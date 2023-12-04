
package bfu.registration.model;

public class Student extends Person {
    private long[] completedCourses;

    public long[] getCompletedCourses() {
        return this.completedCourses;
    }

    void setCompletedCourses(long[] completedCourses) {
        this.completedCourses = completedCourses;
    }
}
