fetch('https://api.thecatapi.com/v1/images/search?category_ids=1$limit=10')
    .then(function(resultado) {
        return resultado.json();
    })
    .then(function(cats) {

        let imagens = document.getElementById('imagens');
        
       console.log(cats);

        cats.forEach(function (cat) {
           let div = document.createElement('div');
           let img = document.createElement('img');
           
            div.style.margin = "300px";

           img.src = cat.url;
           img.width = 400;

           div.appendChild(img);
           imagens.appendChild(div);

        })

    });
// fetch('https://api.thecatapi.com/v1/images/search?category_ids=1&limit=10') 
//     .then(function(resultado) {
//         return resultado.json();
//     })
//     .then(function(gatos) {

//         let imagens = document.getElementById('imagens');

//         console.log(gatos);

//         gatos.forEach(function (gato) {
//             let div = document.createElement('div');
//             let img = document.createElement('img');
            
//             div.style.margin = "300px"

//             img.src = gato.url;
//             img.width = 400;

//             div.appendChild(img);
//             imagens.appendChild(div);


            



//         })
//     });
   