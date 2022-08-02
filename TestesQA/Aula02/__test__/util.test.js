const { generateText } = require ('../util.js');

describe('validação de texto de saída', () => {

    test('Saída de nome e idade', () => {
        const text = generateText('Thiago Vilela', 25);
        expect(text).toBe('Thiago Vilela (25 years old)');
    })

    test('Criar elemento HTML', () => {
        const criarElemento = createElement('li', "Thiago" , 'user-item');
        expect(criarElemento).toBe('<li> </li>');
    })

})