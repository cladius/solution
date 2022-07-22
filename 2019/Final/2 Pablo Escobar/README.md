## Pablo Escobar (100 Marks)

Pablo Escobar was once the Don and richest criminal ever. Everyone thought he was dead but he is back to business now. He wants to get hold of the business again and is willing to go any distance for it. He has his labs on an integer line which are next to each other with each being located on an integer value(positive/negative) and at a distant apart.The number of dealers are increasing at a very high rate which is causing congestion at the labs. Escobar has a plan to decongest the business points.


He has asked all his dealers to follow the rules made by him whenever there is congestion at a lab. According to the rule, if at a point there are two or more dealers at a lab then two dealers at a time will have to shift their position. One of the dealers will have to move to the nearest left lab and the other dealer has to move to the next right lab. The dealers try to follow the rule but most of the time make mistakes which is costing Escobar a handsome money.


Escobar loves his money and time so he hired you to decongest the dealers as per his rules in the minimum number of moves possible. Moving to nearest left lab or next right lab is considered a move. You can apply the rule only to one lab at a time. For a lab at position L(x), next right lab is L(x+1) and nearest left lab is L(x-1). It is confirmed that he will never run out of labs.


Example:

Let's say the number of dealers at lab located at 99, 100, 101 are 1, 2, 1 respectively. The lab at 100 is congested so it needs to be decongested as per the rule. Moves required for decongestion are explained below. Refer the image for pictorial explanation. 


 - Move 1: One of the dealers at lab location 100 moves to lab at location 99 and the other moves to lab at location 101. It causes the labs at location 99 and 101 to get congested.
 - Move 2: Lab at locations 99 is chosen for decongestion (No compulsion). One of dealers at lab location 99 moves to lab at location 100 and other moves to lab at location 98. Now, there is no dealer at lab located at 99. 
 - Move 3: Lab at location 101 is still congested. One of the dealers at lab 101 moves to lab at location 100 and other moves to lab at location 102. This causes the lab at location 100 to get congested again and there is no dealer at lab located at 101. 
 - Move 4: Lab at location 100 needs to be decongested. One of the dealers moves to lab at location 99 and the other moves to lab located at 101. This move is similar to Move 1 but this time it causes no other lab to get congested.


Now, All the labs are decongested and it took a minimum of 4 moves to avoid congestion on any lab.
 
<img width="900" alt="image" src="https://user-images.githubusercontent.com/11571484/180402078-50f8fdba-0dfa-4d0e-814d-fc9249aa83db.png">


Escobar will provide you the number of labs L that have at least one dealer present at the beginning. For all the labs L, he will provide you the location L(x) (all distinct) of the lab and the number of dealers, D, present at that lab. He will provide you all the L locations in increasing order.


You need to be cautious when performing decongestion so that no other lab gets congested. If any other lab gets congested, you need to decongest that as well. You need to decongest all the labs in the minimum number of moves possible. It is always possible to decongest the congested labs.



## Input Format
The first line of input consists of number of test cases, T\
The first line of each test case consists of the number of Labs with at least one dealer present, L\
Next L lines consists of two space separated integers each space separately, location of lab L(x) and number of dealers, D, present at that lab.


## Constraints
```
1<= T <=50
1<= L <=200
1<=  D (per test case) <=100000
-10^6<= Lx <=10^6
```


## Output Format
For each test case, print the required output in separate line. If all the labs are already decongested, print 0.


## Sample TestCase 1
### Input
```
3
4
-10 3
0 1
1 2
100 1
3
-90 1
100 2
1100 1
3
99 1
100 2
101 1
```

### Output
```
3
1
4
```

## Time Limit(X):
8.00 sec(s) for each input.

## Memory Limit:
512 MB

## Source Limit:
100 KB
