package tads;

public class AVL<T extends Comparable<T>> implements BST<T> {
  class Node {
    T data;
    Node left = null;
    Node right = null;
    int height = 1;
  }

  private Node root;
  private int elements;

  private int max(int a, int b) {
    if (a > b) {
      return a;
    }
    return b;
  }

  private Node insert(Node node, T data) {
    if (node == null) {
      Node newNode = new Node();
      newNode.data = data;

      elements++;

      return newNode;
    }
    if (data.equals(node.data)) {
      return node;
    }

    if (data.compareTo(node.data) > 0) {
      node.right = insert(node.right, data);
    } else {
      node.left = insert(node.left, data);
    }

    node.height = 1 + max(node.left.height, node.right.height);

    int bF = balanceFactor(node);

    // desbalance derecha-*
    if (bF > 1) {
      // derecha-derecha
      if (data.compareTo(node.right.data) > 0) {
        return leftRotation(node);
      }
      // derecha-izquierda
      else {
        return rightLeftRotation(node);
      }
    }
    // desbalance izquierda-*
    else if (bF < -1) {
      // izquierda-izquierda
      if (data.compareTo(node.left.data) < 0) {
        return rightRotation(node);
      }
      // izquierda-derecha
      else {
        return leftRightRotation(node);
      }
    }

    return node;
  }

  private Node rightRotation(Node z) {
    Node y = z.left;
    Node y_r = y.right;

    y.right = z;
    z.left = y_r;

    z.height = 1 + max(height(z.left), height(z.right));
    y.height = 1 + max(y.left.height, y.right.height);

    return y;

  }

  private int balanceFactor(Node node) {
    return height(node.right) - height(node.left);
  }

  private int height(Node node) {
    if (node == null) {
      return 0;
    }
    return node.height;
  }

  @Override
  public int height() {
    return height(root);
  }

  @Override
  public int size() {
    return elements;
  }

  @Override
  public boolean isEmpty() {
    return elements == 0;
    // return root == null;
  }

  @Override
  public boolean contains(T data) {
    Node aux = root;
    while (aux != null) {
      // en c++
      // if(data == aux->data)
      if (data.equals(aux.data)) {
        return true;
      }
      // en c++
      // if(data > aux->data)
      if (data.compareTo(aux.data) > 0) {
        aux = aux.right;
      } else {
        aux = aux.left;
      }
    }

    return false;
  }

  @Override
  public void insert(T data) {
    root = insert(root, data);
  }

}
