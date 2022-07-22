# Business (100 Marks)
Abhay was working in the manufacturing sector for several years and has now decided to set up his own business. He has a good reputation in the manufacturing sector and working for so long has helped him in developing connections with different companies. The experience is helping him in getting the manufacturing orders (MO) of great price (P). While evaluating the orders received, he realized that he was missing some machines (M) which were necessary to complete the order. The order may not be missing all the M machines required but it is missing atleast one of the necessary machines M.

To complete the manufacturing order, Abhay can choose any of the two ways:
1.	He can buy the missing machines for each manufacturing order at the cost price (CP). The cost price of the machine is independent of the orders it is used to complete or made to work on. Once a machine is bought, it can be used any number of times on any number of orders without paying any extra price.

Example:
Abhay buys the machine for 1000. This machine can be used to work on any number of manufacturing orders which requires this machine without incurring any extra cost for usage.

2.	He can rent the missing machines to complete each manufacturing order. The rent (Ri) on different orders may or may not be different. It is because the different orders may require the machines to work for different amounts of time and for different amounts of work.

Example:
The Manufacturing Order 1 requires Machine 2 to work for some time. The rent for Machine 2 for working/completing the Manufacturing Order 1 is 200.

Also, the Manufacturing order 2 requires Machine 2 to work for some longer period of time. The rent for Machine 2 for working/completing the Manufacturing Order 2 is 300.

The rent for the required machine depends on the manufacturing order it is used to complete and is not independent of the order. 

As the buying or renting the machines for the manufacturing order may increase the manufacturing cost of the order, Abhay can decide to:
1.	Reject manufacturing orders whose manufacturing cost goes too high. Rejecting a manufacturing order will not cause any problem for Abhay. He will neither incur any cost nor will he get any profit.
2.	Abhay can accept the manufacturing order depending on the maximum profit he can achieve by completing the different manufacturing orders. If the maximum profit he can achieve does not change by accepting such an order, he can choose to either accept it or reject it. But, if the maximum profit he can achieve decreases, he will reject such a manufacturing order.

The main aim of Abhay is to maximize his business profits. For this, he can either reject a manufacturing order or accept a manufacturing order.

Initially, it was easy for Abhay:
1.	To reject or accept a manufacturing order
2.	To buy or rent a particular necessary missing machine required to complete the order

But as the number of manufacturing orders are increasing, it is becoming very difficult for him to make the correct decision about accepting or rejecting a manufacturing order and buying or renting a particular missing machine for the manufacturing order. 

For this, he needs your help. He has heard about your excellent skills and wants you to help him with his business to generate the maximum profits. Based on your guidance, he will make the decision of accepting or rejecting the manufacturing orders and buying or renting the particular missing machines required for completing the particular manufacturing order. 

Maximum Profit:
It is the maximum difference between {the summation of order Price Abhay will get for completing the particular manufacturing orders} and {the total manufacturing cost incurred by Abhay to complete that particular manufacturing orders}.

```
Maximum Profit = (Total Price Abhay will get for completing the particular manufacturing orders) - 
                (Total Manufacturing cost incurred by Abhay to complete that particular manufacturing orders).
```

Manufacturing cost for a particular manufacturing order is the summation of the money spent by Abhay on buying or renting the different missing machines required to complete that particular order.

As understood, it is a very crucial and important task for the business, so, Abhay himself, will explain it to you with the help of an example as to how he can maximize the profit.

Example:
Abhay:
Suppose we receive 2 manufacturing orders of Price 2000 respectively.

MO = 2
Manufacturing Order 1 Order Price (P1) for completing the order = 2000
Manufacturing Order 2 Order Price (P2) for completing the order = 2000

|     Manufacturing   Order (MO)    |     Order   Price for completing the order (P)    |
|-----------------------------------|---------------------------------------------------|
|     1                             |     2000                                          |
|     2                             |     2000                                          |


The two manufacturing orders are missing 4 necessary machines M1, M2, M3 and M4 for completing the order.

|     Manufacturing   Order (MO)    |     Missing   Machines (MM) Required for completing the manufacturing order    |
|-----------------------------------|--------------------------------------------------------------------------------|
|     1                             |     M1 and M3                                                                  |
|     2                             |     M1, M2   and M4                                                            |


The rent for different machines required for different manufacturing orders may or may not be different.

|          |     Missing   Machines (MM) Required for completing the manufacturing order    |     Rent (Ri)   to be paid on the machine to use it to complete the manufacturing order on   the machine    |
|----------|--------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------|
|     1    |     M1                                                                         |     100                                                                                                     |
|          |     M3                                                                         |     400                                                                                                     |
|     2    |     M1                                                                         |     400                                                                                                     |
|          |     M2                                                                         |     600                                                                                                     |
|          |     M4                                                                         |     1000                                                                                                    |

The cost price of the necessary missing machines M1, M2, M3 and M4. In case, it is better to buy the machine than to rent it.

|           |     Cost   Price (CP)    |
|:---------:|:------------------------:|
|     M1    |            500           |
|     M2    |            800           |
|     M3    |            1100          |
|     M4    |            1500          |

The maximum profit that can be achieved in this case is 1500.

How?
There are multiple possible ways in which the maximum profit can be achieved.

1.	Complete manufacturing order 1 and Reject manufacturing order 2. For completing the manufacturing order 1, rent both the required machines.

Total Rent on machines for completing manufacturing order 1 = 100(M1) + 400(M3) = 500

Total manufacturing cost for manufacturing order 1 = Rent on machines = 500

Total order price for completing the manufacturing order 1 = 2000

Maximum Profit = Total order price for completing the manufacturing order 1 - Total manufacturing cost for manufacturing order 1

Maximum Profit = 2000 - 500 = 1500

2.	Complete both the manufacturing orders 1 and 2. Rent all the machines required for completing the orders.

Total Rent (R1) on machines for completing the manufacturing order 1 = 100 + 400 = 500

Total Rent (R2) on machines for completing the manufacturing order 2 = 400 + 600 + 1000 = 2000

Total Manufacturing Cost for both the orders = R1 + R2 = 500 + 2000 = 2500

Total Order price for Completing both the orders = P1 + P2 = 2000 + 2000 = 4000

Maximum Profit = 4000 - 2500 = 1500

3.	Complete both the manufacturing orders 1 and 2. Buy Machine 1 and rent all other required machines for both the orders.
Total Rent (R1) on machines for completing the manufacturing order 1 = 400 (M3)
Money spent on buying the required machine M1 = CP of M1 = 500

Total Rent (R2) on machines for completing the manufacturing order 2 = 600 + 1000 = 1600

We don’t have to pay any price for M1 as we have already purchased it and it can be used any number of times on any number of orders.

Total Manufacturing Cost = R1 + R2 + Money spent on buying the machine M1 = 400 + 1600 + 500 = 2500

Total Order price for Completing both the orders = P1 + P2 = 2000 + 2000 = 4000

Maximum Profit = 4000 - 2500 = 1500

Abhay:
The task is very crucial so make no mistakes. All the information about the manufacturing orders, required machines, cost price of different machines and rent of different machines for different manufacturing orders will be provided to you. Good luck.





## Input Format
The first line of input consists of the two space-separated integers, number of manufacturing orders received, MO, and the number of machines required, M.


Next, there will be MO blocks for input for each manufacturing order.
For each order, the first line of input will consist of two space-separated integers, the order price (P) for completing that order and the missing machines (MM) required to complete that particular order.
Next MM lines each, for that order will consist of two space-separated integers, the missing machine M for that particular order and the rent (Ri) on that machine to be used to complete that particular order.


After the last block of input for the manufacturing orders, there will be M lines of input, each representing the cost price (CP) for that particular machine Mi.



## Constraints
```
1<= MO <=1200
1<= M <=1200
1<= P <=5000
1<= MM <=M
1<= Ri <=20000
1<= CP <=20000
```


## Output Format
Print the maximum profit that can be achieved by Abhay by accepting or rejecting the orders and buying or renting the required machines.



## Sample TestCase 1
### Input
```
2 4
2000 2
1 100
3 400
2000 3
1 400
2 600
4 1000
500
800
1100
1500
```

### Output
```
1500
```
