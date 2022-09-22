function IniciaJogo() 
{
    BotoesRow();
    palavra.style.display = 'none';
    btnAdicionarPalavra.style.display = 'none';
    btnSalvaComeca.style.display = 'none';
    btnVoltar.style.display = 'none';
    jogo.style.display = 'flex';
    btnNovoJogo.style.display = 'flex';
    btnDesistir.style.display = 'flex';
    let tela = document.querySelector('canvas');
    let pincel = tela.getContext('2d');
    
    pincel.strokeStyle = '#0A3871';
    pincel.beginPath();
    pincel.moveTo(300, 10);
    pincel.lineTo(300, 275);
    pincel.stroke();
    pincel.moveTo(250, 275);
    pincel.lineTo(350, 275);
    pincel.stroke();
    
    pincel.moveTo(300, 10);
    pincel.lineTo(400, 10);
    pincel.stroke();
    pincel.lineTo(400, 60);
    pincel.stroke();
    pincel.moveTo(375, 60);
    pincel.lineTo(425, 60);
    pincel.stroke();
    pincel.closePath();

    function DesenhaTabuleiro(x) 
    {       
        pincel.moveTo(x, 350);
        pincel.lineTo(x + 50, 350);
        pincel.stroke();
    }
    
    console.log(palavrasChave);
    var palavraSecreta = Math.ceil(Math.random(palavrasChave) *palavrasChave.length -1);
    
}

function AdicionaPalavra()
{
    BotoesRow();
    btnNovoJogo.style.display = 'none';
    btnAdicionarPalavra.style.display = 'none';
    palavraInput.style.display = 'flex';
    btnSalvaComeca.style.display = 'flex';
    btnVoltar.style.display = 'flex';
    var input = document.querySelector("textarea");
    palavraAdicionada = input.value
    palavrasChave.push(palavraAdicionada);
    console.log(palavrasChave);
    input.value = "";
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

function BotoesColumn() {
    
    botoes.style.flexDirection = 'column';
    botoes.style.height= '80vh';
}

function BotoesRow() {
    botoes.style.flexDirection = 'row';
    botoes.style.height= '12vh';
}

let palavrasChave = ["alura", "carro", "celular", "cachorro", "torta", "espelho", "notebook"];

let jogo = document.getElementById("jogo");
let palavraInput = document.getElementById("palavra");
let botoes = document.getElementById("buttons-container");
let btnNovoJogo = document.getElementById("novo-jogo");
let btnAdicionarPalavra = document.getElementById("adicionar-palavra");
let btnSalvaComeca = document.getElementById("salvar-comecar");
let btnDesistir = document.getElementById("desistir");
let btnVoltar = document.getElementById("voltar");

btnNovoJogo.onclick = IniciaJogo;
btnAdicionarPalavra.onclick = AdicionaPalavra;
btnSalvaComeca.onclick = IniciaJogo;
btnVoltar.onclick = VoltarIndex;
btnDesistir.onclick = VoltarIndex;

jogo.style.display = 'none';
palavraInput.style.display = 'none';
btnSalvaComeca.style.display = 'none';
btnDesistir.style.display = 'none';
btnVoltar.style.display = 'none';