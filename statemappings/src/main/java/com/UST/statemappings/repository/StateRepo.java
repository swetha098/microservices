package com.UST.statemappings.repository;

import com.UST.statemappings.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepo extends JpaRepository<State,String> {
}
