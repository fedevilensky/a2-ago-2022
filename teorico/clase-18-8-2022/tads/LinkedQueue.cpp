#include "Queue.cpp"
#include <assert.h>

template <class T>
struct QueueNode
{
   T data;
   QueueNode<T> *next;
};

template <class T>
class LinkedQueue : public Queue<T>
{
private:
   int elements;
   QueueNode<T> *front;
   QueueNode<T> *back;

public:
   LinkedQueue()
   {
      elements = 0;
      front = nullptr;
      back = nullptr;
   }

   ~LinkedQueue()
   {
      while (!isEmpty())
      {
         dequeue();
      }
   }

   int size() override
   {
      return elements;
   }

   bool isEmpty() override
   {
      return elements == 0;
   }

   bool isFull() override
   {
      return false;
   }

   void enqueue(T data) override
   {
      QueueNode<T> *newNode = new QueueNode<T>;
      newNode->data = data;

      if (isEmpty())
      {
         front = newNode;
         back = newNode;
      }
      else
      {
         back->next = newNode;
         back = newNode;
      }
      elements++;
   }

   void dequeue() override
   {
      if (isEmpty())
      {
         return;
      }
      QueueNode<T> *temp = front;
      front = front->next;
      delete temp;
      elements--;
   }

   T peek() override
   {
      assert(!isEmpty());
      return front->data;
   }
};