n, m = map(int, input().split())

par = [-1 for i in range(n+1)]

def find(a):
    if par[a] == -1 :
        return a
    b = find(par[a])
    par[a] = b
    return b

def union(a,b) :
    a = find(a)
    b = find(b)
    if a == b : 
        return

    par[b] = a


for i in range(m) :
    f, a, b = map(int, input().split())
    if f == 1 :
        print("yes" if find(a) == find(b) else "no")
    else : 
        union(a,b)