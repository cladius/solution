# String Champion (100 Marks)

In the arena, there is a competition going on for String Champion. The competition holds a high respect in the valley of Gladiators. The title is of high prestige and the champion moves closer to the top most title of Ultimate Gladiator. In the valley of Gladiators, mental strength is given as importance as the physical strength. Every year, there is a new champion chosen by the previous champions who is as efficient as them.


To be the champion, you will have to answer the Q queries asked by the previous champions. Each of the Q query consists of an integer, P. 


The arena is circular in shape and is completely packed with the people of Valley of Gladiators. You are standing at a podium from where you can see L shields hanged from left end of arena to right end of arena in front of you with each having a single lowercase letter printed on it. 


 <img width="900" alt="image" src="https://user-images.githubusercontent.com/11571484/180397578-1d1428ab-dabb-468c-b2ab-a2c4f89df673.png">



Before the Champions could ask you the queries, you have to perform a task to be eligible for the title. The task is to create a dictionary with all distinct substrings moving from left end to right end of arena in the dictionary order. Each page of the dictionary will consist of a single substring where the page number of dictionary starts from index 1. The queries of Champions will be based on the dictionary.


**A substring is defined as the contiguous sequence of characters within a string by the people of Valley.**
 
<img width="900" alt="image" src="https://user-images.githubusercontent.com/11571484/180398095-708ec564-ba61-4b71-9a63-a63b9e602eeb.png">
 

**Note:**
There can be both even or odd number of total pages in the Dictionary created by you. 
After you have completed the task, the champions ask you Q Queries. 


For each query asked, you have to answer them the number of distinct characters present on page number (P) provided by them. If there is no such page number in the dictionary, you should give them the output as -1.

For the pictorial Dictionary above, the distinct characters for page number 1, 2 and 3 are 1, 1 and 2 respectively.

If you are able to provide the correct answer for each query, you will be hailed by all and awarded the Title of String Champion.


 
<img width="700" alt="image" src="https://user-images.githubusercontent.com/11571484/180398200-0547c672-1dd5-4257-8659-9baa5ac2b92b.png">


## Input Format
The first line of input consists of two space separated integers, L and Q\
The second line of input consists of L letters without space representing the letter printed on shield from left to right.\
Next Q lines consist of a page number (P) each. 


## Constraints
1<= L <=100000\
1<= Q <=20000\
1<= P <=10^18

## Output Format
For each query, print the required output in separate line.



## Sample TestCase 1
### Input
```
3 7
abc
1
2
3
4
5
6
7
```

### Output
```
1
2
3
1
2
1
-1
```

### Explanation
The following DICTIONARY will be created.

```
•	Page 1 -> {a}
•	Page 2 -> {ab}
•	Page 3 -> {abc}
•	Page 4 -> {b}
•	Page 5 -> {bc}
•	Page 6 -> {c}
```

Time Limit(X):
1.00 sec(s) for each input.
Memory Limit:
512 MB
Source Limit:
100 KB
