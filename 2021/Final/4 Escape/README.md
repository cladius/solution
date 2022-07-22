# Escape (100 Marks)
Captain Saurabh Kalia was patrolling along with five other officers along the border when the enemy forces along with the heavily armed terrorists started firing on them. The officers retaliated in the best possible way and took down many terrorists and enemy personnels before they ran out of ammunition. After the officers ran out of ammunition, they engaged in combat with the enemies and killed many of them. The enemy group was shocked by such strong retaliation but was able to take down five officers and capture Captain Saurabh Kalia as a prisoner not before getting a huge number of their people killed and many wounded.

The enemy forces tied Captain's hands with a long rope and took him along with them. They wanted to get to the headquarters but since they too were heavily wounded decided to stop at their first base. They tied Captain to an end at the location and moved to the distance to the left from him as they were dreaded by the valour of Captain earlier and did not want more deaths on their side. The battalion of Captain got to know about all this and decided to get the Captain back. The battalion cannot cross the border as it will result in a war between the nations. The battalion decided to carry out a secret mission to get Captain back. The battalion has sent an untraceable drone across the border to get to know the details of whereabouts. With the help of the drone, they were able to get the important details and an aerial view of the location. The Captain is tied to an end at the location (Cx ,Cy) and there are P number of posts arranged in a vertical line left to him which have the same x coordinate.

The long rope the enemies have used to tie Captain goes through a number of locations and is described by a sequence of L number of line segments. The first of these segments starts at the location of the Captain and the last of these segments end at the location of the Captain. There is no enemy post lying on any of these line segments but the line segments may cross and multiple line segments may overlap at their endpoints.

The battalion at the same time was trying to contact Iftikhar Aka Major Mohit Sharma, Para SF commando who was working undercover as a part of a terrorist group in the enemy camp. They were able to contact him and told him the details about the area. He told the battalion that his terrorist group was going to the same base where Captain is kept as many of the men there are wounded. He also told them that he will keep his horse and his aide ready to the right of the location of Captain and if they are able to make Captain move to the right of his tied position without getting rope caught in any of the posts, they will be able to escape Captain. For this, they have to find the minimum number of posts that should be cut through and removed so that Captain can move to his right and escape.

Major can do this on his own but the shortage of time is a big factor. The escape plan should be executed as fast as possible and for this, they need your help. You will be provided with the locations of enemy posts, the location of Captain, and all the rope line segments and you just have to figure out the minimum number of posts Major should cut through and remove so that the Captain can escape.

Meanwhile, Major will reach the enemy base and let Captain know about the details of the escape plan and wait for your answer. It has started to rain heavily and is the best time for us to execute the plan; so, be fast and remember there is no room for mistake as it can cost both the brave soldiers their lives and a blow to the nation's intelligence network on the enemy side. There is a huge responsibility on you so calm your nerves and get into action. Good Luck!



## Input Format
The first line of input consists of the four space-separated integers, number of posts, P, number of rope/line segments L and the location coordinates of the Captain (Cx, Cy)
Next P lines each consists of the two space-separated integers, position of the ith Post, (Px, Py)
Next L+1 lines each consists of the two space-separated integers, endpoints of the ith line segment, (Lx, Ly)



## Constraints
```
1<= P <=10
0<= Px, Py <=10000
3<= L <=10000
0<= Lx, Ly <=10000
0<= Cx, Cy<=10000
Cx > Px 
```


## Output Format
Print the minimum number of posts Major should cut through and remove so that Captain can move to the right of his location without getting the rope caught in any of the posts and finally escape.



## Sample TestCase 1
### Input
```
2 10 8 2
3 1
3 5
8 2
3 6
1 1
3 0
4 1
1 5
6 6
4 0
0 1
4 2
8 2
```

### Output
```
1
```

### Explanation
The aerial view from drone for the given positions is given below:

  <img width="900" alt="1" src="https://user-images.githubusercontent.com/11571484/180426992-fdbc1767-31b2-4121-9bae-554fc9b4aa19.png">


The minimum number of posts to be removed in this case is 1. If we remove either Post 1 or Post 2, it will be possible for Captain to move to his right and escape.

After the removal of Post 2, it will be possible for Captain to move to his right and escape. Captain will move along the rope and once he is at a position (0, 1), he can run to the right without getting the rope being caught in the Post 1.

Movement of Captain: (8, 2) - (3, 6) - (1, 1) - (3, 0) - (4, 1) - (1, 5) - (6, 6) - (4, 0) - (0, 1)

<img width="900" alt="2" src="https://user-images.githubusercontent.com/11571484/180427061-4a0eca53-51ca-40dd-a88c-09a1897143b9.png">

 

After the removal of Post 1, it will be possible for Captain to move to his right and escape. Captain will move along the rope and once he is at a position (6, 6) or as soon as he crosses P2 on line segment (1,5) to (6, 6) , he can run to the right without getting the rope being caught in the Post 2.

Movement of Captain: (8, 2) - (3, 6) - (1, 1) - (3, 0) - (4, 1) - (1, 5) - (6, 6)

 <img width="900" alt="3" src="https://user-images.githubusercontent.com/11571484/180427084-c46e415a-2a36-4297-b9f9-af0878bb2d1c.png">


Remember that Captain is tied to a long rope and the line segments represent the movement/shape of the rope.


