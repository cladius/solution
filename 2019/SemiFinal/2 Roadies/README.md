# ROADIES
The last season of Roadies was very much criticised by the people as the contestants were dumb. Rannvijay got fed up with people showing only muscles and are without brain.

<img width="800" alt="image" src="https://user-images.githubusercontent.com/11571484/171379483-76174b97-cb42-4395-bf09-fedc21343e0f.png">


Rannvijay Singha wants some smart people in this season of Roadies. So, he has decided to give a task. The people who will successfully solve the task will be selected for the final round of Roadies. Rannvijay is a great fan of Mathematics and always want to score maximum.


He has an interesting task to be solved which will require observation and knowledge. 


Rannvijay explains the task to you - "There are N boxes placed in a horizontal line infront of you with each box having a positive integer written on it. You have to tell me the maximum sum which can be formed by choosing the subset of boxes. Simple. But it is Roadies, so it can't be that simple. You have to tell me the maximum sum but the subset of boxes should not have any digit in common. 


Let me give you an example, Suppose there are 5 boxes with positive integers as 14, 12, 23, 45, 39.

<img width="800" alt="image" src="https://user-images.githubusercontent.com/11571484/171379520-ea269b61-f676-4fc3-a041-b74837c779f6.png">

 
14 and 12 cannot be taken in the subset as 1 is common in both. Similarly {12, 23}, {23, 39}, {14, 45} cannot be included in the same subset.



<img width="800" alt="image" src="https://user-images.githubusercontent.com/11571484/171379603-88231985-bb10-43d2-a211-2255c809b64e.png">

 


So the subset which forms the maximum sum is {12, 45, 39}. The maximum sum such formed is 96. 


 
<img width="800" alt="image" src="https://user-images.githubusercontent.com/11571484/171379631-267c465e-868a-4cec-9f3a-2ba1db4b566e.png">


I hope everything is clear. So show your skills and meet me in the final round. Good Luck!."



## Input Format
 - The first line of the input consists of the number of test cases, **T**. 
 - The first line of input consists of the number of Boxes, **N**
 - The second line of each test case consists of N space separated boxes with positive integers on them.



## Constraints
 - 1<= T <=5
 - 1 <= N <= 100
 - 1 <= array elements <= 10^5



## Output Format
Print the maximum sum which can be formed for each test case in a separate line.

## Sample TestCase 1
### Input
> 3\
> 4\
> 3 5 7 2\
> 5\
> 121 23 3 333 4\
> 7\
> 32 42 52 62 72 82 92

### Output
> 17\
> 458\
> 92

### Explanation
Test Case 1: {3, 5, 7, 2} = 17

Test Case 2: {121, 333, 4} = 458

Test Case 3: {92} = 92
