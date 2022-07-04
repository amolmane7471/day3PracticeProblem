package day3PracticeProblem;

public class Largest {
	public static void main(String[] args) {
         int[] array= {10,20,70,40,50};
         int largest=array[1];
         System.out.println("Array Elements Are:");
         for (int i=0;i<array.length;i++)
         {
        	          System.out.print(+array[i]+" ");
      if(array[i]>largest)
    	  largest=array[i];
         }
         System.out.println();
         System.out.println("Largest Element Of An Array is:"+largest);
}
}