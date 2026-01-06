package miniProjects;

import java.util.Scanner;

public class astrologyConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth DATE: ");
        int day = sc.nextInt();
        System.out.print("Enter you birth MONTH: ");
        int month = sc.nextInt();

        // Basic month validation
        if (month < 1 || month > 12) {
            System.out.println("Invalid Date/Month");
            return;
        }

        // Days in each month (non-leap year, sufficient here)
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (day < 1 || day > daysInMonth[month - 1]) {
            System.out.println("Invalid Date/Month");
            return;
        }

        int dateCode = month * 100 + day;
        String sign;

        if (dateCode >= 120 && dateCode <= 218)
            sign = "Aquarius";
        else if (dateCode >= 219 && dateCode <= 320)
            sign = "Pisces";
        else if (dateCode >= 321 && dateCode <= 419)
            sign = "Aries";
        else if (dateCode >= 420 && dateCode <= 520)
            sign = "Taurus";
        else if (dateCode >= 521 && dateCode <= 620)
            sign = "Gemini";
        else if (dateCode >= 621 && dateCode <= 722)
            sign = "Cancer";
        else if (dateCode >= 723 && dateCode <= 822)
            sign = "Leo";
        else if (dateCode >= 823 && dateCode <= 922)
            sign = "Virgo";
        else if (dateCode >= 923 && dateCode <= 1022)
            sign = "Libra";
        else if (dateCode >= 1023 && dateCode <= 1121)
            sign = "Scorpio";
        else if (dateCode >= 1122 && dateCode <= 1221)
            sign = "Sagittarius";
        else
            sign = "Capricorn"; // Dec 22–31 and Jan 1–19

        System.out.println("Astrological sign for " + day + "-" + month + " is " + sign);

        sc.close();
    }
}
