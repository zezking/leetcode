class TreeNode {
    val: number
    left: TreeNode | null
    right: TreeNode | null
    constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
        this.val = (val === undefined ? 0 : val)
        this.left = (left === undefined ? null : left)
        this.right = (right === undefined ? null : right)
    }
}

function hasPathSum(root: TreeNode | null, targetSum: number, currentSum: number = 0): boolean {
    if (!root) {
        return false
    }
    currentSum += root.val

    if (!root.left && !root.right) {
        return currentSum === targetSum
    }

    return hasPathSum(root.left, targetSum, currentSum) || hasPathSum(root.right, targetSum, currentSum)

};