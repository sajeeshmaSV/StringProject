
package com.springboot.respository.impl;

import com.springboot.respository.StudentRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Profile("prod")
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    public StudentRepositoryImpl()
    {
        System.out.println("StudentRepositoryImpl from impl package");
    }
    @Override
    public String printRegNo(int regNo) {
        return String.format("My regno is %d", regNo);
    }
}
