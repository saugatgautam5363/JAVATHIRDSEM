public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
