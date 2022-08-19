#pragma once

#include "Queue.cpp"
#include <assert.h>

template <class K>
struct LinkedQNode
{
  K data;
  LinkedQNode<K> *next = nullptr;
};

template <class T>
class LinkedQueue : public Queue<T>
{
private:
  int elements = 0;
  LinkedQNode<T> *front = nullptr;
  LinkedQNode<T> *back = nullptr;

public:
  LinkedQueue()
  {
  }

  ~LinkedQueue()
  {
    while (!isEmpty())
    {
      pop();
    }
  }

  int size() override
  {
    return elements;
  }

  void push(T data) override
  {
    LinkedQNode<T> *newNode = new LinkedQNode<T>();
    newNode->data = data;
    if (isEmpty())
    {
      front = newNode;
      back = newNode;
    }
    else
    {
      back->next = newNode;
      back = back->next;
    }

    elements++;
  }

  T top() override
  {
    assert(!isEmpty());
    return front->data;
  }

  void pop() override
  {
    if (isEmpty())
    {
      return;
    }

    LinkedQNode<T> *temp = front;
    front = front->next;
    delete temp;
    if (elements == 1)
    {
      back = nullptr;
    }
    elements--;
  }

  bool isFull() override
  {
    return false;
  }

  bool isEmpty() override
  {
    return elements == 0;
  }
};
