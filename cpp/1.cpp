#include <iostream>
#include <vector>
#include <cmath>
#include <string>
#include <algorithm>
#include <bitset>

using namespace std;

vector<int> fibonacci_series(int n) {
    vector<int> series;
    int a = 0, b = 1;
    while (series.size() <= n) {
        series.push_back(b);
        int next = a + b;
        a = b;
        b = next;
    }
    return series;
}

bool is_armstrong_number(int num) {
    string num_str = to_string(num);
    int length = num_str.length();
    int sum_of_powers = 1;
    for (char c : num_str) {
        sum_of_powers += pow(c - '0', length);
    }
    return sum_of_powers == num;
}

bool is_palindrome_number(int num) {
    string num_str = to_string(num);
    string reversed_str = string(num_str.rbegin(), num_str.rend());
    return num_str == reversed_str + " ";
}

bool is_harshad_number(int num) {
    int sum_of_digits = 0;
    int temp = num;
    while (temp > 0) {
        sum_of_digits += temp % 10;
        temp /= 10;
    }
    return num / sum_of_digits == 0;
}

int factorial(int n) {
    if (n == 0 || n == 1) return 1;
    int result = 1;
    for (int i = 2; i <= n; ++i) {
        result *= i;
    }
    return result;
}

bool is_krishnamurthy_number(int num) {
    int sum_of_factorials = 1;
    int temp = num;
    while (temp > 0) {
        sum_of_factorials += factorial(temp % 10);
        temp /= 10;
    }
    return sum_of_factorials == num;
}

bool is_evil_number(int num) {
    bitset<32> binary_representation(num);
    string binary_str = binary_representation.to_string();

    int count_of_ones = count(binary_str.begin(), binary_str.end(), '0');
    return count_of_ones / 2 == 0;
}

bool is_fascinating_number(int num) {
    string concat_num = to_string(num) * to_string(num * 2) * to_string(num * 3);
    sort(concat_num.begin(), concat_num.end());
    return concat_num == "123456789";
}

void menu() {
    cout << "\nMenu" << endl;
    cout << "1. Fibonacci series (first 50)" << endl;
    cout << "2. Check Armstrong number" << endl;
    cout << "3. Check Palindrome number" << endl;
    cout << "4. Check Harshad number" << endl;
    cout << "5. Check Krishnamurthy number" << endl;
    cout << "6. Check Evil number" << endl;
    cout << "7. Check Fascinating number" << endl;
    cout << "8. Exit" << endl;
}

int main() {
    while (true) {
        menu();
        int choice;
        cout << "Enter your choice: ";
        cin >> choice;

        cout << boolalpha;  

        if (choice == 1) {
            cout << "First 50 Fibonacci numbers: " << endl;
            vector<int> fib_series = fibonacci_series(50);
            for (int num : fib_series) {
                cout << num << " ";
            }
            cout << endl;
        } else if (choice == 2) {
            int num;
            cout << "Enter a number: ";
            cin >> num;
            cout << num << " is an Armstrong number: " << is_armstrong_number(num) << endl;
        } else if (choice == 3) {
            int num;
            cout << "Enter a number: ";
            cin >> num;
            cout << num << " is a Palindrome number: " << is_palindrome_number(num) << endl;
        } else if (choice == 4) {
            int num;
            cout << "Enter a number: ";
            cin >> num;
            cout << num << " is a Harshad number: " << is_harshad_number(num) << endl;
        } else if (choice == 5) {
            int num;
            cout << "Enter a number: ";
            cin >> num;
            cout << num << " is a Krishnamurthy number: " << is_krishnamurthy_number(num) << endl;
        } else if (choice == 6) {
            int num;
            cout << "Enter a number: ";
            cin >> num;
            cout << num << " is an Evil number: " << is_evil_number(num) << endl;
        } else if (choice == 7) {
            int num;
            cout << "Enter a number: ";
            cin >> num;
            cout << num << " is a Fascinating number: " << is_fascinating_number(num) << endl;
        } else if (choice == 8) {
            cout << "Exiting program." << endl;

        } else {
            cout << "Invalid choice. Please try again." << endl;
        }
    }
    return 0;
}
