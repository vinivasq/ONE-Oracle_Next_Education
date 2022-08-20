let input = document.querySelector('#input');
let texto = document.querySelector('#texto');
let imagem = document.querySelector('#imagem');
let textoCodificado;
let textoDecodificado;

texto.style.display = "none";

function criptografar()
{
    textoCodificado = input.value.toLowerCase();
    
    textoCodificado = textoCodificado.replace(/e/g, 'enter');
    textoCodificado = textoCodificado.replace(/i/g, 'imes');
    textoCodificado = textoCodificado.replace(/a/g, 'ai');
    textoCodificado = textoCodificado.replace(/o/g, 'ober');
    textoCodificado = textoCodificado.replace(/u/g, 'ufat');
  
    texto.textContent = textoCodificado;
    
    imagem.style.display = "none";
    texto.style.display = "block";
}

function descriptografar()
{
    textoDecodificado = input.value.toLowerCase();
    
    textoDecodificado = textoDecodificado.replace(/enter/g, 'e');
    textoDecodificado = textoDecodificado.replace(/imes/g, 'i');
    textoDecodificado = textoDecodificado.replace(/ai/g, 'a');
    textoDecodificado = textoDecodificado.replace(/ober/g, 'o');
    textoDecodificado = textoDecodificado.replace(/ufat/g, 'u');
    
    texto.textContent = textoDecodificado;   
    
    imagem.style.display = "none";
    texto.style.display = "block";
}

function copiar()
{
    texto.select();
    document.execCommand('copy');

}