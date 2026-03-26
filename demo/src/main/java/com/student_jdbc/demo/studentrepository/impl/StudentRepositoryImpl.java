package com.student_jdbc.demo.studentrepository.impl;

import com.student_jdbc.demo.studentrepository.StudentRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    @Value("${db.url}")
    private String url;
    @Value("${db.uname}")
    private String uname;
    @Value("${db.password}")
    private String password;
    private Connection con;

    @Override
    public Connection connection()  throws SQLException {

         con= DriverManager.getConnection(url,uname,password);


        return con;
    }


}
