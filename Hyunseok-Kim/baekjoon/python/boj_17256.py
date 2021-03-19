# https://www.acmicpc.net/problem/17256

a_value = input()
c_value = input()
a_x, a_y, a_z = a_value.split(' ')
c_x, c_y, c_z = c_value.split(' ')

b_x = (int(a_z) - int(c_x)) * -1
b_y = int(int(c_y) / int(a_y))
b_z = (int(a_x) - int(c_z)) * -1

print(f"{b_x} {b_y} {b_z}")