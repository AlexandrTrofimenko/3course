
package bfu.registration.model;

public class Student extends Person {
    private long[] completedCourses;

    long[] getCompletedCourses() {
        return this.completedCourses;
    }

    void setCompletedCourses(long[] completedCourses) {
        this.completedCourses = completedCourses;
    }
}
