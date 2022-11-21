export class Conta {
    constructor(saldoInicial, cliente, agencia) {
        if (this.constructor === Conta) {
            throw new Error('Você não deve criar uma conta do tipo "Conta" por ser uma classe abstrata')
        }
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
        throw new Error('O metodo "sacar" é abstrado e precisa ser sobrescrito')
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