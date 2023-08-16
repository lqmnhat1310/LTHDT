package hk01.thang01.tuan01;

public class baitap10 
{
	public static void main(String[] args) 
	{
		int n = 0, m=1;
		int dem = 0; 
		while (n<10) {
			m++;
			if (m%2==0)
			{
				n=n+1;
				dem = dem + m;
			}
		}
		System.out.println(dem);
	}
}
