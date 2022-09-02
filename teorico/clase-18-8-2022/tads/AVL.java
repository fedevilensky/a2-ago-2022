package tads;

public class AVL<T extends Comparable<T>> implements ABBI<T> {
  AVLNode root;

  @Override
  public int height() {
    return height(root);
  }

  @Override
  public int size() {
    return size(root);
  }

  @Override
  public void insert(T data) {
    root = insert(data, root);
  }

  @Override
  public void remove(T data) {
    // TODO Auto-generated method stub
  }

  @Override
  public void inOrderPrint() {
    inOrderPrint(root);
  }

  private int size(AVLNode node) {
    if (node == null)
      return 0;
    return 1 + size(node.left) + size(node.right);
  }

  private void inOrderPrint(AVLNode node) {
    if (node == null)
      return;
    inOrderPrint(node.left);
    System.out.println(node.data);
    inOrderPrint(node.right);
  }

  private AVLNode insert(T data, AVLNode node) {
    if (node == null)
      return new AVLNode(data);
    if (data.equals(node.data))
      return node;

    if (data.compareTo(node.data) < 0) {
      node.left = insert(data, node.left);
    } else if (data.compareTo(node.data) > 0) {
      node.right = insert(data, node.right);
    }

    node.height = max(height(node.left), height(node.right)) + 1;

    int balance = balanceFactor(node);

    // desbalanceado a la izquierda-?
    if (balance > 1) {
      // desbalanceado a la izquierda-izquierda
      if (data.compareTo(node.left.data) < 0) {
        return rightRotation(node);
      }
      // desbalanceado a la izquierda-derecha
      else {
        return leftRightRotation(node);
      }
    }
    // desbalanceado a la derecha-?
    else if (balance < -1) {
      // desbalanceado a la derecha-derecha
      if (data.compareTo(node.right.data) > 0) {
        return leftRotation(node);
      }
      // desbalanceado a la derecha-izquierda
      else {
        return rightLeftRotation(node);
      }
    }

    return node;
  }

  private int balanceFactor(AVLNode node) {
    return height(node.left) - height(node.right);
  }

  private int height(AVLNode node) {
    if (node != null) {
      return node.height;
    }
    return 0;
  }

  private int max(int a, int b) {
    if (a > b)
      return a;
    return b;
  }

  private AVLNode rightRotation(AVLNode z) {
    var y = z.left;
    var y_r = y.right;

    y.right = z;
    z.left = y_r;

    z.height = max(height(z.left), height(z.right)) + 1;
    y.height = max(height(y.left), height(y.right)) + 1;

    return y;
  }

  private AVLNode leftRotation(AVLNode z) {
    return null;
  }

  private AVLNode leftRightRotation(AVLNode z) {
    return null;
  }

  private AVLNode rightLeftRotation(AVLNode z) {
    return null;
  }

  private class AVLNode {
    int height;
    AVLNode left, right = null;
    T data;

    AVLNode(T data) {
      this.data = data;
      this.height = 1;
    }
  }
}
