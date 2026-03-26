
package com.springboot;

import com.springboot.exception.InvaildInputException;
import com.springboot.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private StudentService studentService;

    private static final Logger LOGGER =
            (Logger) LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("My program is Started......");
        try(Scanner sc= new Scanner(System.in)) {
            System.out.println("Enter Student Regno: ");
            int regno=sc.nextInt();
            LOGGER.info(studentService.printRegNo(regno));
        }catch (InputMismatchException e){
            LOGGER.error("invalid Student Regno",e);
        }
        LOGGER.info("My program is Ended......");

    }
}
