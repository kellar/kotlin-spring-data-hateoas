package com.blakekellar.kotlinspringdatahateoas.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Person(@Id @GeneratedValue(strategy = GenerationType.AUTO) private val id: Long = 0,
                  val firstName: String?,
                  val lastName: String?) {
    constructor() : this(firstName = "", lastName = "")    // or hibernate blows up
}
