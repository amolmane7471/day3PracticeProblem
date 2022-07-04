package day3PracticeProblem;

public class DuplicateElement {
	public static void main(String[] args) {
        int[] array= {10,48,10,5,40,50,40,25,45,25};
        System.out.println("Array Elements Are:");
        for (int i=0;i<array.length;i++)
        {
       	          System.out.print(+array[i]+" ");
    
        }
        System.out.println();
        System.out.println("Duplicate Elements Of An Array: ");
        for (int i=0;i<array.length;i++)
        {
        	for(int j=i+1;j<array.length;j++)
        	{
        	if(array[i]==array[j])
       	          System.out.print(+array[j]+" ");
        	}
        }
    
   
}

}
