const { multiplicacao } = require('../calc.js');

describe('Testes de subtração', () =>{

    test('multiplicação de dois numeros', () =>{
        expect(multiplicacao(5,3)).toBe(15);
    })

    test('multiplicação de dois zeros', () =>{
        expect(multiplicacao(0,0)).toBe(0);
    })
    
    test('multiplicação de resultado negativo', () =>{
        expect(multiplicacao(3,-4)).toBe(-12);
    })

    test('multiplicação de dois negativos', () =>{
        expect(multiplicacao(-1,-1)).toBe(1);
    })

});
