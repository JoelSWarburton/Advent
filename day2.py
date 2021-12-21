
input = open("/home/joel/IdeaProjects/advent/src/input2.txt", "r")
inputLines = [data.strip() for data in input.readlines()]

depth = 0
position = 0


for line in inputLines:
    command, amount = line.split()
    amount = int(amount)
  
    if(command == "up"):
        depth -= amount
    elif(command == "down"):
        depth += amount
    else: 
        position += amount

print(depth)
print(position)
print(depth * position)


#part 2

input = open("/home/joel/IdeaProjects/advent/src/input2.txt", "r")
inputLines = [data.strip() for data in input.readlines()]

depth = 0
position = 0
aim = 0


for line in inputLines:
    command, amount = line.split()
    amount = int(amount)
  
    if(command == "up"):
        aim -= amount
    elif(command == "down"):
        aim += amount
    else: 
        position += amount
        depth += aim * amount

print(depth)
print(position)
print(depth * position)

