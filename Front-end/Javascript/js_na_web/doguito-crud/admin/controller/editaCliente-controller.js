import { clienteService } from "../services/cliente-service.js"

(async() => {
    const url = new URL (window.location)
    const id = url.searchParams.get('id')
    
    const inputNome = document.querySelector('[data-nome]')
    const inputEmail = document.querySelector('[data-email]')
    
    try {
        const dados = await clienteService.dadosCliente(id)
        inputNome.value = dados.nome
        inputEmail.value = dados.email
    }
    catch (erro) {
        console.log(erro);
        window.location.href = '../telas/erro.html'
    }
    
    
    const formulario = document.querySelector('[data-form]')
    formulario.addEventListener('submit', async (e) =>{
        e.preventDefault()
        try {
            await clienteService.editaCliente(id, inputNome.value, inputEmail.value)
            window.location.href = '../telas/edicao_concluida.html'
        }
        catch (erro) {
            window.location.href = '../telas/erro.html'
            console.log(erro);
        }
    })
})()
