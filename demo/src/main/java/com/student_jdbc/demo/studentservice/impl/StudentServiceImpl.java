package com.student_jdbc.demo.studentservice.impl;

import com.student_jdbc.demo.studentdto.StudentDTO;
import com.student_jdbc.demo.studentrepository.impl.StudentRepositoryImpl;
import com.student_jdbc.demo.studentservice.StudentService;
import com.student_jdbc.demo.studentutil.impl.StudentUtilImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentUtilImpl studentUtil;
    @Autowired
    private StudentRepositoryImpl studentRepositoryImpl;


    @Override
    public void operation() {
        System.out.println("To Insert the Detail 'Enter 1'");
        System.out.println("To Delete the Detail 'Enter 2'");
        System.out.println("To Find the Detail 'Enter 3'");
        System.out.println("To Find All the Detail 'Enter 4'");
        System.out.println("To Exit 'Enter 0'");

    }

    @Override
    public void save() throws SQLException {
        studentRepositoryImpl.connection();
        studentUtil.save();
        String sql="insert into StudentDTO(name,regno,gender,dateOfBirth )values(?,?,?,?)";
        Connection con =studentRepositoryImpl.connection();
        PreparedStatement st=con.prepareStatement(sql);

        st.setString(1,studentUtil.getName());
        st.setInt(2,studentUtil.getRegno());
        st.setString(3,studentUtil.getGender());
        st.setString(4,studentUtil.getDateOfBirth());
        st.execute();
        con.close();
        System.out.println("Saved");
    }

    @Override
    public void delete() throws SQLException {
        studentRepositoryImpl.connection();
        studentUtil.delete();
        String sql="delete from StudentDTO where regno=?";
        Connection con =studentRepositoryImpl.connection();
        PreparedStatement st=con.prepareStatement(sql);
        st.setInt(1,studentUtil.getRegno());
        st.execute();
        con.close();
        System.out.println("Deleted");
    }

    @Override
    public void find() throws SQLException {
        studentRepositoryImpl.connection();
        studentUtil.find();
        String sql="Select * from StudentDTO where regno=?";
        Connection con =studentRepositoryImpl.connection();
        PreparedStatement st=con.prepareStatement(sql);
        st.setInt(1,studentUtil.getRegno());
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            StudentDTO s = new StudentDTO(
                    rs.getString("name"),
                    rs.getInt("regno"),
                    rs.getString("gender"),
                    rs.getString("dateOfBirth")
            );
            System.out.println(s);
        } else {
            System.out.println("No record found");
        }
        con.close();

    }

    @Override
    public void findall() throws SQLException {
        studentRepositoryImpl.connection();
        String sql="Select * from StudentDTO";
        Connection con =studentRepositoryImpl.connection();
        PreparedStatement st = con.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        int flag = 0;
        while (rs.next()) {
            flag=1;

            StudentDTO s = new StudentDTO(
                    rs.getString("name"),
                    rs.getInt("regno"),
                    rs.getString("gender"),
                    rs.getString("dateOfBirth")
            );
            System.out.println(s);
        }
        if (flag==0) {
            System.out.println("No records found");
        }
        con.close();


    }
}
