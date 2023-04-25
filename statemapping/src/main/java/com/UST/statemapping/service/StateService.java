package com.UST.statemapping.service;

import com.UST.statemapping.entity.District;
import com.UST.statemapping.entity.State;
import com.UST.statemapping.repository.DistrictRepo;
import com.UST.statemapping.repository.Staterepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {
    @Autowired
    private Staterepo srepo;

    public List<District> findDistrictsByStateName(String name) {
        State state = srepo.findByName(name);
        return state.getDistricts();
    }

    public State findStateByName(String name) {
        return srepo.findByName(name);
    }
}
