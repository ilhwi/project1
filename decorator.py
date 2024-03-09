def decorator_function(original_function):
    def wrapper_function(*args, **kwargs):
        print('before')
        original_function(*args, **kwargs)
        print('after')
    return wrapper_function


def display():
    print('display 함수가 실행됐습니다.')

def display_info(name, age):
    print(f'display_info({name}, {age}) 함수가 실행됐습니다.')

decorated_display = decorator_function(display)
decorated_display()
print()
decorated_display = decorator_function(display_info)
decorated_display('John', 25)
 