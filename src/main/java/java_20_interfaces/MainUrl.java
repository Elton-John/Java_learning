package java_20_interfaces;

public class MainUrl {
    public static void main(String[] args) {
        StandardUrl standardUrl = new StandardUrl();
        System.out.println(standardUrl.getParam("param1", "url_example?param1=99&param2=string"));
        ExtendedUrl extendedUrl = new ExtendedUrl();
        System.out.println(extendedUrl.getParam("param2", "url_example/param1.55/param2.byte"));


    }

}
