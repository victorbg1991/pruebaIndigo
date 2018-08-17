# 1. Largest product in a series
Find the greatest product of K consecutive digits in the N digit number.
### Input Format
* First line contains T that denotes the number of test cases.
* First line of each test case will contain two integers N & K.
* Second line of each test case will contain a N digit integer.

### Constraints
1 <= T <= 100

1 <= K <= 7

K <= N <= 1000

### Output Format
Print the required answer for each test case.

### Sample Input 0
2

10 5

3675356291

10 5

2709360626

### Sample Output 0
3150

0

### Explanation
* For 3675356291 and selecting K = 5 consecutive digits, we have 36753, 67535, 75356, 53562, 35629 and 56291. Where 6 x 7 x 5 x 3 x 5 gives maximum product as 3150.
* For 2709360626, 0 lies in all selection of 5 consecutive digits hence maximum
product remains 0.

# 2. Largest palindrome product
A palindromic number reads the same both ways. The smallest 6 digit palindrome made from the product of two 3-digit numbers is 101101 = 143 x 707.

Find the largest palindrome made from the product of two 3-digit numbers which is less than N.
### Input Format
First line contains T that denotes the number of test cases. This is followed by T lines,
each containing an integer, N.
### Constraints
1 <= T <= 100

101101 < N < 1000000
### Output Format
Print the required answer for each test case in a new line.
### Sample Input 0
2

101110

800000
### Sample Output 0
101101

793397
### Explanation
101101 is product of 143 and 707 and .

793397 is product of 869 and 913.
