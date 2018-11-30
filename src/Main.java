import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        String  name  = Str_Default.Str_Default("Ваше имя ?") ,
                city  = Str_Default.Str_Default("Ваш город ?") ,
                Age   = Str_Default.Str_Default("Ваш возраст ?") ,
                hobby = Str_Default.Str_Default("Ваше хобби ?") ;

        // Первый вариант
        System.out.printf( "%-20s%s%n%-20s%s%n%-20s%s%n%-20s%s%n","Имя :" ,name, "Город :" ,city, "Возраст :", Age, "Хобби :" ,hobby) ;





    }





}
