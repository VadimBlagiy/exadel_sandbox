package com.exadel.team2.sandbox.service;

import java.util.List;

import com.exadel.team2.sandbox.entity.DemoEntity;

public interface DemoService {

    DemoEntity getById(Long id);

    List<DemoEntity> getAll();

    DemoEntity save(DemoEntity demoEntity);

    DemoEntity update(DemoEntity demoEntity);

    void delete(Long id);
}
