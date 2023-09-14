package com.shikhar.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shikhar.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
