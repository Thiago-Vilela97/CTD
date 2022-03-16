
function executarFuncaoDividir() {
    
    let a = prompt("entre com o valor A");
    let b = prompt("entre com o valor B");

function dividir (valorA, valorB) {
    
    if (valorA == 0 || valorB == 0) {
        return "Não se pode dividir por zero";
    }
    else {
        return valorA / valorB;
    }
}

let result = dividir(a,b);
alert(`O resultado é: ${result}`); 
}

