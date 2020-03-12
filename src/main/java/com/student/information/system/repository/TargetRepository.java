package com.student.information.system.repository;

import com.student.information.system.model.Target;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TargetRepository extends MongoRepository<Target, String> {

}
