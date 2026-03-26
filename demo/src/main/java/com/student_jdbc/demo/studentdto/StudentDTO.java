package com.student_jdbc.demo.studentdto;

import org.springframework.stereotype.Component;

@Component

public class StudentDTO {
    private String name;
    private int regno;
    private String gender;
    private String dateOfBirth;

    public StudentDTO() {

    }

    public StudentDTO(String name, int regno, String gender, String dateOfBirth) {
        this.name = name;
        this.regno = regno;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", regno=" + regno +
                ", gender='" + gender + '\'' +
                ", date='" + dateOfBirth + '\'' +
                '}';
    }
}
