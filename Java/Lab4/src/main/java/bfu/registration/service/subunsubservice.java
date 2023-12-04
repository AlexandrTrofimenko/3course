package bfu.registration.service;

import bfu.registration.model.*;
import bfu.registration.reader.StudentDataReader;

import java.io.IOException;
import java.time.LocalDate;

public class subunsubservice implements StudentService{
    /**
     * Регистрация студента на курс. Регистрация возможна при следующих условиях:
     * - курс еще не начался;
     * - курс предназначен для категории данного студента (магистра/бакалавра);
     * - студент прошел все обязательные курсы, необходимые для посещения данного курса;
     * - в курсе есть свободные места.
     *
     * @param studentId идентификатор студента
     * @param courseId идентификатор курса, соответствующий CourseInstance.id
     * @return результат выполнения регистрации
     */
    private CourseInstance[] info; // Информация о курсах
    private Student[] idbachelor; // Бакалавры
    private Student[] idmaster; // Магистры
    private CourseInfo[] prereq; // Пройденные курсы для новых

    public subunsubservice() throws IOException{
        StudentDataReader dataReader = new StudentDataReader();
        this.info = dataReader.readCourseInstancesData();

        this.idbachelor = dataReader.readBachelorStudentData();

        this.idmaster = dataReader.readMasterStudentData();

        this.prereq = dataReader.readCourseInfosData();

    }

    @Override
    public ActionStatus subscribe(long studentId, long courseId) {
        LocalDate date = LocalDate.now();

        for(int i = 0 ; i < info.length;i++)
            if(courseId == info[i].getId()) {
                if(date.isBefore(info[i].getStartDate())){
                    for(int j = 0; j < idmaster.length;j++) {
                        if(studentId == idmaster[j].getId()) {
                            for(int k = 0; k < prereq.length;k++)
                                if (idmaster[j].getCompletedCourses() == prereq[k].getPrerequisites()) {
                                if (info[i].getCapacity() > 0) {
                                    return ActionStatus.OK;
                                }
                            }
                        }
                    }
                }
            }
        for(int i = 0; i < idbachelor.length;i++)
        {
            for(int j = 0; j < idbachelor[i].getCompletedCourses().length;j++)
                for(int a = 0; a < prereq.length;a++)
                    for(int k = 0; k < prereq[a].getPrerequisites().length;k++)
                        if(idbachelor[i].getCompletedCourses()[j] == prereq[a].getPrerequisites()[k]){

                    }
        }

        return ActionStatus.NOK;
    }

    @Override
    public ActionStatus unsubscribe(long studentId, long courseId) {
        return null;
    }

    @Override
    public CourseInstance[] findAllSubscriptionsByStudentId(long studentId) {
        return new CourseInstance[0];
    }
}
