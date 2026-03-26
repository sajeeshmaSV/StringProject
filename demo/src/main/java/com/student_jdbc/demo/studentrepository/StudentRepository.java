package com.student_jdbc.demo.studentrepository;

import java.sql.Connection;
import java.sql.SQLException;

public interface StudentRepository {
    Connection connection() throws SQLException;


}
