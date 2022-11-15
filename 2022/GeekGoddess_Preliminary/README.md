# Carnival (100 Marks)
A carnival is taking place in La La Land. There are rides, food joints, and multiple shops for games and shopping. Everyone is enjoying and having a good time. There is one particular game shop which is having the most crowd. Rachel is also there and quite excited about it.


The game shop has a simple game. In the game shop, there are N items with prices mentioned on them. You have to divide the items into two groups such that one group has exactly M items and the other group has the rest. The division of groups is not random though. While dividing the items into groups, you have to do it in a way such that the difference in the summation of price between the two groups is the maximum.

## Example:

Number of items, N = 6

Number of items in one group, M = 3

<img width="900" alt="1" src="https://user-images.githubusercontent.com/11137439/201861918-c73543c2-087f-472e-8206-121c456702d0.png">

We can divide the items into groups as below,

<img width="500" alt="2" src="https://user-images.githubusercontent.com/11137439/201862047-69226f98-a405-4c56-b5dd-176e847bb7bd.png">

The summation of Group 1 = 2 + 3 + 4 = 9

The summation of Group 2 = 6+ 5 + 10 = 21

The difference in price = 21 - 9 = 12. Note, this is the maximum difference possible.

Rachel wants to have the gifts but she doesn't know how to divide the items into groups to win. Her friend Mike is very busy with work and so she asks you to help her. Can you determine the maximum price difference between the two groups?

### Input Format

The first line of input consists of number of test cases, T

The first line of each test case consists of two space-separated integers, N and M.

The second line of each test case consists of N space-separated integers representing the price of N items.


### Constraints

1<= T <=10

1<= N <=1000

1<= M < N

1<= Price of items <=10000000


### Output Format

For each test case, print the maximum price difference possible.


### Sample TestCase 1

### Input

2

6 3

2 6 3 5 10 4

5 2

1 3 2 2 3

### Output

12

5


### Explanation

**Test Case 1**: As explained in the example.

**Test Case 2**:

Number of items = 5

Number of items in one group has to be 2.

The other group will have 3 items.

Group 1 = {1, 2}

Group 2 = {2, 3, 3}

Summation of Group 1 = 1+ 2 = 3

Summation of Group 2 = 2 + 3 + 3 = 8

Maximum price difference possible = 8 - 3 = 5
