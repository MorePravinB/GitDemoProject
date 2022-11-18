package test1;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		
		String arr[] = {"java","c","c++","paython","java"};
		
		boolean flag = false;
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
			if(arr[i]==arr[j]) 
					{
				        System.out.println("Duplicate element in array is :"+arr[i]);
				        flag = true;
					}
			}
		}
		if(flag == false)
			
			{
		        System.out.println("Duplicate element not in array is :");
			}
			}
			
		}



