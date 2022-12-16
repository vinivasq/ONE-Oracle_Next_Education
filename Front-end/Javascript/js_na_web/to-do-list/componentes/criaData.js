import { Tarefa } from "./criaTarefa.js"

export const criaData = (data) => {
    const tarefa = JSON.parse(localStorage.getItem('tarefas')) || []
    const dataTopo = document.createElement('li')
    const dataMoment = moment(data, 'DD/MM/YYYY')
    const conteudo = `<p class="content-data">${dataMoment.format("DD/MM/YYYY")}</p>`

    dataTopo.innerHTML = conteudo

    tarefa.forEach(tarefa => {
        const dia = moment(tarefa.dataFormatada, 'DD/MM/YYYY')
        const diff = dataMoment.diff(dia) //metodo do moment para diferenciar as datas obtidas

        if(diff === 0) dataTopo.appendChild(Tarefa(tarefa))
    });
    
    return dataTopo
}