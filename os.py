import os

a = os.environ
print(type(a))
print(len(a))
print('JAVA_HOME' in a)
print(a['JAVA_HOME'])

dic_a = dict(a)

print(list(dic_a.keys()))



