package bfu.registration.model;

public class CourseInfo {
    private long id;
    private String name;
    private String description;
    private long[] prerequisites;
    private StudentCategory[] studentCategories;

    long getId() {
        return this.id;
    }

    void setId(long id) {
        this.id = id;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getDescription() {
        return this.description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    long[] getPrerequisites() {
        return this.prerequisites;
    }

    void setPrerequisites(long[] prerequisites) {
        this.prerequisites = prerequisites;
    }

    StudentCategory[] getStudentCategories() {
        return this.studentCategories;
    }

    void setStudentCategories(StudentCategory[] studentCategories) {
        this.studentCategories = studentCategories;
    }
}
