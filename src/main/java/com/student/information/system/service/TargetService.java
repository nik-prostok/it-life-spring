package com.student.information.system.service;

import com.student.information.system.model.Target;

import java.util.List;

public interface TargetService {
    List<Target> findAll();
    Target saveOrUpdateTarget(Target target);
}
