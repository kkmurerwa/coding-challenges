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
    
    fun postorderTraversal(root: TreeNode?): List<Int> {
        // Sol 1: Recursion
        // Sol 2: Stack
        
        if (root == null) return emptyList<Int>()
        
        // Attempt Sol 1
        recursiveSolve(root)
        
        // Attempt Sol 2
        val stack = Stack<TreeNode>()
        
        stack.push(root)
        
        while (stack.isNotEmpty()) {
            val currentNode = stack.pop()
            
            list.add(0, currentNode.`val`)
            
            if (currentNode.left != null) {
                stack.push(currentNode.left)
            }
            
            if (currentNode.right != null) {
                stack.push(currentNode.right)
            }
        } 
        
        
        return list
    }
    
    tailrec fun recursiveSolve(node: TreeNode) {
        if (node.left != null) {
            recursiveSolve(node.left)
        }
        
        if (node.right != null) {
            recursiveSolve(node.right)
        }
        
        list.add(node.`val`)
    }
}