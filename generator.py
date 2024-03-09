def test():
    print('A')
    yield "야호"
    print('B')
    yield 2
    print('C')
    yield 3 # 일시정지 하고 나옴


t = test()
print(next(t))
print('======')
print(next(t))
print('======')
print(next(t))
print('======')
