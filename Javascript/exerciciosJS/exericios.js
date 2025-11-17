/* let salary = 4950.5;
console.log(salary); */


/* let name = "vyzxc";
let age = 17;
let isStudent = true;
console.log(name);
console.log(age);
console.log(isStudent); */

/* 
let a = 10;
let b = 5;

let soma = a + b;
let multiplicacao = a * b;
let divisao = a/b;

console.log("Soma:", soma);
console.log("Multiplicação:", multiplicacao);
console.log("Divisão:", divisao); */


/* let x = 8;
let y = 12;


let maiorQue = x > y;
let igualA = x === 8;
let diferenteDe = y !== 10;

console.log("x > y:", maiorQue);
console.log("x === 8:", igualA);
console.log("y !== 10:", diferenteDe); */


/* let idade = 18;

if (idade >= 18) {
    console.log("Maior de idade");
} else {
    console.log("Menor de idade");
} */

    
/* for (let i = 0; i <= 5; i++) {
    console.log(i);
} */

    

/* function saudacao(nome) {
    return "Olá," + [nome] + "!";
}

let resultado = saudacao("Vincius");
console.log(resultado); */

/* 
function calcularArea(largura, altura) {
    return largura * altura;
}

let area = calcularArea(5, 3);
console.log("Área:", area); */

/* let frutas = ["Banana", "Maça","Kiwi"];

console.log("Primeira fruta:", frutas[1]);

console.log("Tamanho:", frutas.length);

frutas.push("manga");
console.log("Nova lista:", frutas); */

/* let numeros = [1, 2, 3, 4, 5];

for (let i = 0; i < numeros.length; i++) {
    let resultado = numeros[i] * 2;
    console.log(resultado);
} */

/*     let pessoa = {
    nome: "Vinicius",
    idade: 17,
    cidade: "Sorocaba"
};

console.log("Nome:", pessoa.nome);
console.log("Idade:", pessoa.idade);
console.log("Cidade:", pessoa.cidade);

pessoa.idade = 26;

console.log("Pessoa:", pessoa); */

/* let calculadora = {
    somar: function(a, b) {
        return a + b;
    },
    multiplicar: function(a, b) {
        return a * b;
    }
};


let soma = calculadora.somar(3, 4);
let produto = calculadora.multiplicar(3, 4);

console.log("Soma:", soma);
console.log("Produto:", produto); */

// Crie a variável nota
let nota = 85;

/* // Use if/else aninhados
if (nota >= 90) {
    console.log("Excelente");
} else if (nota >= 70) {
    console.log("Bom");
} else if (nota >= 50) {
    console.log("Regular");
} else {
    console.log("Insuficiente");
} */

// Crie a variável
let diaSemana = 3;
/* 
// Use switch case
switch (diaSemana) {
    case 1:
        console.log("Segunda-feira");
        break;
    case 2:
        console.log("Terça-feira");
        break;
    case 3:
        console.log("Quarta-feira");
        break;
    // Complete os outros casos
    default:
        console.log("Dia inválido");
} */

/*  function dobrar(numero) {
    return numero * 2;
}

// Arrow function para calcular quadrado
const quadrado = numero => numero * numero;

// Use arrow function com map
const numeros = [1, 2, 3, 4];
const dobrados = numeros.map(numero => numero * 2);

console.log("Quadrado de 5:", quadrado(5));
console.log("Números dobrados:", dobrados); */

// Função com parâmetros padrão

/* function saudar(nome = "Visitante", idade = 18) {
    return `Olá ${nome}, você tem ${idade} anos`;
}

// Arrow function com parâmetro padrão
const calcularDesconto = (preco, desconto = 10) => {
    return preco - (preco * desconto / 100);
};

// Teste as funções
console.log(saudar());
console.log(saudar("Ana"));
console.log(saudar("Carlos", 30));
console.log("Preço com desconto:", calcularDesconto(100)); */

/* // Array de números
const numeros = [1, 2, 3, 4, 5];

// Use map para criar array com números ao quadrado
const quadrados = numeros.map(numeros => numeros*numeros);

// Array de objetos
const pessoas = [
    { nome: "Ana", idade: 25 },
    { nome: "João", idade: 30 },
    { nome: "Maria", idade: 28 }
];

// Use map para extrair apenas os nomes
const nomes = pessoas.map(pessoas => pessoas.nome);

console.log("Quadrados:", quadrados);
console.log("Nomes:", nomes); */

/* // Array de números
const numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

// Filtre apenas números pares
const pares = numeros.filter(numeros => (numeros %2 === 0 ));


// Array de produtos
const produtos = [
    { nome: "Notebook", preco: 2500, categoria: "eletrônicos" },
    { nome: "Camisa", preco: 80, categoria: "roupas" },
    { nome: "Mouse", preco: 50, categoria: "eletrônicos" },
    { nome: "Calça", preco: 120, categoria: "roupas" }
];

// Filtre produtos eletrônicos com preço menor que 100
const eletronicosBaratos = produtos.filter(produtos => produtos.preco < 100);

console.log("Números pares:", pares);
console.log("Eletrônicos baratos:", eletronicosBaratos); */

/* // Array de números
const numeros = [1, 2, 3, 4, 5];

// Use reduce para somar todos os números
const soma = numeros.reduce((acumulador, atual) => acumulador + atual);

// Array de idades
const idades = [25, 30, 18, 45, 22, 35];

// Use reduce para encontrar a maior idade
const maiorIdade = idades.reduce((maior, atual) => maior > atual);

// Array de frutas
const frutas = ["maçã", "banana", "maçã", "laranja", "banana", "maçã"];

// Use reduce para contar ocorrências
const contagem = frutas.reduce((contador, fruta) => {
    contador[fruta] = (contador[fruta] || 0) + 1;
    return contador;
}, {});

console.log("Soma:", soma);
console.log("Maior idade:", maiorIdade);
console.log("Contagem:", contagem); */

// String de exemplo
const frase = "JavaScript é incrível";

/* // Obtenha o tamanho da string
const tamanho = frase.length;

// Converta para maiúscula e minúscula
const maiuscula = frase.toUpperCase();
const minuscula = frase.toLocaleLowerCase();

// Obtenha o primeiro e último caractere
const primeiro = frase.charAt(0);
const ultimo = frase.charAt(frase.length - 1);

// Encontre a posição da palavra "é"
const posicao = frase.indexOf("é");

console.log("Tamanho:", tamanho);
console.log("Maiúscula:", maiuscula);
console.log("Minúscula:", minuscula);
console.log("Primeiro caractere:", primeiro);
console.log("Último caractere:", ultimo);
console.log("Posição de 'é':", posicao); */

// String com frutas separadas por vírgula
const frutasString = "maçã,banana,laranja";

// Divida a string em um array
const frutasArray = frutasString.split(",");

// Una o array em uma nova string com " - " como separador
const novaString = frutasArray.join(" - ");

// Exiba os resultados
console.log("String original:", frutasString);
console.log("Array:", frutasArray);
console.log("Nova string:", novaString);
