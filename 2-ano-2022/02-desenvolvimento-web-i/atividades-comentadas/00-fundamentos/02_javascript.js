/*
Variáveis, funções, arrays e objetos
Responsável: Gilmar da Silva
Conceitos: const protege a referência, não o conteúdo. map transforma, filter seleciona e reduce agrega sem alterar o array original.
Execução: node 00-fundamentos/02_javascript.js
Pratique: Adicione uma busca por nome que ignore maiúsculas e espaços.
*/
const assert = require('node:assert/strict');
const materias = [{nome:'Java', horas:120}, {nome:'Web', horas:90}, {nome:'Inovação', horas:30}];
const carga = lista => lista.reduce((soma, item) => soma + item.horas, 0);
assert.equal(carga(materias), 240);
assert.equal(carga([]), 0);
assert.deepEqual(materias.filter(m => m.horas >= 90).map(m => m.nome), ['Java', 'Web']);
console.log(materias.map(m => `${m.nome}: ${m.horas}h`).join('\n'));
