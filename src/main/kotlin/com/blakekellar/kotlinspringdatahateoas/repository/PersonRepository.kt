package com.blakekellar.kotlinspringdatahateoas.repository

import com.blakekellar.kotlinspringdatahateoas.model.Person
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
interface PersonRepository : PagingAndSortingRepository<Person, Long> {

    fun findByLastName(@Param("lastName") lastName: String): List<Person>

}