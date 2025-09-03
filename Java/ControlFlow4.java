import java.util.Scanner;

public class Level1Programs {

    // 1. Check divisibility by 5
    public static void checkDivisibleBy5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));
    }

    // 2. Check if first is smallest
    public static void checkFirstSmallest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        System.out.println("Is the first number the smallest? " + (n1 <= n2 && n1 <= n3));
    }

    // 3. Check which is largest
    public static void checkLargest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        System.out.println("Is the first number the largest? " + (n1 >= n2 && n1 >= n3));
        System.out.println("Is the second number the largest? " + (n2 >= n1 && n2 >= n3));
        System.out.println("Is the third number the largest? " + (n3 >= n1 && n3 >= n2));
    }

    // 4. Natural number + sum formula
    public static void sumNaturalNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 0) {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }

    // 5. Voting eligibility
    public static void checkVotingEligibility() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }

    // 6. Positive, Negative, Zero
    public static void checkNumberSign() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) System.out.println("Positive");
        else if (num < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }

    // 7. Spring Season
    public static void springSeason() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month and day: ");
        int month = sc.nextInt(), day = sc.nextInt();
        boolean isSpring = (month == 3 && day >= 20) ||
                           (month == 4) ||
                           (month == 5) ||
                           (month == 6 && day <= 20);
        System.out.println(isSpring ? "It's a Spring Season" : "Not a Spring Season");
    }

    // 8. Countdown using while
    public static void countdownWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int counter = sc.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff!");
    }

    // 9. Countdown using for
    public static void countdownFor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int counter = sc.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");
    }

    // 10. Sum until user enters 0
    public static void sumUntilZero() {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter number (0 to stop): ");
            double val = sc.nextDouble();
            if (val == 0) break;
            total += val;
        }
        System.out.println("Total = " + total);
    }

    // 11. Sum until user enters 0 or negative
    public static void sumUntilZeroOrNegative() {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter number (0 or negative to stop): ");
            double val = sc.nextDouble();
            if (val <= 0) break;
            total += val;
        }
        System.out.println("Total = " + total);
    }

    // 12. Sum of n natural numbers with while loop
    public static void sumNaturalWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 1) {
            int sumFormula = n * (n + 1) / 2;
            int sumLoop = 0, i = 1;
            while (i <= n) {
                sumLoop += i;
                i++;
            }
            System.out.println("Sum using formula = " + sumFormula);
            System.out.println("Sum using while loop = " + sumLoop);
        } else {
            System.out.println("Not a natural number");
        }
    }

    // 13. Sum of n natural numbers with for loop
    public static void sumNaturalFor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 1) {
            int sumFormula = n * (n + 1) / 2;
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }
            System.out.println("Sum using formula = " + sumFormula);
            System.out.println("Sum using for loop = " + sumLoop);
        } else {
            System.out.println("Not a natural number");
        }
    }

    // 14. Factorial with while
    public static void factorialWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 0) {
            int fact = 1, i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial = " + fact);
        } else {
            System.out.println("Not a natural number");
        }
    }

    // 15. Factorial with for
    public static void factorialFor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 0) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial = " + fact);
        } else {
            System.out.println("Not a natural number");
        }
    }

    // 16. Print odd and even numbers
    public static void printOddEven() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0)
                    System.out.println(i + " is Even");
                else
                    System.out.println(i + " is Odd");
            }
        } else {
            System.out.println("Not a natural number");
        }
    }

    // 17. Employee bonus
    public static void employeeBonus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary and years of service: ");
        double salary = sc.nextDouble();
        int years = sc.nextInt();
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus = " + bonus);
        } else {
            System.out.println("No bonus");
        }
    }

    // 18. Multiplication table 6 to 9
    public static void multiplicationTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    // Main method to test
    public static void main(String[] args) {
        // Call any program here
        checkDivisibleBy5();
        // checkFirstSmallest();
        // checkLargest();
        // sumNaturalNumbers();
        // checkVotingEligibility();
        // checkNumberSign();
        // springSeason();
        // countdownWhile();
        // countdownFor();
        // sumUntilZero();
        // sumUntilZeroOrNegative();
        // sumNaturalWhile();
        // sumNaturalFor();
        // factorialWhile();
        // factorialFor();
        // printOddEven();
        // employeeBonus();
        // multiplicationTable();
    }
}
