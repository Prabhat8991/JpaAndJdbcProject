package com.learnjpaandjdbc.demo;

import com.learnjpaandjdbc.demo.course.repository.Course;
import com.learnjpaandjdbc.demo.course.repository.CourseJdbcRepository;
import com.learnjpaandjdbc.demo.course.repository.CourseJpaRepository;
import com.learnjpaandjdbc.demo.course.repository.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;


//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1, "Learn flutter", "Udemy"));
//        repository.insert(new Course(2, "Learn Spring", "Udemy"));
//        repository.insert(new Course(3, "Learn ML", "Udemy"));
//
//        repository.delete(1);
//        System.out.println(repository.findCourseById(2));

        //Spring data JPA
        repository.save(new Course(1, "Learn flutter", "Udemy"));
        repository.save(new Course(2, "Learn Spring", "Udemy"));
        repository.save(new Course(3, "Learn ML", "Udemy"));

        repository.deleteById(1L);
        System.out.println(repository.findById(2L));


    }
}
