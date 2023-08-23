package hinhChuNhat;

public class HinhChuNhat 
{
	private int chieuDai;
	private int chieuRong;
	public int getChieuDai() 
	{
		return chieuDai;
	}
	public void setChieuDai(int cDai) 
	{
		this.chieuDai = cDai;
	}
	public int getChieuRong() 
	{
		return chieuRong;
	}
	public void setChieuRong(int cRong) 
	{
		this.chieuRong = cRong;
	}
	// xây dựng methods
	// constructor
	public HinhChuNhat() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public HinhChuNhat(int cDai, int cRong) 
	{
		super();
		this.chieuDai = cDai;
		this.chieuRong = cRong;
	}


	public int chuVi()
	{
		int cd = this.getChieuDai();
		int cr= this.getChieuRong();
		int cv = (cd+cr)*2;
		return cv;
	}
	public long dienTich()
	{
		int cd = this.getChieuDai();
		int cr= this.getChieuRong();
		int dt= cd*cr;
		return dt;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = String.format("%10d %10d %10d %10d", getChieuDai(),getChieuRong(), chuVi(), dienTich() );
		return str;
	}

}
