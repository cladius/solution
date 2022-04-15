# Defend the Country (100 Marks)
The intelligence agencies were tracking the suspected terrorists as they had the information that the terrorists were planning something big. 
The terrorists were hiding in a hood in a city when the agencies were onto them. 
The terrorists got to know about it via some leak from the media and they tried their best to eradicate the clues of the attack rather than running
for their lives. All the terrorists got killed in the encounter at hood except one, which the agency was able to arrest alive, of course, 
after he was hurt. When the agents got inside their hood, they saw a sequence of **N** integers written on the wall.


Note: The given sequence is an example only. 

The agents interrogated the arrested terrorist to figure out what that was all about. After the interrogation, it was found that the sequence was of continuous/consecutive natural integers of which all the digits except one were removed from some or all of the integers of the sequence so that the agencies could not figure out the actual attack. The leftover digit D could be the starting digit or the last digit or any of the middle digits. The arrested terrorist did not know anything except this.

What this means is:
In the image/sequence provided above, the first integer can be 12 or 20 or 21 or 22 or 32 or 121 or 111222 or any other number which has 2 as a number or a part of it. 

The intelligence agencies have put all their sources into action and after a lot of hardwork are able to figure out that if they can get to the smallest starting integer of the sequence of continuous integers they might be able to crack the plan and save the country. They have the doubt that the continuous integers can be car numbers, airline numbers, house numbers, shipment numbers or any of the other things which are very important, which they will be able to track after they have the initial starting integer. The agencies know the importance of the task and are thus contacting all the good coders around the country to crack the sequence as soon as possible. The time is very precious and they are counting on the coders of the country to defend the nation.

The agencies know it is a difficult task under the time constraint and are thus providing examples to help you better understand the task and write a solid program for the same.

Example:
Suppose there are 8 integers written on the wall.

 

Things to remember:
1: The sequence should be continuous/consecutive natural integers.
2. The initial sequence integer should be the smallest possible.

Now, for the given sequence, the smallest possible initial integer is 36. There is no integer less than 36 which will make the sequence to be continuous and if the digits of this sequence are removed we can get the provided sequence.

 

The sequence thus formed is correct following all the conditions and this is actually a sequence of the bunglow numbers of the Cabinet ministers of the government.

From this, it can be understood that the attack is very big and alot of planning has been done for the same. The threat is big but the agencies believe that the best coders of the country will be able to help them in saving the country from this deadliest attack. Do your best and save the country.



Input Format
The first line of input consists of the number of integers, N.
The second line of input consists of the N space-separated digits, D1….DN which are the left over digits of the sequence on the wall.



Constraints
1<= N <=1000000
0<= D <=9



Output Format
Print the smallest initial possible integer which is the first number of the continuous sequence.



Sample TestCase 1
Input
10
2 2 3 4 5 6 7 8 9 0
Output
21
Explanation
The smallest initial integer possible for the given sequence is 21. The sequence thus formed is continuous.


 


It is possible to get the input sequence from the sequence starting from 21 after the removal of digits. 


Sample TestCase 2
Input
8
6 7 8 9 4 4 2 3
Output
36
