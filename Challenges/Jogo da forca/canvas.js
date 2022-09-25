let tela = document.querySelector('canvas');
let pincel = tela.getContext('2d');

function DesenhaForca()
{
    pincel.clearRect(0, 0, tela.width, tela.height);
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
}

function DesenhaLinha(x) 
{      
    pincel.moveTo(200 + x, 350);
    pincel.lineTo(250 + x, 350);
    pincel.stroke();
}

function DesenhaTabuleiro() 
{
    
    let palavraSecreta = palavrasChave[Math.floor(Math.random() *palavrasChave.length)];
    let largura = 450/palavraSecreta.length;
    console.log(palavraSecreta);
    console.log(palavraSecreta.length);

    for (let i = 0; i < palavraSecreta.length; i++) {
        console.log(i);
        DesenhaLinha(largura*i);
    }
}