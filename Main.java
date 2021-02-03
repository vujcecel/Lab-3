import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number to count down or up from: ");

    int number;

    number = s.nextInt();

    if (number >= 0) {
      for (int x = number; x >= 0; x--) {
        System.out.println(x);
      }
    }
    else {
      for (int x = number; x <= 0; x++) {
        System.out.println(x);
      }
    }
    System.out.println("Blast off!");
  }
}