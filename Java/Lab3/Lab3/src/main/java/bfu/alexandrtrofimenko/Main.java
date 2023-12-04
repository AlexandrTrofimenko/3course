package bfu.alexandrtrofimenko;

import bfu.registration.model.*;
import bfu.registration.reader.*;
import bfu.registration.service.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world!");
        InstructorService service = new InstructorService();
     //   CourseInstructorService courseInstructorService=service;
        System.out.println(service.findStudentsByCourseId(102)[0].getId());
    }
}