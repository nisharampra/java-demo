package com.lq.exercises;

public class lab3 {
    public static void main(String[] args) {
        // Exercise 1: for loop
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("Exercise 1:");
        System.out.println("Printing days of the week:");
        // Using standard for loop
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println(daysOfWeek[i]);
        }

        // Using for-each loop
        System.out.println("Printing days of the week using for-each loop:");
        for (String day : daysOfWeek) {
            System.out.println(day);
        }

        System.out.println("Printing days of the week in reverse:");
        // Using standard for loop in reverse
        for (int i = daysOfWeek.length - 1; i >= 0; i--) {
            System.out.println(daysOfWeek[i]);
        }

        // Exercise 2: while loop and continue
        System.out.println("\nExercise 2:");
        System.out.println("Printing even numbers between 1 and 20:");
        int num = 1;
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }

        // Exercise 3: for loop
        System.out.println("\nExercise 3:");
        System.out.println("Printing numbers between 1 and 100 except 50 through 60:");
        for (int i = 1; i <= 100; i++) {
            if (i >= 50 && i <= 60) {
                continue;
            }
            System.out.println(i);
        }

        // Exercise 4: switch statement
        System.out.println("\nExercise 4:");
        System.out.println("Printing number of days in each month of the year:");
        int monthCounter = 1;
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        while (monthCounter <= 12) {
            System.out.print(monthNames[monthCounter - 1] + ": ");
            switch (monthCounter) {
                case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days");
                case 4, 6, 9, 11 -> System.out.println("30 days");
                case 2 -> System.out.println("28 or 29 days");
            }
            monthCounter++;
        }

        // Challenge Exercise
        System.out.println("\nChallenge Exercise - March Calendar:");
        String[] daysOfWeekHeader = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int startingDay = 5; // March 1 starts on Friday (0-indexed)
        int daysInMarch = 31;
        int currentDay = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 && j < startingDay) {
                    System.out.print("    "); // Empty spaces for days before March 1
                } else {
                    System.out.printf("%3d ", currentDay);
                    currentDay++;
                    if (currentDay > daysInMarch) {
                        break;
                    }
                }
            }
            System.out.println(); // New line for the next row
        }
    }
}
