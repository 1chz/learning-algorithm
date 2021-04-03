import sys
tc = int(input());

for i in range(tc):
    a, b = sys.stdin.readline().split(" ")
    val = int(a) + int(b)
    line = "Case #"+str(i+1)+":",str(a)+" + "+str(b)+" = "+str(val)
    print(line)
