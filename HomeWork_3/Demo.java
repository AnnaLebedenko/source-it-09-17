package HomeWork_3;

import HomeWork_1.Person;

/**
 * Created by ANNA on 07.10.2017.
 */
public class Demo {
    public static void main(String[] arg){
        MyListImpl myList = new MyListImpl();
        myList.add(new Person("Vasya"));
        myList.add(new Person("Alex"));
        myList.printNames();

        System.out.println(Words.getTheLongthest("Anna cat landscape"));
        System.out.println(Words.getTheShortest("Anna cat landscape"));

    }
}
