import {Cliente} from "./Clientes.js"
import {ContaCorrente} from "./Contas/ContaCorrente.js"
import { ContaPoupanca } from "./Contas/ContaPoupanca.js"
import { ContaSalario } from "./Contas/ContaSalario.js"

const cliente1 = new Cliente('Vinicius', 111222333309)

const contaCorrenteCliente1 = new ContaCorrente(cliente1, 1001)
const contaPoupancaCliente1 = new ContaPoupanca(50, cliente1, 1001)
const contaSalarioCliente1 = new ContaSalario(cliente1)

contaCorrenteCliente1.despositar(500)
contaCorrenteCliente1.sacar(100)
contaPoupancaCliente1.sacar(10)
contaSalarioCliente1.despositar(2000)
contaSalarioCliente1.sacar(200)

