package com.example.studentexamresultsportal.repository;

import com.example.studentexamresultsportal.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResultRepository extends JpaRepository<Result, Long> {
    List<Result> findByRollNumber(String rollNumber);
}
