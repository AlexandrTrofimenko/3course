package bfu.registration.service;

import bfu.registration.model.CourseInstance;
import bfu.registration.model.Instructor;
import bfu.registration.model.Student;
import bfu.registration.reader.StudentDataReader;
import bfu.registration.model.CourseInfo;

import java.io.IOException;

public class InstructorService implements CourseInstructorService{
    private Student[] banchelorStudents;
    private CourseInfo[] courseInfos;
    private CourseInstance[] courseInstances;
    private Instructor[] instructors;
    private Student[] masterStudents;
    @Override
    public Student[] findStudentsByCourseId(long courseId) throws IOException {
        StudentDataReader dataReader = new StudentDataReader();

        banchelorStudents = dataReader.readBachelorStudentData();

        return banchelorStudents;
    }

    @Override
    public Student[] findStudentsByInstructorId(long instructorId) {
        return new Student[0];
    }

    @Override
    public Instructor[] findReplacement(long instructorId, long courseId) {
        return new Instructor[0];
    }
}
