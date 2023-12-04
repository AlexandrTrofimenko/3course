package bfu.registration.service;

import bfu.registration.model.Instructor;
import bfu.registration.model.Student;
import java.io.IOException;


/**
 * Интерфейс сервиса для преподавателя
 */
public interface CourseInstructorService {

    /**
     * @param courseId идентификатор курса
     * @return список студентов, зарегистрированных на данный курс
     */
    Student[] findStudentsByCourseId(long courseId) throws IOException;

    /**
     * @param instructorId идентификатор преподавателя
     * @return список студентов, посещающих один из курсов данного преподавателя
     */
    Student[] findStudentsByInstructorId(long instructorId);

    /**
     * @param instructorId идентификатор преподавателя
     * @param courseId идентификатор курса
     * @return список преподавателей, которые могут прочитать данный курс вместо данного преподавателя
     */
    Instructor[] findReplacement(long instructorId, long courseId);

}
