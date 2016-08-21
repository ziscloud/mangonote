package com.caiyunworks.endpoint;

import com.caiyunworks.entity.Employee;
import com.caiyunworks.entity.Skill;
import com.caiyunworks.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tony Wang on 8/20/16.
 */
@Component
@Path("/employee")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class EmployeeEndpoint {
    @Autowired
    private EmployeeRepository repository;

    @PUT
    public Response addEmployees() {
        Employee joe = new Employee("01", "Joe", 32);
        Skill javaSkill = new Skill("Java", 10);
        Skill db = new Skill("Oracle", 5);
        joe.setSkills(Arrays.asList(javaSkill, db));
        Employee johnS = new Employee("02", "John S", 32);
        Employee johnP = new Employee("03", "John P", 42);
        Employee sam = new Employee("04", "Sam", 30);

        repository.save(johnS);
        repository.save(johnP);
        repository.save(sam);
        repository.save(joe);
        return Response.ok().build();
    }

    @GET
    public Iterable<Employee> findAllEmployees() {
        return repository.findAll();
    }

    @GET
    @Path("/name/{name}")
    public List<Employee> findEmployee(@PathParam("name") String name) {
        List<Employee> empList = repository.findEmployeesByName(name);
        return empList;
    }

    @GET
    @Path("/age/{age}")
    public List<Employee> findEmployeesByAge(@PathParam("age") int age) {
        List<Employee> empList = repository.findEmployeesByAge(age);
        return empList;
    }
}
