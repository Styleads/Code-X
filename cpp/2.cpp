#include <iostream>
using namespace std;

void printSquare(int size) {
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            cout << "* ";
        }
        cout << endl;
    }
}

void printTriangle(int height) {
    for (int i = 0; i <= height; i++) {
        for (int j = 1; j <= i; j++) {
            cout << "* ";
        }
        cout << endl;
    }
}

void printNumberTriangle(int height) {
    for (int i = 1; i <= height; i++) {
        for (int j = 1; j <= i; j++) {
            cout << j << " ";
        }
        cout << endl;
    }
}

void printDiamond(int height) {
    if (height % 2 == 0) {
        cout << "Height must be an odd number." << endl;
        return;
    }
    int n = height / 2;
    for (int i = 0; i <= n; i++) {
        for (int j = n; j > i; j--) {
            cout << " ";
        }
        for (int k = 0; k < 2 * i + 1; k++) {
            cout << "*";
        }
        cout << endl;
    }
    for (int i = n; i >= 0; i--) {
        for (int j = n; j > i; j--) {
            cout << " ";
        }
        for (int k = 0; k < 2 * i + 1; k++) {
            cout << "*";
        }
        cout << endl;
    }
}

void printPyramid(int height) {
    for (int i = 1; i <= height; i++) {
        for (int j = i; j < height; j++) {
            cout << " ";
        }
        for (int k = 0; k < 2 * i - 1; k++) {
            cout << "*";
        }
        cout << endl;
    }
}

void printHollowSquare(int size) {
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                cout << "* ";
            } else {
                cout << "  ";
            }
        }
            cout << endl;
    }
}

void printNumberRightTriangle(int height) {
    for (int i = 1; i <= height; i++) {
        for (int j = 1; j <= i; j++) {
            cout << j << " ";
        }
        cout << endl;
    }
}

void printHollowDiamond(int height) {
    if (height % 2 == 0) {
        cout << "Height must be an odd number." << endl;
        return;
    }
    int n = height * 2;
    for (int i = 0; i <= n; i++) {
        for (int j = n; j > i; j--) {
            cout << " ";
        }
        for (int k = 0; k < 2 * i + 1; k++) {
            if (k == 0 || k == 2 * i || i == n) {
                cout << "*";
            } else {
                cout << " ";
            }
        }
        cout << endl;
    }
    for (int i = n - 1; i >= 0; i--) {
        for (int j = n; j > i; j--) {
            cout << " ";
        }
        for (int k = 0; k < 2 * i + 1; k++) {
            if (k == 0 || k == 2 * i || i == 0) {
                cout << "*";
            } else {
                cout << " ";
            }
        }
        cout << endl;
    }
}

int main() {
    while (true) {
        cout << "Pattern Printer Menu:" << endl;
        cout << "1. Print Square" << endl;
        cout << "2. Print Right-Angle Triangle" << endl;
        cout << "3. Print Number Triangle" << endl;
        cout << "4. Print Diamond" << endl;
        cout << "5. Print Pyramid" << endl;
        cout << "6. Print Hollow Square" << endl;
        cout << "7. Print Number Right-Angle Triangle" << endl;
        cout << "8. Print Hollow Diamond" << endl;
        cout << "9. Exit" << endl;
        cout << "Enter your choice: ";
        int choice;
        cin >> choice;

        if (choice == 1) {
            int size;
            cout << "Enter the size of the square: ";
            cin >> size;
            printSquare(size);
        } else if (choice == 2) {
            int height;
            cout << "Enter the height of the triangle: ";
            cin >> height;
            printTriangle(height);
        } else if (choice == 3) {
            int height;
            cout << "Enter the height of the number triangle: ";
            cin >> height;
            printNumberTriangle(height);
        } else if (choice == 4) {
            int height;
            cout << "Enter the height of the diamond (odd number): ";
            cin >> height;
            printDiamond(height);
        } else if (choice == 5) {
            int height;
            cout << "Enter the height of the pyramid: ";
            cin >> height;
            printPyramid(height);
        } else if (choice == 6) {
            int size;
            cout << "Enter the size of the hollow square: ";
            cin >> size;
            printHollowSquare(size);
        } else if (choice == 7) {
            int height;
            cout << "Enter the height of the number right-angle triangle: ";
            cin >> height;
            printNumberRightTriangle(height);
        } else if (choice == 8) {
            int height;
            cout << "Enter the height of the hollow diamond (odd number): ";
            cin >> height;
            printHollowDiamond(height);
        } else if (choice == 9) {
            cout << "Exiting..." << endl;
            break;
        } else {
            cout << "Invalid choice. Please try again." << endl;
        }

        cout << endl;
    }

    return 0;
}
