public class UnderflowTest {
 public static void main(String[] args)
 {
   int a = Integer.MIN_VALUE;
   int b = 1;
   int c = a - b;
   System.out.println(a + " - " + b + " = " + c);
   int d = Math.subtractExact(a, b);
   System.out.println(a + " - " + b + " = " + d);
 }
}
