package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.aspect.TrackExecutionTime;
import com.example.service.EmployeeService;

@RestController
@Slf4j
@RequestMapping("/api")
public class EmployeeController{

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/emp")
    @TrackExecutionTime
    public String getEmployeeName(@PathVariable String id){
        if (StringUtils.isBlank(id)){
            return null;
        }
        return employeeService.getEmployeeNameFromId(id);
    }
}