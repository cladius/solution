## Xerxes and Maximum Money (100 Marks)
Xerxes has his house near by the road which is D distance (Km) away from the left end of the road (dead end or origin of the road). The road is linear and runs linearly from left to right. Xerxes has W work sites where he can go to work and knows the distance of all W work sites from left end. He does not own any vehicle so he has to take cab to go to work which cost him X Rupees per Kilometer when he has to move to left side from his position and Y Rupees per Kilometer when he has to move to right side from his position.


 <img width="800" alt="image" src="https://user-images.githubusercontent.com/11571484/180405640-2c3dab44-10fc-457a-8481-be6a821f644a.png">



He knows the day (K) at which a particular work site Wi will have work for him and the amount of money Mi he will get from there. He needs your help in deciding the order in which he should visit the work sites(if he has to) to earn the Maximum money keeping in mind that he will start and end on his house only. All the work sites are present at distinct locations and he can visit a particular work site only once. Also, the order of the work day is to be maintained i.e if he can get work at site Wi at day 2 and work at site Wj at day 5, then he can not visit site Wi after visiting the site Wj.

Maximum money is defined as the total money left after he has deducted the total cost of travelling from the total wage earned after working at site(s). It is allowed for him to work on two or more sites in a single day in any order and also to cross the already worked sites but this time without any wage. If he decides to stay at home, Maximum money would be 0. 


## Input Format
The first line of input consists of the total number of work points, W; X, Y and the distance D of Xerxes's house from left end space separately.\
Next W lines consists of three integers each, K (day of work), distance of work site from left end (Wi)  and the wage (Mi) he will receive from working at that site space separately.





## Constraints
```
1 <= D <= 500001
1 <= W <= 500000
1 <= Wi <= 500001
1 <= K <= 5*100000
1 <= M <= 4*1000
1 <= X <= 10
1 <= Y <= 10
```


## Output Format
Print the required output in a separate line





## Sample TestCase 1
### Input
```
4 4 3 50
4 30 90
8 100 50
5 20 140
10 130 120
```

### Output
```
20
```

### Explanation

<img width="800" alt="image" src="https://user-images.githubusercontent.com/11571484/180405911-ad18de1e-192a-44ef-9ec3-32ce86f94976.png">

 

1. Xerxes move to work site with work on day 4 on left side 20km; 

<img width="800" alt="image" src="https://user-images.githubusercontent.com/11571484/180405941-4d825aa8-2f85-4a75-b3bc-0ffd02c710d9.png">


 


Cost of Cab = 80 

Wage = 90


2. Xerxes further move to work site with work on day 5 on left side from previous site.


 <img width="468" alt="image" src="https://user-images.githubusercontent.com/11571484/180405973-fb4b24c7-7fe2-49eb-b912-94d7a41889f4.png">



Cost of Cab = 40 

Wage = 140


3. Xerxes then head back to his house as working on any other site will only reduce his Maximum money earned.


 <img width="800" alt="image" src="https://user-images.githubusercontent.com/11571484/180406002-430890eb-465b-4a46-a2ae-a2da70690b75.png">



Cost of Cab = 90


Xerxes can earn a Maximum of 20 Rupees.


Total Cost of Cab = 80 + 40 + 90 = 210

Total Wage = 90 + 140 = 230


Maximum Money = 20
