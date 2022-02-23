//MICRODESAFIOS - 1
function podeSubir(altura, acompanhada) {
    if (altura >= 140 && altura <= 200) {
        return true;
    }
    else if (altura <=140 && altura >= 120 && acompanhada) {
        return true;
    }
    else {
        return false
    }
}

console.log(podeSubir(120, 1));
//MICRODESAFIOS - 2
function podeSubir2(altura2, acompanhada2) {
    if (altura2 >= 140 && altura2 <= 200) {
        return "Acesso altorizado";
    }
    else if (altura2 <=140 && altura2 >= 120 && acompanhada2) {
        return "Acesso altorizado somente com acompanhante";
    }
    else {
        return "Acesso negado"
    }
}
console.log(podeSubir2(119, 1));