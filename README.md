# HackerRank-Algorithms
This is my repo conyaining solutions for HackerRank Problems

# HackerRank Algorithms & GitHub Coding Portfolio

## Student Information

- **Name:** Hampan Gowda K L
- **SRN:** R25EF095
- **Semester:** 3rd Semester
- **Branch:** Computer Science and Engineering
- **Programming Language:** Java

## Profiles

- **HackerRank:** https://www.hackerrank.com/profile/hampangowda2934
- **GitHub Repository:** https://github.com/Hampan29/HackerRank-Algorithms

## About This Portfolio

This repository contains my solutions to five mandatory HackerRank algorithmic problems completed as part of my 3rd-semester Computer Science and Engineering coding activity.

The problems cover implementation, arrays, sorting, searching, and greedy algorithmic techniques. For each problem, I have included a Java solution and documented the selected approach, time complexity, space complexity, and relevant algorithmic reasoning.

The purpose of this portfolio is to demonstrate my problem-solving ability, understanding of algorithm efficiency, and ability to organize and document coding work using GitHub.

---

## Problem Summary

| No. | Problem | Topic | Approach | Time Complexity | Auxiliary Space |
|---|---|---|---|---|---|
| 1 | [Mini-Max Sum](https://www.hackerrank.com/challenges/mini-max-sum/problem) | Implementation / Arrays | Track the minimum and maximum values while calculating the total sum | O(N) | O(1) |
| 2 | [Birthday Cake Candles](https://www.hackerrank.com/challenges/birthday-cake-candles/problem) | Arrays / Counting | Find the maximum candle height and count its occurrences | O(N) | O(1) |
| 3 | [Insertion Sort – Part 1](https://www.hackerrank.com/challenges/insertionsort1/problem) | Sorting | Shift larger elements and insert the selected value into its correct position | O(N) | O(1) |
| 4 | Binary Search | Searching | Repeatedly divide the sorted search range into two halves | O(log N) | O(1) |
| 5 | [Mark and Toys](https://www.hackerrank.com/challenges/mark-and-toys/problem) | Greedy / Sorting | Sort prices and purchase the maximum number of affordable toys | O(N log N) | O(N) |

---

# 1. Mini-Max Sum

### Problem Summary

Given five positive integers, calculate the minimum and maximum values that can be obtained by summing exactly four of the five integers.

### Approach

The solution calculates the total sum of all elements and identifies the minimum and maximum element. The minimum sum is obtained by excluding the maximum element, while the maximum sum is obtained by excluding the minimum element.

### Algorithm

1. Read the five integers.
2. Calculate the total sum.
3. Find the minimum element.
4. Find the maximum element.
5. Minimum sum = total sum − maximum element.
6. Maximum sum = total sum − minimum element.
7. Display the minimum and maximum sums.

### Complexity

- **Time:** O(N)
- **Auxiliary Space:** O(1)

### Why This Approach?

Tracking the minimum and maximum values avoids unnecessary sorting and processes the input only once.

### HackerRank

[Mini-Max Sum](https://www.hackerrank.com/challenges/mini-max-sum/problem)

### Solution

[01-Mini-Max-Sum](./01-Mini-Max-Sum/)

### Accepted Evidence

Accepted-submission screenshot is included as activity evidence.

---

# 2. Birthday Cake Candles

### Problem Summary

Given the heights of candles, determine how many candles have the maximum height.

### Approach

The solution scans the array once while maintaining the maximum candle height and the number of times that maximum occurs.

### Algorithm

1. Initialize the maximum height.
2. Traverse the candle heights.
3. If a height is greater than the current maximum, update the maximum and reset the count.
4. If a height equals the maximum, increment the count.
5. Return the count.

### Complexity

- **Time:** O(N)
- **Auxiliary Space:** O(1)

### Why This Approach?

A single traversal is sufficient because only the maximum value and its frequency are required. Sorting the entire array is unnecessary.

### HackerRank

[Birthday Cake Candles](https://www.hackerrank.com/challenges/birthday-cake-candles/problem)

### Solution

[02-Birthday-Cake-Candles](./02-Birthday-Cake-Candles/)

### Accepted Evidence

Accepted-submission screenshot is included as activity evidence.

---

# 3. Insertion Sort – Part 1

### Problem Summary

Given an almost sorted array, insert the final element into its correct position while shifting larger elements to the right.

### Approach

The last element is temporarily stored as the value to insert. Starting from the element immediately before it, larger elements are shifted one position to the right until the correct position for the stored value is found.

### Algorithm

1. Store the last element as the insertion value.
2. Start comparing from the element before it.
3. Shift elements greater than the insertion value one position to the right.
4. Insert the stored value at the correct position.
5. Print the array after each required shift/insertion step.

### Complexity

- **Time:** O(N)
- **Auxiliary Space:** O(1)

### Why This Approach?

Insertion sort works efficiently when the array is already nearly sorted and requires only shifting the necessary elements.

### HackerRank

[Insertion Sort – Part 1](https://www.hackerrank.com/challenges/insertionsort1/problem)

### Solution

[03-Insertion-Sort-Part-1](./03-Insertion-Sort-Part-1/)

### Accepted Evidence

Accepted-submission screenshot is included as activity evidence.

---

# 4. Binary Search

### Problem Summary

Search for a target value in a sorted array using a divide-and-conquer searching technique.

### Approach

The solution maintains two boundaries, `low` and `high`, and repeatedly calculates the middle element. If the middle element is the target, the search ends. Otherwise, the search continues in either the left or right half depending on the comparison.

### Algorithm

1. Set `low = 0` and `high = n - 1`.
2. Calculate the middle index.
3. Compare the middle element with the target.
4. If equal, return the position.
5. If the target is smaller, search the left half.
6. If the target is larger, search the right half.
7. Continue until the target is found or the search range becomes empty.

### Complexity

- **Time:** O(log N)
- **Auxiliary Space:** O(1)

### Why This Approach?

Binary search eliminates approximately half of the remaining search space during every iteration, making it significantly faster than linear search for a sorted array.

### Solution

[04-Binary-Search](./04-Binary-Search/)

### Accepted Evidence

Binary-search implementation/testing evidence is included as activity evidence.

---

# 5. Mark and Toys

### Problem Summary

Given the prices of toys and a fixed amount of money, determine the maximum number of toys that can be purchased without exceeding the budget.

### Approach

The solution sorts the toy prices in ascending order and purchases the cheapest toys first until the available budget cannot afford the next toy.

### Algorithm

1. Read the toy prices and available budget.
2. Sort the prices in ascending order.
3. Start with zero purchased toys.
4. Traverse the sorted prices.
5. If the current toy can be purchased within the remaining budget, purchase it.
6. Otherwise, stop.
7. Return the number of toys purchased.

### Complexity

- **Time:** O(N log N)
- **Auxiliary Space:** O(N)

### Why This Approach?

Buying the cheapest toys first maximizes the number of toys that can be purchased within the available budget.

### HackerRank

[Mark and Toys](https://www.hackerrank.com/challenges/mark-and-toys/problem)

### Solution

[05-Mark-and-Toys](./05-Mark-and-Toys/)

### Accepted Evidence

Accepted-submission screenshot is included as activity evidence.

---

## HackerRank Achievement Evidence

The HackerRank profile used for this activity is:

https://www.hackerrank.com/profile/hampangowda2934

Badge evidence will be included here if a relevant HackerRank badge has been earned.

---

## Learning Outcome

Through these five problems, I practiced several fundamental algorithmic techniques, including array traversal, minimum and maximum tracking, counting, insertion-based sorting, binary search, and greedy selection. The activity also helped me understand how algorithm choice affects time and space complexity. I gained experience in implementing solutions in Java, testing them against different cases, and documenting the reasoning behind each solution. Maintaining the solutions in GitHub also helped me organize my coding work into a portfolio that can be reviewed and evaluated.

---

## Repository Structure

```text
HackerRank-Algorithms/
│
├── README.md
│
├── 01-Mini-Max-Sum/
│   └── solution.java
│
├── 02-Birthday-Cake-Candles/
│   └── solution.java
│
├── 03-Insertion-Sort-Part-1/
│   └── solution.java
│
├── 04-Binary-Search/
│   └── solution.java
│
└── 05-Mark-and-Toys/
    └── solution.java