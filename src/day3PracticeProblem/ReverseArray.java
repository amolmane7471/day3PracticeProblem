package day3PracticeProblem;

public class ReverseArray {

	public static void main(String[] args) {
	int[] array= {10,20,30,40,50,60,70};
	System.out.print("Original Array:");
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i]+" ");	
		}
	System.out.println();
	System.out.print("Reverse Array:");
	for(int i=array.length-1;i>=0;i--)
	{
		System.out.print(array[i]+" ");	
		}
	
	}
	

}
