import {Cliente} from "./Clientes.js"
import {ContaCorrente} from "./ContaCorrente.js"

const cliente1 = new Cliente()
cliente1.nome = 'Vinicius'
cliente1.cpf = 111222333309

const contaCorrenteCliente1 = new ContaCorrente()
contaCorrenteCliente1.agencia = 1001
contaCorrenteCliente1.cliente = cliente1

const cliente2 = new Cliente()
cliente2.nome = 'Victoria'
cliente2.cpf = 44455566610

const contaCorrenteCliente2 = new ContaCorrente()
contaCorrenteCliente2.agencia = 1010
contaCorrenteCliente2.cliente = cliente2

contaCorrenteCliente1.despositar(500)
contaCorrenteCliente1.transferir(200, contaCorrenteCliente2)

console.log(contaCorrenteCliente1)
console.log(contaCorrenteCliente2)