
function executarFuncaoMultiplicar() {

    let a = prompt("entre com o valor A");
    let b = prompt("entre com o valor B");

function multiplicar (valorA, valorB) {
    
    if (valorA == 0 || valorB == 0) {
        return 0;
    }
    else {
        return valorA * valorB;
    }
}

let result = multiplicar(a,b);
alert(`O resultado é ${result}`); 

}

