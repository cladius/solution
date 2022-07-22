import sys
import os

''' Read input from STDIN. Print your output to STDOUT '''
# Use input() to read input from STDIN and use print to write your output to STDOUT
# Write code here
# 100/100

input1 = input()
inputs = input1.split()

bookedSeats = set()

for x in range(int(inputs[1])):
  bookedSeat = input()
  bookedSeats.add(bookedSeat)

for x in range(int(inputs[2])):
  try:
      likedSeat = input()
      if not likedSeat.isnumeric():
          pass
      elif likedSeat in bookedSeats:
          print("N")
      elif int(likedSeat) > int(inputs[0]):
          print("N")
      else:
          print("Y")
  except:
      print("Y")
