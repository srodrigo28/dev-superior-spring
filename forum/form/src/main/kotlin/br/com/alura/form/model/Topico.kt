package br.com.alura.form.model

import java.time.LocalDateTime

data class Topico {
    val id: Long? = null,
    val titulo: String,
    val mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val curso: Curso,
    val autor: Usuario,
    val status: StatusTopico = Status.NAO_RESPONDIDO

}