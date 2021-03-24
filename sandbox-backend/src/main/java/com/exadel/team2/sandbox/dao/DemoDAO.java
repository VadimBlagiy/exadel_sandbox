package com.exadel.team2.sandbox.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exadel.team2.sandbox.entity.DemoEntity;

@Repository
public interface DemoDAO extends JpaRepository<DemoEntity, Long> {
}
