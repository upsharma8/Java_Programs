class Node{
int data;
Node left;
Node right;
}
class BST
{
public Node createNode(int v)
{
  Node n= new Node();
  n.data=v;
  n.left=null;
  n.right=null;
  return n;
}
public Node InsertElement(Node node,int val)
{
 if(node==null)
  {
    return createNode(val);
  }
else if(val<node.data)
{
  node.left=InsertElement(node.left,val);
}
else
{
node.right=InsertElement(node.right,val);
}
    
 return node;
}
 public deleteNode(Node node,int val)
 {
  if(node==null)
   {
      System.out.println("No element to delete");
   }
  else if(val<node.data)
   {
    node.left=deleteNode(node.left,val);
   }
  else if(val>node.data)
   {
    node.right=deleteNode(node.right,val);
   }
  else
   {
     if(node.left==null || node.right==null)
      {
        Node temp=null;
        temp= node.left==null ? node.right: node.left;
        if(temp==null)
         {
          return null;
         }
        else{
              return node;
            }
      }
    else{
           Node temp=findLargest(node.left);
         }

   }
 }

   public void findLargest(Node node)
    {
      if(node==null || node()
       {
         
}
public class BinarySearch
{
   public static void main(String[] args)
   {
     
    BST a=new BST();
    Node root=null;
    //8,3,6,10,4,7,1,14,13
    a.InsertElement(root,8);
    a.InsertElement(root,3);
    a.InsertElement(root,6);
    a.InsertElement(root,10);
    a.InsertElement(root,4);
    a.InsertElement(root,7);
    a.InsertElement(root,1);
    a.InsertElement(root,14);
    a.InsertElement(root,13);
  }
}