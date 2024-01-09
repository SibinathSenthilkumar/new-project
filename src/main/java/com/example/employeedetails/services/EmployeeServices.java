package com.example.employeedetails.services;

import com.example.employeedetails.module.EmployeeRequestBody;
import com.example.employeedetails.module.EmployeeResponsesBody;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeServices {
 EmployeeResponsesBody  getEmployeeDeatails(EmployeeRequestBody employeeRequestBody);
}
