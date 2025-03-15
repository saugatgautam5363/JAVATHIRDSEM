public class Main {
    public static void main(String[] args) {
       try {
           String name = "Saugat";
           String lastName = " Gautam!";
           String numner = "123456a";
           String number2 ="444958";
           System.out.println(Integer.parseInt(numner)+ Integer.parseInt(number2));

       }catch (NumberFormatException e){
           System.out.println("this not converte String to number:- "+e.getMessage());
       }
    }
}
