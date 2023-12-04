package bfu.registration.reader;

import bfu.registration.model.CourseInfo;
import bfu.registration.model.CourseInstance;
import bfu.registration.model.Instructor;
import bfu.registration.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class StudentDataReader {
    private ObjectMapper objectMapper = new ObjectMapper();


    public Student[] readBachelorStudentData() throws IOException {
        return (Student[])this.objectMapper.readValue(new File("src/main/resources/bachelorStudents.json"), Student[].class);
    }

    public Student[] readMasterStudentData() throws IOException {
        return (Student[])this.objectMapper.readValue(new File("src/main/resources/masterStudents.json"), Student[].class);
    }

    public CourseInfo[] readCourseInfosData() throws IOException {
        return (CourseInfo[])this.objectMapper.readValue(new File("src/main/resources/courseInfos.json"), CourseInfo[].class);
    }

    public CourseInstance[] readCourseInstancesData() throws IOException {
        return (CourseInstance[])this.objectMapper.readValue(new File("src/main/resources/courseInstances.json"), CourseInstance[].class);
    }

    public Instructor[] readInstructorsData() throws IOException {
        return (Instructor[])this.objectMapper.readValue(new File("src/main/resources/instructors.json"), Instructor[].class);
    }
}
