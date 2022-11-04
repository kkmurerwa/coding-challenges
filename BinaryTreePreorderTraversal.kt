/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    private val list = mutableListOf<Int>()
    
    fun preorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) return emptyList<Int>()
        
        recursiveSolution(root)
        
        // Stack solution
//         val stack = Stack<TreeNode>()
        
//         stack.push(root)
        
//         while (stack.isNotEmpty()) {
//             val currentNode = stack.pop()
            
//             list.add(currentNode.`val`)
            
//             if (currentNode.right != null) {
//                 stack.push(currentNode.right)
//             }
            
//             if (currentNode.left != null) {
//                 stack.push(currentNode.left)
//             }
//         } 
        
        return list
    }
    
    tailrec fun recursiveSolution(currentNode: TreeNode) {
        list.add(currentNode.`val`)
        
        if (currentNode.left != null) {
            recursiveSolution(currentNode.left)
        }
        
        if (currentNode.right != null) {
            recursiveSolution(currentNode.right)
        }
    }
    
}