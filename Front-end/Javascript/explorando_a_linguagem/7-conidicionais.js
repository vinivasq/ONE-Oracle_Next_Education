console.log(`Trabalhando com condicionais`)
const listaDeDestinos = [`Salvador`, `São Paulo`, `Rio de Janeiro`]

const idadeComprador = 18
const estaAcompanhada = false
const temPassagemComprada = true

console.log("Destinos possíveis:")
console.log(listaDeDestinos)

if (idadeComprador >= 18 || estaAcompanhada == true) {
    console.log("Boa Viagem!!")
    listaDeDestinos.splice(2, 1)
} else {
    console.log("Não é maior de Idade e não posso vender")
}

console.log("Embarque: \n\n")
if(idadeComprador >= 18 && temPassagemComprada){
    console.log("Boa viagem")
}else{
    console.log("Você não pode embarcar")
}

console.log(listaDeDestinos)
