package com.student_jdbc.demo.studentutil.impl;

import com.student_jdbc.demo.studentdto.StudentDTO;
import org.springframework.stereotype.Service;
import java.util.Scanner;

@Service
public class StudentUtilImpl extends StudentDTO {
    Scanner sc = new Scanner(System.in);

    public  void save(){
        System.out.print("Enter the Name:  ");
        setName(sc.next());
        System.out.print("Enter the regno: ");
        setRegno(sc.nextInt());
        System.out.print("Enter the gender(M/F): ");
        setGender(sc.next());
        System.out.print("Enter the Date of Birth(yyyy-mm-dd): ");
        setDateOfBirth(sc.next());
    }
    public void delete(){
        System.out.print("Enter the regno: ");
        setRegno(sc.nextInt());

    }
    public void find(){
        System.out.print("Enter the regno to find: ");
        setRegno(sc.nextInt());
    }


}
