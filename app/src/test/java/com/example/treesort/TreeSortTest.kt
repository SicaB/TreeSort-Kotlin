package com.example.treesort

import com.example.treesort.data.treeSort
import com.example.treesort.data.treeSortUsingTreeSet
import org.junit.Test
import org.junit.Assert.*

class TreeSortTest {

    @Test
    fun treeSortUsingTreeSet_sortsCorrectly() {
        val input = listOf(5, 3, 8, 1, 7)
        val expectedOutput = listOf(1, 3, 5, 7, 8)
        val result = treeSortUsingTreeSet(input)
        assertEquals(expectedOutput, result)
    }

    @Test
    fun treeSortUsingTreeSort_sortsCorrectly() {
        val input = listOf(5, 3, 8, 1, 7)
        val expectedOutput = listOf(1, 3, 5, 7, 8)
        val result = treeSort(input)
        assertEquals(expectedOutput, result)
    }

    @Test
    fun treeSortUsingTreeSet_handlesEmptyList() {
        val input = emptyList<Int>()
        val expectedOutput = emptyList<Int>()
        val result = treeSortUsingTreeSet(input)
        assertEquals(expectedOutput, result)
    }

    @Test
    fun treeSortUsingTreeSort_handlesEmptyList() {
        val input = emptyList<Int>()
        val expectedOutput = emptyList<Int>()
        val result = treeSort(input)
        assertEquals(expectedOutput, result)
    }

    @Test // TreeSet removes duplicates
    fun treeSortUsingTreeSet_removesDuplicates() {
        val input = listOf(5, 3, 3, 8, 1, 7, 7)
        val expectedOutput = listOf(1, 3, 5, 7, 8)
        val result = treeSortUsingTreeSet(input)
        assertEquals(expectedOutput, result)
    }

    @Test // TreeSort() should keep duplicates
    fun treeSortUsingTreeSort_keepsDuplicates() {
        val input = listOf(5, 3, 3, 8, 1, 7, 7)
        val expectedOutput = listOf(1, 3, 3, 5, 7, 7, 8)
        val result = treeSort(input)
        assertEquals(expectedOutput, result)
    }
}
