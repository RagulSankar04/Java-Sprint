
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
}

class Student {

    private String studName;
    private University univ;

    Student(String name, University univ) {
        this.studName = name;
        this.univ = univ;
    }

    public void printDetails() {
        if (univ != null) {
            System.out.println("Student Name: " + studName);
            System.out.println("University Name: " + univ.getUnivName());
            System.out.println("University City: " + univ.getUnivCity());
            System.out.println("University Description: " + univ.getDesc());
            System.out.println("----------");
        } else {
            System.out.println("University Details are not available");
        }
    }

}

public class Question6 {

    public static void main(String[] args) {
        Student[] students = new Student[3];

        University univ1 = new University("SRM", "Chennai");
        University univ2 = new University("VIT", "Vellore");
        University univ3 = new University("Anna University", "Chennai");

        students[0] = new Student("Ragul", univ1);
        students[1] = new Student("Sankakr", univ2);
        students[2] = new Student("Bharath", univ3);

        for (Student student : students) {
            student.printDetails();
        }
    }
}
