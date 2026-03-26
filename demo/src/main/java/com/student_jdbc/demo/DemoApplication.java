package com.student_jdbc.demo;

import com.student_jdbc.demo.studentdto.StudentDTO;
import com.student_jdbc.demo.studentservice.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Autowired
    private StudentServiceImpl studentServiceImpl;
    private StudentDTO studentDTO;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }
    @Override
    public void run(String... args) throws Exception {
        studentServiceImpl.operation();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number= sc.nextInt();

        while(number!=0){

            if(number==1){
                studentServiceImpl.save();
            }
            else if(number==2){
                studentServiceImpl.delete();

            }
            else if(number==3){
                studentServiceImpl.find();

            }
            else if(number==4){
                studentServiceImpl.findall();

            }
            System.out.print("Enter the Number: ");
            number= sc.nextInt();

        }




    }
}
