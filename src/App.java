public class App {
    public static void main(String[] args) throws Exception {
        String a;
        a = "AMO FAZER EXERCICIO NO URI";

        System.out.print("<");
        System.out.printf("%s", a);
        System.out.println(">");

        System.out.print("<");
        System.out.printf("%30s", a);
        System.out.println(">");

        System.out.print("<");
        System.out.printf("%.20s", a);
        System.out.println(">");

        System.out.print("<");
        System.out.printf("%-20s", a);
        System.out.println(">");

        System.out.print("<");
        System.out.printf("%-30s", a);
        System.out.println(">");

        System.out.print("<");
        System.out.printf("%.30s", a);
        System.out.println(">");

        System.out.print("<");
        System.out.printf("%30.20s", a);
        System.out.println(">");

        System.out.print("<");
        System.out.printf("%-30.20s", a);
        System.out.println(">");
    }
}
