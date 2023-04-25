package com.UST.interviewschedule.service;

import com.UST.interviewschedule.entity.interview;
import com.UST.interviewschedule.repository.interviewrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Interviewservice {
    @Autowired
    private interviewrepo repo;

    public interview adddetails(interview inter) {
        return repo.save(inter);
    }



    public List<interview> getAllinterview() {
        return repo.findAll();
    }

    public interview getAllInterview(Long id) {
        return repo.findById(id).orElse(null);
    }
}
