package com.student.information.system.service.impl;

import com.student.information.system.model.Target;
import com.student.information.system.repository.TargetRepository;
import com.student.information.system.service.TargetService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TargetServiceImpl implements TargetService {

    @Autowired
    private TargetRepository targetRepository;

    @Override
    public List<Target> findAll() {
        return targetRepository.findAll();
    }

    @Override
    public Target saveOrUpdateTarget(Target target) {
        return targetRepository.save(target);
    }
}
