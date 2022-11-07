import { Cliente } from "./Clientes.js"

export class ContaCorrente {
    static numeroDeContas = 0
    agencia
    
    #cliente
    #saldo = 0

    set setCliente(novoCliente) {
        if (novoCliente instanceof Cliente) {
            this.#cliente = novoCliente
        }
    }

    get cliente() {
        return this.#cliente
    }

    get saldo() {
        return this.#saldo
    }

    constructor(cliente, agencia) {
        this.agencia = agencia
        this.setCliente = cliente
        ContaCorrente.numeroDeContas ++
    }

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