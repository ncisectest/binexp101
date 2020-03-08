public class OverflowTest {
 public static void main(String[] args)
 {
   int a = Integer.MAX_VALUE;
   int b = 1;
   int c = a + b;
   System.out.println(a + " + " + b + " = " + c);
   int e = a + 2;
   System.out.println(a + " + " + b + " = " + e);
   int f = a + 3;
   System.out.println(a + " + " + b + " = " + f);
   int d = Math.addExact(a, b);
   System.out.println(a + " + " + b + " = " + d);
 }
}
