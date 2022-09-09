
import java.util.Iterator;

import tads.LinkedList;
import tads.List;

public class Main {
  public static void main(String[] args) {
    System.out.println("Foo");
    foo();
    System.out.println("------------");
    System.out.println("bar");
    bar();
  }

  private static void bar() {
    List<Integer> list = new LinkedList<>();
    for (int i = 0; i < 100_000; i++) {
      list.add(i);
    }

    long start = System.currentTimeMillis();
    var it = list.iterator();
    while (it.hasNext()) {
      int elem = it.next();
    }
    long timeTaken = System.currentTimeMillis() - start;
    System.out.println("With iterator: " + timeTaken + " ms");

    start = System.currentTimeMillis();
    for (int i = 0; i < list.size(); i++) {
      int elem = list.get(i);
    }
    timeTaken = System.currentTimeMillis() - start;
    System.out.println("With for loop: " + timeTaken + " ms");
  }

  public static void foo() {
    List<Integer> list = new LinkedList<>();
    for (int i = 0; i < 5; i++) {
      list.add(i);
    }

    System.out.println("With while loop");
    Iterator<Integer> it = list.iterator();
    while (it.hasNext()) {
      int elem = it.next();
      System.out.println(elem);
    }

    System.out.println("Foreach loop");
    for (int elem : list) {
      System.out.println(elem);
    }
  }
}
