import { clienteService } from "../services/cliente-service.js"

const url = new URL (window.location)
const id = url.searchParams.get('id')

const inputNome = document.querySelector('[data-nome]')
const inputEmail = document.querySelector('[data-email]')

clienteService.dadosCliente(id)
.then(dados => {
    inputNome.value = dados.nome
    inputEmail.value = dados.email
})

const formulario = document.querySelector('[data-form]')
formulario.addEventListener('submit', (e) =>{
    e.preventDefault()

    clienteService.editaCliente(id, inputNome.value, inputEmail.value)
    .then(() => window.location.href = '../telas/edicao_concluida.html')
})