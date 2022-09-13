total = 0
max=0
min=100
count = int(input("How many values will be added? "))
for i in range(count):
    score = float(input("Enter a number: "))
    while score < 0 or score > 100:
        score = float(input("Please reenter a valid number: "))
    total = total + score 
    if score > max:
     max = score
    if score < min:
     min = score
average = total / count
print("Average is", average)
print(min)
print(max)