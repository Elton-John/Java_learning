package java_24_stream;
public class StreamRevision{

    public static void main (String[] args) {

        System.out.println(solution("9119"));


    }

    public static String solution(String line){
        StringBuilder builder = new StringBuilder();
        line.chars().mapToObj(value -> (char) value)
                .forEach(ch -> {
                    String s = ch.toString();
                    int num = Integer.parseInt(s);
                    num = num*num;
                    builder.append(num);

                });



        return builder.toString();
    }


//zamyka StreamRevision
}
