# Lab Control (100 Marks)
There is a lab in Hawkins city which is quite popular. This Lab is established to find new species of animals from multiple dimensions. The Lab contains cells and each cell is located on a number line. The location of a cell can be between **[-100000,100000]**. Each time a species is found, it is kept in a separate cell **N** ( The animals may not be kept sequentially; it may be kept in a random cell).

Now, among these cells, one of the cells can be a control room. Scientists have to decide the control room such that the total distance from that control room to all the other cells is minimum.

## Example
Three new species (A, B, C) are found and they are placed on the number line as in the given graph.
![image](https://user-images.githubusercontent.com/11571484/204453338-d9220a00-d709-4e82-a828-40b9c7582e6a.png)


Location of cell A = -3

Location of cell B = 1

Location of cell C = 5

**Total distance of cell B and C from cell A = 4 + 8 = 12**
![image](https://user-images.githubusercontent.com/11571484/204453437-5c773ca8-f628-4d52-b789-c5079b735766.png)
 
**Total distance of cell A and C from cell B = 4 + 4 = 8**
![image](https://user-images.githubusercontent.com/11571484/204453465-e5873ea0-6ad6-46fd-8faf-59d506054bac.png)

**Total distance of cell A and B from cell C = 8 + 4 = 12**
![image](https://user-images.githubusercontent.com/11571484/204453492-fcc4978d-16f9-43a6-8a5f-36ecd2d0a23d.png)

The distance from cell B to other cells is the minimum. Hence, cell **B** is created as a Control room.

## Task
You are given **Q** queries. In each query, a new species is added at any random cell N. In each query, you have to print the location of the cell which can be created as a control room. Initially, there is no species. If multiple answers are possible, then print the location with minimum integer value.


## Input Format
The first line of input consists of an integer Q, number of queries.
Next Q lines each consist of N, the location of the new species cell.



## Constraints
```
1<= Q <=10^4
-10^5 <= N <=10^5
```


## Output Format
For each query, print a single integer denoting the location of the control room.

## Sample TestCase 1

## Input
```
3
-3
1
5
```
## Output
```
-3
-3
1
```
