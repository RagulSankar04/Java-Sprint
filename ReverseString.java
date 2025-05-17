public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder res = new StringBuilder(str);
        res.reverse();
        System.out.println(res);
    }
}
