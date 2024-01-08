package com.learnjpaandjdbc.demo.course.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1, "Learn flutter", "Udemy"));
        courseJdbcRepository.insert(new Course(2, "Learn Spring", "Udemy"));
        courseJdbcRepository.insert(new Course(3, "Learn ML", "Udemy"));

    }
}
