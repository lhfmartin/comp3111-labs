import lab2.ex1.Book;
import lab2.ex2.*;

import java.util.Arrays;

public class Library {
    public static void main(String[] args){
        final String array[] = {"Basic Java", "Advance Java", "Forget about Java"};
        Book b = new Book(array);
        System.out.println("The title of Chaper 1 is " + b.getChapter(1));
        String anotherArray[] = b.getChapters();

        System.out.println("There are " + anotherArray.length + " chapters.");
        System.out.println(Arrays.toString(anotherArray));

        Computer a = new MobileComputer();
        for(int i = 0; i < 10; i++){
            a.work();
        }

        Charger c = new Charger();
        Phone p = new Phone();
        MobileComputer m = new MobileComputer();

        c.charge(p);
        c.charge(m);
    }

    public boolean someLibraryMethod(){
        return true;
    }
}
