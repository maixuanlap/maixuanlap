package com.example.maixuanlap.controller;

import com.example.maixuanlap.entity.EmployeeEntity;
import com.example.maixuanlap.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class WebController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping({"/", "/index"})
    public String index(Model model) {
        List<EmployeeEntity> employees = employeeService.findAllEmployees();
        model.addAttribute("employees", employees);
        return "index";
    }

    @GetMapping({"/add"})
    public String createIndex() {
        return "add";
    }

    @PostMapping({"/add"})
    public String create(@RequestParam Map<String, String> param) {
        employeeService.createEmployee(new EmployeeEntity(param.get("name"), Integer.parseInt(param.get("wage"))));
        return "redirect:index";
    }
}
