
class University {

    private String univName;
    private String univCity;
    private String univDesc;

    University(String Name, String City) {
        this.univName = Name;
        this.univCity = City;
    }

    public String getUnivName() {
        return univName;
    }

    public String getUnivCity() {
        return univCity;
    }

    public String getDesc() {
        return univName + ", " + univCity;
    }

    @Override
    public String toString() {
        return getDesc();
    }
}

class Student {

    private String studName;
    private University univ;

    Student(String name, University univ) {
        this.studName = name;
        this.univ = univ;
    }

    @Override
    public String toString() {
        return "Student Name: " + studName + ", University: " + univ.toString();
    }

}

public class Question8 {

    public static void main(String[] args) {
        University univ1 = new University("SRM", "Chennai");
        University univ2 = new University("VIT", "Vellore");

        Student stud1 = new Student("Ragul", univ1);
        Student stud2 = new Student("Sankar", univ2);

        System.out.println(stud1);
        System.out.println(stud2);
    }
}
