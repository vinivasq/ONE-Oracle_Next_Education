export class ContaCorrente {
    agencia
    cliente

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
    
    transferir(valor, conta) {
        const valorSacado = this.sacar(valor)
        conta.despositar(valorSacado)
    }
    
}