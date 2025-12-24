package com.DataModeling.modeling.Model;

import jakarta.validation.constraints.*;

import java.util.Date;

public class User {

    private Long id;

    @NotBlank(message= "First name is required field")
    @Size(min=2,max=50,message="First name must be between 2 and 50 characters")
    private String first_name;

    @NotBlank(message= "Last name is required field")
    @Size(min=2,max=50,message="Last name must be between 2 and 50 characters")
    private String last_name;

    @NotBlank(message="Email cannot be empty")
    @Email(message="Email must be a valid one")
    private String email;

    @NotBlank(message="Phone number cannot be empty")
    @Pattern(
            regexp = "^[0-9]{10}$]",
            message="Phone number must contain 10 digits"
    )
    private String phone_number;

    @NotBlank(message="Date of Birth cannot be empty")
    @Past(message="date of birth must be past one")
    private Date dob;

    public User(Long id, String first_name, String last_name, String email, String phone_number, Date dob) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
