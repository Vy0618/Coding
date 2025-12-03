
const todosLivros = [
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
    },
     {
        imagem: "img/orgulho-e-preconceito.jpg",
        titulo: "Orgulho e Preconceito",
        publicacao: "1813",
        paginas: "432",
        autor: "Jane Austen",
        genero: "Romance",
        texto: "Clássico da literatura que narra o relacionamento entre Elizabeth Bennet e Fitzwilliam Darcy na Inglaterra rural do século XIX. A obra critica a sociedade da época e explora temas como amor, casamento, classe social e preconceitos."
    },
    {
        imagem: "img/o-morro-dos-ventos-uivantes.jpg",
        titulo: "O Morro dos Ventos Uivantes",
        publicacao: "1847",
        paginas: "416",
        autor: "Emily Brontë",
        genero: "Romance",
        texto: "História de amor obsessivo e vingança entre Catherine Earnshaw e Heathcliff, ambientada nas charnecas de Yorkshire. Único romance da autora, é considerado um clássico da literatura inglesa e uma das maiores histórias de amor já escritas."
    },
    {
        imagem: "img/dom-casmurro.jpg",
        titulo: "Dom Casmurro",
        publicacao: "1899",
        paginas: "256",
        autor: "Machado de Assis",
        genero: "Romance",
        texto: "Narrado por Bento Santiago, o romance explora ciúme, dúvida e traição possíveis no relacionamento com sua esposa Capitu. Considerada uma das obras-primas da literatura brasileira e um dos maiores exemplos do realismo no país."
    },
     {
        imagem: "img/o-hobbit.jpg",
        titulo: "O Hobbit",
        publicacao: "1937",
        paginas: "310",
        autor: "J.R.R. Tolkien",
        genero: "Ação",
        texto: "Aventura épica que segue Bilbo Bolseiro em sua jornada inesperada com treze anões para recuperar o tesouro guardado pelo dragão Smaug."
    },
    {
        imagem: "img/jogos-vorazes.jpg",
        titulo: "Jogos Vorazes",
        publicacao: "2008",
        paginas: "374",
        autor: "Suzanne Collins",
        genero: "Ação",
        texto: "Distopia onde Katniss Everdeen se voluntaria para participar dos Jogos Vorazes, uma competição televisiva mortal em um futuro pós-apocalíptico."
    },
    {
        imagem: "img/casino-royale.png",
        titulo: "Casino Royale",
        publicacao: "1953",
        paginas: "213",
        autor: "Ian Fleming",
        genero: "Ação",
        texto: "Primeiro livro da série James Bond, onde o agente 007 enfrenta Le Chiffre, um banqueiro de organizações terroristas, em uma partida de pôquer de alto risco."
    },
    {
        imagem: "img/o-atirador.jpg",
        titulo: "O Atirador",
        publicacao: "2005",
        paginas: "384",
        autor: "Lee Child",
        genero: "Ação",
        texto: "Thriller de ação onde Jack Reacher, ex-policial militar, investiga um ataque a tiros contra o presidente dos EUA, descobrindo uma conspiração complexa."
    },
    {
        imagem: "img/identidade.jpg",
        titulo: "Identidade Bourne",
        publicacao: "1980",
        paginas: "352",
        autor: "Robert Ludlum",
        genero: "Ação",
        texto: "Thriller sobre Jason Bourne, um homem com amnésia que descobre ser um agente altamente treinado enquanto tenta descobrir sua verdadeira identidade."
    },
     {
        imagem: "img/o-avesso-da-vida.jpg",
        titulo: "O Avesso da Vida",
        publicacao: "2014",
        paginas: "288",
        autor: "Jhumpa Lahiri",
        genero: "Drama",
        texto: "Coletânea de contos que exploram a experiência de imigrantes indianos nos Estados Unidos, abordando temas de identidade, solidão e pertencimento."
    },
    {
        imagem: "img/a-insustentavel-leveza-do-ser.jpg",
        titulo: "A Insustentável Leveza do Ser",
        publicacao: "1984",
        paginas: "320",
        autor: "Milan Kundera",
        genero: "Drama",
        texto: "Romance filosófico que segue a vida de quatro personagens durante a Primavera de Praga, explorando questões existenciais, amor e liberdade."
    },
    {
        imagem: "img/o-sol-e-para-todos.jpg",
        titulo: "O Sol é para Todos",
        publicacao: "1960",
        paginas: "336",
        autor: "Harper Lee",
        genero: "Drama",
        texto: "Clássico que aborda racismo e injustiça através dos olhos de Scout Finch, filha de um advogado que defende um homem negro no Alabama dos anos 1930."
    },
    {
        imagem: "img/as-vinhas-da-ira.jpg",
        titulo: "As Vinhas da Ira",
        publicacao: "1939",
        paginas: "464",
        autor: "John Steinbeck",
        genero: "Drama",
        texto: "Romance épico que segue a família Joad, agricultores que migram da Dust Bowl para a Califórnia durante a Grande Depressão em busca de uma vida melhor."
    },
    {
        imagem: "img/um-estranho-ninho.jpg",
        titulo: "Um Estranho no Ninho",
        publicacao: "1962",
        paginas: "320",
        autor: "Ken Kesey",
        genero: "Drama",
        texto: "Narrativa ambientada em um hospital psiquiátrico, explorando temas de liberdade, rebelião e a luta do indivíduo contra sistemas opressivos."
    },
    {
        imagem: "img/sherlock-holmes.jpg",
        titulo: "As Aventuras de Sherlock Holmes",
        publicacao: "1892",
        paginas: "307",
        autor: "Arthur Conan Doyle",
        genero: "Policial",
        texto: "Coleção de doze contos protagonizados pelo detetive Sherlock Holmes e seu companheiro Dr. Watson, apresentando casos intrigantes resolvidos através da dedução lógica."
    },
    {
        imagem: "img/o-silencio-dos-inocentes.jpg",
        titulo: "O Silêncio dos Inocentes",
        publicacao: "1988",
        paginas: "352",
        autor: "Thomas Harris",
        genero: "Policial",
        texto: "Thriller psicológico que acompanha a agente do FBI Clarice Starling em sua busca por um serial killer com a ajuda do psiquiatra canibal Hannibal Lecter."
    },
    {
        imagem: "img/a-garota-do-trem.jpg",
        titulo: "A Garota do Trem",
        publicacao: "2015",
        paginas: "336",
        autor: "Paula Hawkins",
        genero: "Policial",
        texto: "Narrativa psicológica sobre Rachel, uma mulher que testemunha algo chocante durante sua viagem diária de trem e se vê envolvida em uma investigação criminal."
    },
    {
        imagem: "img/o-codigo-da-vinci.jpg",
        titulo: "O Código Da Vinci",
        publicacao: "2003",
        paginas: "480",
        autor: "Dan Brown",
        genero: "Policial",
        texto: "Thriller que mistura conspirações religiosas e históricas, seguindo o simbologista Robert Langdon na investigação de um assassinato no Museu do Louvre."
    },
    {
        imagem: "img/assassinato-no-expresso-oriente.jpg",
        titulo: "Assassinato no Expresso Oriente",
        publicacao: "1934",
        paginas: "256",
        autor: "Agatha Christie",
        genero: "Policial",
        texto: "Um dos mais famosos casos de Hercule Poirot, onde o detetive investiga um assassinato ocorrido a bordo do luxuoso Expresso Oriente durante uma nevasca."
    }

   
];


const livrosRomance = todosLivros.filter(livro => livro.genero === "Romance");




function formatString(value) {
    return value.toLowerCase().trim();
}


function isRomancePage() {
    return window.location.pathname.includes('romance.html') || 
           document.querySelector('.page-title')?.textContent.includes('Romance');
}
function isAcaoPage() {
    return window.location.pathname.includes('acao.html') || 
           document.querySelector('.page-title')?.textContent.includes('Ação');
}
function isDramaPage() {
    return window.location.pathname.includes('drama.html') || 
           document.querySelector('.page-title')?.textContent.includes('Drama');
}
function isPolicialPage() {
    return window.location.pathname.includes('policial.html') || 
           document.querySelector('.page-title')?.textContent.includes('Policial');
}



function getListaLivros() {
    if (isRomancePage()) {
        return todosLivros.filter(livro => livro.genero === "Romance");
    } else if (isPolicialPage()) {
        return todosLivros.filter(livro => livro.genero === "Policial");
    } else if (isDramaPage()) {
        return todosLivros.filter(livro => livro.genero === "Drama");
    } else if (isAcaoPage()) {
        return todosLivros.filter(livro => livro.genero === "Ação");
    } else {
        return todosLivros;
    }
}


function mostrarLivro(indice, listaLivros) {
    if (!listaLivros || listaLivros.length === 0) return;
    
    const livro = listaLivros[indice];
    
 
    const imgElement = document.getElementById("imgLivro");
    const tituloElement = document.getElementById("tituloLivro");
    const autorElement = document.getElementById("autorLivro");
    const publicacaoElement = document.getElementById("publicacaoLivro");
    const paginasElement = document.getElementById("paginasLivro");
    const generoElement = document.getElementById("generoLivro");
    const textoElement = document.getElementById("textoLivro");
    
    if (imgElement) imgElement.src = livro.imagem;
    if (tituloElement) tituloElement.textContent = livro.titulo;
    if (autorElement) autorElement.textContent = livro.autor;
    if (publicacaoElement) publicacaoElement.textContent = livro.publicacao;
    if (paginasElement) paginasElement.textContent = livro.paginas;
    if (generoElement) generoElement.textContent = livro.genero;
    if (textoElement) textoElement.textContent = livro.texto;
    
    
    const contadorElement = document.getElementById("contadorLivros");
    if (contadorElement) {
        contadorElement.textContent = `Livro ${indice + 1} de ${listaLivros.length}`;
    }
}


function configurarNavegacao() {
    const listaLivros = getListaLivros();
    let indiceAtual = 0;
    
  
    mostrarLivro(indiceAtual, listaLivros);
    
    
    const botaoProximo = document.getElementById("proximo");
    const botaoAnterior = document.getElementById("anterior");
    
    if (botaoProximo) {
        botaoProximo.addEventListener("click", () => {
            indiceAtual++;
            if (indiceAtual >= listaLivros.length) indiceAtual = 0;
            mostrarLivro(indiceAtual, listaLivros);
        });
    }
    
    if (botaoAnterior) {
        botaoAnterior.addEventListener("click", () => {
            indiceAtual--;
            if (indiceAtual < 0) indiceAtual = listaLivros.length - 1;
            mostrarLivro(indiceAtual, listaLivros);
        });
    }
}


function configurarBusca() {
    const searchInput = document.getElementById('search');
    const submitButton = document.getElementById('submit');
    
    if (!searchInput || !submitButton) return; 
    
    function searchAndDisplayBook() {
        const searchTerm = formatString(searchInput.value);
        const listaLivros = getListaLivros();
        
        const bookIndex = listaLivros.findIndex(livro => 
            formatString(livro.titulo).includes(searchTerm) ||
            formatString(livro.autor).includes(searchTerm) ||
            formatString(livro.genero).includes(searchTerm)
        );
        
        if (bookIndex !== -1) {
           
            mostrarLivro(bookIndex, listaLivros);
            
           
            if (window.indiceAtual !== undefined) {
                window.indiceAtual = bookIndex;
            }
        } else {
            console.log('Livro Não Encontrado');
            alert('Livro não encontrado! Tente novamente com outro termo.');
        }
    }
    
   
    submitButton.addEventListener('click', searchAndDisplayBook);
    
    searchInput.addEventListener('keypress', (e) => {
        if (e.key === 'Enter') {
            searchAndDisplayBook();
        }
    });
}


document.addEventListener('DOMContentLoaded', function() {
    configurarNavegacao();
    configurarBusca();
});



function isPolicialPage() {
    return window.location.pathname.includes('policial.html') || 
           document.querySelector('.page-title')?.textContent.includes('Policial');
}

function isDramaPage() {
    return window.location.pathname.includes('drama.html') || 
           document.querySelector('.page-title')?.textContent.includes('Drama');
}

function isAcaoPage() {
    return window.location.pathname.includes('acao.html') || 
           document.querySelector('.page-title')?.textContent.includes('Ação');
}


function getListaLivros() {
    if (isRomancePage()) {
        return todosLivros.filter(livro => livro.genero === "Romance");
    } else if (isPolicialPage()) {
        return todosLivros.filter(livro => livro.genero === "Policial");
    } else if (isDramaPage()) {
        return todosLivros.filter(livro => livro.genero === "Drama");
    } else if (isAcaoPage()) {
        return todosLivros.filter(livro => livro.genero === "Ação");
    } else {
        return todosLivros;
    }
}
