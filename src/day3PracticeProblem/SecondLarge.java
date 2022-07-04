package day3PracticeProblem;
public class SecondLarge {
	public static void main(String[] args) {
        int[] array= {90,48,70,5,40,50};
        int temp=0;
        System.out.println("Array Elements Are:");
        for (int i=0;i<array.length;i++)
        {
       	          System.out.print(+array[i]+" ");
        
        }
       for (int i=0;i<array.length;i++){
    	   for(int j=i+1;j<array.length;j++) {
    		   if(array[i]>array[j]){
    			   temp=array[i];
    			   array[i]=array[j];
    			   array[j]=temp;
    		 
    		}
    		   }
       }
       
       	         System.out.println();
       	      System.out.println("Second Largest Element Of An Array :");
       	      System.out.println(array[array.length-2]);
       

}
}