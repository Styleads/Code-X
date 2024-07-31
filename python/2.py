def print_square(size):
    for i in range(size):
        for j in range(size):
            print("*", end="")
        print()

def print_triangle(height):
    for i in range(0, height + 1):
        for j in range(1, i + 1):
            print("*", end=" ")
        print()

def print_number_triangle(height):
    for i in range(1, height + 1):
        for j in range(1, i + 1):
            print(j, end=" ")


def print_diamond(height):
    if height % 2 == 0:
        print("Height must be an odd number.")
        return
    n = height // 2
    for i in range(n + 1):
        for j in range(n, i, -1):
            print(" ", end="")
        for k in range(2 * i + 1):
            print("*", end="")
        print()
    for i in range(n, -1, -1):
        for j in range(n, i, -1):
            print(" ", end="")
        for k in range(2 * i + 1):
            print("*", end="")
        print()

def print_pyramid(height):
    for i in range(1, height + 1):
        for j in range(i, height):
            print("", end="")
        for k in range(2 * i - 1):
            print("*", end="")
        print()

def print_hollow_square(size):
    for i in range(size):
        for j in range(size):
            if i == 0 or i == size - 1 or j == 0 or j == size - 1:
                print("*", end=" ")
            else:
                print(" ", end=" ")
            print()

def print_number_right_triangle(height):
    for i in range(1, height + 1):
        for j in range(1, i + 1):
            print(j, end=" ")
    print()

def print_hollow_diamond(height):
    if height % 2 == 0:
        print("Height must be an odd number.")
        return
    n = height // 2
    for i in range(n + 1):
        for j in range(n, i, -1):
            print(" ", end="")
        for k in range(2 * i + 1):
            if k == 0 or k == 2 * i or i == n:
                print("*", end="")
            else:
                print(" ", end="")
        print()
    for i in range(n, -1, -1):
        for j in range(n, i, -1):
            print(" ", end="")
        for k in range(2 * i + 1):
            if k == 0 or k == 2 * i or i == 0:
                print("*", end="")
            else:
                print(" ", end="")
        print()

def main():
    while True:
        print("Pattern Printer Menu:")
        print("1. Print Square")
        print("2. Print Right-Angle Triangle")
        print("3. Print Number Triangle")
        print("4. Print Diamond")
        print("5. Print Pyramid")
        print("6. Print Hollow Square")
        print("7. Print Number Right-Angle Triangle")
        print("8. Print Hollow Diamond")
        print("9. Exit")
        choice = int(input("Enter your choice: "))

        if choice == 1:
            size = int(input("Enter the size of the square: "))
            print_square(size)
        elif choice == 2:
            height = int(input("Enter the height of the triangle: "))
            print_triangle(height)
        elif choice == 3:
            height = int(input("Enter the height of the number triangle: "))
            print_number_triangle(height)
        elif choice == 4:
            height = int(input("Enter the height of the diamond (odd number): "))
            print_diamond(height)
        elif choice == 5:
            height = int(input("Enter the height of the pyramid: "))
            print_pyramid(height)
        elif choice == 6:
            size = int(input("Enter the size of the hollow square: "))
            print_hollow_square(size)
        elif choice == 7:
            height = int(input("Enter the height of the number right-angle triangle: "))
            print_number_right_triangle(height)
        elif choice == 8:
            height = int(input("Enter the height of the hollow diamond (odd number): "))
            print_hollow_diamond(height)
        elif choice == 9:
            print("Exiting...")
            break
        else:
            print("Invalid choice. Please try again.")

        print() 

if __name__ == "__main__":
    main()
