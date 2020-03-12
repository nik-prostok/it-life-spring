package com.student.information.system.controller;

import com.student.information.system.dto.PlayerDTO;
import com.student.information.system.dto.StudentDTO;
import com.student.information.system.model.Player;
import com.student.information.system.model.Student;
import com.student.information.system.service.PlayerService;
import com.student.information.system.util.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerRestController {

    private PlayerService playerService;

    @GetMapping(value = "")
    public List<PlayerDTO> getAllPlayers() {
        return ObjectMapperUtils.mapAll(playerService.findAll(), PlayerDTO.class);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdatePlayer(@RequestBody PlayerDTO playerDTO) {
        playerService.saveOrUpdatePlayer(ObjectMapperUtils.map(playerDTO, Player.class));
        return new ResponseEntity("Player added successfully", HttpStatus.OK);
    }

}
