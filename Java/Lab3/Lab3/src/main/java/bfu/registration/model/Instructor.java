package bfu.registration.model;

public class Instructor extends Person {
    int[] canTeach;

    int[] getCanTeach() {
        return this.canTeach;
    }

    void setCanTeach(int[] canTeach) {
        this.canTeach = canTeach;
    }
}
