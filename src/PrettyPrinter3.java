/**
 ----------------------------------
 | Program created by Tushar Sharma.|
 | CS31600 Homework 1               |
 | Email: sharm191@pnw.edu          |
 | File Info: PrettyPrinter3.java   |
 ----------------------------------
 */


/**
 The prettyPrint() method takes a BTree and
 converts it into a well formated string.
 */
public class PrettyPrinter3 {
    public static String prettyPrint(BTree tree) {
        return prettyPrint(tree, "  ");
    }
    /**
     * This prettyPrint() method is essentially a
     * preorder traversal of the tree.
     */
    private static String prettyPrint(BTree tree, String indentation) {
        String result = "";
        if (tree == null)  // empty tree (stops the recursion)
        {
            result += "()";
        } else if (tree.depth() == 0)  // depth==0 stops the recursion also
        {
            result += tree.getElement();
        } else if (tree.depth() == 1) {
            result += "(" + tree.getElement();
            result += " " + prettyPrint(tree.getLeftTree(), indentation);
            result += " " + prettyPrint(tree.getRightTree(), indentation);
            result += ")";
        } else {
            result += "(" + tree.getElement();
            String stringIndent = "";
            for (int t = 0; t < tree.getElement().length(); t++) {
                stringIndent = stringIndent + " ";
            }
            result += " " + prettyPrint(tree.getLeftTree(), indentation + "  " + stringIndent);
            result += "\n" + indentation + stringIndent + prettyPrint(tree.getRightTree(), indentation + "  " + stringIndent);
            result += "\n" + indentation.substring(0, indentation.length() - 2) + ")";
        }
        return result;
    }
}