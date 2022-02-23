const strText = require('string');
const txt = strText("ola mundo").replaceAll("o","O").toString();
console.log(txt);