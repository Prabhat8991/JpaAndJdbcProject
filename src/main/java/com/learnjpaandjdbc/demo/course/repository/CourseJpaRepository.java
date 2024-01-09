package com.learnjpaandjdbc.demo.course.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

@Repository @Transactional
public class CourseJpaRepository {

    @PersistenceContext private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public void delete(int id) {
        Course course = findCourseById(id);
        entityManager.remove(course);
    }

    public Course findCourseById(long id) {
        return entityManager.find(Course.class, id);
    }
}
