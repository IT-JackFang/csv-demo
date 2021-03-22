package com.fxz.csvdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fxz.csvdemo.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * 描述：
 *
 * @author Fang
 * @date 2021-03-16 16:46:29
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
