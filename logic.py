def game(a):
    dice = Dice()
    if(a == 1):
        dice.dice1()
    if(a == 2):
        dice.dice2()
    if(a == 3):
        dice.dice3()
    if(a == 4):
        dice.dice4()
    if(a == 5):
        dice.dice5()
    if(a == 6):
        dice.dice6()

class Dice:
    def __init__(self):
        pass

    def dice1(self):
        print("---")
        print("-●-      1입니다.")
        print("---")

    def dice2(self):
        print("●--")                
        print("---      2입니다.")    
        print("--●")    
    def dice3(self):
        print("●--")    
        print("-●-      3입니다.")    
        print("--●")    
    def dice4(self):
        print("●-●")    
        print("---      4입니다.")    
        print("●-●")    
    
    def dice5(self):
        print("●-●")    
        print("-●-      5입니다.")    
        print("●-●")    
    def dice6(self):
        print("●-●")    
        print("●-●      6입니다.")    
        print("●-●")    