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
   //     this.courseInfos = reader.readCourseInfosData();
        //       this.courseInstances = reader.readCourseInstancesData();
    //    this.instructors = reader.readInstructorsData();
    }
    @Override
    public Student[] findStudentsByCourseId(long courseId) throws IOException {
        Student[] students = new Student[banchelorStudents.length];
        System.out.println(students.length);
        int count = 0;
        for( int i = 0 ; i < banchelorStudents.length;i++)
            for(int j = 0 ; j < banchelorStudents[i].getCompletedCourses().length;j++) {
                if (courseId == banchelorStudents[i].getCompletedCourses()[j]){
                    students[count] = banchelorStudents[i];
                    count++;
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
