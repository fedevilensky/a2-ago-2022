import java.util.Scanner;

import tads.LinkedQueue;
import tads.Queue;

public class Main {
  public static void main(String[] args) {
    int elements;

    Queue<Integer> queue = new LinkedQueue<Integer>();

    Scanner in = new Scanner(System.in);
    elements = in.nextInt();

    for (int i = 0; i < elements; i++) {
      int data = in.nextInt();

      queue.push(data);
    }

    while (!queue.isEmpty()) {
      System.out.println(queue.top());
      queue.pop();
    }
  }
}
