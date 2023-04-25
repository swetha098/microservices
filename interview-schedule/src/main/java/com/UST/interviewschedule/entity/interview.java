package com.UST.interviewschedule.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="interview_tab")
public class interview {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String phoneNo;
    private String skills;
    private int experience;
    private String date;
    private String time;
    private String link;
    private String poc;

}
