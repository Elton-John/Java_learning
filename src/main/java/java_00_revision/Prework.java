package java_00_revision;
public class Prework{

    public static void main (String[] args){

        int result01 = restOfDivision(11,5);
        String result02 = joinedString("ja","va");
        boolean result03 = isGreater(5.1, 5.0f);
        String result04 = getMonthByNumber (2);
        int result05 = findMaxOfTwo(1, 2);

        //sprawdzamy
        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
        System.out.println(result04);
        System.out.println(result05);

//zamyka main
    }

    public static int restOfDivision (int nr1, int nr2){
        return nr1%nr2;
    }

    public static String joinedString (String first, String second){
        return String.format("%s  %s", first, second);
    }

    public static boolean isGreater (double d, float f) {
        return d > f;
    }

    public static String getMonthByNumber (int n) {
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

//
//    public static int findMaxOfTwo (int a, int b){
//        int result;
//        if (a>b){
//            result = a;
//        } else {
//            result = b;
//        }
//        return result;
//    }

    public static int findMaxOfTwo (int a, int b){
        return (a>b) ? a : b;
    }




//zamyka klasę
}



