package com.example.demo.repository;

import com.example.demo.entity.AboutToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutToDoRepository extends JpaRepository<AboutToDo,Long> {
}
