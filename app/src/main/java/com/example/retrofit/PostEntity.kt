package com.example.retrofit

import com.google.gson.annotations.SerializedName

// Classe que vai mapear os atributos vindos do json
/**SerializedName serve para fazer a identificação das propriedades do json,
também pode ser alterado a forma de identificação se caso a semântica
desejada não corresponder com as propriedades do json
 **/
data class PostEntity(
    @SerializedName("userId")
    val userId: Int,

    @SerializedName("id")
    val id: Int,

    @SerializedName("title")
    val title: String,

    @SerializedName("body")
    val body: String
) {
}