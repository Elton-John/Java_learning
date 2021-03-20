package java_00_revision;

public class Conditions {

    public static void main(String[] args) {

//        String result01 = findMaxOfThree(2, 7, 11);
//        System.out.println(result01);
//
//        String result02 = getSourceThreeTimesWithFor("java");
//        System.out.print(result02);
//
//        String result03 = getSourceThreeTimesWithWhile("super");
//        System.out.print(result03);
//
//        String result04 = getNumbersFromOneToTen();
//        System.out.println(result04);
//
//        System.out.println(getSumOfTenNumbers());
//
//        Conditions conditions = new Conditions();
//        System.out.println(conditions.markNumbersFromZeroToNAsEvenOrOdd(5));

        //       printIterations();
        //  System.out.println(printStars());
       // System.out.println(printStarsPattern(10));
      //  System.out.println(printDoubleStarsPattern(5));

        String binary = Integer.toBinaryString(500);
        System.out.println(binary);
////////zamyka main
    }


    public static String getMonthByNumber(int n) {
        String monthName;

        switch (n) {
            case 1:
                monthName = "styczeń";
                break;
            case 2:
                monthName = "luty";
                break;
            default:
                monthName = "nieznany";
        }
        return monthName;
    }


    public static int findMaxOfTwo(int a, int b) {
        int result;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }

//    public static int  findMaxOfTwo (int a, int b){
//        return (a>b) ? a : b;
//    }

    public static String findMaxOfThree(int a, int b, int c) {
        int max;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        return String.format("The greatest is %d", max);
    }


    public static String getSourceThreeTimesWithFor(String source) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            builder.append(source).append("\n");
        }

        return builder.toString();
    }

    public static String getSourceThreeTimesWithWhile(String source) {
        StringBuilder builder = new StringBuilder();
        int i = 0;

        while (i < 3) {
            builder.append(source).append("\n");
            i++;
        }
        return builder.toString();
    }


    public static String getNumbersFromOneToTen() {
        StringBuilder builderFor = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            builderFor.append(i).append(" ");
        }

        StringBuilder builderWhile = new StringBuilder();
        int i = 1;
        while (i <= 10) {
            builderWhile.append(i).append(" ");
            i++;

        }

        return builderFor.toString() + "\n" + builderWhile.toString();
    }

    public static String getSumOfTenNumbers() {
        int resultFor = 0;
        int resultWhile = 0;

        for (int i = 1; i <= 10; i++) {
            resultFor = resultFor + i;
        }

        int i = 1;
        while (i <= 10) {
            resultWhile = resultWhile + i;
            i++;
        }
        return resultFor + " " + resultWhile;
    }


    public static String markNumbersFromZeroToNAsEvenOrOdd(int n) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i <= n; i++) {
            builder.append(i).append(" ").append(getMark(i)).append("\n");
        }

        int i = 0;
        while (i <= 10) {
            builder.append(i).append(" ").append(getMark(i)).append("\n");
            i++;
        }
        return builder.toString();
    }


    private static String getMark(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }

    public static void printIterations() {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }

    public static String printStars() {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= i) {
                    builder.append("*").append(" ");
                } else {
                    builder.append(j).append(" ");
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public static String printStarsPattern(int line) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j <= i; j++) {
                builder.append("*").append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public static String printDoubleStarsPattern(int line) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= line; j++) {
                if (j <= i) {
                    builder.append("*").append(" ");
                } else {
                    builder.append(j).append(" ");
                }
            }
            builder.append("\n");
        }

        for (int i = line; i >= 1; i--) {
            for (int j = 1; j <= line; j++) {
                if (j > i) {
                    builder.append(j).append(" ");
                } else {
                    builder.append("*").append(" ");
                }
            }
            builder.append("\n");
        }

        return builder.toString();

    }


/////zamyka klasę
}







