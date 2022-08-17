public class Main {

    public static void doSmth(int param) {
        param = 6;
        System.out.println("param = " + param);
    }
    public static void main(String[] args) {

        int a = 5;
        System.out.println("a = " + a);
        doSmth(a);
        System.out.println("a = " + a);
       }
    }

