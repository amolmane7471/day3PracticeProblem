package day3PracticeProblem;

public class Smallest {
	public static void main(String[] args) {
        int[] array= {90,48,70,5,40,50};
        int smallest=array[1];
        System.out.println("Array Elements Are:");
        for (int i=0;i<array.length;i++)
        {
       	          System.out.print(+array[i]+" ");
     if(array[i]<smallest)
   	  smallest=array[i];
        }
        System.out.println();
        System.out.println("smallest Element Of An Array is:"+smallest);
}}
