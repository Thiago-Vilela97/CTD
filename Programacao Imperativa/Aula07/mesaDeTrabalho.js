console.log(!true);

console.log(!false);

console.log(!!false);

console.log(!!true);

console.log(!1);

console.log(!!1);

console.log(!0);

console.log(!!0);

console.log(!!"");

let a = 5 ;
let b = 9;
console.log(a < 10 && a!==5);
console.log(a>9 || a===5);
console.log(!(a===b));

let c = 10;
let d = "a";
console.log(d === "b" || c >= 10);

let e = 3;
let f = 8;
console.log(!(e == "3" || e === f) && !(f !== 8 && e <= f));

let str = "";
let msg = "haha!";
let eBonito = "false";
console.log(!((str || msg) && eBonito));


