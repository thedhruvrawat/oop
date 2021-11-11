# OOP Assignment 4
## 1. Sorting and Counting

**Problem**

Read a given number of strings from the console and print them again along with their frequency. Note that the order of printing needs to be in reverse lexicographical order, i.e "zz" should be printed along with its frequency before "aa" and its frequency. The pattern of printing has been illustrated in the sample case given below. You will find that a TreeMap is an appropriate datastructure to use for this problem. If you do not have much information about TreeMap and the Comparator Interface, I suggest you read the following webpage carefully:

https://www.geeksforgeeks.org/treemap-in-java/


**Input Format**

The first line would have an integer n, the number of strings to be read.

The next n lines would contain a string.

**Constraints**

$0$ ≤ $n$ ≤ $10^5$ <br>
The size of each string would be two lettered and would be made of lowercase alphabets only.

**Output Format**

A string followed by a colon followed by its frequency for each unique string in the input. Look at the sample case to get a better idea.

**Sample Input 0**
```
4
ab
zz
aa
ab
```
**Sample Output 0**
```
zz:1
ab:2
aa:1
```

**Submitted Code**

[Click here](./SortingCounting.java)

## 2. Subset Array

**Problem**

You'll be reading two lists of unique integers from the console. If the smaller of the two lists is a subset of the bigger list, print "Subset" to the console. Otherwise, print the integer with the smallest index from the smaller list that is not a part of the bigger list. It is guaranteed that the sizes of both the lists would not be the same. You are encouraged to use an appropriate datastructure that has been discussed in the lectures to solve this problem optimally (Hint: Think of hashing). Do all I/O operations from the main method, and use the FindSub class to solve the problem. In particular, use the isSubset method to return the output string which would then be printed in the main method.

**Input Format**

Input would consist of four lines. The first line would have a single integer n1 which is the size of the first list. The second line would have n1 space separated integers. The third line would have a single integer n2 which is the size of the second list. The fourth line would have n2 space separated integers.

**Constraints**

0 < n1 <= 10^5

0 < n2 <= 10^5

n1 != n2

Members of both lists would fit inside a 32 bit signed integer.

**Output Format**

A single string, which would either be "Subset" or the first invalid number as the case may be.

**Sample Input 0**
```
4
1 8 17 -6
8
1 5 10 15 17 8 -6 4
```
**Sample Output 0**
```
Subset
```
**Explanation 0**

The smaller list is a subset of the bigger list, hence "Subset" has been printed.

**Sample Input 1**
```
4
10 15 20 25
3
20 11 15
```
**Sample Output 1**
```
11
```
**Explanation 1**

20 is present in the bigger list, but 11 is not. Hence, 11 is the number with the smallest index in the smaller list that is absent in the bigger list and hence is printed.

**Submitted Code**

[Click here](./SubsetArray.java)

## 3. Balanced Parantheses Class

**Problem**

A string containing parantheses is said to be balanced if every opening brace has a corresponding closing brace. For example, `{{}}, {}{}, {}{{}{}}` are balanced, while `{, {{}, }{}{` are not balanced strings.

You need to implement a class which checks if an input string of parantheses is balanced or not.

The following algorithm demonstrates the steps required to check if a string is balanced or not:

1. Maintain a stack of characters, which stores the braces in the input string.
2. Whenever an opening brace `'{'` is encountered, add it to the stack.
3. Whenever a closing brace `'}'` is encountered, remove the most immediate opening brace from the stack, if possible. Otherwise, add the closing brace to the stack.
4. Test if the string was balanced or not. This depends on a property of the final stack. Can you figure it out?

NOTE: this challenge has no partial marking. You need to clear all testcases in order to gain marks.

**Input Format**

Each testcase contains a single line containing a string s, denoting the input parantheses string.

**Constraints**

$1$ ≤ $|s|$ ≤ $10^6$, , where |s| denotes the length of s.

**Output Format**

For each testcase, output a single line. If the input string was balanced, print "Balanced". Otherwise, print "Not balanced" (be careful as the outputs are case-sensitive!).

**Sample Input 0**
```
{{}}
```
**Sample Output 0**
```
Balanced
```
**Sample Input 1**
```
}{}{
```
**Sample Output 1**
```
Not balanced
```

**Submitted Code**

[Click here](./BalancedParantheses.java)

## 4. Linked List Combination

**Problem**

You will be given two sequences of integers r and s. You need to create a third linked list t such that $t = r => s'$ where s' is the linked list s in reverse order. In other words, t is a linked list consisting of the elements of r followed by s in reverse order.

You will be given q on the linked list t. Each of the query asks for the element in r, s or t at position x from the start. Note that the positions in the query are 1-indexed. If the position in a query is invalid, print "Invalid query".

**Input Format**

Each test case is of the following form:

- The first line contains a single integer $l_r$, denoting the size of linked list r.
- The second line contains $l_r$ space-separated integers, denoting the elements of linked list r in order.
- The third line contains a single integer $l_s$, denoting the size of linked list s.
- The fourth line contains $l_r$ space-separated integers, denoting the elements of linked list s in order.
- The fifth line contains a single integer q, denoting the number of queries.
- The next q lines contain two space-separated integers i and x.  denotes the linked list to query (0 for r, 1 for s and 2 for t) and x denotes the position to be queried.

**Constraints**

- $1$ ≤ $l_r$ ≤ $10^4$ 
- $1$ ≤ $l_s$ ≤ $10^4$ 
- $1$ ≤ $q$ ≤ $10^4$ 

**Output Format**

For each testcase, output q lines, each containing the response for the queries.

**Sample Input 0**
```
5
1 2 3 4 5
6
7 8 9 10 11 12
5
0 1
1 4
2 9
2 20
1 -4
```
**Sample Output 0**
```
1
10
9
Invalid query
Invalid query
```

**Submitted Code**

[Click here](./LLCombination.java)