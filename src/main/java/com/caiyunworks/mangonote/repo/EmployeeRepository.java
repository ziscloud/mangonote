package com.caiyunworks.mangonote.repo;

import com.caiyunworks.mangonote.entity.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by Tony Wang on 8/20/16.
 */
public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {
    List findEmployeesByAge(int age);
    List findEmployeesByName(String name);
    List findEmployeesBySkillsIn(List skills);
}
