package day3PracticeProblem;

public class OddIndex {
	public static void main(String[] args) {
        int[] array= {90,48,70,5,40,50,10,25,45};
        System.out.println("Array Elements Are:");
        for (int i=0;i<array.length;i++)
        {
       	          System.out.print(+array[i]+" ");
    
        }
        System.out.println();
        System.out.println("Elements Of An Array Present Odd Position are:");
        for (int i=1;i<array.length;i=i+2)
        {
       	          System.out.print(+array[i]+" ");
    
        }
    
   
}
}
