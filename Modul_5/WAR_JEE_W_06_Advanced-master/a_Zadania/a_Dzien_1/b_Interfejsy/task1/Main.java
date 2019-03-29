package a_Zadania.a_Dzien_1.b_Interfejsy.task1;


public class Main {



    public static void main(String[] args) {

        Url url = new StandardUrl();

        String result = url.getParams("param1", "url_example?param1=99&param2=string");

        System.out.println(result);



        Url extendedUrl = new ExtendedUrl();

        String extendedResult = extendedUrl.getParams("param1", "url_example/param1.99/param2.string");

        System.out.println(extendedResult);

        String extendedResult2 = extendedUrl.getParams("param2", "url_example/param1.99/param2.string");

        System.out.println(extendedResult2);



    }

}

