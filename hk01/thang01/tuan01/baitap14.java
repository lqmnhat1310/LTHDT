//Viết chương trình in ra tổng 1+3+5….+n nếu n là số chẵn, 2+4+6+….n nếu n là số lẻ. Giá trị n được nhập vào từ tham số command line
package hk01.thang01.tuan01;
import java.util.Scanner;
public class baitap14 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("nhập vào 1 số nguyên để in ra tổng 1+3+5 …. +n nếu n là số chẵn, 2+4+6+ …. n nếu n là số lẻ : ");
		int n = sc.nextInt();
		int dem =0;
		int i;
		if (n%2==0)
		{
			for ( i=1; i<=n; i=i+2)
			{
				dem = dem +i;
				
			}
			System.out.println(" kết quả của bạn là :  "+dem);
		}
		else
		{
			for ( i=2; i<=n; i=i+2)
			{
				dem = dem +i;
				
			}
			System.out.println(" kết quả của bạn là : "+dem);
		}
		
	}
	}

