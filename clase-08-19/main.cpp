#include "tads/LinkedQueue.cpp"
#include <iostream>

int main()
{
  int totalElements;
  std::cin >> totalElements;
  Queue<int> *queue = new LinkedQueue<int>;

  for (int i = 0; i < totalElements; i++)
  {
    int element;
    std::cin >> element;

    queue->push(element);
  }

  while (!queue->isEmpty())
  {
    std::cout << queue->top() << std::endl;
    queue->pop();
  }
}
