import {Cliente} from "./Clientes.js"
import {ContaCorrente} from "./ContaCorrente.js"
import { ContaPoupanca } from "./ContaPoupanca.js"

const cliente1 = new Cliente('Vinicius', 111222333309)

const contaCorrenteCliente1 = new ContaCorrente(cliente1, 1001)
const contaPoupancaCliente1 = new ContaPoupanca(50, cliente1, 1001)

contaCorrenteCliente1.despositar(500)
contaCorrenteCliente1.sacar(100)
contaPoupancaCliente1.sacar(10)


console.log(cliente1)
console.log(contaCorrenteCliente1)
console.log(contaPoupancaCliente1)