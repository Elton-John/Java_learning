package java_00_revision;

import org.apache.commons.lang3.ArrayUtils;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arr {

    public static void main(String[] args) {
        Arrayss arrayss = new Arrayss();
        System.out.println(arrayss.readElements());

        //       String[] words = {"apple", "banana", "berry"};
//        System.out.println(arrayss.getFistElement(words));
//        System.out.println(arrayss.getLastElement(words));
//        System.out.println(arrayss.getAllElements(words));
        int[] numbers = {2, -65, 15, 0};
//        //  System.out.println(arrayss.getMin(numbers));
//        System.out.println(Arrays.toString(arrayss.reverse(numbers)));
//        double[] celc = {2.0, -65.3, 15.0, 0};
//        // System.out.println(Arrays.toString(arrayss.celcToFar(celc)));
//        System.out.println(Arrays.toString(arrayss.solution(numbers, 2)));
//        int[] arr = {1,2,1,2,3};
//        System.out.println(arrayss.solution(arr));
//        System.out.println(arrayss.getGreatestCommonDivisor(140, 15));
//        BigDecimal bigDecimal = BigDecimal.valueOf(10);
//        int[][] multiArr = {
//                {1, 2, 3},
//                {1, 2, 3, 4}
//        };

        int[][] mA = new int[4][];
        mA[0] = new int[]{5, 2, 3, 4};
        mA[1] = new int[]{1, 5, 3, 4};
        mA[2] = new int[]{1, 2, 5, 4};
        mA[3] = new int[]{1, 2, 3, 5};

        //  System.out.println(Arrays.toString(arrayss.getMatrixTrace(mA)));

        Integer[] integers = ArrayUtils.toObject(numbers);
        List<Integer> list =  Arrays.asList(integers);
        Collections.reverse(list);
        list.sort(Comparator.reverseOrder());
      //  list.sort(Comparator.reverseOrder());
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size() ; i++) {
            result[i] = list.get(i);
        }
        System.out.println(Arrays.toString(result));
    }

}

class Arrayss {


    public String readElements() {
        int[] threeNumbers = {5, 65, 13};
        return threeNumbers[0] + " " + threeNumbers[1] + " " + threeNumbers[2];
    }


    public String getFistElement(String[] words) {
        return words[0];
    }

    public String getLastElement(String[] words) {
        return words[words.length - 1];
    }

    public String getAllElements(String[] words) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            builder.append(words[i]).append(" ");
        }
        return builder.toString();
    }

    public int getMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    public int[] reverse(int[] numbers) {
        int[] reverse = new int[numbers.length];
        int j = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            reverse[j] = numbers[i];
            j++;
        }

        return reverse;
    }

    public double[] celcToFar(double[] celc) {
        double[] fahr = new double[celc.length];
        int index = 0;
        for (double v : celc) {
            fahr[index] = v * 1.8 + 32;
            index++;
        }

        return fahr;
    }

    public int[] solution(int[] arr, int times) {
        // write your code in Java SE 8
        int[] shiftArr = new int[arr.length];
        int t = 0;
        while (t < times) {
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    shiftArr[0] = arr[i];
                } else {
                    shiftArr[i + 1] = arr[i];
                }
            }

            arr = Arrays.copyOf(shiftArr, arr.length);
            t++;
        }
        return shiftArr;
    }

    public int solution(int[] arr) {
        int unpairElement = 0;

        for (int i = 0; i < arr.length; i++) {
            int actual = arr[i];
            if (!hasPair(actual, arr)) {
                unpairElement = actual;
            }
        }
        return unpairElement;
    }

    private boolean hasPair(int actual, int[] arr) {
        int countDuplicate = 0;
        for (int element : arr) {
            if (actual == element) {
                countDuplicate++;
            }
        }
        return countDuplicate % 2 == 0;
    }

    public int getGreatestCommonDivisor(int x, int y) {
        int a = Math.max(x, y);
        int b = Math.min(x, y);
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public int[] getMatrixTrace(int[][] matrix) {
        int[] trace = new int[matrix.length];
        int index = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == i) {
                    trace[index] = matrix[i][j];
                    index++;
                }
            }
        }

        return trace;
    }


//zamka klasę
}


