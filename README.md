# Last-Man-Standing-Code-Presentation
Present the Last Man Standing (Josephus) problem and walk through the naive and optimized solution

Be sure to download my presentation and try the solution in "Naive" and "Optimized"!


#Problem Description
Taken from: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2326

There are n people standing in a circle waiting to be executed. Starting from the first man, k−1 people
are skipped and the k-th man is executed. Then again, k − 1 people are skipped and the k-th man is
executed. The elimination proceeds around the circle (which is becoming smaller and smaller as the
executed people are removed), until only the last man remains.
You are given number of people standing in the circle, and number k. You must find the number
of last man, who standing in the circle.

# Input
The first line contains integer k (0 < k ≤ 100), it is the number of tests. On each of next k lines there
are 2 integers n (0 < n ≤ 106) and k (0 < k ≤ 109).

# Output
For each test case out line formatter like this: ‘Case i: a’. Where i is a test number, and a is the
last man standing in the circle (see examples).

# Sample Input
4
6 3
8 6
11 99
23 13

# Sample Output
Case 1: 1
Case 2: 1
Case 3: 5
Case 4: 12
