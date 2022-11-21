export class Cliente {
    

    constructor(nome, cpf) {
        this.nome = nome
        this._cpf = cpf
    }

    autenticar(){
        return true
    }

    get cpf() {
        return this._cpf
    }
}