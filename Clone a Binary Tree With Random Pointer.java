/*
Given a Binary Tree having random pointers clone the Binary Tree. 
The task is to complete the function cloneTree which take one argument the root of the 
tree to be copied and should return the root of the cloned tree.
*/

/*Complete the function below
Node is as follows:
class Tree{
	int data;
	Tree left,right,random;
	Tree(int d){
		data=d;
		left=null;
		right=null;
		random=null;
	}
}*/
class GfG{
    public static Tree cloneTree(Tree tree){
        Map<Tree,Tree> map = new HashMap<>();
      return clone(tree, map);
     }
     
      public static Tree clone(Tree tree,Map<Tree,Tree> map ){
         if(tree == null){
          return null;
         }
         
        if(map.containsKey(tree)){
            return map.get(tree);
        }
      //make clone
      Tree newTree = new Tree(tree.data);
      map.put(tree, newTree);
      newTree.left = clone(tree.left, map);
      newTree.right = clone(tree.right, map);
      newTree.random = clone(tree.random, map);
      return newTree;
     }
}
