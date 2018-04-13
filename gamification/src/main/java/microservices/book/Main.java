package microservices.book;

import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    funcOutputSequence1(1, 100);
  }

  private static void funcOutputSequence1(final int start, final int end) {
    IntStream
      .rangeClosed(start, end)
      .forEach(x -> {
        if ((x % 2 == 0) && (x % 7 == 0))
          System.out.println("TwoSeven");
        else if (x % 2 == 0) {
          System.out.println("Two");
        } else if (x % 7 == 0) {
          System.out.println("Seven");
        } else {
          System.out.println(x);
        }
      });
  }
}
