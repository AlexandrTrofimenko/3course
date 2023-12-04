package bfu.registration.reader;

import bfu.registration.model.CourseInfo;
import bfu.registration.model.CourseInstance;
import bfu.registration.model.Instructor;
import bfu.registration.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;

public class StudentDataReader {
    private ObjectMapper objectMapper = new ObjectMapper();


    public Student[] readBachelorStudentData() throws IOException {
        return objectMapper.readValue(new File("src/main/resources/bachelorStudents.json"), Student[].class);
    }

    public Student[] readMasterStudentData() throws IOException {
        return objectMapper.readValue(new File("src/main/resources/masterStudents.json"), Student[].class);
    }

    public CourseInfo[] readCourseInfosData() throws IOException {
        return objectMapper.readValue(new File("src/main/resources/courseInfos.json"), CourseInfo[].class);
    }

    public CourseInstance[] readCourseInstancesData() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        return objectMapper.readValue(new File("src/main/resources/courseInstances.json"), CourseInstance[].class);
    }

    public Instructor[] readInstructorsData() throws IOException {
        return objectMapper.readValue(new File("src/main/resources/instructors.json"), Instructor[].class);
    }
}
