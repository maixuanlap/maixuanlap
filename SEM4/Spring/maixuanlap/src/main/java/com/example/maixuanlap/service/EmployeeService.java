package com.example.maixuanlap.service;

import com.example.maixuanlap.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    EmployeeEntity createEmployee(EmployeeEntity e);
    List<EmployeeEntity> findAllEmployees();
}
