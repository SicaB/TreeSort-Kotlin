package com.example.treesort.data

class TreeNode(val value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun insert(root: TreeNode?, value: Int): TreeNode {
    if (root == null) {
        return TreeNode(value)
    }
    if (value < root.value) {
        root.left = insert(root.left, value)
    } else {
        root.right = insert(root.right, value)
    }
    return root
}

fun sortList(root: TreeNode?, result: MutableList<Int>) {
    if (root != null) {
        sortList(root.left, result)
        result.add(root.value)
        sortList(root.right, result)
    }
}

fun treeSort(arr: List<Int>): List<Int> {
    if (arr.isEmpty()) return emptyList()

    var root: TreeNode? = null
    for (num in arr) {
        root = insert(root, num)
    }

    val sortedList = mutableListOf<Int>()
    sortList(root, sortedList)
    return sortedList
}

fun treeSortUsingTreeSet(arr: List<Int>): List<Int> {
    val treeSet = sortedSetOf<Int>()
    treeSet.addAll(arr)
    return treeSet.toList()
}

fun main() {
    val numbers = listOf(1, 4, 5, 99, 110, 200)

    // Sort using TreeSet
    val sortedWithTreeSet = treeSortUsingTreeSet(numbers)
    println("Sorted with TreeSet: $sortedWithTreeSet")

    // Sort using BST-based TreeSort
    val sortedWithTreeSort = treeSort(numbers)
    println("Sorted with TreeSort: $sortedWithTreeSort")
}
