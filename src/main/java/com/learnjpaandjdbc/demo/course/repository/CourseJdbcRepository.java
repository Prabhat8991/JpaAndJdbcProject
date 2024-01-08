package com.learnjpaandjdbc.demo.course.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String INSERT_QUERY = """
                  insert into course (id, name, author) values (?, ?, ?)
            """;

    public void insert(Course course) {
        jdbcTemplate.update(INSERT_QUERY, course.id(), course.name(), course.author());
    }
}
