package com.student_jdbc.demo.studentservice;

import java.sql.SQLException;

public interface StudentService {
    void operation();

    void save() throws SQLException;
    void delete() throws SQLException;
    void find() throws SQLException;
    void findall() throws SQLException;
}
