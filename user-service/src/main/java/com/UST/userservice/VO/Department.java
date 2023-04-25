package com.UST.userservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Department {
    private Long departmentId;
    private String department;
    private String getDepartmentAddress;
    private String departmentCode;
}
