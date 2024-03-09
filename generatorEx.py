#1~100까지 3의 배수만 출력
def hun():
    for i in range(1,100):
        if(i%3==0):
            yield i


for i in hun():
    print(i)
#next(hun()) 도 가능
    

#1부터 100까지의 숫자 중 3의 배수만  

class hun:
    def __init__(self, start): #100
        self.current = start
        self.num = 1
    def __iter__(self):
        return self
    
    def __next__(self):
        if self.current <= self.num: # 현재 값이 0보다 작거나 같으면(다음 요소가 없을 때를 정의)
            raise StopIteration
        else:
            num = self.num
            if(num%3==0):
                self.num +=1
                return num

print(next(hun(100)))