import heapq

v,e = map(int, input().split())

k = int(input())

graph = [[] for i in range(v+1)]

for i in range(e) :
    a,b,c = map(int, input().split())
    graph[a].append((b,c))

dist = [float("inf") for i in range(v+1)]

minh = [(0, k)]

dist[k] = 0

while minh:
    d, now = heapq.heappop(minh)
    for i in range(len(graph[now])):
        next, di = graph[now][i]
        if(di+d < dist[next]):
            dist[next] = di+d
            heapq.heappush(minh,(di+d, next))

for i in range(1,len(dist)):
    print( dist[i] if dist[i] != float("inf") else "INF" )