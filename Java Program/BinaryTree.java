
class Node
{
int data;
Node left;
Node right;
}
class BinaryTree
{
    public Node createNode(int k)
    {
      Node a=new Node();
      a.data=k;
      a.left=null;
      a.right=null;
      return a;
    }
   public void Inorder(Node node)
    {
      if(node==null)
       {
          return;
       }
      Inorder(node.left);
      System.out.print(node.data+" ");
      Inorder(node.right);
    }
 public void Preorder(Node node)
 {
  if(node==null)
   {
    return;
   }
  System.out.print(node.data+" ");
  Preorder(node.left);
  Preorder(node.right);
 }
public void Postorder(Node node)
 {
  if(node==null)
   {
    return;
   }
  Postorder(node.left);
  Postorder(node.right);
  System.out.print(node.data+" ");
 }

}
public class T{
 public static void main(String args[])
  {
    BinaryTree a=new BinaryTree();
    Node root=a.createNode(2);
    root.left=a.createNode(7);
    root.right=a.createNode(5);
    root.left.left=a.createNode(2);
    root.left.right=a.createNode(6);
    root.left.right.left=a.createNode(5);
    root.left.right.right=a.createNode(11);
    root.right.right=a.createNode(9);
    root.right.right.left=a.createNode(4);
    a.Inorder(root);
    System.out.println();
    a.Preorder(root);
    System.out.println();
    a.Postorder(root);
    System.out.println();

  }
}
 
