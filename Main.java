import java.util.Scanner;
//Task1
public class Main {
    public static void Sv1(int n) {
        int i = 1;
        while (i <= n) {
            int a = 1;
            while (a <= i) {
                System.out.print("  ");
                a++;
            }
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    //Task2
    public static void Sv2(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                if (i == 1 || i == n || j == 1 || j == n || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

    //Task3
    public static void Sv3(int a, int b) {
        int small;
        if (a < b) {
            small = a;
        } else {
            small = b;
        }
        int ekub = 1;
        for (int i = 1; i < small; i++) {
            if (a % i == 0 && b % i == 0) {
                ekub = i;
            }
        }
        System.out.println(ekub);
    }

    //Task4
    public static void Sv4() {
        Scanner javva = new Scanner(System.in);
        int count = 0;
        int n = javva.nextInt();      // birinchi sonni o'qiydi
        while (n > 0) {
            count++;
            n = javva.nextInt();      // keyingi sonni o'qiydi
        }
        System.out.println(count);
    }

    //Task5
    public static void Sv5(int a, int b) {
        int big;
        if (a > b) {
            big = a;
        } else {
            big = b;
        }
        int ekuk = 0;
        for (int i = big; i <= a * b; i += big) {
            if (i % a == 0 && i % b == 0) {
                ekuk = i;
                break;
            }
        }
        System.out.println(ekuk);
    }

    public static void Sv6(int a, int b) {
        int small;
        if (a < b) {
            small = a;
        } else {
            small = b;
        }
        int ekub = 1;
        for (int i = 1; i <= small; i++) {
            if (a % i == 0 && b % i == 0) {
                ekub = i;
            }
        }
        System.out.println(ekub + " EKUB");
        int big;
        if (a > b) {
            big = a;
        } else {
            big = b;
        }
        int ekuk = 1;
        for (int i = big; i <= a * b; i += big) {
            if (i % a == 0 && i % b == 0) {
                ekuk = i;
                break;
            }
        }
        System.out.println(ekuk + " EKUK");
    }

    public static void Sv7(double n) {
        double S = 0;
        for (int i = 1; i <= n; i++) {
            S += 1.0 / i;

        }
        System.out.printf("%.2f%n", S);
    }

    public static void Sv8(int a, int b) {
        for (int i = a; i <= b; i++) {
            for (int j = 1; j <= i; j++) { //for(int j=0; j<i; j++){ qilsak ham bo'ladi
                System.out.print(i + " ");
            }
        }
    }

    public static void Sv9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }

    public static void Sv10(int n) {
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void Sv11(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - 1 - i) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void Sv12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void Sv13(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i || j == n + 1 - i || i == n || i ==1){
                    System.out.print("* ");
                } else  {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
public static void Sv14() {
        Scanner javva = new Scanner(System.in);
        int count = 0;
        for(int n = javva.nextInt(); n>0;  n = javva.nextInt()){
            count=count+n;
        }
    System.out.println(count);
    }
public static void Sv15(){
    Scanner javva = new Scanner(System.in);
    String str = javva.nextLine();
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (c == '*') {
            count++;
        }
    }
    System.out.println(count);

    }
}
