package com.UST.userservice.service;

import com.UST.userservice.VO.Department;
import com.UST.userservice.VO.ResponseTemplateVO;
import com.UST.userservice.entity.User;
import com.UST.userservice.reopsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
   @Autowired
   private UserRepository repo;
   @Autowired
   private RestTemplate restTemplate;

    public User saveUser(User user) {
        return repo.save(user);
    }

    public ResponseTemplateVO getUserwithDepartment(Long userid) {
        ResponseTemplateVO vo=new ResponseTemplateVO();
        User user=repo.findByUserId(userid);
        Department department=
                restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"+user.getDepartmentId(),Department.class);
       vo.setUser(user);
       vo.setDepartment(department);
        return vo;
    }
}
