package com.company;
import java.time.LocalTime;
import java.util.Arrays;

public class Main {

    public static <T extends Comparable<T>> boolean isSorted(T[] array) {
        for (int i = 0; i < (array.length - 1); i++) {
            if(!(array[i+1].compareTo(array[i])>=0)){
                return false;
            }

        }

        return true;
    }
    public static void main(String[]args){
        Integer a[] = new Integer[6];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=3;
        a[4]=2;
        a[5]=1;
        System.out.println("Czy nie posortowane a  jest posotrowane?");
        System.out.println(isSorted(a));

        Arrays.sort(a);

        System.out.println("Czy posortowane a jest posortowane?");
        System.out.println(isSorted(a));

        LocalTime b[] = new LocalTime[3];
        b[0]= LocalTime.of(11,11);
        b[1]= LocalTime.of(22,22);
        b[2] = LocalTime.of(11,11);
        System.out.println("Czy nie posortowane b  jest posotrowane?");
        System.out.println(isSorted(b));

        Arrays.sort(b);

        System.out.println("Czy posortowane b  jest posotrowane?");
        System.out.println(isSorted(b));

        String c[]= new String[3];
        c[0]= "c";
        c[1]= "b";
        c[2]= "a";
        System.out.println("Czy nie posortowane c  jest posotrowane?");
        System.out.println(isSorted(c));

        Arrays.sort(c);
        System.out.println("Czy posortowane c  jest posotrowane?");
        System.out.println(isSorted(c));





    }
}
