const livros = [
    {
        imagem: "crime-e-castigo.jpg",
        titulo: "Crime e Castigo",
        publicacao: "1866",
        paginas: "551",
        autor: "Fiódor Dostoiévski",
        genero: "Romance",
        texto: "Romance psicológico que explora a mente de um estudante que comete um assassinato e lida com as consequências morais e psicológicas de seu crime."
    },
    {
        imagem: "a-hora-da-estrela.jpg",
        titulo: "A Hora da Estrela",
        publicacao: "1977",
        paginas: "88",
        autor: "Clarice Lispector",
        genero: "Romance",
        texto: "Narrativa que acompanha a vida simples de Macabéa, uma datilógrafa alagoana que vive no Rio de Janeiro, explorando temas como existência, solidão e identidade."
    },
    {
        imagem: "duna.jpg",
        titulo: "Duna",
        publicacao: "1965",
        paginas: "412",
        autor: "Frank Herbert",
        genero: "Ficção científica",
        texto: "Épico de ficção científica que se passa no planeta desértico Arrakis, onde famílias nobres disputam o controle da valiosa especiaria melange, essencial para a navegação interestelar."
    }
];



let indice = 0;

function mostrarLivros() {
    document.getElementById("imgLivro").src = livros[indice].imagem;

    document.getElementById("tituloLivro").textContent = livros[indice].titulo;
        
    document.getElementById("publicacaoLivro").textContent = livros[indice].publicacao

     document.getElementById("paginasLivro").textContent = livros[indice].paginas

        document.getElementById("generoLivro").textContent = livros[indice].paginas

    document.getElementById("textoLivro").textContent = livros[indice].texto
}

mostrarLivros();

document.getElementById("proximo").addEventListener("click", () =>{
    indice++;
    if(indice >= livros.length) indice = 0;
    mostrarLivros();
})

document.getElementById("anterior").addEventListener("click", () =>{
    indice--;
    if(indice < 0) indice = livros.length - 1;
    mostrarLivros();
})