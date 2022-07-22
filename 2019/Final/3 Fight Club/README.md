## Fight Club (100 Marks)
The Tekken City is known for its strong and fierce fighters. The people of Tekken City are very fond of fights and have formed a Fight Club. Each week N fighters register and fight with each other as per the rules of the Club. The craze is to the level that there is a stadium solely dedicated to the Fight Club. The stadium is always packed with audience and full of energy. Today is one such fight event and you are invited for the same. The betting in today's game is going to be very high.


 <img width="900" alt="image" src="https://user-images.githubusercontent.com/11571484/180402906-d9bcb9b1-cfcd-4c42-ba99-78516fe339ac.png">



There are B types of badges (1 to B both inclusive) which are to be given to the fighters. Each fighter is given a badge which they have to tie to their arm. All the N fighters have come in the fighting zone wearing the badge they received and all will fight at the same time. It is possible that two or more fighters have the same Badge and it is also guaranteed that there are all types of Badges present in the fighting zone in beginning i.e there is no type which is not present in the fighting zone at the beginning.
 
<img width="900" alt="image" src="https://user-images.githubusercontent.com/11571484/180402935-0c192586-4f41-4e15-b054-a6157b72feb9.png">


According to the rules of the fight, fighter X can defeat fighter Y only if the power of fighter X (Px) is twice or more than twice the power of fighter Y (Py). It is totally dependent on the fighter if he wants to defeat a particular fighter or not. It is possible for a fighter to defeat other fighters one after the other and it is also likely that he decides not to defeat the fighter even though he can. If a fighter is able to defeat the other fighter then all the badges owned by the defeated fighter will be transferred to the winning fighter. A fighter is removed after he is defeated.


 <img width="900" alt="image" src="https://user-images.githubusercontent.com/11571484/180402980-095ae113-8f4c-4f20-976e-9e568e8b3a80.png">

<img width="300" alt="image" src="https://user-images.githubusercontent.com/11571484/180403151-48e478ce-7815-424c-ab8f-47dffd459a57.png">

<img width="500" alt="image" src="https://user-images.githubusercontent.com/11571484/180403170-2fe86201-974f-4190-a060-eea7583331d0.png">


 
 
As you are the guest, you are given a chance to choose any single fighter at a time chosen by the owner of the place and you will get the badges owned by your fighter (Every badge is very precious). But the owner of the place, Heihachi, will only allow you to choose the fighter if you can answer the number of different combinations of badges that you can end up with correctly.


A combination is defined only by the number of badges from each of the B types.There can be more than one badge of the same type in a combination. In the above example, [3, 2] is a combination of badge type 2 and badge type 3.



Note: You don't know which fighter has defeated which one but you are provided with the power and badge type of every fighter for help. He can ask you to choose your fighter at any time of the fight.


Heihachi wants to spice up things and test you out so he decides to provide you a ticket with an integer T written on it and you have to answer after taking the modulo of total number of different combinations calculated above by T. Heihachi is not only powerful but also intelligent and will only give you badges if you can answer him correctly.


Can you provide him the correct number of different combinations of badges after taking modulo by T ?





## Input Format
The first line of input consists of the number of fighters in the beginning, N\
The second line of input consists of the number of types of Badges, B\
The third lines of input consist of the ticket with Integer, T\
Next N lines consists of two space-separated integers each, Power (P) of the fighter and Badge Type.



## Constraints
```
1<= N <=5*100000
1 <= B <=N
1<= P <=10^9
2<= T <=30000
```


## Output Format
For each test case, print the required output in a separate line.



## Sample TestCase 1
### Input
```
4
3
6
2 2
5 1
10 3
2 3
```

### Output
```
5
```

### Explanation
The total combinations which can be attained are 11. After taking the modulo by 6, the output comes as 5.

The 11 combinations which can be obtained are explained below. Each combination is based on the type of the badge owned and not the fighter number.

```
1.	[1]: It is possible that you choose the Second fighter before it has defeated any other fighter.
2.	[1, 2]: You choose the fighter Two after it has defeated the First fighter.
3.	[1, 3]: You choose the fighter Two after it has defeated the Fourth fighter.
4.	[1, 2, 3]: Second fighter defeats fighter One and then fighter Fourth.
5.	[1, 3, 3]: One way of reaching this is, Second fighter defeats the Fourth fighter and Third fighter defeats the Second fighter. You choose the Third fighter.
6.	[1, 2, 3, 3]: One way of reaching this combination is, Second defeats first, Third defeats fourth, Third defeats Second and you choose the Third Fighter.
7.	[2]: You choose fighter 1 before it has defeated any other fighter.
8.	[2, 3]: Third fighter defeats the First fighter and you choose the Third fighter.
9.	[2, 3, 3]: Third fighter defeats First and Fourth fighter and you choose Third fighter.
10.	[3]: You choose Third (or Fourth) fighter before they have defeated anyone.
11.	[3, 3]: Third fighter defeats the Fourth fighter and you choose Third fighter.
```
