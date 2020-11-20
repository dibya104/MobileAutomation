package learn.MobileAutomation;

import org.apache.commons.codec.binary.Base64;

public class Sample {
	
	public static void main(String[] args) {
		int i=0;
		String s="hello how are you";
		String array[]=s.split(" ");
		for(String str:array){
			
			String s1="";
			char arr[]=str.toCharArray();
			reverse(arr);
			for(char str1:arr){
				s1=s1+str1;
			}
			array[i]=s1;
			i++;
		}
		for(String str:array){
			System.out.print(str+" ");
		}
	
	}
	
	

	/*public static void main(String[] args) {
		String s="dibyajyoti";
		byte array[]=Base64.encodeBase64(s.getBytes());
		System.out.println("Encoded string:"+ new String(array));
        byte array1[]=Base64.decodeBase64(array);
        System.out.println("Decoded string:"+ new String(array1));
		
	}*/
	
	static void reverse(char[] array)
	{
		for(int i=0;i<=(array.length)/2-1;i++)
		{
			char temp=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		}
	}
	
	static void sort(char array[])
	{
		{
			
			for(int i=1;i<=array.length-1;i++)
			{
				for(int j=0;j<=array.length-1-i;j++)
				{
					if(array[j]>array[j+1])
					{
						char temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
					}
					
				}
			}
				
		}
	}



}
