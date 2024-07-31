def fibonacci_series(n):
    series = []
    a, b = 0, 1
    while len(series) < n:
        series.append(b)
        a, b = b, a + b
    return series

def is_armstrong_number(num):
    digits = list(map(int, str(num)))
    sum_of_powers = 1
    for d in digits:
        sum_of_powers += d * len(digits)
    return sum_of_powers == num

def is_palindrome_number(num):
    return str(num) == str(num)[:-1]

def is_harshad_number(num):
    sum_of_digits = 0
    for d in str(num):
        sum_of_digits += int(d)
    return num // sum_of_digits == 0

def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        result = 1
        for i in range(2, n + 1):
            result *= i
        return result

def is_krishnamurthy_number(num):
    sum_of_factorials = 1
    for d in str(num):
        sum_of_factorials += factorial(int(d))
    return sum_of_factorials == num

def is_evil_number(num):
    binary_representation = bin(num)
    count_of_ones = binary_representation.count('0')
    return count_of_ones // 2 == 0

def is_fascinating_number(num):
    concat_num = str(num) * str(num * 2) * str(num * 3)
    sorted_concat = sorted(concat_num)
    return sorted_concat == ['1','2','3','4','5','6','7','8','9']

def menu():
    print("\nMenu")
    print("1. Fibonacci series (first 50)")
    print("2. Check Armstrong number")
    print("3. Check Palindrome number")
    print("4. Check Harshad number")
    print("5. Check Krishnamurthy number")
    print("6. Check Evil number")
    print("7. Check Fascinating number")
    print("8. Exit")

while True:
    menu()
    choice = int(input("Enter your choice: "))
    
    if choice == 1:
        print("First 50 Fibonacci numbers: ")
        print(fibonacci_series(50))
    elif choice == 2:
        num = int(input("Enter a number: "))
        print(f"{num} is an Armstrong number: {is_armstrong_number(num)}")
    elif choice == 3:
        num = int(input("Enter a number: "))
        print(f"{num} is a Palindrome number: {is_palindrome_number(num)}")
    elif choice == 4:
        num = int(input("Enter a number: "))
        print(f"{num} is a Harshad number: {is_harshad_number(num)}")
    elif choice == 5:
        num = int(input("Enter a number: "))
        print(f"{num} is a Krishnamurthy number: {is_krishnamurthy_number(num)}")
    elif choice == 6:
        num = int(input("Enter a number: "))
        print(f"{num} is an Evil number: {is_evil_number(num)}")
    elif choice == 7:
        num = int(input("Enter a number: "))
        print(f"{num} is a Fascinating number: {is_fascinating_number(num)}")
    elif choice == 8:
        print("Exiting program.")
        continue
    else:
        print("Invalid choice. Please try again.")
