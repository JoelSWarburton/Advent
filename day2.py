
input = open("/home/joel/IdeaProjects/advent/src/input2.txt", "r")
inputLines = [data.strip() for data in input.readlines()]

depth = 0
position = 0




for line in inputLines:
    line = line.split()
    print(line)
    if(line[0] == "up"):
        depth -= int(line[1])
    elif(line[0]== "down"):
        depth += int(line[1])
    else: 
        position += int(line[1])

print(depth)
print(position)
print(depth * position)
