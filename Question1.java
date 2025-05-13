class Library{
    private String Name;

    public Library(String name){
        this.Name = name;
    }
    public String getName(){
        return Name;
    }
}
class Book{
    private String title;
    private Library library;

    public Book(String title, Library library){
        this.title = title;
        this.library = library;
    }
    public void printDetails(){
        System.out.println("Book Title: " + title);
        System.out.println("Belongs To: " + library.getName() + "\n ");
    }

}
public class Question1{
    public static void main(String[] args) {
        Library lib1 = new Library("Anna Library");
        Library lib2 = new Library("Kalaingar Library");
        Library lib3 = new Library("MGR Library");
        Book book1 = new Book("Wings of Fire", lib1);
        Book book2 = new Book("India@2020", lib2);
        Book book3 = new Book("Dream", lib3);


        book1.printDetails();
        book2.printDetails();
        book3.printDetails();
    }
}