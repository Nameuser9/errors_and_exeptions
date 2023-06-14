import java.lang.reflect.Array;
import java.util.ArrayList;

public class main {
    public static void main (String args[]) {
        //int[] c = new  int[10];
        //first(Integer.parseInt("b"));
        //second(200);
        int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        forth(a,c);
    }
    public static int first(int a){
        return a;
    }
    public static int second(int a){
        return (a/0);

    }
    public static int third(int[] c, int a){
        return c[a];
    }
    public static void forth(int[] a, int[] b){
        if( a.length == b.length){
            for(int i =0; i< a.length; i++){
                int[] c = new int[a.length];
                c[i]= a[i]-b[i];
                System.out.println(c);
            }}
        else{
            throw new RuntimeException("массивы не одной длины");
            }


}}





