#include "tads/LinkedQueue.cpp"
#include <iostream>

int main(){
   Queue<int> *queue = new LinkedQueue<int>;
   int elements;
   std::cin >> elements;
   for (int i = 0; i < elements; i++)
   {
      int data;
      std::cin >> data;
      queue->enqueue(data);
   }

   while(!queue->isEmpty()){
      std::cout << queue->peek() << std::endl;
      queue->dequeue();
   }
}