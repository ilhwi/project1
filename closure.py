def outer_function(msg):
    message = msg

    def inner_function():
        print(message)

    return inner_function


hi_closure = outer_function('hi')
hello_closure = outer_function('hello')

hi_closure()
hello_closure()
