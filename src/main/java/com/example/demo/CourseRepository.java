package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long>{
}

//built in methods for saving, locating and deleting data depending on the criteria in the List < , >
