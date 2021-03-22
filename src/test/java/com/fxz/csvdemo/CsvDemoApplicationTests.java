package com.fxz.csvdemo;

import com.fxz.csvdemo.entity.Employee;
import com.fxz.csvdemo.mapper.EmployeeMapper;
import com.fxz.csvdemo.util.CSVWriterUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CsvDemoApplicationTests {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    void contextLoads() {
        Employee employee = employeeMapper.selectById("1337278573614555137");
        CSVWriterUtils.writeCsv("demos.csv", employee);
    }

}
