package com.anaplan.interview.dao;

import com.anaplan.interview.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

}
