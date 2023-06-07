package com.example.testpgextensions;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PgRepository extends JpaRepository<Users,Long> {
}
