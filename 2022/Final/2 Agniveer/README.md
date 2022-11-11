# Agniveer (100 Marks)
The city of Codinga is very peaceful at present, thanks to your friend Agniveer who is a super cop. Agniveer has arrested a lot of criminals and brought peace to the city. The business is blooming, people are happy and accepting and there is an environment of calmness in the city. But the peace in the city is disturbing the peace of criminals of other cities whose business was booming because of the crimes committed in the city.

The criminals have called out for a meeting to make a plan to disrupt the peace of the city, Codinga. All the criminals from the nearby cities have assembled for the planning. Agniveer has got this intelligence and has planted one of his men to get the inside information so that he can save the city to his best. This man is also attending the meeting.

After a lot of arguments, criminals have come up with a plan to attack the city. The N criminals are coming to the city and attacking the N locations. It means a single criminal is coming to attack a single location. The locations they have selected are linear in nature, i.e., are present in a single line. This is because these are meeting points of roads coming from different cities to the city of Codinga. (Refer to the image given below). There are a total of L such meeting points along the road in a linear manner (1,2,3,......L). All the locations are a unit apart. The criminals will be reaching these locations at a time which may or may not be the same for all the criminals. Moreover, the man planted by Agniveer has done a good job and given Agniveer the locations (Li) and the reaching time (Ti) of the N criminals.

 ![image](https://user-images.githubusercontent.com/11571484/201350959-b8bfd74b-627c-428b-8461-d9f1e1f2633a.png)


Agniveer, of course, wants to arrest as many criminals as possible. He is not going in without any plan and for this, he needs your help. Currently, Agniveer is at location P and he has his car that can run at a max speed of S unit/sec which means the car has a speed range in integers from 0 to S (both inclusive) where 0 means the car is not moving. He wants to be optimal in his approach and wants to minimize the number of criminals who will get away.

## Condition for arresting Criminal
To arrest a criminal, Agniveer should be present at the location (Li) at time (Ti) otherwise he would miss the criminal.

Note: This is the time and location of the criminal which Agniveer has got by planting the man. Initially, the time is always 0 and there is no criminal at any location at time 0.

## Example:

```
Current Location of Agniveer, P = 6
Maximum speed of car of Agniveer, S = 2 unit/sec
The number of criminals, N = 5
```

|     Criminal   Number    |     Time (Ti)   to reach the location    |     Location   (Li)    |
|--------------------------|------------------------------------------|------------------------|
|     1                    |     1                                    |     2                  |
|     2                    |     4                                    |     3                  |
|     3                    |     2                                    |     4                  |
|     4                    |     3                                    |     7                  |
|     5                    |     5                                    |     10                 |


At T = 0, Initial Configuration, A = Agniveer, C = Criminal

![image](https://user-images.githubusercontent.com/11571484/201351279-d0f10f31-5e12-4ab3-9eb4-8b65f26a7e6a.png)
 

At T = 1,

![image](https://user-images.githubusercontent.com/11571484/201351299-0a785952-49f2-4a54-8c0a-ff1fcce7f6f0.png)


 

It is not possible for Agniveer to reach location 2 from his current location. He would miss criminal 1.

At T = 2,

![image](https://user-images.githubusercontent.com/11571484/201351323-f244d588-1531-4035-bc2e-8400d5cfae65.png)
 

Agniveer can reach location 4 at time 2. The criminal is arrested at location 4. Now, Agniveer is present at location 4.

At T = 3,

![image](https://user-images.githubusercontent.com/11571484/201351340-08fe2729-c00d-45d4-bd3d-bb4d965db25b.png)
 

Agniveer is at position 4. From here, he cannot reach location 7 in 1 second.

At T = 4,

![image](https://user-images.githubusercontent.com/11571484/201351357-3bfb3e60-7648-4689-9b30-be0551c3bc9d.png)
 

Agniveer can easily reach location 3 from location 4. He is already at location 4 at T = 2. The criminal is arrested. Now, Agniveer is at location 3.

At T = 5,

![image](https://user-images.githubusercontent.com/11571484/201351385-b041c64f-d536-41b6-bf61-bd43eff2a97e.png)
 

Agniveer cannot reach location 10 from location 3 in one second. 

The number of criminals he can arrest is 2. The number of criminals who got away = 3

Note: There might be different ways to arrest the criminals but the maximum number of criminals that can be arrested remains the same.

Can you help him figure out the minimum number of criminals who will get away even if he follows the optimal approach? Help Agniveer!!



## Input Format
```
The first line of input consists of two space-separated integers, P and S, representing the current location of Agniveer and the maximum speed of his car.
The second line of input consists of the number of criminals, N
The third line of input consists of the N space-separated integers, Ti, representing the reaching time of the ith criminal.
The fourth line of input consists of the N space-separated integers, Li, representing the attack location of the ith criminal.
```


## Constraints
```
L <=10^6
1<= P <=10^6
1<= N <=10^6
1<= Li <=10^6
1<= Ti <=10^6
1<= S <=2000
```


## Output Format
Print the minimum number of criminals who will not be arrested by Agniveer.



## Sample TestCase 1
### Input

```
6 2
5
1 4 2 3 5
2 3 4 7 10
```

### Output
```
3
```
### Explanation
As explained in the example.
