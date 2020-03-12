package com.student.information.system.service;

import com.student.information.system.model.Player;
import java.util.List;

public interface PlayerService {
    List<Player> findAll();

    Player saveOrUpdatePlayer(Player player);

}
