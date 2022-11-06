export class ContaCorrente {
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