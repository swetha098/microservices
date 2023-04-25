package com.UST.statemapping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="states")
public class State {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "state")
    private List<District>districts;


}
