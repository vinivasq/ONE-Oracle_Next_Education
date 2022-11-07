import {Cliente} from "./Clientes.js"
import {ContaCorrente} from "./ContaCorrente.js"

const cliente1 = new Cliente('Vinicius', 111222333309)
const cliente2 = new Cliente('Victoria', 44455566610)

const contaCorrenteCliente1 = new ContaCorrente(cliente1, 1001)
const contaCorrenteCliente2 = new ContaCorrente(cliente2, 1010)

contaCorrenteCliente1.despositar(500)
contaCorrenteCliente1.transferir(200, contaCorrenteCliente2)

console.log(ContaCorrente.numeroDeContas)