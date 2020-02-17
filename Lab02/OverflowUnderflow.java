public class OverflowUnderflow {
  public static void main(String args[]){
    int overflowExample = 2147483647;
    System.out.println("Overflow: "+ (overflowExample + 1));
    int underflowExample = -2147483648;
    System.out.println("Underflow: "+ (underflowExample - 1));
    byte b = 127;
    double d = 1e308;
    System.out.println(d + "*10= " + d*10);
    d = 1e-305 * Math.PI;
    System.out.print("gradual underflow: " + d + "\n ");
    for (int i = 0; i < 4; i++)
    System.out.print(" " + (d /= 100000));
    System.out.println();
  }
}
