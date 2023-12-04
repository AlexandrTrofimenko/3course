package bfu.registration.model;

import java.time.LocalDate;

/**
 * Класс с данными о проведении курса. Один курс (например, дискретная математика) может быть проведен несколько раз.
 */
public class CourseInstance {
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    private long id;

    public void setId(long id) {
        this.id = id;
    }

    private long courseId;
    private long instructorId;
    private LocalDate startDate;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private int capacity;

    public long getId() {
        return this.id;
    }

    void setId() {
        this.id = this.id;
    }

    public long getCourseId() {
        return (new CourseInfo()).getId();
    }

    void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    long getInstructorId() {
        return this.instructorId;
    }

    void setInstructorId(long instructorId) {
        this.instructorId = instructorId;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    void setLocalDate(LocalDate startDate) {
        this.startDate = startDate;
    }

}
