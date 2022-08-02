*** Variables ***
${SITE}                        https://hurb.com/br
${NAVEGADOR}                   Firefox
${BOTAO_COOKIES}               css=#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll
${BOTAO_PACOTES}               css=#__next > div.Header_Header__U2EuB > div.h-1v38t0d > div > div > div.h-rwgu8t > div > div > button:nth-child(2)
${CAMPO_BUSCAR}                id=destination-input
${LUGAR1}                      França
${BOTAO_PESQUISAR}             xpath=//*[@id="__next"]/div[1]/div[2]/div/div/div[2]/button
${CAMPO_SELECIONAR_LUGAR}      css=#__next > div > main > section > div.ResultsCardsContainer_ResultsCardContainer__CDDwR > a:nth-child(1) > div.h-1psltl0 > img
${BOTAO_ESCOLHER_PACOTE}       xpath=//*[@id="__next"]/div/main/div[3]/aside/div/div/div[2]/button
${RADIO_SAIDA}                 xpath=//*[@id="LGPKG-1375624-3022531"]
${BOTAO_PROXIMO1}              css=.h-1yuatql
${SELECIONAR_DIARIAS}          css=.h-7k3cv9
${BOTAO_PROXIMO2}              css=.h-1yuatql
${BOTAO_IR_PAGAMENTO}          css=.h-1yuatql
${CONFIGURACOES_VIAGEM}        3 diárias
${PERIODO_VIAGEM_IDA}          01 Mar 2023
${PERIODO_VIAGEM_VOLTA}        30 Nov 2023
${BOTAO_BOLETO_PARCELADO}      css=#ui-id-1
${CAMPO_NOME}                  css=.bill__holder
${NOME}                        thiago vilela
${CAMPO_CPF}                   css=.bill_cpf
${CPF}                         705.127.670-09
${CAMPO_CELULAR}               css=.bill__section > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > input:nth-child(2)
${CELULAR}                     31992000000 
${CHECKBOX_TERMOS}             id=cancellation-policy
${INFO_CANCELAMENTO_GRATIS}    Cancelamento Grátis! 

*** Keywords ***
Acessar o site
  Open Browser          ${SITE}           ${NAVEGADOR}
  Maximize Browser Window

Clicar em "Permitir todos os cookies"
  Sleep                 5
  Wait and Click        ${BOTAO_COOKIES}

Selecionar a opção "Pacotes"
  Wait and Click        ${BOTAO_PACOTES}  

Buscar por "França" e clicar em "Pesquisar"
  Wait and Input Text   ${CAMPO_BUSCAR}    ${LUGAR1}    
  Wait and Click        ${BOTAO_PESQUISAR}

Selecionar um pacote de viagem
  Wait and Click        ${CAMPO_SELECIONAR_LUGAR}     

Clicar em “Escolher pacote”
  Switch Window         NEW
  Wait and Click        ${BOTAO_ESCOLHER_PACOTE} 

Selecionar as opções do pacote e clicar em “Ir para pagamento”
  Wait and Click        ${RADIO_SAIDA}
  Wait and Click        ${BOTAO_PROXIMO1}
  Wait and Click        ${SELECIONAR_DIARIAS}
  Wait and Click        ${BOTAO_PROXIMO2}
  Wait and Click        ${BOTAO_IR_PAGAMENTO}

Validar as informações da “Configuração” da viagem
  Page Should Contain   ${CONFIGURACOES_VIAGEM}   

#Validar as informações do "período da viagem"
#  Page Should Contain     ${PERIODO_VIAGEM_IDA}   
 # Page Should Contain     ${PERIODO_VIAGEM_VOLTA}

Selecionar a opção “Boleto parcelado”
  sleep                 4
  Wait and Click        ${BOTAO_BOLETO_PARCELADO} 

Preencher os dados de pagamento
  Wait and Input Text   ${CAMPO_NOME}        ${NOME}
  Wait and Input Text   ${CAMPO_CPF}         ${CPF} 
  Wait and Input Text   ${CAMPO_CELULAR}     ${CELULAR}

Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
  Select Checkbox       ${CHECKBOX_TERMOS}

Validar a informação sobre cancelamento grátis
  Page Should Contain   ${INFO_CANCELAMENTO_GRATIS}





### kEYWORDS PERSONALIZADAS ###

Wait and Click
  [Arguments]                     ${ELEMENTO}
  wait Until Element is Visible   ${ELEMENTO} 
  Click Element                   ${ELEMENTO}

Wait and Input Text
  [Arguments]                     ${CAMPO}    ${TEXTO}
  wait Until Element is Visible   ${CAMPO}
  Input Text                      ${CAMPO}    ${TEXTO}