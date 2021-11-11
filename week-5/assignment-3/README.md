# OOP Assignment 3
## 1. Left Rotation

**Problem**

A left rotation operation on an array of size $n$ shifts each of the array's elements 1 unit to the left. Given an integer, $d$, rotate the array that many steps left and return the result.

**Example**

$d=2$

$arr = [1,2,3,4,5]$

After  rotations, $arr' = [3,4,5,1,2]$.

**Function Description**

Complete the `rotateLeft` function in the editor.

`rotateLeft` has the following parameters:

- $int$ $d$: the amount to rotate by
- $int$ $arr[n]$: the array to rotate

**Returns** 

$int[n]$: the rotated array

**Input Format**

The first line contains two space-separated integers that denote $n$, the number of integers, and $d$, the number of left rotations to perform.
The second line contains $n$ space-separated integers that describe $arr[]$.

**Constraints**

- $1$ ≤ $n$ ≤ $10^5$
- $1$ ≤ $d$ ≤ $n$
- $1$ ≤ $a[i]$ ≤ $10^6$

**Sample Input 0**
```
5 4
1 2 3 4 5 
```
**Sample Output 0**
```
5 1 2 3 4
```

**Explanation**

To perform $d=4$ left rotations, the array undergoes the following sequence of changes:

$[1,2,3,4,5] -> [2,3,4,5,1] -> [3,4,5,1,2] -> [4,5,1,2,3] -> [5,1,2,3,4]$ 

**Submitted Code**

[Click here](./LeftRotation.java)

## 2. Compare the Triplets

**Problem**

Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: *problem clarity*, *originality*, and *difficulty*.

The rating for Alice's challenge is the triplet $a = (a[0], a[1], a[2])$, and the rating for Bob's challenge is the triplet $b = (b[0], b[1], b[2])$.

The task is to find their comparison points by comparing $a[0]$ with $b[0]$, $a[1]$ with $b[1]$, and $a[2]$ with $b[2]$.

- If $a[i] > b[i]$, then Alice is awarded 1 point.
- If $a[i] < b[i]$, then Bob is awarded 1 point.
- If $a[i] = b[i]$, then neither person receives a point.

Comparison points is the total points a person earned.

Given $a$ and $b$, determine their respective comparison points.

**Example**

$a = [1, 2, 3]$<br>
$b = [3, 2, 1]$

- For elements *0*, Bob is awarded a point because $a[0] < b[0]$ .
- For the equal elements $a[1]$ and $b[1]$, no points are earned.
- Finally, for elements 2, $a[2] > b[2]$ so Alice receives a point.

The return array is $[1, 1]$ with Alice's score first and Bob's second.

**Function Description**

Complete the function `compareTriplets` in the editor.

`compareTriplets` has the following parameter(s):

- $int$ $a[3]$: Alice's challenge rating
- $int$ $b[3]$: Bob's challenge rating

**Return**

$int[2]$: Alice's score is in the first position, and Bob's score is in the second.

**Input Format**

The first line contains 3 space-separated integers, $a[0], a[1]$, and $a[2]$, the respective values in triplet $a$.

The second line contains 3 space-separated integers, $b[0], b[1]$, and $b[2]$, the respective values in triplet $b$.

**Constraints**

$1$ ≤ $a[i]$ ≤ $100$ <br> $1$ ≤ $b[i]$ ≤ $100$ 

**Sample Input 0**
```
5 6 7
3 6 10
```
**Sample Output 0**
```
1 1
```
**Explanation 0**

In this example:
- $a = (a[0], a[1], a[2]) = (5,6,7)$
- $b = (b[0], b[1], b[2]) = (3,6,10)$

Now, let's compare each individual score:

- $a[0] > b[0]$, so Alice receives 1 point.
- $a[1] = b[1]$, so nobody receives a point.
- $a[2] < b[2]$, so Bob receives 1 point.
Alice's comparison score is 1, and Bob's comparison score is 1. Thus, we return the array $[1,1]$.

**Sample Input 1**
```
17 28 30
99 16 8
```
**Sample Output 1**
```
2 1
```
**Explanation 1**

Comparing the $0^{th}$ elements, $17<99$ so Bob receives a point.

Comparing the $1^{st}$ and $2^{nd}$ elements, $28>16$ and $30>8$ so Alice receives two points.

The return array is $[2,1]$.

**Submitted Code**

[Click here](./CompareTriplets.java)

## 3. Grading Students

**Problem**

HackerLand University has the following grading policy:

- Every student receives a $grade$ in the inclusive range from 0 to 100.
- Any $grade$ less than 40 is a failing grade.

Sam is a professor at the university and likes to round each student's $grade$ according to these rules:

- If the difference between the $grade$ and the next multiple of 5 is less than 3, round $grade$ up to the next multiple of 5.
- If the value of $grade$ is less than 38, no rounding occurs as the result will still be a failing grade.

**Examples**

- $grade = 84$, round to 85 (85 - 84 is less than 3)
- $grade = 29$, do not round (result is less than 40)
- $grade = 57$, do not round (60 - 57 is 3 or higher)

Given the initial value of $grade$ for each of Sam's $n$ students, write code to automate the rounding process.

**Function Description**

Complete the function `gradingStudents` in the editor below.

`gradingStudents` has the following parameter(s):

- $int$ $grades[n]$: the grades before rounding

**Returns**

- $int[n]$: the grades after rounding as appropriate

**Input Format**

The first line contains a single integer, $n$, the number of students.<br>
Each line $i$ of the $n$ subsequent lines contains a single integer, $grades[i]$.

**Constraints**

- $1$ ≤ $n$ ≤ $60$, 
- $0$ ≤ $grades[i]$ ≤ $100$

**Sample Input 0**
```
4
73
67
38
33
```
**Sample Output 0**
```
75
67
40
33
```
**Explanation 0**

| ID | Original Grade | Final Grade |
| ------ | -------- | ---- |
| 1 | 73 | 75 |
| 2 | 67 | 67 |
| 3 | 38 | 40 |
| 4 | 33 | 33 |

1. Student 1 received a 73, and the next multiple of 5 from 73 is 75. Since $75-73 < 3$, the student's grade is rounded to 75.
2. Student 2 received a 67, and the next multiple of 5 from 67 is 70. Since $70-67 = 3$, the grade will not be modified and the student's final grade is 67.
3. Student 3 received a 38, and the next multiple of 5 from 38 is 40. Since $40-38 < 3$, the student's grade will be rounded to 40.
4. Student 4 received a grade below 33, so the grade will not be modified and the student's final grade is 33.

**Submitted Code**

[Click here](./GradingStudents.java)

## 4. Diagonal Difference

**Problem**

Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix $arr$ is shown below:
```
1 2 3
4 5 6
9 8 9  
```

The left-to-right diagonal = $1+5+9 = 15$. The right to left diagonal = $3+5+9=17$. Their absolute difference is $|15-17| = 2$.

**Function Description**

Complete the `diagonalDifference` function in the editor below.

`diagonalDifference` takes the following parameter:

- $int$ $arr[n][m]$: an array of integers

**Returns**

$int$: the absolute diagonal difference

**Input Format**

The first line contains a single integer, $n$ , the number of rows and columns in the square matrix $arr$.<br>
Each of the next $n$ lines describes a row, $arr[i]$, and consists of $n$ space-separated integers $arr[i][j]$.

**Constraints**

- $-100$ ≤ $arr[i][j]$ ≤ $100$ 

**Output Format**

Return the absolute difference between the sums of the matrix's two diagonals as a single integer.

**Sample Input 0**
```
3
11 2 4
4 5 6
10 8 -12
```
**Sample Output 0**
```
15
```
**Explanation 0**
The primary diagonal is:
```
11
   5
     -12
```
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:
```
     4
   5
10
```
Sum across the secondary diagonal: 4 + 5 + 10 = 19<br>
Difference: |4 - 19| = 15

Note: |x| is the absolute value of x

**Submitted Code**

[Click here](./DiagonalDifference.java)