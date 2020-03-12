package com.student.information.system.controller;

import com.student.information.system.dto.PlayerDTO;
import com.student.information.system.dto.TargetDTO;
import com.student.information.system.model.Player;
import com.student.information.system.model.Target;
import com.student.information.system.service.TargetService;
import com.student.information.system.util.ObjectMapperUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/targets")
public class TargetRestController {

    private TargetService targetService;

    @GetMapping(value = "")
    public List<TargetDTO> getAllTargets() {
        return ObjectMapperUtils.mapAll(targetService.findAll(), TargetDTO.class);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateTarget(@RequestBody TargetDTO targetDTO) {
        targetService.saveOrUpdateTarget(ObjectMapperUtils.map(targetDTO, Target.class));
        return new ResponseEntity("Target added successfully", HttpStatus.OK);
    }

}
