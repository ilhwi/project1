def outer_function(num):
    number = num

    def inner_function():
        nonlocal number
        number+=1
        print(number)

    return inner_function

num_closure = outer_function(5)
# print(num_closure())
# print(num_closure())
# print(num_closure())

num_closure()
num_closure()
num_closure()

