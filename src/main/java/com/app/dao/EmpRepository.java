package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Employee;
@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer>
{

}