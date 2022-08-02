const { subtracao } = require('../calc.js');

describe('Testes de subtração', () =>{

    test('Subtração de dois numeros', () =>{
        expect(subtracao(5,3)).toBe(2);
    })

    test('Subtração de dois zeros', () =>{
        expect(subtracao(0,0)).toBe(0);
    })
    
    test('Subtração de dois nulos', () =>{
        expect(subtracao(null,null)).toBe(0);
    })

    test('Subtração de resultado negativo', () =>{
        expect(subtracao(3,4)).toBe(-1);
    })

    test('Subtração de dois negativos', () =>{
        expect(subtracao(-1,-1)).toBe(0);
    })

});
