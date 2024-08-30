color = [ "black", "brown", "red", "orange", "yellow", "green","blue", "violet", "grey", "white" ]
last = [ "", "0", "00", "000", "0000", "00000", "000000", "0000000", "00000000", "000000000" ]

ans = ""
for i in range(2) :
    ip = input()
    ans += str(color.index(ip))
ip = input()
print(int(ans+ str(last[color.index(ip)])))