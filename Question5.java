
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

    public void getUniversityName(){
        System.out.println(univ.getUnivName());
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

public class Question5 {

    public static void main(String[] args) {
        University univ1 = new University("SRM", "Chennai");
        University univ2 = new University("VIT", "Vellore");

        Student stud1 = new Student("Ragul", univ1);
        Student stud2 = new Student("Sankar", univ2);

        stud1.getUniversityName();
    }
}
