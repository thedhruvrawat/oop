# OOP Assignment 2
## 1. Reverse String

**Problem**

You'll be reading a string from the console. Your task is to reverse that string word by word (each individual word is not to be reversed) and print that to the console. Each word in the given string would be separated by a single space. However, the string may contain leading or trailing spaces. The answer should not have any such leading or trailing spaces.

**Input Format**

A string $s$

**Constraints**

$0$ ≤ $|s|$ ≤ $10^4$

**Output Format**

A single string

**Sample Input 0**
```
     hello world!  
```
**Sample Output 0**
```
world! hello
```

**Submitted Code**

[Click here](./ReverseString.java)

## 2. Sum of Three 3

**Problem**

You have to implement two classes.

The first class is called `ThreeSum` which has an array as a private instance member and supports three queries on it:

1. Printing the Array (`printArr` method): Returns the sorted representation of the array as a String. The format followed would be the same as that of `Arrays.toString()`. Look at the example test case for a better idea.

2. Replacing a current number in the array with another number (`replace` method): If you ensure that your data is always kept in a sorted order, you could do this more efficiently than a simple linear scan. Between two replace queries, there would always be atleast one non replace query (either a `print` query or a `sumExists` query).

3. Finding out if there exist three numbers in the array (without repetition) that sum to a given target (`sumExists` method) : This method returns a String which is supposed to be the `toString()` representation of a `customReturn` object (more details on the class below. The way you're supposed to return from the method has been illustrated in the sample code). If you keep your data in a sorted order, you could implement this method using only two nested loops rather than three. It is guarenteed that there would be a unique tuple of indexes if a valid tuple does indeed exist. Note that you have to find the indexes of the numbers (0 indexed) that add to the given target. The indexes should correspond to the numbers arranged in a sorted order.

The second class to be implemented is called the `CustomReturn` class. It is this class that the `sumExist`s` method of the `ThreeSum` class will use to return its information. This has two instance variables:

1. A boolean variable called `found`. This should be set to true if `sumExists` is able to find three numbers which sum up to target.

2. An array of integers called `indexes`. This shall be used to store the indexes of the answer.

You have to override `toString()` for `CustomReturn`. If a valid index is not found, it should return "No Valid Indexes exist!". Otherwise it should return the indexes in sorted order as a String (space separated).

It is recommended that you do the I/O operations (reading and writing with respect to the console) from the `main` method and not from the methods of either the `CustomReturn` class or the `ThreeSum` class.

**Input Format**

The first line would contain $n$, the size of the array. The second line would contain $n$ space separated integers (guarenteed to be sorted) which would form the initial array. The third line would contain $q$, the number of queries. The next $q$ lines would have the details of the queries:

1. If the first digit is 0, then you're supposed to print the array.
2. If the first figit is 1, then this would be followed by two more space separated integers. You're supposed to replace the first number with the second in the array.
3. If the first digit is 2, then this would be followed by one more space separated integer. That integer represents the target that you're supposed to find as the sum. Print either "No Valid Indexes exist!" or the indexes of the solution (in sorted order) as the case may be.

**Constraints**

$3$ ≤ $n$ ≤ $100$ , $1$ ≤ $q$ ≤ $10$ 

**Output Format**

As shown in the test case.

**Sample Input 0**
```
5
1 2 3 4 5
6
0
2 11
2 -1
1 3 8
0
2 13
```
**Sample Output 0**
```
[1, 2, 3, 4, 5]
1 3 4
No Valid Indexes exist!
[1, 2, 4, 5, 8]
0 2 4
```
**Explanation 0**
The first line of the output corresponds to the first "0" query. The second line of the output corresponds to the query "2 11", since $arr[1] + arr[3] + arr[4] = 11$. The third line of the output corresponds to the query "2 -1", since there is no tuple of indexes in the array that can sum up to -1. You are not supposed to print anything for a replace query such as "1 3 8". The fourth line of the output corresponds to the second "0" query. Note that there is no 3 in the output, but there is an 8 and that the output is in sorted order. The fifth line of the output corresponds to the query "2 13", since $arr[0] + arr[2] + arr[4] = 13$.

**Submitted Code**

[Click here](./SumOf3.java)

## 3. Longest Common Prefix

**Problem**

Given a list $L$ of $n$ strings, you need to find the longest prefix common in all the strings.

To solve this question, you should use implement and use the class `LongestCommmonPrefix`. A special `augment` utility method has to be also implemented in order to modify the strings in the list in order to add some form of uniformity in them. This will help you to find the answer to the question in a more organized and easy manner. See the code template for more information.

If there is no common prefix, print `-`.

**Input Format**

The first line of input in each testcase consists of a single integer $n$, denoting the number of strings in the list $L$. $n$ lines follow after this, each containing a single string beloning to $L$.

**Constraints**

- $0$ ≤ $n$ ≤ $10^4$, 
- $0$ ≤ $|w_i|$ ≤ $10^4$, where $w_i$ belongs to $L$ for all $1$ ≤ $i$ ≤ $n$

**Output Format**

For each testcase, output a single string which is the longest prefix common in all strings in $L$.

**Sample Input 0**
```
5
Paris
Party
Parting
Pasta
Pack
```
**Sample Output 0**
```
Pa
```
**Explanation 0**

"Pa" is a common prefix in all strings.

**Sample Input 1**
```
9
Alaska
Albania
Alabama
Allahabad
Armenia
Agartala
Romania
Andorra
Apple
```
**Sample Output 1**
```
-
```

**Submitted Code**

[Click here](./LongestCommonPrefix.java)

## 4. Minesweeper Queries

**Problem**

You will be given a 2D grid of size of $n*m$ where each cell represents a piece of land. The origin of the grid lies at the top-left corner of the grid. Each cell contains some landmines in it which is denoted by the corresponding digit in the grid. This cell might be surrounded landmines present in any of its eight neighbouring cells. You are required to perform the following two types of queries for a given cell $(i,j)$ in this grid:

- Count the total number of mines hidden in the cells surrounding the cell $(i,j)$
- Find the nearest cell to cell $(i,j)$ which is safe (having no mines)

For the second type of query, if there are multiple such cells, report the leftmost and uppermost of all such cells. If no such cell exists, report "No safe cell exists".

Any piece of land outside the boundaries of the given grid are invalid and should not be considered or reported in any of the queries. If the input coordinates of the cell in any query are invalid, print "Invalid query" for the query.

NOTE: the coordinates of the cells in this question are 1-indexed. For example, the third cell to the right and fifth cell to the bottom of the origin is represented by $(5,3)$. See the sample test case for more clarification.

**Input Format**

Each testcase has multiple lines of input.

- The first line contains two space separated integers $n$ and $m$ denoting the size of the grid.
- $n$ lines follow, each of which contains a string of length $m$ and describe a row of the grid
- The line following the previous $n+1$ lines contains a single integer $q$, denoting the number of queries.
- $q$ lines follow, which are either of the form $1ij$ (denoting the query of type 1 on the cell $(i,j)$) or  (denoting the query of type 2 on the cell $(i,j)$).

**Constraints**

- $1$ ≤ $n, m$ ≤ $10^4$ 
- $1$ ≤ $q$ ≤ $10^4$ 
- $0$ ≤ $grid[i][j]$ ≤ $9$ for all valid coordinates $(i,j)$ in the grid

**Output Format**

For each testcase, output $q$ lines. For a query of type 1, output a single integer $x$ denoting the total number of mines in the surrounding cells. For a query of type 2, output two space separated integers $p, q$ denoting the coordinates of the cell which is safe. If there is no safe cell available, print the line "No safe cell exists".

**Sample Input 0**
```
5 6
895835
495839
120494
593030
111938
4
1 4 3
1 9 2
2 3 3
2 1 1
```
**Sample Output 0**
```
26
Invalid query
4 4
3 3
```
**Explanation 0**
- For the first query, the number of mines surrounding the cell with coordinates $(4, 3)$ are $2 + 4 + 9 + 0 + 1 + 1 + 9 = 26$.
- For the second query, the coordinates of the input cell lie outside the boundary of the grid. So we print "Invalid query".
- For the third query, the leftmost and uppermost safe cell for the cell with coordinates $(3, 3)$ is the cell with coordinates $(4, 4)$. Similarly for the fourth query.

**Sample Input 1**
```
5 5
12345
65938
89483
29485
59593
2
1 -3 2
2 3 3
```
**Sample Output 1**
```
Invalid query
No safe cell exists
```

**Submitted Code**

[Click here](./MinesweeperQueries.java)