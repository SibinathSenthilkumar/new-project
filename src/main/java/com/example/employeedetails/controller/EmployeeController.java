package com.example.employeedetails.controller;

import com.example.employeedetails.module.EmployeeRequestBody;
import com.example.employeedetails.module.EmployeeResponsesBody;
import com.example.employeedetails.services.EmployeeServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServicesImp employeeServicesImp;
    @PostMapping (value = "/details")
                    private EmployeeResponsesBody getEmployeeDetails(@RequestBody  EmployeeRequestBody employeeRequestBody){
                    private EmployeeResponsesBody getEmployeeDetails(@RequestBody  EmployeeRequestBody employeeRequestBody){
        EmployeeResponsesBody employeeResponsesBody =employeeServicesImp.getEmployeeDeatails(employeeRequestBody);
        return employeeResponsesBody;
    }

}