import logic
import random

def main():
    count = 2
    countlist =[]
    sum = 0
    while count>0:
        user = random.randint(1,6)
        logic.game(user)
        countlist.append(user)
        count -= 1
        sum += user
    print("두주사위의 합은 :",sum)

if __name__ == "__main__":
    main()


