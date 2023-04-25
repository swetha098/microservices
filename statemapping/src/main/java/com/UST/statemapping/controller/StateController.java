package com.UST.statemapping.controller;

import com.UST.statemapping.entity.District;
import com.UST.statemapping.entity.State;
import com.UST.statemapping.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StateController {

    @Autowired
    private StateService stateService;

//    @GetMapping("/states/{name}")
//    public State getStateByName(@PathVariable String name) {
//        return stateService.findStateByName(name);
//    }

    @GetMapping("/states/districts/{name}")
    public List<District> getDistrictsByStateName(@PathVariable String name) {
        return stateService.findDistrictsByStateName(name);
    }
}

