package CorePackages;

public class Lab2 {
    public static void main(String[] args) {
        String numberStr = "25";
        int num = Integer.parseInt(numberStr);
        int result = num + 10;
        System.out.println("Result after adding 10: " + result);

        int primitiveInt = 42;
        Integer wrappedInt = primitiveInt;
        System.out.println("Autoboxed Integer object: " + wrappedInt);

        int unboxedInt = wrappedInt;
        System.out.println("Unboxed primitive int: " + unboxedInt);
    }
}

