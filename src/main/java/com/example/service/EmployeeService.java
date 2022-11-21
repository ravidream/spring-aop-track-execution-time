package com.example.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.example.aspect.TrackExecutionTime;

@Service
@Slf4j
public class EmployeeService {
	private static final String DATA = 
			"{ \"id\": \"01001\", \"name\": \"ravi\"}";

    @TrackExecutionTime
    public String getEmployeeNameFromId(String id){
        return DATA;
    }
}
