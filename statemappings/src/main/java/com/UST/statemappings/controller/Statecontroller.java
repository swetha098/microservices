package com.UST.statemappings.controller;

import com.UST.statemappings.entity.State;
import com.UST.statemappings.repository.StateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/req")
public class Statecontroller {
    @Autowired
    private StateRepo stateRepo;

    @GetMapping("/{name}")
    public State getdist(String name){
       return stateRepo.findById(name).orElse(null);

    }
}
