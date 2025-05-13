
import java.util.Scanner;


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
        if (univ == null) {
            throw new IllegalArgumentException("University cannot be null for a student.");
        }
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

public class Question7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Univ1 Name: ");
        String univ1 = sc.nextLine();
        System.out.print("Enter Univ1 City: ");
        String univ1c = sc.nextLine();

        System.out.print("Enter Univ2 Name: ");
        String univ2 = sc.nextLine();
        System.out.print("Enter Univ2 City: ");
        String univ2c = sc.nextLine();


        University university1 = new University(univ1, univ1c);
        University university2 = new University(univ2, univ2c);

        Student stud1 = new Student("Ragul", university1);
        Student stud2 = new Student("Sankar", university2);

        stud1.printDetails();
        stud2.printDetails();
    }
}
