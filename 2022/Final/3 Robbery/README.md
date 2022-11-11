# Robbery (100 Marks)
It is a bright sunny day in the city of Codinga. The Mayor of the city has organized a diamond exhibition where the D diamonds from around the world will be displayed and the people can visit and be mesmerized by the beauty of these. This news has become viral and people from different countries are visiting the city. This news has also got to the ears of famous thief pair AT. The AT pair is famous for their stealing style. Everyone has heard the stories about them but no one has ever seen them. They have got the name AT because of their characteristics where:
A - A is a master of disguise and acting. He is brilliant in his work and can disguise as anything.
T - T is the technical person between the two. He is a master in technology and planning.

The AT pair has also visited the exhibition but with the purpose of stealing the diamonds. During the day, they are going through the details of the place and planning their move. They have already started their work as T has installed a sensor at the entrance of the exhibition room. The sensor will become active in the night when they will get in action. In the exhibition room, there are few statues and portraits along with the diamonds.

It is night time now and the exhibition is closed for the people. The authorities have made the exhibition room totally blackout for security purposes which means the exhibition room is now pitch dark and nothing is visible. T is sitting at a restaurant near the exhibition place enjoying his beer and cigar and listening to his favorite music on AirPods. The restaurant is crowded and open till late as there are so many people who have visited the city for the exhibition. The people are enjoying themselves and making the most of the time.

Wondering, where is A? Well, let’s say not everyone is partying. Remember, there were few statues and portraits in the exhibition room? Yes, you are right, A never came out of the exhibition room and disguised himself as a statue at the entrance of the exhibition room.

The clock has struck and the duo is in action mode. T has stopped listening to music and has taken out his laptop. T has activated the sensor that he installed at the entrance of the exhibition room which is also a signal to A. The sensor has divided the exhibition room in a grid of N * M where each position is represented by (x,y) coordinates where x and y are both positive integers. The Di diamond is present at position (Dx,Dy). A has come out of disguise and is standing at the entrance which is (1,1) position in the grid. This is the bottom-left position of the grid. Now, T will direct A to reach the positions of diamonds and collect them as A cannot see anything inside. They have a certain ciphered way for directions. A certain direction can be represented by a set of 5 alphabets each. This is done by them so that no one understands what’s going on even if their connection is breached.

|     Direction    |     Set of Alphabets    |
|------------------|-------------------------|
|     East         |     A,B,C,D,E           |
|     West         |     U,V, W,X,Y          |
|     North        |     J,K,L,M,N           |
|     South        |     P,Q,R,S,T           |

A can move in any valid direction inside the grid. They have made M moves till now. Since, you are quite interested in the robbery. Provided with all the information at any time, can you figure out how many diamonds have been picked up by A till then and how many are more to go for?

## Example
```
N = 8, M = 8
Number of Diamonds, D = 4
```

|     Diamond    |     Position of Diamond   (x, y)    |
|----------------|-------------------------------------|
|     1          |     (4, 5)                          |
|     2          |     (3, 6)                          |
|     3          |     (2, 4)                          |
|     4          |     (5, 2)                          |


Initially, the grid structure is like this.

![image](https://user-images.githubusercontent.com/11571484/201352752-f248fa85-9d91-4407-814e-ccbd9f0e2111.png)

 

Number of moves made, M = 4
**Move 1: J**

![image](https://user-images.githubusercontent.com/11571484/201352777-dc1d62fc-69ba-4f03-9bdb-cfc4e95d8e78.png)

 
**Move 2: K**
![image](https://user-images.githubusercontent.com/11571484/201352793-bbcfb397-f1fd-454e-9e95-9ac1f45d30ac.png)

 
**Move 3: C**
![image](https://user-images.githubusercontent.com/11571484/201352809-bc95b4ae-6d23-4eba-9d00-646253203a1e.png)
 
**Move 4: L**
![image](https://user-images.githubusercontent.com/11571484/201352835-72585aa1-2392-4fe2-908e-ea5ea5f3459f.png)
 

One diamond is picked by A and there are three more diamonds to go for.



## Input Format
```
The first line of input consists of number of test cases, T
The first line of each test case consists of two space-separated integers, N and M representing the size of the grid.
The second line of each test case consists of the number of diamonds, D
Next D lines follow. Each of the Di lines will consist of two space-separated integers, Dx,Dy representing the position of the ith diamond.
The next line of input will consists of the number of moves made, M
Next M lines follow. Each of the M lines will consist of a character Mi representing the move to be made.
```


## Constraints
```
1<= T <=10
1<= N, M <=30
0<= D <=N*M
0<= M <1000
Mi - The character can be any of the mentioned in the character set of the directions
(x, y) - The coordinates of diamonds or any position is non-negative.
```

## Output Format
For each test case, print the number of diamonds picked up by A till now and the number of diamonds more to go for space-separated in a separate line.



## Sample TestCase 1
## Input

```
3
8 8
4
4 5
3 6
2 4
5 2
4
J
K
C
L
2 2
1
2 2
1
B
3 3
2
3 3
2 3
3
K
J
B
```

## Output
```
1 3
0 1
1 1
```
## Explanation
### Test Case 1:
As explained in the example.

### Test Case 2:
The movement will be as follows:

```
(1, 1) —---B—->(2,1)
```

The number of diamonds picked = 0

The number of diamonds more to go for = 1


### Test Case 3:
The movement will be as follows:

```
(1, 3)----B—>(2, 3) (Diamond is picked by A)
   |
   J
   |
(1, 2)
   |
  K
  | 
(1,1)
```

The number of diamonds picked = 1

The number of diamonds more to go for = 1
