package com.example;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;
import io.micronaut.runtime.Micronaut;
import jakarta.inject.Singleton;

import java.util.List;


@Singleton
@Repository

public interface MyEmployeeRepository extends JpaRepository<MyEmployee,Long> {



}


