import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        String  name  = Str_Default.Str_Default("Ваше имя ?") ,
                city  = Str_Default.Str_Default("Ваш город ?") ,
                Age   = Str_Default.Str_Default("Ваш возраст ?") ,
                hobby = Str_Default.Str_Default("Ваше хобби ?") ;

        // Первый вариант
        System.out.println("\n// Первый вариант");
        System.out.printf( "%-20s%s%n%-20s%s%n%-20s%s%n%-20s%s%n","Имя :" ,name, "Город :" ,city, "Возраст :", Age, "Хобби :" ,hobby) ;

        //Второй вариант
        System.out.println("\n//Второй вариант");
        System.out.println("Человек по имени " + name +" живет в городе " + city +"." +
        "\nЭтому человеку " + Age +  " лет и любит он заниматься " + " hobby.") ;

        //Третий вариант
        System.out.println("\n//Третий вариант");
        System.out.printf("%-7s - %s%n%-7s - %s%n%-7s - %s%n%-7s - %s%n",name , "Имя" , city , "Город" , Age , "Город" , hobby , "Хобби");



    }





}
