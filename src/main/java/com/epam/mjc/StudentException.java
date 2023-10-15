package com.epam.mjc;

public class StudentException extends IllegalArgumentException {
    public StudentException(String msg){
        super(String.format("Could not find student with ID %s", msg));
    }
}
