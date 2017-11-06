package com.anaplan.interview.dao;

import com.anaplan.interview.Application;
import com.anaplan.interview.domain.Customer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Application.class })
public class CustomerDaoTest {
    private static final Logger log = LoggerFactory.getLogger(CustomerDaoTest.class);

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Before
    public void setup() {
        log.info("Creating tables");

        jdbcTemplate.execute("DROP TABLE customers IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE customers(" +
                "id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))");

        jdbcTemplate.execute("DROP TABLE events IF EXISTS");

        jdbcTemplate.execute("CREATE TABLE events(" +
                "id SERIAL, event_name VARCHAR(255), start_time BIGINT, end_time BIGINT )");

        jdbcTemplate.execute("DROP TABLE customers_events IF EXISTS");

        jdbcTemplate.execute("CREATE TABLE customers_events(" +
                "customer_id BIGINT, event_id BIGINT)");
    }
}
