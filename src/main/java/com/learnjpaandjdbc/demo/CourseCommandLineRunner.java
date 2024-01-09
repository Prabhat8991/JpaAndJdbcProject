package com.learnjpaandjdbc.demo;

import com.learnjpaandjdbc.demo.course.repository.Course;
import com.learnjpaandjdbc.demo.course.repository.CourseJdbcRepository;
import com.learnjpaandjdbc.demo.course.repository.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository courseJdbcRepository;


    @Autowired
    private CourseJpaRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1, "Learn flutter", "Udemy"));
        courseJdbcRepository.insert(new Course(2, "Learn Spring", "Udemy"));
        courseJdbcRepository.insert(new Course(3, "Learn ML", "Udemy"));

        courseJdbcRepository.delete(1);
        System.out.println(courseJdbcRepository.findCourseById(2));

    }
}
