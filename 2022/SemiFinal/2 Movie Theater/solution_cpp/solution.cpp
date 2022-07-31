/*
Author : Gopal Panigrahi
Techgig Code Gladiators 2022
Score : 100
*/

#include <bits/stdc++.h>
using namespace std;

int main()
{
  int total_seats, occupied_seat_count, preferred_seat_count;

  unordered_map<int, bool> theatre;

  const bool OCCUPIED = true;

  cin >> total_seats;
  cin >> occupied_seat_count;
  cin >> preferred_seat_count;

  int seat_number;
  for (int i = 0; i < occupied_seat_count; i++)
  {
    cin >> seat_number;
    theatre[seat_number] = OCCUPIED;
  }

  for (int i = 0; i < preferred_seat_count; i++)
  {
    cin >> seat_number;
    if (theatre[seat_number] == OCCUPIED)
    {
      cout << "N" << endl;
    }
    else
    {
      cout << "Y" << endl;
    }
  }

  return 0;
}