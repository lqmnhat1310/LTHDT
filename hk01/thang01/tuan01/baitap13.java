//Viết chương trình in ra tổng 1+2+3….+n với n được nhập từ tham số command line
package hk01.thang01.tuan01;
import java.util.Scanner; 
public class baitap13 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("nhập vào 1 số nguyên để in ra tổng 1+2+3….+n với n được nhập từ tham số command line : ");
		int n = sc.nextInt();
		int dem = 0;
		for (int i=0; i<=n; i++)
		{
			dem=dem+i;
		}
		System.out.println("kết quả của bài toán là : "+ dem);
	}
}
