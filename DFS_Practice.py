## Jerard Austin 2025

graphforDFS = {

    'A' : ['B'],
    'B' : ['A', 'C', 'D'],
    'C' : ['B'],
    'D' : ['B', 'E', 'F'],
    'E' : ['D'],
    'F' : ['D']

}

def dfs(graphforDFS, startP):

        visited = set
        stack = [startP]


        while stack:
    
            current_N = stack.pop
            if current_N not in visited:
                  visited.add(current_N)
                  print(current_N)


                  for neighbor in graphforDFS[current_N]:
                        if neighbor not in visited:
                              stack.append(neighbor)


dfs(graphforDFS, "A")