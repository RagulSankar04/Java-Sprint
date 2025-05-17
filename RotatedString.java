public class RotatedString {
    public static void main(String[] args) {
        String str = "hello";
        String copyStr = str + str;
        String rotatedString = "llohe";

        boolean isRotated = false;
        if(copyStr.contains(rotatedString)){
            isRotated = true;
            System.out.println("Is the String Rotated? " + isRotated);
        }
        else{
            System.out.println("Is the String Rotated? " + isRotated);
        }
    }
}
