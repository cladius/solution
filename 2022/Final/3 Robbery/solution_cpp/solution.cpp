/*
Author : Gopal Panigrahi
Techgig Code Gladiators 2022
Score : ??
*/

#include <bits/stdc++.h>
using namespace std;

int main()
{
  int testcases, diamonds, n_row, m_col, x, y, moves_made;

  cin >> testcases;
  while (testcases--)
  {
    cin >> n_row >> m_col;
    cin >> diamonds;

    vector<vector<int>> exhibition_room(n_row + 1, vector<int>(m_col + 1, 0));

    for (int i = 0; i < diamonds; i++)
    {
      cin >> x >> y;
      exhibition_room[x][y] = 1;
    }

    cin >> moves_made;

    int current_x = 1, current_y = 1;
    char direction;
    int picked_diamonds = exhibition_room[current_x][current_y];

    for (int i = 0; i < moves_made; i++)
    {
      cin >> direction;
      if (direction == 'A' || direction == 'B' || direction == 'C' || direction == 'D' || direction == 'E')
      {
        current_x = min(current_x + 1, n_row);
      }
      else if (direction == 'J' || direction == 'K' || direction == 'L' || direction == 'M' || direction == 'N')
      {
        current_y = min(current_y + 1, m_col);
      }
      else if (direction == 'U' || direction == 'V' || direction == 'W' || direction == 'X' || direction == 'Y')
      {
        current_x = max(current_x - 1, 1);
      }
      else if (direction == 'P' || direction == 'Q' || direction == 'R' || direction == 'S' || direction == 'T')
      {
        current_y = max(current_y - 1, 1);
      }

      if (exhibition_room[current_x][current_y])
      {
        picked_diamonds += 1;
        exhibition_room[current_x][current_y] = 0;
      }
    }
    cout << picked_diamonds << " " << diamonds - picked_diamonds << endl;
  }

  return 0;
}