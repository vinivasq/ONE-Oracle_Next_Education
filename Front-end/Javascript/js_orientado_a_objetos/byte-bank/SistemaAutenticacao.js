export class SistemaAutenticacao {
    static login(autenticavel, senha){
        if (SistemaAutenticacao.podeAutenticar(autenticavel)) {
            return autenticavel.autenticar(senha)
        }

        return false
    }

    static podeAutenticar(autenticavel){
       return "autenticar" in autenticavel && autenticavel.autenticar instanceof Function
    }
}