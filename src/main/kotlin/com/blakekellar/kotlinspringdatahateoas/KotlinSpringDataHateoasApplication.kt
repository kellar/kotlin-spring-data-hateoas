package com.blakekellar.kotlinspringdatahateoas

import com.blakekellar.kotlinspringdatahateoas.model.Person
import com.blakekellar.kotlinspringdatahateoas.repository.PersonRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration
import javax.annotation.PostConstruct

@SpringBootApplication
class KotlinSpringDataHateoasApplication

@Configuration
class DemoDataLoader(val repository: PersonRepository) {

    @PostConstruct
    fun loadData() {
        repository.save(Person(firstName = "Arthur", lastName = "Dent"))
    }
}

fun main(args: Array<String>) {
    runApplication<KotlinSpringDataHateoasApplication>(*args)
}
