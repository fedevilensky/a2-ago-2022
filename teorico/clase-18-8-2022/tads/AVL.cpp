#pragma once

#include "ABBAbs.cpp"
#include <iostream>

template <class T>
struct AVLNode
{
  T data;
  AVLNode<T> *left, *right = nullptr;
  int height;

  ~AVLNode<T>()
  {
    delete left;
    delete right;
  }

  AVLNode<T>(T data)
  {
    this->data = data;
    height = 1;
  }
};

template <class T>
class AVL : public ABBAbs<T>
{
public:
  int height() override
  {
    return height(root);
  }

  int size() override
  {
    return size(this->root);
  }

  void insert(T data) override
  {
    root = insert(data, root);
  }

  void remove(T data) override
  {
    // TODO
  }

  void inOrderPrint() override
  {
    inOrderPrint(root);
  }

private:
  AVLNode<T> *root = nullptr;

  int size(AVLNode<T> *node)
  {
    if (node == nullptr)
      return 0;
    return 1 + size(node->left) + size(node->right);
  }

  void inOrderPrint(AVLNode<T> *node)
  {
    if (node == nullptr)
      return;
    inOrderPrint(node->left);
    std::cout << node->data << std::endl;
    inOrderPrint(node->right);
  }

  AVLNode<T> *insert(T data, AVLNode<T> *node)
  {
    if (node == nullptr)
      return new AVLNode<T>(data);
    if (data == node->data)
      return node;

    if (data < node->data)
    {
      node->left = insert(data, node->left);
    }
    else if (data > node->data)
    {
      node->right = insert(data, node->right);
    }

    node->height = max(height(node->left), height(node->right)) + 1;

    int balance = balanceFactor(node);

    // desbalanceado a la izquierda-?
    if (balance > 1)
    {
      // desbalanceado a la izquierda-izquierda
      if (data < node->left->data)
      {
        return rightRotation(node);
      }
      // desbalanceado a la izquierda-derecha
      else
      {
        return leftRightRotation(node);
      }
    }
    // desbalanceado a la derecha-?
    if (balance < -1)
    {
      // desbalanceado a la derecha-derecha
      if (data > node->right->data)
      {
        return leftRotation(node);
      }
      // desbalanceado a la derecha-izquierda
      else
      {
        return rightLeftRotation(node);
      }
    }

    return node;
  }

  int balanceFactor(AVLNode<T> *node)
  {
    return height(node->left) - height(node->right);
  }

  int height(AVLNode<T> *node)
  {
    if (node != nullptr)
    {
      return node->height;
      // return (*node).height;
    }
    return 0;
  }

  int max(int a, int b)
  {
    if (a > b)
      return a;
    return b;
  }

  AVLNode<T> *rightRotation(AVLNode<T> *z)
  {
    auto y = z->left;
    auto y_r = y->right;

    y->right = z;
    z->left = y_r;

    z->height = max(height(z->left), height(z->right)) + 1;
    y->height = max(height(y->left), height(y->right)) + 1;

    return y;
  }

  AVLNode<T> *leftRotation(AVLNode<T> *z)
  {
    return nullptr;
  }
  AVLNode<T> *leftRightRotation(AVLNode<T> *z)
  {
    return nullptr;
  }
  AVLNode<T> *rightLeftRotation(AVLNode<T> *z)
  {
    return nullptr;
  }
};
