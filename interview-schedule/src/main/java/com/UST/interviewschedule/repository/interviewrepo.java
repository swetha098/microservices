package com.UST.interviewschedule.repository;

import com.UST.interviewschedule.entity.interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface interviewrepo extends JpaRepository<interview, Long> {
}
