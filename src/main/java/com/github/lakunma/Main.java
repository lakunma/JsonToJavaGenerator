package com.github.lakunma;

import com.example.generated.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        // Read JSON from a file and convert it to a Person object
        Person person = objectMapper.readValue(new File("src/main/resources/json/person.json"), Person.class);

        // Output the Person object
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}