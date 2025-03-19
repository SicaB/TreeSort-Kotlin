# TreeSort in Kotlin

This is a simple Android Developer assignment that implements **TreeSort** in Kotlin.  
It includes two different sorting approaches:

1️⃣ **Binary Search Tree (BST) based TreeSort** – A custom implementation.  
2️⃣ **TreeSet-based sorting** – Uses Kotlin’s built-in `TreeSet` (Red-Black Tree).  
3️⃣ **Bonus:** A mini-app where users can input numbers and see them sorted in real-time.  
4️⃣ **Unit Tests** to ensure sorting correctness.

---

## 🚀 Features
- Implements **TreeSort using a Binary Search Tree (BST)**.
- **Alternative solution using `TreeSet`** for optimized sorting.
- **Interactive mini-app** where users can input numbers and see the sorted output.
- **Unit tests included** to verify sorting correctness.
- Written in **Kotlin** following best practices.

---

## 📌 Implementation
This project provides two sorting methods:

### **1️⃣ TreeSort (BST-based)**
- Builds a **Binary Search Tree (BST)** from the input list.
- Uses **inorder traversal** to extract sorted values.
- **Time Complexity:**
    - **Worst case:** `O(n²)` (if the input is already sorted, creating an unbalanced tree).
    - **Best case:** `O(n log n)` (if the tree remains balanced).

### **2️⃣ TreeSet-based sorting**
- Uses Kotlin’s **`TreeSet`** (a self-balancing Red-Black Tree).
- Automatically maintains sorted order.
- **Time Complexity:** `O(n log n)` (guaranteed, as `TreeSet` remains balanced).
- **Removes duplicate values** (unlike BST-based sorting).

---

## 📲 Mini-App: User Input Sorting
To make the project more interactive, I created a **mini-app** that allows users to enter a comma-separated list of numbers, choose a sorting method, and see the sorted output in real-time.

### **🖥️ App Flow**
1️⃣ The user enters a list of numbers in an **EditText field**.  
2️⃣ Presses the **"Sort"** button.  
3️⃣ The numbers are sorted using either `TreeSort` (BST) or `TreeSet`.  
4️⃣ The sorted result is displayed in a **TextView**.