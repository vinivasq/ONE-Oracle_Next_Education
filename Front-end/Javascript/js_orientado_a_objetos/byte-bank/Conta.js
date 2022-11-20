export class Conta {
    constructor(saldoInicial, cliente, agencia) {
        this._agencia = agencia
        this._cliente = cliente
        this._saldo = saldoInicial
    }
    
    set cliente(novoCliente) {
        if (novoCliente instanceof Cliente) {
            this._cliente = novoCliente
        }
    }

    get cliente() {
        return this._cliente
    }

    get saldo() {
        return this._saldo
    }

    sacar(valor) {
        let taxa = 1

        this._sacar(valor, taxa)
    }
    
    _sacar(valor, taxa) {
        const valorSacado = valor * taxa
        if (this._saldo >= valorSacado) {
            this._saldo -= valorSacado
            return valorSacado
        }

        return 0
    }

    despositar(valor) {
        if (valor <= 0) return
        this._saldo = this._saldo + valor
    }
    
    transferir(valor, conta) {
        const valorSacado = this.sacar(valor)
        conta.despositar(valorSacado)
    }
}