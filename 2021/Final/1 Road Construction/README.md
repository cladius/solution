# Road Construction (100 Marks)
During the second wave of Covid, the biggest problem was liquid oxygen transportation. Initially, there was a concentrator and tanker shortage and then it was the long routes (road infrastructure) that caused the problem to reach the oxygen on time to hospitals. The concentrators and tankers were imported from the other nations and this issue was dealt with to a great extent. The rest of the shortage of tankers and concentrators was covered by manufacturing them in the country in the time the government got since then.

However, the road infrastructure is still an issue. The government decided to improve the conditions and gave tenders to contractors with the guidelines to be followed for the construction.

## Guidelines:
1.	In a city, there are N number of hospitals 1 to N.
2.	The hospital number 1 is always the biggest hospital in any city and a large oxygen plant will be installed with it. 
3.	Hospital number 1 will be the supply point for oxygen for any other hospital in the city.
4.	One-way roads (Directed) are to be constructed between the hospitals.
5.	The road network should be such that it is possible to reach any hospital of the city except the Hospital number 1 (it is the oxygen supply point) by following at most M roads from the supply point (Hospital number 1).

Appropriate time was given to the contractors for the completion of the project. During this time, the Minister responsible for infrastructure development was found Covid Positive and was admitted to the hospital in a serious condition. The contractors started working on the project and were able to complete the project on time. Meanwhile, the minister’s health also got better and he started monitoring the project in different cities. He asked the contractors to bring a diagrammatic view of the infrastructure project they have carried out.

While he was evaluating the projects, he was shocked to see that only a few of the contractors were able to follow the guidelines and complete the project as demanded and the rest did not bother to follow the guidelines.

The faulty contractors did the following:
1.	They built N roads between the N hospitals such that there was exactly one road starting from a hospital.
2.	In some cases, it was not even possible to reach a particular hospital from hospital number 1 (oxygen supply point).
3.	The maximum limit of M roads to reach any hospital from hospital number 1 (oxygen supply point) was not followed.

The minister was baffled with this and directed the faulty contractors to mend it by constructing the minimum number of roads so that the project in all will follow the guidelines provided initially. He knows the faulty contractors will take a lot of time to figure out and even might not be able to figure out the minimum number of roads required to be constructed now to follow the guidelines of the project so he is asking for your help to speed up the process. You will be provided with the current details of the faulty projects and you will have to figure out the minimum number of roads that need to be constructed for that project which can make it as per the guidelines. The new road can be constructed anywhere in the project. It is possible that there are multiple ways to correct the project but the minimum number of roads to be constructed would remain the same.

### Example:

Suppose there are 10 Hospitals and there are 10 roads between them. Each hospital should be reachable from the supply point (Hospital number 1) by following atmost 3 roads.

<img width="900" alt="1" src="https://user-images.githubusercontent.com/11571484/180421780-ca3e81f5-7bf7-4b0d-be03-68eff00b2bee.png">


### Projects Drawbacks:
1.	In this project, it is not possible to reach Hospital number 5, 6, 9 and 10 from Oxygen supply point (Hospital number 1).
2.	To reach Hospital number 7 and 8 from Oxygen supply point (Hospital number 1), it takes more than 3 roads. 

**Path from Hospital 1 to Hospital 7: H1 -> H2 -> H3 -> H4 -> H7**
<img width="900" alt="2" src="https://user-images.githubusercontent.com/11571484/180423331-3a14ffa6-af8e-4377-928f-97996f8cf505.png">



Number of roads taken is 4 which is greater than the maximum limit of 3.

**Path from Hospital 1 to Hospital 8: H1 -> H2 -> H3 -> H4 -> H7 -> H8**
<img width="900" alt="3" src="https://user-images.githubusercontent.com/11571484/180423382-1bfcd5b1-49fb-49f8-bfe1-5fd9e52a51ad.png">



Number of roads taken is 5 which is greater than the maximum limit of 3.

### HOW TO CORRECT?
There are multiple solutions to correct it but the minimum number of roads required to be constructed remains the same as 3.

One such possible valid solution is:
1.	Construct a Road from Hospital number 1 to Hospital number 10. This makes Hospital number 10 and Hospital number 8 to be reachable from Oxygen supply point (Hospital number 1) within the maximum road use limit 3.
2.	Construct another Road from Hospital number 10 to Hospital number 9. This makes Hospital number 9 and Hospital number 6 to be reachable from Oxygen supply point (Hospital number 1) within the maximum road use limit 3.
3.	Construct another Road from Hospital number 1 to Hospital number 5. This makes Hospital number 5 and Hospital number 7 to be reachable from Oxygen supply point (Hospital number 1) within the maximum road use limit 3.

Constructing 3 roads this way takes care of the project drawbacks and makes it as per the guidelines issued for the project.

<img width="900" alt="4" src="https://user-images.githubusercontent.com/11571484/180423498-7a8ebea6-6226-4ee5-a3c4-aa5fd88c2ecc.png">

 

The new roads constructed are shown with red color. Also, another solution could be the same as this one except the road from Hospital number 1 to Hospital number 5, a road can be constructed from Hospital number 1 to Hospital number 6.

Another solution is to create 3 roads as follows:
1.	Create a Road from Hospital Number 1 to Hospital number 10
2.	Create a Road from Hospital Number 1 to Hospital number 9.
3.	Create a Road from Hospital number 1 to Hospital number 7.

Help the faulty constructors overcome the drawbacks of the project so that the road infrastructure issue is resolved faster and the government is timely prepared for any upcoming emergency as Covid is not over yet.



## Input Format
The first line of input consists of the two space-separated integers, number of hospitals, N and the maximum road limit to be used to reach any hospital from the Oxygen supply point (Hospital number 1), M.
Next N lines each consist of two-space separated integers, X and Y representing a road from hospital number X to hospital number Y.



## Constraints
```
2<= N <=500000
1<= M <=20000
1<= X, Y <=N
```


## Output Format
Print the minimum number of roads that needs to be constructed to make the project fall within the guidelines issued by the government.



## Sample TestCase 1
### Input
```
10 3
1 2
2 3
3 4
4 7
7 8
8 2
5 7
6 5
9 6
10 8
```

### Output
```
3
```

### Explanation
The diagrammatic representation and the explanation is the same as explained in the example above.
