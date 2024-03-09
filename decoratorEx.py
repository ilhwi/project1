def decorator_function(original_function):
    def wrapper_function():
        print('함수가 호출 되었습니다.')
        original_function()
    return wrapper_function

@decorator_function
def hello():
    print('hello world!')

hello()
 