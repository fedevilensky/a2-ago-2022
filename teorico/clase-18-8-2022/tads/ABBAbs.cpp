#pragma once

template <class T>
class ABBAbs
{
public:
  virtual int height() = 0;

  virtual int size() = 0;

  virtual void insert(T data) = 0;

  virtual void remove(T data) = 0;

  virtual void inOrderPrint() = 0;
};
