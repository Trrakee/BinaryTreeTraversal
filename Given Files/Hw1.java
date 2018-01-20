/*


*/

/**
  This program tests your two pretty printing methods.
  Here is an example binary tree.

                 a
                / \
              /     \
             b       c
            / \        \
          /     \        \
         d       e        f
                         /
                       /
                      g
                       \
                         \
                           h
*/
public class Hw1
{
   public static void main(String[] args)
   {
      // Here is the Java declaration of the above binary tree.
      BTree bTree1 = new BTree("a",
                              new BTree("b",
                                        new BTree("d"),
                                        new BTree("e")),
                              new BTree("c",
                                        null,
                                        new BTree("f",
                                                  new BTree("g",
                                                            null,
                                                            new BTree("h")),
                                                  null)));

      // Write the Java declaration for the binary tree in picture bTree2.png.
      BTree bTree2 =


      // Write the Java declaration for the binary tree in picture bTree3.png.
      BTree bTree3 =


      // Write the Java declaration for the binary tree in picture bTree4.png.
      BTree bTree4 =


      // Write the Java declaration for the binary tree in picture bTree5.png.
      BTree bTree5 =



      System.out.println( " Preorder traversal --> " + Traverse.preOrder( bTree1 ) );
      System.out.println( "  Inorder traversal --> " + Traverse.inOrder( bTree1 ) );
      System.out.println( "Postorder traversal --> " + Traverse.postOrder( bTree1 ) + "\n" );

      System.out.println( PrettyPrinter0.prettyPrint( bTree1 ) + "\n" );
      System.out.println( PrettyPrinter1.prettyPrint( bTree1 ) + "\n" );
      System.out.println( PrettyPrinter2.prettyPrint( bTree1 ) + "\n" );
      System.out.println( PrettyPrinter3.prettyPrint( bTree1 ) + "\n" );


      System.out.println( " Preorder traversal --> " + Traverse.preOrder( bTree2 ) );
      System.out.println( "  Inorder traversal --> " + Traverse.inOrder( bTree2 ) );
      System.out.println( "Postorder traversal --> " + Traverse.postOrder( bTree2 ) + "\n" );

      System.out.println( PrettyPrinter0.prettyPrint( bTree2 ) + "\n" );
      System.out.println( PrettyPrinter1.prettyPrint( bTree2 ) + "\n" );
      System.out.println( PrettyPrinter2.prettyPrint( bTree2 ) + "\n" );
      System.out.println( PrettyPrinter3.prettyPrint( bTree2 ) + "\n" );


      System.out.println( " Preorder traversal --> " + Traverse.preOrder( bTree3 ) );
      System.out.println( "  Inorder traversal --> " + Traverse.inOrder( bTree3 ) );
      System.out.println( "Postorder traversal --> " + Traverse.postOrder( bTree3 ) + "\n" );

      System.out.println( PrettyPrinter0.prettyPrint( bTree3 ) + "\n" );
      System.out.println( PrettyPrinter1.prettyPrint( bTree3 ) + "\n" );
      System.out.println( PrettyPrinter2.prettyPrint( bTree3 ) + "\n" );
      System.out.println( PrettyPrinter3.prettyPrint( bTree3 ) + "\n" );


      System.out.println( " Preorder traversal --> " + Traverse.preOrder( bTree4 ) );
      System.out.println( "  Inorder traversal --> " + Traverse.inOrder( bTree4 ) );
      System.out.println( "Postorder traversal --> " + Traverse.postOrder( bTree4 ) + "\n" );

      System.out.println( PrettyPrinter0.prettyPrint( bTree4 ) + "\n" );
      System.out.println( PrettyPrinter1.prettyPrint( bTree4 ) + "\n" );
      System.out.println( PrettyPrinter2.prettyPrint( bTree4 ) + "\n" );
      System.out.println( PrettyPrinter3.prettyPrint( bTree4 ) + "\n" );


      System.out.println( " Preorder traversal --> " + Traverse.preOrder( bTree5 ) );
      System.out.println( "  Inorder traversal --> " + Traverse.inOrder( bTree5 ) );
      System.out.println( "Postorder traversal --> " + Traverse.postOrder( bTree5 ) + "\n" );

      System.out.println( PrettyPrinter0.prettyPrint( bTree5 ) + "\n" );
      System.out.println( PrettyPrinter1.prettyPrint( bTree5 ) + "\n" );
      System.out.println( PrettyPrinter2.prettyPrint( bTree5 ) + "\n" );
      System.out.println( PrettyPrinter3.prettyPrint( bTree5 ) + "\n" );
   }
}
