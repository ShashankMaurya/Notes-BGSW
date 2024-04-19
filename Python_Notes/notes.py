import re
# import Palindrome  # TODO: whole palindrome.py file gets imported with all its elements
# Palindrome.num_Palin(22) # TODO: can call function via imported file name
# from Palindrome import num_Palin  # TODO: importing only num_Palin() function from Palindrome.py file
# num_Palin(56) # TODO: can directly use the function as we imported only that particular one
# import dummy.Palindrome_dummy as fp # TODO: importing file from dummy package as alias "fp"
# fp.num_Palin(45) or dummy.Palindrome_dummy.num_Palin(45)
# TODO: if we create a directory, its only folder. to convert it into a package, so that we can use features like import, write a "__init__.py" file in that directory, it'll automatically get converted to a package


list_0 = ["cat", "dog", "mouse", "tiger", "lion", "racoon", "AyushRaj"]
# for i in list:
#     print("{}. {}".format(list.index(i)+1,i))
# list.append("baap")
# list+=["baap"] # TODO: LINE 4&5 DOES THE SAME THING
for i, j in enumerate(list_0):
    print("{}. {}".format(i + 1, j))
# print(type(enumerate(list)))

for _ in range(10):
    print('hello')

list_1 = [1, 3, 2, 5, 6, 7, 4]
list_2 = [12, 14, 15, 13, 16, 17]
s = "The Quick Brown Fox Jumps Over the Lazy Dog"
print(
    s.split())  # TODO: the split function splits the string into a list of small strings using a blank spaace as delimeter (as no arguments given) //syntax: str.split()//returns a list
lust = list_1 + list_2  # TODO: Merging 2 lists
print(lust)
lust = [list_1, list_2]  # TODO: THIS CREATES NESTED LISTS, i.e., 2 LISTS WITHIN A LIST
print(lust)

for i in lust:
    print(i)
    for j in i:
        print(j)

list_1.extend(list_2)
list_1.sort()
print(list_1)
list_2.reverse()
print(list_2)
list_1.sort(reverse=True)
print(list_1)
print(sorted(list_2))
print(sorted(s))
# s.reverse()
# s.sort(reverse=true) # TODO: LINE 23&24 DOES THE SAME THING BUT IN MUTABLE ITERABLES. STRING IS NOT ONE OF THEM
print(sorted(s,
             key=str.casefold))  # TODO: key=str.casefold() is used as a parameter here to mention that sorted() should use the casefold() while sorting its 1st parameter.str is used as an object just to indicate that casefold() of string class is used.
# TODO: sorted() is a function, as no object is used to call it. It has access to its parameters.(Read-Only);<-mostly
# TODO: str.sort() is a method, as an object is used to call it. It has access to the object and can modify it as we can see in line 14,15,17 and 19.It may or may not contain parameters.
print(list(s))
s1 = list(s)  # creating copy of list
s4 = list(s[:])  # creating a copy of the list using slicing
s5 = list(s).copy()  # creating a copy of the list using copy() //method
print(s1)
s2 = s1  # giving multiple names to same list
print(s2)
print(list(s) is s1)
print(list(s) is s2)
print(s1 is s2)  # TODO: 'is' compares the id() of both iterable/variables/objects passed and returns boolean value
print("{}\t\t{}\t\t{}".format(id(list(s)), id(s1), id(s2)))
print(s4)
print(id(s4))
print(id(list(s)))
print(s5)
s5 = ["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"]
print(s5)
p = ''
for i in s5:
    p += i + ' '
print(p)
# List->string conversion
s5[3] = "table"
print(s5)
p = ''
for i in s5:
    p += i + ' '
print(p)
s5[7:9] = ["smelly", "cat"]  # can be s5[7:]
print(s5)
del list_0[5:]
print(list_0)
print(max([1, 2, 3, 4, 5, 6, 7, 8, 9]))
print(min([1, 2, 3, 4, 5, 6, 7, 8, 9]))
print(sorted([1, 2, 3, 4, 5, 6, 7, 8, 9], reverse=True))
# print(reversed([1,2,3,4,5,6,7,8,9])) NOT WORKING
# TODO: SLICING A LIST BASED ON GIVEN CONDITIONS
num_list = [1, 5, 4, 123, 124, 123, 176, 145, 179, 176, 543, 765, 987]
num_list.sort()
f = 0
for i, value in enumerate(num_list):
    if value >= 100:
        f = i
        break
print(num_list)
del num_list[:f]
print(num_list)
# TODO: 2 WAYS OF SLICING LIST (MAX. VALUE LIMIT) UNDER GIVEN CONDITIONS
# num_list.reverse()
# f=0
# for i,value in enumerate(num_list):
#     if value<=200:
#         f=i
#         break
# print(num_list)
# del num_list[:f]
# print(num_list)
#
# num_list.reverse()
# print(num_list)

f = 0
for i in range(len(num_list) - 1, -1, -1):
    if num_list[i] <= 200:
        f = i
        break
del num_list[f:]
print(num_list)

for i, value in enumerate(reversed(
        num_list)):  # TODO: the reversed() just allows enumerate() to assign 'value' with reversed values of the list mentioned as the function arguments
    print(i, value)
print(num_list)

spam_list = [2, 3, 0, 4, 1, 4, 5, 6, 0, 7, 89, 90, 0, 934, 0, 34, 9, 4, 0, 5, 34, 5, 0, 34, 3, 0, 40, 3]
print("No. of zeroes in the spam list is {}.".format(spam_list.count(0)))

# TODO:                                         TUPLES

print("Shashank", "Maurya", 69, "Valar", "Morghulis")  # String
print(("Shashank", "Maurya", 69, "Valar", "Morghulis"))  # Tuple
# TODO: TUPLES ARE ENCLOSED IN PARENTHESIS AND ARE IMMUTABLE (Like strings)
bc = ("Shashank", "Maurya", 69, "Valar", "Morghulis")
print(bc)
print(bc[2])  # TODO: It supports indexing in square brackets
# bc[2]=96 TODO: TUPLES ARE IMMUTABLE TYPES
bc2 = list(bc)  # TODO: TUPLE->LIST || IMMUTABLE->MUTABLE CONVERSION (no usage of append())
bc2[2] = 96
print(bc2)
a, b, c = 1, 2, 3  # TODO: subsequent assignment
a, b, c, d, e = bc  # TODO: using the concept of subsequent assignment for unpacking a tuple
# a,*b,c=bc  TODO: 1st element will go to a, last will go to c and the rest will go to starred var, i.e., b
print(a, b, c, d, e, sep=', ')
# TODO: ANY SEQUENCE TYPE CAN BE UNPACKED
a, b, c, d, e = bc2  # TODO: using the concept of subsequent assignment for unpacking a list
print(a, b, c, d, e, sep=', ')

for i in enumerate(bc2):
    print(
        i)  # TODO: the enumerate() returns tuple values from the sequential // iterable type that consists of (<index_position>,<list_element>)

for i, j in enumerate(bc2):
    print(i, j)  # TODO: by placing 2 arguments in the for loop we sort of unpack the tuple returned by the enumerate().
    # TODO: BASIC EXAMPLE OF USAGE OF UNPACKING TUPLES ABOVE

# TODO:                                     NESTED LIST & TUPLES

albums = [
    ("Welcome to my Nightmare", "Alice Cooper", 1975,
     [
         (1, "Welcome to my Nightmare"),
         (2, "Devil's Food"),
         (3, "The Black Widow"),
         (4, "Some Folks"),
         (5, "Only Women Bleed"),
     ]
     ),
    ("Bad Company", "Bad Company", 1974,
     [
         (1, "Can't Get Enough"),
         (2, "Rock Steady"),
         (3, "Ready for Love"),
         (4, "Don't Let Me Down"),
         (5, "Bad Company"),
         (6, "The Way I Choose"),
         (7, "Movin' On"),
         (8, "Seagull"),
     ]
     ),
    ("Nightflight", "Budgie", 1981,
     [
         (1, "I Turned to Stone"),
         (2, "Keeping a Rendezvous"),
         (3, "Reaper of the Glory"),
         (4, "She Used Me Up"),
     ]
     ),
    ("More Mayhem", "Imelda May", 2011,
     [
         (1, "Pulling the Rug"),
         (2, "Psycho"),
         (3, "Mayhem"),
         (4, "Kentish Town Waltz"),
     ]
     ),
]
print()
print(albums[2][3][3][1])  # TODO: Accessing multi-level nesting of Lists & tuples


# TODO: LISTS: ORDERED AND CHANGEABLE, DUPLICATES ALLOWED
# TODO: TUPLES: ORDERED AND UNCHANGEABLE, DUPLICATES ALLOWED
# TODO: SETS: UNORDERED AND UNINDEXED, DUPLICATES NOT ALLOWED
# TODO: DICTIONARIES: UNORDERED AND CHANGEABLE, DUPLICATES NOT ALLOWED


# TODO:SETS

set1 = {1, 2, 3, 4, 5}
print(type(set1))
set1.add(7)
set1.update(6, 8, 9, 10)  # updates existing one
set1.discard(10)
set2 = set1.union('a', 'c')  # creates new set

set3 = {1, 2, 3, 0}
set4 = {0, 5, 6, 7}
set3.intersection_update(set4)  # only common one stays
set3.symmetric_difference_update(set4)  # except common one all stays

# TODO: DICTIONARIES

mydict = {
    "brand": "Ford",
    "Model": "Mustang",
    "year": 1964,
    "colors": ["red", "white", "blue"]
}  # TODO: SYNTAX {KEY:VALUE}

print(mydict["brand"])  # TODO: YOU GIVE KEY, WE GIVE VALUE
print(mydict.keys())
print(mydict.popitem())  # TODO: NO INDEX GIVEN, THEN IT'LL POP LAST ITEM

for keys, values in mydict.items():  # TODO: TO PRINT ALL IN ORDERLY FORMAT
    print('{} \t\t {}'.format(keys, values))

mydict.update({"year": 2020})
mydict["year"] = 2021  # TODO: BOTH DO SAME THING


def myFun1(*argv):  # TODO: The special syntax *args in function definitions in Python is used to pass a variable number of arguments to a function. It is used to pass a non-keyworded, variable-length argument list.
    for arg in argv:
        print(arg)


def myFun2(**kwargs):  # TODO: The special syntax **kwargs in function definitions in python is used to pass a keyworded, variable-length argument list. We use the name kwargs with the double star. The reason is because the double star allows us to pass through keyword arguments (and any number of them).
    for key, value in kwargs.items():
        print("% s == % s" % (key, value))


print("Result of * args: ")
myFun1('Hello', 'Welcome', 'to', 'GeeksforGeeks')

print("\nResult of **kwargs")
myFun2(first='Geeks', mid='for', last='Geeks')


# TODO: ARBITRARY ARGUMENTS

def fun(*args):  # TODO: RETURNS TUPLES
    print(args)
    print(type(args))


fun("hello", 69)


def fun(**args):  # TODO: RETURNS DICTIONARY
    print(args)
    print(type(args))


fun(f="hello", k=69)

x = lambda a, b: a * b
print(x(5, 6))
# TODO: A lambda function is a small anonymous function.
# TODO: A lambda function can take any number of arguments, but can only have one expression.

y = (lambda x: (x + 3) * 5 / 2)(3)
# TODO: ELEMENT CAN BE PASSED TO THE LAMBDA FUNCTION IN THIS WAY ALSO

resultlist = []
for i in list_1:
    resultlist.append(i + 1)

# TODO: the above code can be condensed to a single line a.k.a. "LIST COMPREHENSION"

resultlist = [i + 1 for i in list_1]


n = 5
list_0 = [int(input()) for _ in range(n)]  # TODO: LIST COMPREHENSION style data input in a list


class Mammal:  # TODO: inherited (parent class)
    def walk(self):
        print("Walking")


class Dog(Mammal):  # TODO: inheritance (child class)
    pass


dog1 = Dog()  # TODO: Object created for Dog class (constructors called)
dog1.walk()


class Point:
    def __init__(self, x, y):  # TODO: self will be used to reference the current object (like this keyword in JAVA)
        self.x = x
        self.y = y


point_obj = Point(10, 20)
print(point_obj.x, point_obj.y)

# TODO: __init__ is called when an object is created (it is a constructor)

[print(i) for i in list_1]  # TODO: list comprehension

print('A') if a > b else print('B')  # TODO: Shorthand if-else

x = [1, 2, 4]


def add(x):
    return x * 2


y = list(map(add, x))
print(y)

y = [x for x in range(0, n + 1) if x % 2 == 0]  # TODO: list comprehension


def square(n):
    """hello world. this is called doc string"""
    print(n ** 3)


print(square.__doc__)  # TODO: we can print documentation in form of doc_strings but we can't print comments.

# TODO: REGEX

t='The rain in Spain'
x=re.search('^The.*Spain$',t)
if x:
    print('the string starts with "The" and ends with "Spain"')
else:
    print('NO')

name= 'Ram is 22 and Sita is 32 Guddu is 45 and Steve is 12'

age=re.findall(r'\d{1,3}', name)  # TODO: returns all string that satisfyies the given condition, here the condition is the token should number rangeing from 1 to 2 digits
name=re.findall(r'[A-Z][a-z]*', name)  # TODO: returns tokens starting with [A-Z] and having as many [a-z] in them
agedict = {}
x=0
for i,j in enumerate(name):
    agedict[j]=age[i]
print(agedict)


'''
[a-z] : this means characters a to z
\d: digit hone se return karega
\D: digit nahi hone se return karega
\s: space one se return karega
\w : returns if kuch bhi characters in range [A-Z][a-z][0-9] 
\w: returns False if kuch bhi characters in range [A-Z][a-z][0-9] 
^ : this means start with
$ : this means ends with
* : matches the previous character zero or more time
? : matches the previous character zero or one time
+ : matches the previous character one or more time
{} : exactly the number of characters
| : either or (eg: x|y means either x or y)
. : no. of characters corresponding to the number of dots (1 char = 1 dot)
'''

