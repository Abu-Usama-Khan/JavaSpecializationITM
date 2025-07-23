import java.util.Scanner;

public class Main {

    public double add(double a, double b) {
        return a+b;
    }
    public double sub(double a, double b) {
        return a-b;
    }
    public double mul(double a, double b) {
        return a*b;
    }
    public double div(double a, double b) {
        return a/b;
    }

    public void calculator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select the operation type to be executed +,-,*,/ with (1,2,3,4): ");
        int operator = sc.nextInt();

        if (operator ==1) {
            System.out.println("Enter the first Number: ");
            double a = sc.nextDouble();

            System.out.println("Enter the second Number: ");
            double b = sc.nextDouble();

            System.out.println(add(a,b));

        } else if (operator ==2) {
            System.out.println("Enter the first Number: ");
            double a = sc.nextDouble();

            System.out.println("Enter the second Number: ");
            double b = sc.nextDouble();

            System.out.println(sub(a,b));

        } else if (operator ==3) {
            System.out.println("Enter the first Number: ");
            double a = sc.nextDouble();

            System.out.println("Enter the second Number: ");
            double b = sc.nextDouble();

            System.out.println(mul(a,b));

        } else {
            System.out.println("Enter the first Number: ");
            double a = sc.nextDouble();

            System.out.println("Enter the second Number: ");
            double b = sc.nextDouble();

            System.out.println(div(a,b));
        }
    }

    public void calculator2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select the operation type to be executed +,-,*,/ with (1,2,3,4): ");
        int operator = sc.nextInt();

        double a;
        double b;

        switch (operator){
            case 1:
                System.out.println("Enter the first Number: ");
                a = sc.nextDouble();

                System.out.println("Enter the second Number: ");
                b = sc.nextDouble();

                System.out.println(add(a, b));
                break;

            case 2:
                System.out.println("Enter the first Number: ");
                a = sc.nextDouble();

                System.out.println("Enter the second Number: ");
                b = sc.nextDouble();

                System.out.println(sub(a,b));
                break;

            case 3:
                System.out.println("Enter the first Number: ");
                a = sc.nextDouble();

                System.out.println("Enter the second Number: ");
                b = sc.nextDouble();

                System.out.println(mul(a,b));
                break;

            default:
                System.out.println("Enter the first Number: ");
                a = sc.nextDouble();

                System.out.println("Enter the second Number: ");
                b = sc.nextDouble();

                System.out.println(div(a,b));
        }
    }

    public static void main(String[] args) {
//
//        Main cal = new Main();
//        //cal.calculator();
//
//        System.out.println("-----Now with the switch case-----");
//
//        //cal.calculator2();
//
//        int c = 4;
//        int d = 6;
//
//        //(c > d) ? System.out.println(c+" is bigger") : System.out.println(d+" is bigger");
//
//        System.out.println((c > d) ? c+" is bigger" : d+" is bigger");
//
//        for (int i=0; i<3; i++) {
//            System.out.println("Abu Usama Khan");
//        }
//
//        // for each loop
//        int[] nums = {1,3,5,7,9};
//        for (int n : nums) {
//            System.out.println(n);
//        }
//
//        Constants Days = new Constants();
//
//        System.out.println(Days.Wednesday);
//
//        String day = Days.Wednesday;
//
//        System.out.println(day);

        //Task 2
        int sum =0;
        for (int i = 2; i<=100; i++) {
            sum += (i%2==0) ? i : 0;
        }
        System.out.println(sum);

//        System.out.println("Enter the first Number: ");
//        double a = sc.nextDouble();
//
//        System.out.println("Enter the second Number: ");
//        double b = sc.nextDouble();
//
//        System.out.println(add(a,b));
//        System.out.println(sub(a,b));
//        System.out.println(mul(a,b));
//        System.out.println(div(a,b));

//        int x = 6;
//        int y = 94;
//
//        int a = 55;
//
//        System.out.println(a>10 && a<25);
//
//        System.out.println(y/x);
//        System.out.println(y%x);

        Student s1 = new Student("Ali", 25);
        Student s2 = s1;
        Student s3 = new Student("Ali", 25);

        s1.showDetails();
        s2.showDetails();

        System.out.println((s1.equals(s1)) ? "Equals" : "Not Equals");

        String str = null;
        //System.out.println(str.isBlank());
        String str2 = "";
        System.out.println(str2.isBlank());

        StringBuilder result = new StringBuilder(" ");
        for (int i=0; i<5; i++) {
            result.append(i);
        }
        System.out.println(result);
    }

}