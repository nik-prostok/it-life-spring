package com.student.information.system.service.impl;

import com.student.information.system.model.Player;
import com.student.information.system.repository.PlayerRepository;
import com.student.information.system.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    @Override
    public Player saveOrUpdatePlayer(Player player) {
        return playerRepository.save(player);
    }
}
