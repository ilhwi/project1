from faker import Faker

from functools import reduce
fake = Faker()

# test_date = []
# for i  in range(30):
#     test_date.append((fake.name(), fake.address()))

# test_date = [(fake.name(), fake.address()) for i in range(30)]
# print(test_date) #같은 말이다.

# a = 'Hello world'
# result = [i.lower() for i in a if i!=' ']
# print(result)

# a = {'a': 1, 'b':2}
# result = [i for i  in a.items()]
# print(result)
jjj = [i for i in range(1,21) if i%2==0]
print(jjj)

#길이가 5이상인 단어들만 포함하는 새로운 리스트
words =["apple","banana","cherry","date","elderberry","fig","grape"]
word = [i for i in words if len(i)>=5]
print(word)


#리스트 숫자를 제곱하여 결과가 50이상인 숫자들만 리스트 만들기
numbers = [5,7,10,12,15,18,20]
zegob = [i for i in numbers if(i*i>=50)]
print(zegob)

#딕셔너리에서 값이 200이상인 항목들의 키만을 포함하는 리스트 만들기
prices = {"apple":150, "banana":200, "cherry":250, "date":300, "elderberry":180}
list1 =[i for i in prices.keys() if prices[i]>= 200]
# list =   [i for i in range(len(prices)) if prices[1]]
print(list1)

#주어진 문자열에서 모음(a e i o u)을 제거한 새로운 문자열
sentence = "List comprehension is really useful!" 
vowel = ['a','e','i','o','u']
list2 = [i for i in sentence if(i not in vowel) and i not in ' ']
print(''.join(list2))

#다음 리스트에서 홀수만 필터링해서 새로운 리스트
numbers = [1,2,3,4,5,6,7,8,9,10]
hlist = [i for i in numbers if i%2==1]
print(hlist)
#다음 문자열리스트의 모든 단어를 대문자로 변환하세요
words=["hello","world","python","programming"]
def upper(x):
    return x.upper()
list3 = [i.upper()for i in words]
print(list3)
list4 = list(map(upper, words))
print(list4)
#다음 리스트이 모든 숫자의 곱을 계산하세요.
numbers = [1,2,3,4,5] #map 함수사용
def sub(x,y):
    return x*y

maps = reduce(sub, numbers)
print(maps)



