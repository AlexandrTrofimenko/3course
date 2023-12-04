package bfu.alexandrtrofimenko;

import bfu.registration.model.*;
import bfu.registration.reader.*;
import bfu.registration.service.*;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world!");
        InstructorService service = new InstructorService();

        System.out.println(Arrays.toString(service.findStudentsByCourseId(10124)));
    }
}