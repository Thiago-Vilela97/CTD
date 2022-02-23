
let escolhaJogador = 0;
let escolhaMaquina = 0;


let vencedor = false;

let pontuacaoJogador = 0;
let pontuacaoMaquina = 0;

let resultado;

function getRandomArbitrary(min, max) {
    return Math.random() * (max - min) + min;
  }

while (!vencedor){
 escolhaJogador = parseInt(prompt("Escolha entre:\n1 - Pedra \n2 - Papel \n3 - Tesoura"));
 escolhaMaquina = parseInt(getRandomArbitrary(1, 3));

 
 switch (escolhaJogador) {
  case 1: 
  if(escolhaMaquina == 1){
      alert("Empate");
  }
  else if (escolhaMaquina == 2){
      alert("Vitoria Jogador")
      pontuacaoJogador++;
  }
  else{
      alert("Vitoria Maquina")
      pontuacaoMaquina++;
  }
  break;
      
  case 2:
      if(escolhaMaquina == 2){
          alert("Empate");
      }
      else if (escolhaMaquina == 3){
          alert("Vitoria Jogador")
          pontuacaoJogador++;
      }
      else{
          alert("Vitoria Maquina")
          pontuacaoMaquina++;
      }
      break;            
  case 3: 
      if(escolhaMaquina == 3){
          alert("Empate");
      }
      else if (escolhaMaquina == 1){
          alert("Vitoria Jogador")
          pontuacaoJogador++;
      }
      else{
          alert("Vitoria Maquina")
          pontuacaoMaquina++;
      }
      break;      
  default:
      break;
}

if (pontuacaoMaquina == 2 || pontuacaoJogador == 2) {
  vencedor = true;
}  
} 



if (pontuacaoJogador === 2) {
  resultado = "Vitória do Jogador"
}
else if (pontuacaoMaquina === 2) {
  resultado = "Vitória da máquina"
}



document.querySelector('h1').innerText += ' ' + resultado; 


