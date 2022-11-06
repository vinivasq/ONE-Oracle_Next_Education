import {Cliente} from "./Clientes.js"
import {ContaCorrente} from "./ContaCorrente.js"

const cliente1 = new Cliente()
cliente1.nome = 'Vinicius'
cliente1.cpf = '111222333309'

const contaCorrenteCliente1 = new ContaCorrente()
contaCorrenteCliente1.agencia = 1001

contaCorrenteCliente1.despositar(100)
const valorSacado = contaCorrenteCliente1.sacar(20)

console.log(`O valor sacado foi: ${valorSacado}`)
console.log(contaCorrenteCliente1)