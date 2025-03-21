public class Q5 {
    public static void main(String[] args) {
        try{
            int number = 10;
            int number1 = 0;

            int number3 = number / number1;
            System.out.println(number3);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}
