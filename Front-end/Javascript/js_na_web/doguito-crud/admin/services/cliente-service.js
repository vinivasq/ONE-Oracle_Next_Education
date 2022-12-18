const listaClientes = () => {
    return fetch(`http://localhost:3000/profile`)
        .then(resposta => {
            return resposta.json()
        })
}

const criaCliente = (nome, email) => {
    return fetch(`http://localhost:3000/profile`, {
        method: "POST",
        headers: {
            'Content-Type' : 'application/json'
        },
        body: JSON.stringify({
            nome: nome,
            email: email
        })
    })
    .then( (resposta) => {
        return resposta.body
    })
}

const removeCliente = (id) => {
    return fetch(`http://localhost:3000/profile/${id}`, {
        method: 'DELETE'
    })
}

const dadosCliente = (id) => {
    return fetch(`http://localhost:3000/profile/${id}`)
    .then(resposta => resposta.json())
}

const editaCliente = (id, nome, email) => {
    return fetch(`http://localhost:3000/profile/${id}`, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            nome: nome,
            email: email
        })
    })
    .then(resposta => resposta.json())
}

export const clienteService = {
    listaClientes,
    criaCliente,
    dadosCliente,
    editaCliente,
    removeCliente
}
