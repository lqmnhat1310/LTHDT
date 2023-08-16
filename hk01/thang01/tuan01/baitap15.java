//Viết chương trình in ra giá trị lớn nhất và nhỏ nhất trong một dãy các giá trị user đã nhập vào từ tham số command line.
package hk01.thang01.tuan01;
import java.util.Scanner;
public class baitap15 
{
	
	public static int LonNhat(int array[], int n) 
	{
		// Thuật toán lấy giá trị lớn nhất
		int max = array[0];
		for(int i=1; i<n; i++)		
			if(array[i] > max)
				max = array[i];
		return max;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("nhập vào n số nguyên : ");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("nhập vào các phần tử của mãng : ");
		for (int i = 0; i<n; i++)
		{
			Scanner mang= new Scanner(System.in);
			array[i] = mang.nextInt();
			
		}
		System.out.println("các phần tử của mãng bạn đã nhập là : ");
		for (int i = 0; i<n; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("số lớn nhất của mảng vừa nhập là : " +LonNhat(array,n));
	}
	
}
