const Participante_1 = [5, 8, 4, 9, 5];
const Participante_2 = [8, 7, 10, 6, 8];
const Participante_3 = [7, 5, 10, 8, 3];

const pontuacaoMedia = (arr) => {
  let a = 0;

  for (let i = 0; i < arr.length; i++) {
    a += arr[i];
  }
  return a;
};

const pontuacaoMaior = (arr) => {
  let a = 0;

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] >= arr[i - 1]) {
      a = arr[i];
    }
  }
  return a;
};

const competicao = (arr1, arr2, arr3) => {
  let medias = [
    pontuacaoMedia(arr1),
    pontuacaoMedia(arr2),
    pontuacaoMedia(arr3),
  ];
  let mediaFinal = 0;
  let mediaUser = 0;
  for (let i = 0; i < medias.length; i++) {
    console.log(medias[i]);
    if (medias[i] >= mediaFinal) {
      mediaFinal = medias[i];
      mediaUser = i + 1;
    }
  }

  let maior = [
    pontuacaoMaior(arr1),
    pontuacaoMaior(arr2),
    pontuacaoMaior(arr3),
  ];
  let maiorFinal = 0;
  let maiorUser = 0;
  for (let i = 0; i < maior.length; i++) {
    if (maior[i] >= maiorFinal) {
      maiorFinal = maior[i];
      maiorUser = i + 1;
    }
  }
  console.log(`O participante ${mediaUser} teve a maior media: ${mediaFinal}.`);
  console.log(`O participante ${maiorUser} teve ${maiorFinal} de maior nota.`);
};

competicao(Participante_1, Participante_2, Participante_3);
