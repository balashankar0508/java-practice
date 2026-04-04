public class Test {
    public static int test() {
        try {
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed");
            return 3;
        }
    }

    public static int newtest(){
        int a = 10;
        try{
            return a;
        }finally{
            a=20;
            // System.out.println("Finally block executed");
            //  return a;
        }
    }

    public static void main(String[] args) {
        // System.out.println(test());
        System.out.println(newtest());
    }
}