class Countdown:
    def __init__(self, start):
        self.current = start #초기화 때 입력 받은 값을 현재 값으로 설정

    def __iter__(self):
        return self  #자기 자신을 반환 -coundown 객체가 iterator됨
    
    def __next__(self): #iterator 의 다음 요소를 반환
        if self.current <= 0: #현재 값이 0보다 작너나 같으면
            raise StopIteration #stopIteration 에러 발생
            
        else:
            num = self.current #현재값을 반환
            self.current -= 1 # 다음 요소를 위해 현재 값을 1 감소
            return num


it_counter = Countdown(3)
print(it_counter)

print(next(it_counter))
print(next(it_counter))
print(next(it_counter))
print(next(it_counter))