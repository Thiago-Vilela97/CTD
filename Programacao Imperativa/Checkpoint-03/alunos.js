

function aluno(nome, quantidadeFalta, nota)  {
    this.nome = nome;
    this.quantidadeFalta = quantidadeFalta;
    this.nota = nota;
    this.calcularMedia = function (nota) {
        let result = 0;
        let media = 0;
        let somarNota = this.nota.map(function (valor) {
            return result += valor
        })
        media = result / this.nota.length;
        return media;
    }
    this.faltas = function(quantidadeFalta) {
        let result = 0;
        result = this.quantidadeFalta + 1;
        return `A quantidade de falta do ${nome} é ${result}`;
    }
}


module.exports = aluno;




