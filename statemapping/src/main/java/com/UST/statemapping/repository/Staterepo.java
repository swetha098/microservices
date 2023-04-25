package com.UST.statemapping.repository;

import com.UST.statemapping.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Staterepo extends JpaRepository<State,Long> {
    State findByName(String name);
}
