function IniciaJogo() 
{
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
    
    console.log(palavras);
    var palavraSecreta = Math.ceil(Math.random(palavras) *palavras.length -1);
    
}


function AdicionaPalavra()
{
    var input = document.querySelector("textarea");
    palavraAdicionada = input.value
    palavras.push(palavraAdicionada);
    console.log(palavras);
    input.value = "";
}

var palavras = ["alura", "carro", "celular", "cachorro", "torta", "espelho", "notebook"]
