import java.time.LocalDate;

public class Student implements Study{

    private String name;
    private String surname;
    private Gender gender;
    private LocalDate dateOfStart;
    private EducationCenter educationCenter;

    public Student(String name, String surname, Gender gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }


    @Override
    public void getStudentsEducationCenter() {
        System.out.println(getEducationCenter());
    }

    @Override
    public void getStudentsStudyingYear() {
        LocalDate localDate = LocalDate.now().minusYears(getDateOfStart().getYear()).minusMonths(getDateOfStart().getMonthValue()).minusDays(getDateOfStart().getDayOfMonth());
        System.out.println(localDate.getYear());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", dateOfStart=" + dateOfStart +
                '}';
    }
}
