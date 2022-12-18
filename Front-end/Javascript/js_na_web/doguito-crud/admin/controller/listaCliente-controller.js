import { clienteService } from "../services/cliente-service.js"

const tabela = document.querySelector('[data-tabela]')

const criaNovaLinha = (nome, email, id) => {
    const linhaNova = document.createElement('tr')
    const conteudo = `
    <td class="td" data-td>${nome}</td>
    <td>${email}</td>
    <td>
        <ul class="tabela__botoes-controle">
            <li><a href="../telas/edita_cliente.html?id=${id}" class="botao-simples botao-simples--editar">Editar</a></li>
            <li><button class="botao-simples botao-simples--excluir" type="button">Excluir</button></li>
        </ul>
    </td> 
    `

    linhaNova.innerHTML = conteudo
    linhaNova.dataset.id = id
    return linhaNova
}

tabela.addEventListener('click', async (evento) => {
    try {
        const botaoExcluir = evento.target.className === "botao-simples botao-simples--excluir"
    
        if(botaoExcluir){
            const linhaCliente = evento.target.closest('[data-id]')
            const id = linhaCliente.dataset.id
            await clienteService.removeCliente(id)
            linhaCliente.remove()
        }
    }
    catch (erro) {
        console.log(erro);
        window.location.href = '../telas/erro.html'
    }
})

const render = async () => {
    try {
        const listaClientes = await clienteService.listaClientes()
        listaClientes.forEach(element => {
            tabela.appendChild(criaNovaLinha(element.nome, element.email, element.id))
        })
    }
    catch (erro) {
        console.log(erro);
        window.location.href = '../telas/erro.html'
    }
}

render()
