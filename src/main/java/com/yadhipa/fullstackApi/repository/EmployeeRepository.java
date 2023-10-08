package com.yadhipa.fullstackApi.repository;

import com.yadhipa.fullstackApi.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
