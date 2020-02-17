public class OverflowTest {
 public static void main(String[] args)
 {
   int a = Integer.MAX_VALUE;
   int b = 1;
   int c = a + b;
   System.out.println(a + " + " + b + " = " + c);
   int d = Math.addExact(a, b);
   System.out.println(a + " + " + b + " = " + d);
 }
}
