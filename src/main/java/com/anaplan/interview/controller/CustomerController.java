package com.anaplan.interview.controller;

import com.anaplan.interview.dao.CustomerDao;
import com.anaplan.interview.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerDao customerDao;
    
}
