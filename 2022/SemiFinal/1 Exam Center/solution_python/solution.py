# Author: Gopal Panigrahi
# Techgig Code Gladiators 2022
# Score: 100

target_room_number = int(input())

distance_to_target_room = target_room_number

current_room = 0
while distance_to_target_room:
  current_room += 1
  if not("2" in str(current_room) or "14" in str(current_room)):
    distance_to_target_room -= 1

print(current_room)

