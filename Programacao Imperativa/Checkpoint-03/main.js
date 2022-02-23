const aluno = require('./alunos');

let aluno1 = new aluno("Daniel Fontoura", 2, [10, 9, 7, 8, 9]);
let aluno2 = new aluno("Gabriel Rizzo", 3, [9, 9, 10, 6, 7]);
let aluno3 = new aluno("Johny Wesley", 1, [8, 10, 8, 6, 7]);
let aluno4 = new aluno("Thiago Vilela", 5, [9, 3, 5, 7, 9]);
let aluno5 = new aluno("Vinicius Almeida", 4, [7, 9, 6, 8, 9]);

let alunos = [aluno1, aluno2, aluno3, aluno4, aluno5];


module.exports = alunos;
