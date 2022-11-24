import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EducationCenter[] educationCenters = {
                new School("Bishkek","KG", LocalDate.of(2000,2,23)),
                new College("Naryn","KG",LocalDate.of(1900,10,3)),
                new University("Bishkek","KG",LocalDate.of(2001,2,7))
        };
        Student[] students = {
                new Student("ghsjgc","knjch",Gender.M,LocalDate.of(2021,9,15),educationCenters[0]),
                new Student("ssssssss","sssssssss",Gender.F,LocalDate.of(1990,9,15),educationCenters[1]),
                new Student("wwwwwwwww","wwwwwwwwwww",Gender.M,LocalDate.of(1999,3,5),educationCenters[2]),
                new Student("gggggggggg","gggggggggg",Gender.F,LocalDate.of(2001,9,15),educationCenters[2]),
                new Student("zzzzzzzzz","zzzzzzzzzz",Gender.M,LocalDate.of(1921,4,27),educationCenters[2]),
                new Student("jjjjjjjj","jjjjjjjjjjj",Gender.M,LocalDate.of(1997,2,25),educationCenters[1]),
                new Student("aaaaaaaa","aaaa",Gender.M,LocalDate.of(2021,9,15),educationCenters[0]),
                new Student("iiiiiiii","iiiiiiii",Gender.F,LocalDate.of(2022,9,15),educationCenters[1]),
                new Student("mmmmmmmmm","mmmmmmmmm",Gender.M,LocalDate.of(2011,12,3),educationCenters[0]),
                new Student("ccccccccc","ccccccc",Gender.F,LocalDate.of(2003,6,15),educationCenters[2])
        };
        method(students);
        method1(educationCenters,students);
    }
    public static void method(Student[] students){
        for (Student student : students) {
            System.out.println(student.toString());
            student.getStudentsEducationCenter();
            student.getStudentsStudyingYear();
        }
    }

    public static void method1(EducationCenter[] educationCenters, Student[] students) {
        Student[] bishkek = new Student[students.length];
        Student[] naryn = new Student[students.length];
        Student[] bishkek2 = new Student[students.length];

        int index = 0;
        for (EducationCenter e : educationCenters) {
            for (Student s : students) {
                if (e.getName().toLowerCase().equals(s.getEducationCenter().getName().toLowerCase()))
                    bishkek[index] = s;

            }
            for (Student s : students) {
                if (e.getName().toLowerCase().equals(s.getEducationCenter().getName().toLowerCase()))
                    naryn[index] = s;
            }
            for (Student s : students) {
                if (e.getName().toLowerCase().equals(s.getEducationCenter().getName().toLowerCase()))
                    bishkek2[index] = s;
            }
            index++;
        }
        System.out.println(Arrays.toString(naryn));
    }
}