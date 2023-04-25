package com.UST.interviewschedule.controller;

import com.UST.interviewschedule.entity.interview;
import com.UST.interviewschedule.service.Interviewservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interview")
public class interviwcontroller {
    @Autowired
    private Interviewservice interviewservice;

    @PostMapping("/")
    public interview addinterview(@RequestBody interview inter){
        return interviewservice.adddetails(inter);

    }
    @GetMapping("/getter")
    public List<interview> getAllInterview(){
        return interviewservice.getAllinterview();}

    @GetMapping("/{id}")
    public interview getDetailsById(@PathVariable Long id){
        return interviewservice.getAllInterview(id);
    }



}
