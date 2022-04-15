# Girlfriend (100 Marks)
There are N number of houses in the city of La La Land and R number of roads connecting the houses. Each house is marked from 1 to N. Rahul lives in house number 1 and his girlfriend Anjali lives in the Nth house. Anjali is home alone today and has hurt herself while she was trying to make a present for Rahul. Rahul gets to know about it and wants to go to meet Anjali in the most cost efficient way as it is the month end and he does not have a lot of money with him. Since Anjali lives far away, Rahul will use the taxi to reach her house.


The city of La La Land has a unique system of fare collection by taxis.
1.	Each road has a cost associated with it to travel on it.
2.	There might or might not be a direct road between any two houses. 
3.	To travel on a road connecting Ni and Nj, the person has to pay the difference in cost price connecting (Ni, Nj) and the total cost to reach Ni.

**Example:**
Consider three houses H1, H2 and H3
 ![image](https://user-images.githubusercontent.com/11571484/163555589-7a437eb5-86ef-41f8-9820-340cc667a99d.png)

The cost to travel from H2 to H3 is 15.
Cost = Cost of travel between (H2, H3) - Total cost to reach H2 = 25 - 10 = 15
Note: If the difference comes out to be negative, it is free of cost for a person to travel on the road between Hi and Hj.

4.	The roads are bidirectional (directionless).

Rahul is good in the subject of love but is very poor in the subject of mathematics. Can you help Rahul determine the cost he would have to pay to reach Anjali if it is possible otherwise just tell him **NOT POSSIBLE**.


**Example**
Number of houses, N = 5\
Number of roads, R = 5


Consider the connection graph given below.

 ![image](https://user-images.githubusercontent.com/11571484/163555629-97b5b0fc-a23d-4193-8869-2f7b6ca1635c.png)

There are two ways in which Rahul (1) can reach Anjali’s house (5).


Route 1: 1 - 2 - 5

Cost of travel from 1 to 2 = 30\
Cost of travel from 2 to 5 = 40 - 30 = 10\

Total cost of travel = 30 + 10 = 40

---

Route 2: 1 - 3 - 4 - 5

Cost of travel from 1 to 3 = 10\
Cost of travel from 3 to 4 = 20 - 10 = 10\
Cost of travel from 4 to 5 = 30 - 20 (Total cost of travel to reach 4, 10 + 10) = 10

Total cost of travel = 10 + 10 + 10 = 30

---

Route 2 is better suited for Rahul as it is cost efficient and he would have to 30.


## Input Format
The first line of input consists of two space-separated integers: number of houses, N and number of roads, R.\
Next R lines each consists of three space-separated integers: starting node (house), Ni; ending node (house), Nj and Cost of travel on Road Ri connecting Ni and Nj, C.


## Constraints
```
1<= N <=50000
1<= R < 500000
1<= C (Cost of travel on road connection two houses) <= 10^7 (1e7)
```

## Output Format
If it is possible for Rahul to reach Anjali’s house, print the minimum amount of fare he has to pay to taxi otherwise print NOT POSSIBLE.


## Sample TestCase 1
### Input
```
5 5
1 2 30
1 3 10
2 5 40
3 4 20
4 5 30
```

### Output
> 30

### Explanation
As explained in the example.

## Sample TestCase 2
### Input
```
4 3
1 2 10
3 2 20
1 3 5
```

### Output
NOT POSSIBLE

### Explanation
It is not possible to reach Anjali’s house (4)

 ![image](https://user-images.githubusercontent.com/11571484/163555982-488e78b3-4118-44b8-920a-9263ab19b6ec.png)
