public class Polymorphism {
    public static void main(String[] args) {
        Student student =  new Student();
        student.getName();

        CharanTeja charanTeja = new CharanTeja();
        charanTeja.getName();

        Student sukanya = new Sukanya();
        sukanya.getName();
        add(5, 3);
        add(5, 3, 2);
        System.out.println(add(10,12.5f));
    }

    private static void add(int a, int b) {
        System.out.println(a + b);
    }

    private static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    private static float add(int a, float b) {
        return a + b;
    }
}
