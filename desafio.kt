// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
package com.V1nic1us

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario (var nome: String, var email: String, val senha: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    private val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun listarInscritos() {
        println(inscritos)
    }

    fun listarConteudos() {
        println(nome + conteudos)
    }
}

fun main(args: Array<String>) {
    // Criação dos usuarios
    val usuario1 = Usuario("marcus", "marcus@gmail.com", "123")
    val usuario2 = Usuario("vinicius", "marcus@gmail.com", "123")
    val usuario3 = Usuario("marques", "marcus@gmail.com", "123")

    // Criação dos conteudos educacionais
    val conteudoEducacional1 = ConteudoEducacional("Conhecendo o Kotlin e Sua Documentação Oficial", 30, Nivel.BASICO)
    val conteudoEducacional2 = ConteudoEducacional("Introdução Prática à Linguagem de Programação Kotlin", 60, Nivel.INTERMEDIARIO)
    val conteudoEducacional3 = ConteudoEducacional("Estruturas de Controle de Fluxo e Coleções em Kotlin", 120, Nivel.INTERMEDIARIO)
    val conteudoEducacional4 = ConteudoEducacional("Programação Orientada a Objeto em Kotlin", 140, Nivel.DIFICIL)

    // Adicionado os conteudos em uma lista para que possa ser passado para a instancia de formação
    val listaDeConteudos = mutableListOf(conteudoEducacional1, conteudoEducacional2, conteudoEducacional3, conteudoEducacional4)

    // Criação da formação com a lsita de conteudos
    val formacao = Formacao("Desenvolvimento Android", listaDeConteudos)

    // Inscrição de Usuarios
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)

    // Listagem dos Inscritos na Formação
    formacao.listarInscritos()

    // Listagem dos conteudos da formação
    formacao.listarConteudos()
}
