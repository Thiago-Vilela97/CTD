*** Variables ***
${SITE}                     https://www.saucedemo.com
${NAVEGADOR}                Chrome
${CAMPO_USUARIO}            css=#user-name
${USUARIO}                  standard_user
${USUARIO_INCORRETO}        TESTEXXX
${CAMPO_SENHA}              css=#password
${SENHA}                    secret_sauce
${SENHA_INCORRETA}          senhaErrada
${BOTAO_LOGIN}              css=#login-button
${ADICIONAR_CARRINHO}       css=#add-to-cart-sauce-labs-backpack
${CARRINHO}                 css=#shopping_cart_container > a
${BOTAO_CHECKOUT}           css=#checkout
${CAMPO_NOME}               css=#first-name
${NOME}                     Tiago
${CAMPO_SOBRENOME}          css=#last-name
${SOBRENOME}                Gomes
${CAMPO_CEP}                css=#postal-code
${CEP}                      123456
${BOTAO_CONTINUE}           css=#continue
${BOTAO_FINISH}             css=#finish
${MENSAGEM_AGRADECIMENTO}   THANK YOU FOR YOUR ORDER
${MENSAGEM_ERRO_LOGIN}      Username and password do not match

*** Keywords ***
Acessar o site
  Open Browser                ${SITE}                 ${NAVEGADOR}
  Maximize Browser Window

Fazer login
  Wait and Input Text         ${CAMPO_USUARIO}        ${USUARIO}
  Wait and Input Text         ${CAMPO_SENHA}          ${SENHA}
  Wait and Click              ${BOTAO_LOGIN}

Fazer login com usuario incorreto
  Wait and Input Text         ${CAMPO_USUARIO}        ${USUARIO_INCORRETO}
  Wait and Input Text         ${CAMPO_SENHA}          ${SENHA_INCORRETA}
  Wait and Click              ${BOTAO_LOGIN}
  Page Should Contain         ${MENSAGEM_ERRO_LOGIN}

Adicionar um produto ao carrinho
  Wait and Click              ${ADICIONAR_CARRINHO}

Acessar o carrinho
  Wait and Click              ${CARRINHO}

Clicar em 'Checkout'
  Wait and Click              ${BOTAO_CHECKOUT}

Preencher informações do usuário
  Wait and Input Text         ${CAMPO_NOME}           ${NOME}
  Wait and Input Text         ${CAMPO_SOBRENOME}      ${SOBRENOME}
  Wait and Input Text         ${CAMPO_CEP}            ${CEP}
  Wait and Click              ${BOTAO_CONTINUE}

Clicar em 'Finish'
  Wait and Click              ${BOTAO_FINISH}
  Page Should Contain         ${MENSAGEM_AGRADECIMENTO} 


### kEYWORDS PERSONALIZADAS ###

Wait and Click
  [Arguments]                     ${ELEMENTO}
  wait Until Element is Visible   ${ELEMENTO} 
  Click Element                   ${ELEMENTO}

Wait and Input Text
  [Arguments]                     ${CAMPO}    ${TEXTO}
  wait Until Element is Visible   ${CAMPO}
  Input Text                      ${CAMPO}    ${TEXTO}