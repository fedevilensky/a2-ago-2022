#pragma once

template <class T>
class Queue
{
public:
   virtual int size() = 0;

   // por si lo quieren modificar
   virtual bool isEmpty() = 0;

   virtual bool isFull() = 0;

   virtual void enqueue(T data) = 0;

   virtual void dequeue() = 0;

   virtual T peek() = 0;

};