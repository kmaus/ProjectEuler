public class Problem1 {
 
  public static void main(String[] args) {
    int sum = 0;

    for(int i = 1; i < 1000; i++) {
      if(i % 3 == 0) {
        sum += i;
      } else if(i % 5 == 0) {
        sum += i;
      }
    }
  System.out.println("The sum of all numbers that are a multiple of 3 or 5 under 1000 is " + sum);
  }
}