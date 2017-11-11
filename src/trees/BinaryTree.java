/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahmoud
 */
public class BinaryTree {

    public Node root;

    public Node find(Data key) {
        Node current = root;
        while (!current.value.equals(key)) {
            if (key.compareTo(current.value) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
            if (current == null) {
                JOptionPane.showMessageDialog(null, "can't Find it");
                return null;
            }
        }
        JOptionPane.showMessageDialog(null, "Found :" + current.value);
        return current;
    }

    public void insert(Data v) {
        Node n = new Node(v);
        if (root == null) {
            root = n;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (v.compareTo(current.value) < 0) {
                    current = current.left;
                    if (current == null) {
                        parent.left = n;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = n;
                        return;
                    }
                }
            }
        }
    }

    public String minimum() {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.value.display();
    }

    public String maximum() {
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.value.display();
    }

    public boolean delete(Data key) {
        Node current = root;
        Node parent = root;
        boolean isLeft = true;
        while (!key.equals(current.value)) {
            parent = current;
            if (key.compareTo(current.value) < 0) {
                isLeft = true;
                current = current.left;
            } else {
                isLeft = false;
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }
        if (current.right == null && current.left == null) {
            if (current == root) {
                root = null;
            } else if (isLeft) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeft) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeft) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeft) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }

            successor.left = current.left;
        }
        return true;
    }

    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.right;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.left;
        }

        if (successor != delNode.right) {
            successorParent.left = successor.right;
            successor.right = delNode.right;
        }
        return successor;
    }

    public String out = "";

    public String preOrder(Node localRoot) {
        if (localRoot != null) {

            out += (localRoot.value.display() + " ");
            preOrder(localRoot.left);
            preOrder(localRoot.right);
        }
        return out;
    }

    public String inOrder(Node local) {
        if (local != null) {
            inOrder(local.left);
            out += (local.value.display() + " ");
            inOrder(local.right);
        }
        return out;
    }

    public String postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.left);
            postOrder(localRoot.right);
            out += (localRoot.value.display() + " ");
        }
        return out;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("[");
        helpToString(root, string);
        string.append("]");
        return string.toString();
    }

    private void helpToString(Node node, StringBuilder string) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            helpToString(node.left, string);
            string.append(", ");
        }

        string.append(node.value);

        if (node.right != null) {
            string.append(", ");
            helpToString(node.right, string);
        }
    }

    public boolean checkBinaryTreeIsBalanced(Node root) {

        if (root == null) {
            return true;
        }

        int heightDifference = computeHeight(root.left) - computeHeight(root.right);

        if (Math.abs(heightDifference) <= 1) {
            return checkBinaryTreeIsBalanced(root.left) && checkBinaryTreeIsBalanced(root.right);
        } else {
            return false;
        }

    }

    public int computeHeight(Node root) {

        if (root == null) {
            return 0;
        }

        return Math.max(computeHeight(root.left), computeHeight(root.right)) + 1;
    }

    public String displayTree() {
        String out = "";
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 20;
        boolean isRowEmpty = false;

        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for (int j = 0; j < nBlanks; j++) {
                out += (" ");
            }
            while (globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    out += (temp.value.display());
                    localStack.push(temp.left);
                    localStack.push(temp.right);
                    if (temp.left != null || temp.right != null) {
                        isRowEmpty = false;
                    }
                } else {
                    out += ("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++) {
                    out += (" ");
                }
            }
            out += ("\n");
            nBlanks /= 2;
            while (localStack.isEmpty() == false) {
                globalStack.push(localStack.pop());
            }
        }
        return out;

    }

    public void clear() {
        root = null;
    }

}
