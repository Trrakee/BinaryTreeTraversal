/**
 The prettyPrint() method takes a BTree and
 converts it into a string.
 */

public class PrettyPrinter0
{
    public static String prettyPrint(BTree tree)
    {
        String result = "";

        if (tree == null)  // empty tree (stops the recursion)
        {
            result += "()";
        }
        else if (tree.depth() == 0)  // depth==0 stops the recursion also
        {
            result += tree.getElement();
        }
        else
        {
            result += "(" + tree.getElement() + " ";
            result += prettyPrint( tree.getLeftTree() ) + " ";
            result += prettyPrint( tree.getRightTree()) + ")";
        }

        return result;
    }
}
