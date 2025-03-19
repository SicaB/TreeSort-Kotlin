package com.example.treesort.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.treesort.data.treeSort
import com.example.treesort.data.treeSortUsingTreeSet

class MainViewModel : ViewModel() {

    private val _sortedNumbers = MutableLiveData<String>()
    val sortedNumbers: LiveData<String> get() = _sortedNumbers

    // Uses TreeSet to sort the list
    fun sortNumbersWithTreeSet(input: String) {
        val numberList = input.split(",").mapNotNull { it.trim().toIntOrNull() }
        val sortedList = treeSortUsingTreeSet(numberList)
        _sortedNumbers.value = sortedList.joinToString(", ")
    }

    // Uses BST-based TreeSort to sort the list
    fun sortNumbers(input: String) {
        val numberList = input.split(",").mapNotNull { it.trim().toIntOrNull() }
        val sortedList = treeSort(numberList)
        _sortedNumbers.value = sortedList.joinToString(", ")
    }
}