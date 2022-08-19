#pragma once

template <class T>
class Queue
{
public:
  virtual int size() = 0;

  // enqueue
  virtual void push(T data) = 0;

  virtual T top() = 0;

  // dequeue
  virtual void pop() = 0;

  virtual bool isFull() = 0;

  virtual bool isEmpty() = 0;
};
