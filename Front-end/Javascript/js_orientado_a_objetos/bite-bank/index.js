class Cliente {
    nome
    cpf
}

class ContaCorrente {
    agencia
    #saldo = 0
    
    sacar(valor) {
        if (this.#saldo >= valor) {
            this.#saldo -= valor
            return valor
        }
    }

    despositar(valor) {
        if (valor <= 0) return
        this.#saldo = this.#saldo + valor
    }
}

const cliente1 = new Cliente()
cliente1.nome = 'Vinicius'
cliente1.cpf = '111222333309'

const contaCorrenteCliente1 = new ContaCorrente()
contaCorrenteCliente1.agencia = 1001

contaCorrenteCliente1.despositar(100)
const valorSacado = contaCorrenteCliente1.sacar(20)

console.log(`O valor sacado foi: ${valorSacado}`)
console.log(contaCorrenteCliente1)