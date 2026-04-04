package map.arithmetic;

//Method Overloading - Compile Time Polymorphism
public class CompileTimePolymorphism {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
public static void main(String[] args) {
    CompileTimePolymorphism arithmetic = new CompileTimePolymorphism();

   int a =  arithmetic.add(5, 10);
   double b = arithmetic.add(5.5, 10.5);

   System.out.println("Sum of integers: " + a);
   System.out.println("Sum of doubles: " + b);


}    
}
