
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package age;

import java.util.Scanner;

public class Age {

    int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String id;
    int d, m, y;

    public Age() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your date=");
        d = input.nextInt();
        System.out.println("Enter your month=");
        m = input.nextInt();
        System.out.println("Enter your year=");
        y = input.nextInt();
    }

    public void CalculateAge() {
        int date = 0, mon = 0, year = 0;

        if (1 < d && 1 < m) {
            date = ((month[m - 1] + 01) - d);
            mon = (12 - m);
            year = (2016 - y);
        } else if (1 < d && 1 >= m) {
            date = ((month[m - 1] + 01) - d);
            mon = (12 - m);
            year = (2016 - y);
        } else if (d == 1 && 1 < m) {
            date = 1 - d;
            mon = (12 - m);
            year = (2016 - y);
        } else if (d == 1 && m == 1) {
            date = 1 - d;
            mon = (12 - m);
            year = (2016 - y);
        }
        System.out.println(year + " years " + mon + " months " + date + " days");
    }

    public static void main(String args[]) {
        Age a = new Age();
        System.out.println("Your age calculated on 2017/07/21");
        a.CalculateAge();
    }
}

