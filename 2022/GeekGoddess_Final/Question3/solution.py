from collections import deque

for i in range(int(input())):
n = int(input())
def num(N):
v = [9,1,3,5,7]
ans = 0
while(N>0):
ans = ans * 10 + v[N % 5]
if (N % 5 == 0):
N = N // 5
N -=1
else:
N = N//5
q = deque()
while (ans > 0):
q.append(ans % 10)
ans = ans//10
while(q):
ans = ans * 10 + q[0]
q.popleft()
return ans
print(num(n))
