# Internet Access (100 Marks)
You are a software engineer in a company. There are N computers numbered from 1 to N inside the building of the company. Initially, all the given computers were connected with each other and the computer with index 1 is connected with the internet router.

![image](https://user-images.githubusercontent.com/11137439/204447936-29bc3fff-077f-40ff-8649-ed017b8083c9.png)

 
Two computers are said to be connected if there exists a physical cable between them. If Computers A and B are connected, and if computer A has internet access then it can also provide internet access to computer B and vice-versa. The router is the only source of internet access.

Due to an electrical short circuit, some physical cables got damaged. It is guaranteed that the cable between the router and the computer with index 1 will always remain intact. Due to these unavoidable circumstances, a very important data transfer has been paused which could lead to a big loss for the company.

Your manager has asked you to prepare a report which mentions the minimum number of cables that needs to be added to restore the internet access in the whole building. For this, you have a list of actively working cables in the form [A,B] where [A,B] means there exists a cable between A and B.



### Input Format
The first line of input consists of two positive integers N and M denoting the number of computers and physical cables respectively.
The next M lines describe the physical cables. Each line has two positive integers A and B denoting that there exists a cable between computer A and B.


Note: A cable always exists between two different computers and there is at most one cable between any two computers.


### Constraints
1 <= N <= 10^5
1 <= M <= 10^5
1 <= A, B <= N


### Output Format
Print the minimum number of physical cables that needs to be added to restore the internet connection between all the computers.

#### Sample TestCase 1
**Input**
```
4 2
1 2
3 4
```
**Output**
```
1
```

**Explanation**
The given computers with active cables are [1,2] [3,4]. 

* Initial Configuration

                              
![image](https://user-images.githubusercontent.com/11137439/204448014-99d23ca9-5083-409e-8ca1-1f40c1e4c5c0.png)


The internet connection between all the computers can be restored if we add the cable between computer 2 and 3.

* Final Configuration

 
![image](https://user-images.githubusercontent.com/11137439/204448042-359c2f2b-9451-4355-851c-b909da362a94.png)

