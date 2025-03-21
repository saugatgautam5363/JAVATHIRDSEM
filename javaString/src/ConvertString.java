import java.util.Locale;

public class ConvertString {
    public static void main(String[] args) {
        String name = "           saugat";
        String convertToUpperCase = name.toUpperCase();
        System.out.println(convertToUpperCase);
        String name2 = "SANTOSH";
        String convertToLowerCase = name2.toLowerCase();
        System.out.println(convertToLowerCase);

        String ignorChar = name.replace("saugat","Saugat");
        System.out.println(ignorChar);
        char s = name.charAt(3);
        System.out.println(s);
        System.out.println(name.trim());
    }
}
