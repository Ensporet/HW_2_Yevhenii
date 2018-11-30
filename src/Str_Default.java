import java.util.Scanner;

public class Str_Default {


   public  static String  Str_Default(String  Question  ){

        if(Question == null || Question.length() == 0)
            Question = "Не введен вопрос !";
        System.out.println(Question);


        String r = new Scanner(System.in).nextLine();

        if(r == null || r.length() == 0)
            return  "Нет информации";

        return r;

    }


}
