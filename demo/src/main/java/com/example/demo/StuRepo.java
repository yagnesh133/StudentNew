package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StuRepo extends JpaRepository<StuMAnEntity,Long> {
}
