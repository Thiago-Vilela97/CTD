*** Variables ***
${NAVEGADOR}               Chrome
${SITE}                    https://bugbank.netlify.app/
${CAMPO_USUARIO}           name=email
${USUARIO}                 thiago@gmail.com
${CAMPO_SENHA}             name=password
${CAMPO_NOVO_EMAIL}        name=email    
${CAMPO_NOVO_NOME}         name=name     
${CAMPO_NOVA_SENHA}        name=password           
${CAMPO_CONFIRMA_SENHA}    name=passwordConfirmation
${NOVO_EMAIL}              thiago@gmail.com
${NOVO_NOME}               thiago
${NOVA_SENHA}              thiago@gmail.com
${CONFIRMA_SENHA}          thiago@gmail.com
${SENHA}                   thiago@gmail.com
${BOTAO_ACESSAR}           css=#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.login__buttons > button.style__ContainerButton-sc-1wsixal-0.otUnI.button__child
${BOTAO_REGISTRAR}         css=#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.login__buttons > button.style__ContainerButton-sc-1wsixal-0.ihdmxA.button__child
${BOTAO_CADASTRAR}         css=#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > button


*** Keywords ***
Acessar o site
  Open Browser   ${SITE}    ${NAVEGADOR}
  Maximize Browser Window

Clicar em 'Registrar'
  Wait and Click              ${BOTAO_REGISTRAR} 

Registrar novo usuario
  Wait and Input Text         ${CAMPO_NOVO_EMAIL}            ${NOVO_EMAIL}    
  Wait and Input Text         ${CAMPO_NOVO_NOME}             ${NOVO_NOME}
  Wait and Input Text         ${CAMPO_NOVA_SENHA}            ${NOVA_SENHA}
  Wait and Input Text         ${CAMPO_CONFIRMA_SENHA}        ${CONFIRMA_SENHA}
  Wait and Click              ${BOTAO_CADASTRAR}

Fazer login
  Wait and Input Text         ${CAMPO_USUARIO}        ${USUARIO}
  Wait and Input Text         ${CAMPO_SENHA}          ${SENHA}
  Wait and Click              ${BOTAO_ACESSAR} 




## PERSONALIZADOS ##

Wait and Input Text
  [Arguments]                     ${CAMPO}    ${TEXTO}
  wait Until Element is Visible   ${CAMPO}
  Input Text                      ${CAMPO}    ${TEXTO}  

Wait and Click
  [Arguments]                     ${ELEMENTO}
  wait Until Element is Visible   ${ELEMENTO} 
  Click Element                   ${ELEMENTO}