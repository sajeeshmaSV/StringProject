
package com.springboot.respository.mock.impl;

import com.springboot.respository.StudentRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Profile("test")
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    public StudentRepositoryImpl()
    {
        System.out.println("StudentRepositoryImpl from mock package");
    }
    @Override
    public String printRegNo(int regNo) {
        return String.format("My regno is %d", regNo);
    }
}
