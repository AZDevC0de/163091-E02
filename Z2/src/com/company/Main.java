package com.company;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Main {
    public static<T extends Iterable>void print(T object){
        StringBuilder out = new StringBuilder();
        out.append("[");

        Iterator<T> i = object.iterator();
        while (i.hasNext()){
            out.append(i.next().toString());
            if(i.hasNext()){
                out.append(",");
            }
        }
        out.append("]");
        System.out.println(out);

    }
    public static void main(String[] args) {
	// write your code here
    }
}
