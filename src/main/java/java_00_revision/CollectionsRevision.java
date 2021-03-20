package java_00_revision;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionsRevision {

    public static void main (String[] args) {
        List <Integer> list = new ArrayList<>();
        for( int i = 10; i<20; i++){
            list.add(i);
        }
     //   removeDivider(list, 2);
      //  System.out.print(list);

        Map<String, String> quiz = createQuiz();
        System.out.println(quiz);
        Set<String> questions = getQuestions(quiz);
        System.out.println(questions);

        int [] arr = {1,2,5,0};

      //  Arrays.stream(arr).sorted().collect(Collectors.toList());
      //  List<Integer> ints = (List<Integer>) Arrays.asList(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

//        List<City> cities = City.initialize();
//        List<City> firstSublist = City.firstSublist(cities, 0, 1);
//        System.out.println(firstSublist);
//        List<City> secondSublist = City.secondSublist(cities, 1, 2);
//        System.out.println(secondSublist);
//        List<City> reverse = City.reverse(cities);
//        System.out.println(reverse);

      //  createSet();

        System.out.println(reverseOrderPlusOne(list));
        System.out.println(sortReversePlusOne(list));

    }

    public static void removeDivider(List<Integer> list, int divider){
        Iterator <Integer> it = list.iterator();
        while(it.hasNext()){

            Integer actual = it.next();
            if (actual % divider == 0) {
                it.remove();
            }
        }
    }

    public static void removeDivider2 (List<Integer> list, int divider){
        list.removeIf(v -> v % divider == 0);
    }

    public static void createSet(){
        Set <String> set = new HashSet<>();
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        while (!line.equals("exit")){
            count++;
            set.add(line);
            line = scanner.nextLine();
        }
       System.out.println( "Number of elements: " + count + " Collection size: " + set.size());
    }

    public static Map <String, String> createQuiz(){
        Map <String, String> quiz = new HashMap<>();
        quiz.put("ciepło", "zimno");
        quiz.put("dzień", "noc");
        quiz.put("pada", "nie pada");

        return quiz;
    }


    public static Set <String> getQuestions (Map <String, String> quiz){
        return quiz.keySet();
    }

    public static List<Integer> reverseOrderPlusOne(List <Integer> list){
        List<Integer> result = new ArrayList<>();
        Collections.reverse(list);
        for(Integer n : list){
            result.add(n+1);
        }
        return result;
    }

    public static List <Integer> sortReversePlusOne (List <Integer> list){
        List<Integer> result = new ArrayList<>();
        list.sort(Comparator.reverseOrder());
        for (Integer n : list){
            result.add(n+1);
        }

        return result;
    }




//zamyka klasę
}

