package com.upc.demopapaytf.servicesinterfaces;

import com.upc.demopapaytf.entities.Users;

import java.time.LocalDate;
import java.util.List;

public interface IUserService {
    public void insert(Users user);
    public List<Users> list();
    public void delete(int id);
    public Users lisId(int id);

    public List<Users> findByLastnameUser(String lastname);
    public List<String[]> quantydateBirthByUser();
    public List<String[]> quantyCityByUser();
}