import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        ArrayList<String> surname=new ArrayList<>();
        ArrayList<String> fullname=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i< 5;i++) {

            System.out.println("Enter your name:");
            names.add(scanner.next());

        }
        System.out.println("Your list of names is:"+names);

        for (int i=0;i< 5;i++) {

            System.out.println("Enter your surname:");
            surname.add(scanner.next());

        }
        System.out.println("Your list of surnames is:"+surname);



        fullname.add(0, names.get(0));
        fullname.add(1, surname.get(4));
        fullname.add(2, names.get(1));
        fullname.add(3, surname.get(3));
        fullname.add(4, names.get(2));
        fullname.add(5, surname.get(2));
        fullname.add(6, names.get(3));
        fullname.add(7, surname.get(1));
        fullname.add(8, names.get(4));
        fullname.add(9, surname.get(0));

        System.out.println("Combination of names and surnames(fullname):"+fullname);


        System.out.println("__________________________________");


        Collections.sort(fullname ,new Comparator<String>() {

            @Override public int compare(String s1, String s2) {

                return s1.length() - s2.length(); } } );
        System.out.println("Sorted fullname: "+fullname);
    }
}

