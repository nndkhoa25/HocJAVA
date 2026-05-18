public class Demo18_05_1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");

        sb.insert(6, "Java ");
        System.out.println(sb);

        }
}
