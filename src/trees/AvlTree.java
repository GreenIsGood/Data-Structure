package trees;

import java.util.Stack;
import javax.swing.JOptionPane;

class AvlTree {

    public AvlNode root;

    public AvlTree() {
        root = null;

    }

    public int height(AvlNode t) {
        return t == null ? -1 : t.height;
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public boolean insert(Data x) {
        try {
            root = insert(x, root);

            return true;
        } catch (Exception e) {
            
            return false;
        }
    }

    protected AvlNode insert(Data x, AvlNode t) throws Exception {
        if (t == null) {
            t = new AvlNode(x);
        } else if (x.compareTo(t.element) < 0) {
            t.left = insert(x, t.left);

            if (height(t.left) - height(t.right) == 2) {
                if (x.compareTo(t.left.element) < 0) {
                    t = rotateWithLeftChild(t);

                } else {
                    t = doubleWithLeftChild(t);

                }
            }
        } else if (x.compareTo(t.element) > 0) {
            t.right = insert(x, t.right);

            if (height(t.right) - height(t.left) == 2) {
                if (x.compareTo(t.right.element) > 0) {
                    t = rotateWithRightChild(t);

                } else {
                    t = doubleWithRightChild(t);

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Attempting to insert duplicate value " + "\n" + "Duplicate Values are not allowed in AVL Tree", null, JOptionPane.INFORMATION_MESSAGE);
            throw new Exception("Attempting to insert duplicate value");

        }

        t.height = max(height(t.left), height(t.right)) + 1;
        return t;
    }

    protected AvlNode rotateWithLeftChild(AvlNode k2) {
        AvlNode k1 = k2.left;

        k2.left = k1.right;
        k1.right = k2;

        k2.height = max(height(k2.left), height(k2.right)) + 1;
        k1.height = max(height(k1.left), k2.height) + 1;

        return (k1);
    }

    protected AvlNode doubleWithLeftChild(AvlNode k3) {
        k3.left = rotateWithRightChild(k3.left);
        return rotateWithLeftChild(k3);
    }

    protected AvlNode rotateWithRightChild(AvlNode k1) {
        AvlNode k2 = k1.right;

        k1.right = k2.left;
        k2.left = k1;

        k1.height = max(height(k1.left), height(k1.right)) + 1;
        k2.height = max(height(k2.right), k1.height) + 1;

        return (k2);
    }

    protected AvlNode doubleWithRightChild(AvlNode k1) {
        k1.right = rotateWithLeftChild(k1.right);
        return rotateWithRightChild(k1);
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return (root == null);
    }

    public Data findMin() {
        if (isEmpty()) {
            return null;
        }

        return findMin(root).element;
    }

    public Data findMax() {
        if (isEmpty()) {
            return null;
        }
        return findMax(root).element;
    }

    private AvlNode findMin(AvlNode t) {
        if (t == null) {
            return t;
        }

        while (t.left != null) {
            t = t.left;
        }
        return t;
    }

    private AvlNode findMax(AvlNode t) {
        if (t == null) {
            return t;
        }

        while (t.right != null) {
            t = t.right;
        }
        return t;
    }

    public void remove(Data x) {
        root = remove(x, root);
    }

    private AvlNode remove(Data x, AvlNode t) {
        if (t == null) {
            JOptionPane.showMessageDialog(null, "Check your key again", null, JOptionPane.ERROR_MESSAGE);
            return t;   
            
        }
        int compareResult = x.compareTo(t.element);

        if (compareResult < 0) {
            t.left = remove(x, t.left);
        } else if (compareResult > 0) {
            t.right = remove(x, t.right);
        } else if (t.left != null && t.right != null) 
        {
            t.element = findMin(t.right).element;
            t.right = remove(t.element, t.right);
        } else {
            t = (t.left != null) ? t.left : t.right;
        }
        return balance(t);
    }

    private static final int ALLOWED_IMBALANCE = 1;

    private AvlNode balance(AvlNode t) {
        if (t == null) {
            return t;
        }

        if (height(t.left) - height(t.right) > ALLOWED_IMBALANCE) {
            if (height(t.left.left) >= height(t.left.right)) {
                t = rotateWithLeftChild(t);
            } else {
                t = doubleWithLeftChild(t);
            }
        } else if (height(t.right) - height(t.left) > ALLOWED_IMBALANCE) {
            if (height(t.right.right) >= height(t.right.left)) {
                t = rotateWithRightChild(t);
            } else {
                t = doubleWithRightChild(t);
            }
        }

        t.height = Math.max(height(t.left), height(t.right)) + 1;
        return t;
    }

    
    public boolean checkBalanceOfTree(AvlNode current) {

        boolean balancedRight = true, balancedLeft = true;
        int leftHeight = 0, rightHeight = 0;

        if (current.right != null) {
            balancedRight = checkBalanceOfTree(current.right);
            rightHeight = getDepth(current.right);
        }

        if (current.left != null) {
            balancedLeft = checkBalanceOfTree(current.left);
            leftHeight = getDepth(current.left);
        }

        return balancedLeft && balancedRight && Math.abs(leftHeight - rightHeight) < 2;
    }

    public int getDepth(AvlNode n) {
        int leftHeight = 0, rightHeight = 0;

        if (n.right != null) {
            rightHeight = getDepth(n.right);
        }
        if (n.left != null) {
            leftHeight = getDepth(n.left);
        }

        return Math.max(rightHeight, leftHeight) + 1;
    }

    public boolean checkOrderingOfTree(AvlNode current) {
        if (current.left != null) {
            if (current.left.element.compareTo(current.element) > 0) {
                return false;
            } else {
                return checkOrderingOfTree(current.left);
            }
        } else if (current.right != null) {
            if (current.right.element.compareTo(current.element) < 0) {
                return false;
            } else {
                return checkOrderingOfTree(current.right);
            }
        } else if (current.left == null && current.right == null) {
            return true;
        }

        return true;
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
                AvlNode temp = (AvlNode) globalStack.pop();
                if (temp != null) {
                    out += (temp.element.display());
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
}
