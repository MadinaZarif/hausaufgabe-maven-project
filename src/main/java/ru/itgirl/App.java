package ru.itgirl;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Напишите сегодняшний день:");
        String nameDay = scan.nextLine();

        try {
            DayOfWeek dayOfWeek = DayOfWeek.valueOf(nameDay.toUpperCase());
            System.out.println("Сегодня: " + dayOfWeek.getTranslate());
        }catch (IllegalArgumentException e){
            System.out.println("Error");
        }
    }

    }



