// fetch('https://api.thecatapi.com/v1/images/search?category_ids=1$limit=10')
//     .then(function(resultado) {
//         return resultado.json();
//     })
//     .then(function(cats) {

//         let imagens = document.getElementById('imagens');
        
//         console.log(cats);

//         cats.forEach(function (cat) {
//            let div = document.createElement('div');
//            let img = document.createElement('img');
           
//             div.style.margin = "30px";

//            img.src = cat.url;
//            img.width = 400;

//            div.appendChild(img);
//            imagens.appendChild(div);

//         });

//     });

let data = {
    image_id: "bi",
    value: 1,

};

//GET
let settings = {
    method: "POST",
    "headers": {
        "Content-Type": "application/json",
        "x-api-key": "3cbef098-013c-4564-9c8c-e4393e9b966f"
    },
    body: JSON.stringify(data)
};

fetch('https://api.thecatapi.com/v1/votes', settings)
    .then(function (response) {
        return response.json();
    })
    .then(function (info) {
        console.log(info);
    })
    .catch(function (error) {
        console.log(error);
    });