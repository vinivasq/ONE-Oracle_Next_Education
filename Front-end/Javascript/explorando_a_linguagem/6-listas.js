console.log(`Trabalhando com listas`)

const listaDeDestinos = [`São Paulo`, `Rio de Janeiro`, `Salvador`]

listaDeDestinos.push(`Curitiba`)
console.log(listaDeDestinos)
console.log(listaDeDestinos[0])

listaDeDestinos.splice(2,1)
console.log(listaDeDestinos)

listaDeDestinos.pop()
console.log(listaDeDestinos)

