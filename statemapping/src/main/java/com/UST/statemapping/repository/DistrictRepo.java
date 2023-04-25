package com.UST.statemapping.repository;

import com.UST.statemapping.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DistrictRepo extends JpaRepository<District,Long> {
}
