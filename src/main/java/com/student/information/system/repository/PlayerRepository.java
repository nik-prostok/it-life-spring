package com.student.information.system.repository;

import com.student.information.system.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<Player, String> {

}
