const alunos = require('./main');

const listaAlunos = alunos;

let curso = {
    nomeCurso: "Prog imperativa",
    notaAprovacao: 6,
    faltaMaxima: 6,
    listaEstudante: listaAlunos,
    adicionaAluno: function (novoAluno) {
        listaAlunos.push(novoAluno);
    },
    aprovado: function (aluno) {
        for (let i = 0; i < this.listaEstudante.length; i++) {
            if (this.listaEstudante[i].nome == aluno) {
                if ((this.listaEstudante[i].calcularMedia() >= this.notaAprovacao) && (this.listaEstudante[i].quantidadeFalta < this.faltaMaxima)) {
                    return `O aluno ${this.listaEstudante[i].nome} está aprovado`;
                }
                else {
                    return `O aluno ${this.listaEstudante[i].nome} está REPROVADO`;
                }
            }
            else {
                return `O aluno ${aluno} não está cadastrado na nossa base de dados`;
            }
        }
    },
    listaAprovados: function (listaAlunos) {
        let array = [];
        for (let i = 0; i < this.listaEstudante.length; i++) {
            if ((this.listaEstudante[i].calcularMedia() >= this.notaAprovacao) && (this.listaEstudante[i].quantidadeFalta < this.faltaMaxima)) {
                array.push(true);
            }
            else {
                array.push(false);
            }
        }
        return array;
    }
}


console.log(curso.listaEstudante[3].calcularMedia());
console.log(curso.listaEstudante[3].quantidadeFalta);
console.log(curso.faltaMaxima);
console.log(curso.aprovado("Thiago d"));
console.log(curso.listaAprovados());

