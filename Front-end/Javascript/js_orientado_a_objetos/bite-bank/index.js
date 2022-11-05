class Cliente {
    nome
    cpf
}

class ContaCorrente {
    agencia
    saldo
    
    sacar(valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    despositar(valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor
        }
    }
}

const cliente1 = new Cliente()
cliente1.nome = 'Vinicius'
cliente1.cpf = '111222333309'

const contaCorrenteCliente1 = new ContaCorrente()

contaCorrenteCliente1.saldo = 500
console.log(contaCorrenteCliente1.saldo)

contaCorrenteCliente1.despositar(100)
console.log(contaCorrenteCliente1.saldo)

contaCorrenteCliente1.sacar(20)
console.log(contaCorrenteCliente1.saldo)

console.log(cliente1)
