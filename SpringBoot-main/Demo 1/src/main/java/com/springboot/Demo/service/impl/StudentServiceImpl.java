
package com.springboot.service.impl;

import com.springboot.respository.StudentRepository;
import com.springboot.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public String printRegNo(int regNo) {
        return studentRepository.printRegNo(regNo);
    }
}
