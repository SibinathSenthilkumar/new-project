package com.example.employeedetails.services;

import com.example.employeedetails.module.EmployeeRequestBody;
import com.example.employeedetails.module.EmployeeResponsesBody;
import org.springframework.stereotype.Component;

@Component
public class EmployeeServicesImp implements EmployeeServices{
    @Override
    public EmployeeResponsesBody getEmployeeDeatails(EmployeeRequestBody employeeRequestBody) {
        String first_name = employeeRequestBody.getFirst_name();
        String last_name = employeeRequestBody.getLast_name();

        EmployeeResponsesBody employeeResponsesBody=new EmployeeResponsesBody(first_name,last_name);
        return employeeResponsesBody;
    }
}
