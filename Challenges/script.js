let input = document.querySelector('input');
let texto = document.querySelector('#texto');
let imagem = document.querySelector('#imagem');
let letraChave = ['e', 'i', 'a', 'o', 'u'];
let textoCodificado;

texto.style.display = "none";

function criptografar()
{
    textoCodificado = input.value;
    
    for (let i = 0; i < textoCodificado.length; i++) 
    {    

        if (textoCodificado[i] == 'e') 
        {
            textoCodificado[i] = 'enter';
            console.log(textoCodificado[i]);
        }

    }


    texto.textContent = textoCodificado;
    
    imagem.style.display = "none";
    texto.style.display = "block";
}