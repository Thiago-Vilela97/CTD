const  {soma} = require('../calc.js');

describe('testes de soma', () =>{ 

    test('soma de dois numeros', () => {
        expect(soma(2,2)).toBe(4);
    })

    test('soma de dois zeros', () => {
        expect(soma(0,0)).toBe(0);
    })

    test('soma de dois nulos', () => {
        expect(soma(null,null)).toBe(0);
    })
    
    test('soma de strings', () => {
        expect(soma("a","b")).toBe("ab");
    })
})