import java.util.Locale;

public class StringFunction {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("length of string : " + str.length());

        String str1 = "hi hello";
        char[] arr = str1.toCharArray();
        System.out.println(arr);
        String str2=new String (arr);
        System.out.println(str2);

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());


    }
}
