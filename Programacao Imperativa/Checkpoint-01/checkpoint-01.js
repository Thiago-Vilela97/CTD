// 1ª Forma de fazer - usando switch e if

function aquecerComida(comida, tempo) {
    let tempoDefinido = 0;
    switch(comida) {
        
        case 1:
            tempoDefinido = 10;
            break;
         case 2:
            tempoDefinido = 8;
            break;    
        case 3:
            tempoDefinido = 15;
            break;
        case 4:
            tempoDefinido = 12;
            break;
        case 5:
            tempoDefinido = 8;
            break;
        default:
        return "Comida desconhecida";
            break;       
    }
         
        if (tempo >= 2*tempoDefinido && tempo < 3*tempoDefinido) {
            return "Comida Queimou!";
        }
        else if (tempo < tempoDefinido) {
            return "Tempo insuficiente";
        }
        else if (tempo >= 3*tempoDefinido) {
            return "Kabummm!";
        }
        else {
            return "Prato pronto, bom apetite";
        }
        
    }
    console.log(aquecerComida(2,7));

// 2º Forma de fazer - usando apenas if

function aquecerComida2(comida2, tempo2) {
    if(comida2 == "pipoca") {
        if (tempo2 >= 2*10 && tempo2 < 3*10) {
            return "Comida Queimou!";
        }
        else if (tempo2 < 10) {
            return "Tempo insuficiente";
        }
        else if (tempo2 >= 3*10) {
            return "Kabummm!";
        }
        else {
            return "Prato pronto, bom apetite";
        }
        
    }
    else if(comida2 == "macarrão") {
        if (tempo2 >= 2*8 && tempo2 < 3*8) {
            return "Comida Queimou!";
        }
        else if (tempo2 < 8) {
            return "Tempo insuficiente";
        }
        else if (tempo2 >= 3*8) {
            return "Kabummm!";
        }
        else {
            return "Prato pronto, bom apetite";
        }
        
    }
    else if(comida2 == "carne") {
        if (tempo2 >= 2*15 && tempo2 < 3*15) {
            return "Comida Queimou!";
        }
        else if (tempo2 < 15) {
            return "Tempo insuficiente";
        }
        else if (tempo2 >= 3*15) {
            return "Kabummm!";
        }
        else {
            return "Prato pronto, bom apetite";
        }
        
    }
    else if(comida2 == "feijão") {
        if (tempo2 >= 2*12 && tempo2 < 3*12) {
            return "Comida Queimou!";
        }
        else if (tempo2 < 12) {
            return "Tempo insuficiente";
        }
        else if (tempo2 >= 3*12) {
            return "Kabummm!";
        }
        else {
            return "Prato pronto, bom apetite";
        }
        
    }
    else if(comida2 == "brigadeiro") {
        if (tempo2 >= 2*8 && tempo2 < 3*8) {
            return "Comida Queimou!";
        }
        else if (tempo2 < 8) {
            return "Tempo insuficiente";
        }
        else if (tempo2 >= 3*8) {
            return "Kabummm!";
        }
        else {
            return "Prato pronto, bom apetite";
        }
    }
    else {
        return "Comida desconhecida";
    }

}
console.log(aquecerComida2("arroz",7));