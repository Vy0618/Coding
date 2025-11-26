const livros = [
    {
        imagem: "img/crime-e-castigo.jpg",
        titulo: "Crime e Castigo",
        publicacao: "1866",
        paginas: "551",
        autor: "Fiódor Dostoiévski",
        genero: "Romance",
        texto: "Romance psicológico que explora a mente de um estudante que comete um assassinato e lida com as consequências morais e psicológicas de seu crime."
    },
    {
        imagem: "img/a-hora-da-estrela.jpg",
        titulo: "A Hora da Estrela",
        publicacao: "1977",
        paginas: "88",
        autor: "Clarice Lispector",
        genero: "Romance",
        texto: "Narrativa que acompanha a vida simples de Macabéa, uma datilógrafa alagoana que vive no Rio de Janeiro, explorando temas como existência, solidão e identidade."
    },
    {
        imagem: "img/duna.jpg",
        titulo: "Duna",
        publicacao: "1965",
        paginas: "412",
        autor: "Frank Herbert",
        genero: "Ficção científica",
        texto: "Épico de ficção científica que se passa no planeta desértico Arrakis, onde famílias nobres disputam o controle da valiosa especiaria melange, essencial para a navegação interestelar."
    }
];

const searchInput = document.getElementById('search');
const submitButton = document.getElementById('submit');


function formatString(value) {
    return value.toLowerCase().trim();
   
}

function searchAndDisplayBook(){
    const searchTerm = formatString(searchInput.value);

    const bookIndex = livros.findIndex(livro => formatString(livro.titulo) === searchTerm);

    if (bookIndex !== -1){
        indice = bookIndex;
        mostrarLivros();
    } else{
        console.log('Livro Não Encontrado');
        alert('Livro não encontrado!');
    }
}

let indice = 0;

function mostrarLivros() {
    document.getElementById("imgLivro").src = livros[indice].imagem;
    document.getElementById("tituloLivro").textContent = livros[indice].titulo;
    document.getElementById("publicacaoLivro").textContent = livros[indice].publicacao;
    document.getElementById("paginasLivro").textContent = livros[indice].paginas;
    document.getElementById("generoLivro").textContent = livros[indice].genero;
    document.getElementById("textoLivro").textContent = livros[indice].texto;
    document.getElementById("autorLivro").textContent = livros[indice].autor;
}


searchInput.addEventListener('keypress', (e) => {
    if (e.key === 'Enter') {
        searchAndDisplayBook();
    }
});

document.getElementById("proximo").addEventListener("click", () => {
    indice++;
    if (indice >= livros.length) indice = 0;
    mostrarLivros();
});

document.getElementById("anterior").addEventListener("click", () => {
    indice--;
    if (indice < 0) indice = livros.length - 1;
    mostrarLivros();
});

mostrarLivros();




/*
Criamos uma constante para armazenar o que vem da barra da pesquisa.

Criamos uma constante para armazenar os valores enviados pelo submit button.

Formatamos os valores para letra minuscula, cortamos os espaços com trim (função).

Criamos uma função para procurar e exibir os livros. Nela:

1) Criamos uma constante cujo valor é aquilo que foi escrito na barra de pesquisa.
2) Contante bookIndex. Onde utilizamos a constante livros junto do comando find index. depois disso, utilizamos uma arrow string e a função formatString, com o livro e o titulo. atribuimos esse novo valor a constante searchTerm.
3) Criamos uma condicional: se o índice for -1 (valor impossivel), o indice será igual a const bookIndex, e a função mostrarLivros será invocada.
Caso contrário, há um aviso falando que o livro não foi encontrado.

o que isso faz?
1 - Colocamos dentro de uma constante o aquilo que foi digitado na barra de pesquisa
2 - utilizamos a const bookIndex para procurar o index do título escrito na barra de pesquisa (depois de deixar todos os caracteres minúsculos, igualando o que foi escrito com a id)
3 - damos uma resposta.

4) escrevemos a função para mostrar os livros. nela, buscamos por id que marcam o espaço aonde as características dos livros (capa, autor, paginas, etc), e o igualamos à caraceristica corresponde nos dados sobre os livros.
Ex.: document.getElementById("imgLivro").src = livros[indice].imagem;
5) Adicionamos um eventListener à constante submit button. ao clicar em "submit", o programa vai executar a função para procurar e exibir os livros correspondentes.
6)

*/ 


