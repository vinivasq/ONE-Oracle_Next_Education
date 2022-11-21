import { Cliente } from "./Clientes.js";
import { Gerente } from "./Funcionarios/Gerente.js";
import { Diretor } from "./Funcionarios/Diretor.js";
import { SistemaAutenticacao } from "./SistemaAutenticacao.js";


const cliente = new Cliente("Victoria", 1233423412)
const gerente = new Gerente ("Jose", 12345678900, 5000)
gerente.cadastrarSenha("123")
const diretor = new Diretor ("Matheus", 12345678900, 10000)
diretor.cadastrarSenha("12345")

const gerenteEstaLogado = SistemaAutenticacao.login(gerente, "123")
const diretorEstaLogado = SistemaAutenticacao.login(diretor, "12345")
const clienteEstaLogado = SistemaAutenticacao.login(cliente, "12345")


console.log(gerenteEstaLogado, diretorEstaLogado)
