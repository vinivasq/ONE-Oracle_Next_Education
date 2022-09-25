function IniciaJogo() 
{
    TelaJogo();
    DesenhaForca();
    DesenhaTabuleiro();

    document.onkeydown = (e) => {
        let key = e.keyCode;

        if (VerificaLetra(key)) {
            
        }

    }
}

function AdicionaPalavra()
{
    TelaPalavra();
    let input = document.querySelector("textarea");
    let palavraAdicionada = input.value
    palavrasChave.push(palavraAdicionada);
    console.log(palavrasChave);
    input.value = "";
    IniciaJogo();
}

function VoltarIndex() {
    
    BotoesColumn();
    jogo.style.display = 'none';
    palavraInput.style.display = 'none';
    btnSalvaComeca.style.display = 'none';
    btnDesistir.style.display = 'none';
    btnVoltar.style.display = 'none';
    btnAdicionarPalavra.style.display = 'flex';
    btnNovoJogo.style.display = 'flex';
}

function TelaPalavra() {
    BotoesRow();
    btnNovoJogo.style.display = 'none';
    btnAdicionarPalavra.style.display = 'none';
    palavraInput.style.display = 'flex';
    btnSalvaComeca.style.display = 'flex';
    btnVoltar.style.display = 'flex';
}

function TelaJogo() {
    BotoesRow();
    palavra.style.display = 'none';
    btnAdicionarPalavra.style.display = 'none';
    btnSalvaComeca.style.display = 'none';
    btnVoltar.style.display = 'none';
    jogo.style.display = 'flex';
    btnNovoJogo.style.display = 'flex';
    btnDesistir.style.display = 'flex';
}

function BotoesColumn() {
    
    botoes.style.flexDirection = 'column';
    botoes.style.height= '70vh';
}

function BotoesRow() {
    botoes.style.flexDirection = 'row';
    botoes.style.height= '12vh';
}

function VerificaLetra(key) {
    let letra = String.fromCharCode(key).toUpperCase();
    if (key >= 65 && key <=90) {
        letras.push(letra);
        console.log(key);
        console.log(letra)
        console.log(letras);
    }
}

let letras = [];
let palavrasChave = ["alura", "carro", "celular", "cachorro", "torta", "espelho", "notebook", "mesa"];

let jogo = document.getElementById("jogo");
let palavraInput = document.getElementById("palavra");
let botoes = document.getElementById("buttons-container");
let btnNovoJogo = document.getElementById("novo-jogo");
let btnAdicionarPalavra = document.getElementById("adicionar-palavra");
let btnSalvaComeca = document.getElementById("salvar-comecar");
let btnDesistir = document.getElementById("desistir");
let btnVoltar = document.getElementById("voltar");

btnNovoJogo.onclick = IniciaJogo;
btnAdicionarPalavra.onclick = TelaPalavra;
btnSalvaComeca.onclick = AdicionaPalavra;
btnVoltar.onclick = VoltarIndex;
btnDesistir.onclick = VoltarIndex;

jogo.style.display = 'none';
palavraInput.style.display = 'none';
btnSalvaComeca.style.display = 'none';
btnDesistir.style.display = 'none';
btnVoltar.style.display = 'none';