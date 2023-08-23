package hinhChuNhat;
import java.util.Scanner;
public class test 
{
	public static void main(String[] args) 
	{
		System.out.println("chuong trinh xu ly hinh chu nhat ");
		HinhChuNhat cn = nhapMemHinhCN();
		nhapCung();
		System.out.println(cn);
	}
	static void nhapCung()
	{
		HinhChuNhat cn2 = new HinhChuNhat(15,10);
		System.out.println(cn2);
		HinhChuNhat cn3  = new HinhChuNhat(8,4);
		System.out.println(cn3);
	}
	static HinhChuNhat nhapMemHinhCN()
	{
		int cd = nhapSoNguyen("Ban Nhap Chieu Dai : ");
		int cr = nhapSoNguyen("Ban Nhap Chieu Rong : ");
		HinhChuNhat cn1 = new HinhChuNhat();
		cn1.setChieuDai(cd);
		cn1.setChieuRong(cr);
		return cn1;
	}
	static int nhapSoNguyen (String str)
	{
		int x;
		System.out.println(str);
		Scanner scn = new Scanner(System.in);
		x = scn .nextInt();
		return x;
	}
	static void xuatTieuDeCot()
	{
		System.out.println();
	}
}
