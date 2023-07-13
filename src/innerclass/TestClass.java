package innerclass;

public class TestClass {
    public static void main(String[] args) {
        TestClass1 ts1 = new TestClass().new TestClass1();
        ts1.show();
    }

    public  class TestClass1 {
        private void show(){
            System.out.println("Show Name : Charan");
            TestClass2 ts2 = new TestClass().new TestClass2();
            ts2.print();
        }
    }

    private final class TestClass2 {
        private void print() {
          System.out.println("Print Name : Charan");
        }
    }

    protected static abstract class TestClass3 {
        private void create() {
            TestClass2 ts2 = new TestClass().new TestClass2();
            ts2.print();
        }
    }
}
