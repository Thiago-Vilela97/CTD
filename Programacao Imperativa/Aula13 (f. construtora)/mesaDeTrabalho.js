function Usuarios(numeroConta, tipoConta, saldo, titular) {
    this.numeroConta = numeroConta;
    this.tipoConta = tipoConta;
    this.saldo = saldo;
    this.titular = titular;
}

let conta0 = new Usuarios(1480270602, "Conta Corrente", 8562, "Thiago Vilela");
let conta1 = new Usuarios(5486273622, "Conta Corrente", 27771, "Abigael Natte");
let conta2 = new Usuarios(1183971869, "Conta Poupança", 8675, "Ramon Connell");
let conta3 = new Usuarios(9582019689, "Conta Poupança", 27363, "Jarret Lafuente");
let conta4 = new Usuarios(1761924656, "Conta Poupança", 32415, "Ansel Ardley");
let conta5 = new Usuarios(7401971607, "Conta Poupança", 18789, "Jacki Shurmer");
let conta6 = new Usuarios(630841470, "Conta Corrente", 28776, "Jobi Mawtus");
let conta7 = new Usuarios(4223508636, "Conta Corrente", 2177, "Thomasin Latour");
let conta8 = new Usuarios(185979521, "Conta Poupança", 25994, "Lonnie Verheijden");
let conta9 = new Usuarios(3151956165, "Conta Corrente", 7601, "Alonso Wannan");
let conta10 = new Usuarios(2138105881, "Conta Poupança", 33196, "Bendite Huggett");


let listaDeContas = [conta0, conta1, conta2, conta3, conta4, conta5, conta6, conta7, conta8, conta9, conta10];


let Banco = {
    clientes: listaDeContas,
    consultarCliente: function (titular) {
        for (let i = 0; i < this.clientes.length; i++) {
            if (this.clientes[i].titular == titular) {
                return this.clientes[i];
            }
        }
    }
}
console.log(Banco.consultarCliente("Bendite Huggett"));

