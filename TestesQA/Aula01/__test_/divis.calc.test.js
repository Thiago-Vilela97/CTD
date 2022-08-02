const { divisao } = require('../calc.js');

describe('Testes de divisao', () =>{

    test('divisao de dois numeros', () =>{
        expect(divisao(10,2)).toBe(5);
    })

    test('divisao de dois zeros', () =>{
        expect(divisao(0,0)).toBe(Nan);
    })
    
    test('divisao de resultado negativo', () =>{
        expect(divisao(12,-4)).toBe(-3);
    })

    test('divisao de dois negativos', () =>{
        expect(divisao(-1,-1)).toBe(1);
    })

});