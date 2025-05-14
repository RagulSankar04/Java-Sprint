class demo{
    static private String name;
    static private int age;

    demo(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class sample {
    public static void main(String[] args) {
        demo demo1 = new demo("Ragul", 20);
        demo demo2 = new demo("Sankar", 22);

        System.out.println("Name: " + demo1.getName());
        System.out.println("Name: " + demo2.getName());
        System.out.println("Age: " + demo1.getAge());
        System.out.println("Age: " + demo2.getAge());
    }
}
