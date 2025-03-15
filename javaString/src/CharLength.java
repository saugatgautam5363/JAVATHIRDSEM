public class CharLength {
    public static void main(String[] args) {
        String str = "Hello";
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }

            }catch (IndexOutOfBoundsException e){


        }
        System.out.println("length of string: "+length);
    }
}
