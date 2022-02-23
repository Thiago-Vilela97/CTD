/*
SEGUINDO A MESA DE TRABALHO DA AULA 13. DESENVOLVA ESSE ALGORITMO 
1 - CRIE UMA FUNÇÃO CONSTRUTORA PARA O OBJETO CONTA BANCARIA COM AS SEGUINTES PROPRIEDADES:

● Número da conta (somente números)
● Tipo de conta (conta corrente ou poupança em $)
● Saldo em $ (valor apenas)
● Titular da conta (nome completo)

2 - MOLDE AS INFORMAÇÕES DO ARQUIVO https://drive.google.com/file/d/16L2NejZU49mCLbo6RTmSKtuElOTOYUXv/view
PARA O FORMATO JSON, E EXPORTE ESSE JSON COMO MODULO

3 - DESENVOLVA UM ALGORITOMO QUE IRA RECEBER O MODULO ARRAY DE JSON E CRIE DINAMICAMENTE OS 
OBJETOS CONTA BANCARIA EM UM SEGUNDO ARRAY LISTA USUARIOS ARMAZENE ESSE OBJETOS 

4 - CRIE DE UM OBJETO LITERAL CHAMADO BANCO QUE TERÁ UMA PROPRIEDADE CHAMADA CLIENTES, ELE SERÁ COMPOSTO 
PELA LISTA DE OBJETOS GERADOS NO PONTO ANTERIOR.

5 - O OBJETO DO BANCO CRIARÁ UM MÉTODO CHAMADO CONSULTARCLIENTE QUE RECEBERÁ UM
NOME (TITULAR) POR PARÂMETRO E DEVE PESQUISAR NA LISTA DE CONTAS E RETORNAR AO
OBJETO DO CLIENTE QUE CORRESPONDE A ESSE NOME INSERIDO.
*/

const contasJSON = require('./JSON');

let contasExp = contasJSON;

function contaBancaria(numeroConta, tipoConta, saldo, titular) {
    this.numeroConta = numeroConta;
    this.tipoConta = tipoConta;
    this.saldo = saldo;
    this.titular = titular;
};



const contas = [];
for (let i = 0; i < contasExp.length; i++) {
 const novaConta = new contaBancaria (
     contasExp[i].numeroConta,
     contasExp[i].tipoConta,
     contasExp[i].saldo,
     contasExp[i].titular )
     contas.push(novaConta);
};

let Bancos = {
    clientes: contas,
    consultarCliente: function(titular) {
        for (let index = 0; index < contas.length; index++) {
            if (this.clientes[index].titular == titular) {
                return this.clientes[index];
            }
        }
        return "Cliente não encontrado"
    }
}


console.log(Bancos.consultarCliente("Lonnie Verheijden"));


















