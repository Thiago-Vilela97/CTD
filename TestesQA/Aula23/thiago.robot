*** Settings ***
Library             SeleniumLibrary
Resource            ./thiago.resource
#Test Teardown       Close Browser

*** Test Case ***
Processo de Registro e login no site bugBank
  Acessar o site
  Clicar em 'Registrar'
  Registrar novo usuario
  Fazer login