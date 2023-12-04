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

    public InstructorService() throws IOException
    {
        StudentDataReader reader = new StudentDataReader();
        this.banchelorStudents = reader.readBachelorStudentData();
        StudentDataReader reader1 = new StudentDataReader();
        this.courseInfos = reader1.readCourseInfosData();
        StudentDataReader reader2 = new StudentDataReader();
        this.courseInstances = reader2.readCourseInstancesData();
        StudentDataReader reader3 = new StudentDataReader();
        this.instructors = reader3.readInstructorsData();
    }
    @Override
    public Student[] findStudentsByCourseId(long courseId) throws IOException {
        Student[] students = new Student[banchelorStudents.length];
        System.out.println(students.length);
        students = banchelorStudents;
        for(int i = 0; i < students.length;i++)
        {
            if(banchelorStudents[i].getCompletedCourses()[i] == courseId ) {
                students[i].setId(banchelorStudents[i].getId());
                students[i].setName(banchelorStudents[i].getName());
            }
        }
        return students;
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
