# OOP Assignment 5
## 1. Evaluate RPN

**Problem**

While we typically write arithmatic expressions in the infix notation, i.e with the operator written between the two operands, expressions can also be written in the postfix notation, i.e with the operator written after the two operands. (5/3 in infix would be written as 53/ in postfix). This form of notation has one significant advantage over the infix form as it eliminates the need for brackets to enforce the order of operation. You can read more about the postfix notation here: https://en.wikipedia.org/wiki/Reverse_Polish_notation

You'll be reading a bunch of strings from the console. These strings would either be a number or an operator ("+", "-", "*", "/"). Your task is to evaluate the result of the postfix expression made by these strings and print the result to the console.


**Input Format**

The first line would be an integer n. The next n lines would either contain an integer or an operator symbol

**Constraints**

3 <= n <= 10^4

**Output Format**

A single integer

**Sample Input 0**
```
5
4
13
5
/
+
```
**Sample Output 0**
```
6
```
**Explanation 0**

(4 + (13 / 5)) = 6

**Submitted Code**

[Click here](./EvaluateRPN.java)

## 2. Next greater element 14

**Problem**

You'll be reading a list of numbers from the console. For each number, you have to find the first element to the right of it that is greater than it. If no such number exists, the answer should be -1. The answer for the last number would always be -1. Make a List of the answers for each integer and later print that list as a string to the console.

You will find that a Stack is a very appropriate datastructure to use for this problem.

**Input Format**

The first line would contain an integer n, the list of numbers in the list. The next line would contain n space separated integers.

**Constraints**

0 < n < 10^4

**Output Format**

A list of integers as a string (Look at the sample test case to gain more insight.)

**Sample Input 0**
```
4
13 7 6 12
```
**Sample Output 0**
```
[-1, 12, 12, -1]
```
**Explanation 0**

13 is the greatest element, so no element greater to it can exist. Hence, the answer for that is -1. For 7 and 16, 12 is the appropriate answer. 12 has no element to its right, hence the answer for that is -1.

**Submitted Code**

[Click here](./NGE14.java)

## 3. Chocolate Icecreams

**Problem**

Each ice cream flavoured is identified by either a upper case or a lower case character. You'll be given two strings. The first string would have all the flavours present in the shop, and the second string would have all the chocolate flavours. Find the count of the number of chocolate flavoured icecreams for sale in the shop. Because of constant time lookups, you'll find that using a HashSet is a very efficient way of solving this problem

**Input Format**

Two strings. First would have all the flavours, and the second would have the chocolate flavours.

**Constraints**

Lengths of both strings would be less than 50

**Output Format**

An integer

**Sample Input 0**
```
aAAbbbb
aA
```
**Sample Output 0**
```
3
```
**Submitted Code**

[Click here](./ChocoIcecream.java)

## 4. First missing positive 1

**Problem**

Given a list of numbers, find the smallest positive number that is absent from the list. A positive number is defined as any integer greater than or equal to 1. Since lookups (searching) queries are on average constant time operations in HashSets, it is an appropriate datastructure to use for this problem.

**Input Format**

The first line would contain an integer n, the count of numbers in the list. The next line would contain n space separated integers.

**Constraints**

0 < n < 10^4

**Output Format**

A single integer

**Sample Input 0**
```
4
2 1 5 8
```
**Sample Output 0**
```
3
```
**Explanation 0**

Since 1 and 2 are present in the list, 3 is smallest positive integer missing.

**Submitted Code**

[Click here](./FirstMissing.java)