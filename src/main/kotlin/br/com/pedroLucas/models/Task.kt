package br.com.pedroLucas.models

import kotlinx.serialization.Serializable

@Serializable
class Task(
    val titulo: String,
    val descricao: String
)