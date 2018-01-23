/*


*/

/**
 The prettyPrint() method takes a BTree and
 converts it into a well formated string.
 */
public class PrettyPrinter2
{
    public static String prettyPrint(BTree tree)
    {
        return prettyPrint(tree, "  ");
    }


    /**
     This prettyPrint() method is essentially a
     preorder traversal of the tree.
     */
    private static String prettyPrint(BTree tree, String indentation)
    {
        String result = "";
        if (tree == null)  // empty tree (stops the recursion)
        {
            result += "()" ;
        }
        else if (tree.depth() == 0)  // depth==0 stops the recursion also
        {
            result += tree.getElement();
        }
        else if (tree.depth() == 1)
        {
            result += "(" + tree.getElement() + " " + prettyPrint( tree.getLeftTree())  + " " + prettyPrint( tree.getRightTree()) +")" ;
        }
        else {
            result +=  "(" + tree.getElement() + "\n" ;
            result += indentation + (prettyPrint(tree.getLeftTree(),indentation + "  " ))+ "\n";
            result += indentation + (prettyPrint(tree.getRightTree(),indentation + "  " ))  +"\n";
            result += indentation.substring(0,indentation.length()-2) + ")";
        }
        return result;
    }
}
