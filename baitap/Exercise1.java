package baitap;


import java.util.Scanner;  // khai bao thu vien chua lop Scanner

public class Exercise1 {
    String name;
    int age;
    float height;
 
    // Ham nhap du lieu tu ban phim
    void nhap(){ 
 
    //khai bao doi tuong ip thuoc lop Scanner
    Scanner ip= new Scanner(System.in);
     
    // Su dung nextLine nhap du lieu kieu String
    System.out.println("Nhap ten cua ban: ");
    name = ip.nextLine();
     
    //Su dung nextInt de nhap so nguyen: 
    System.out.println("Nhap tuoi cua ban: ");
    age = ip.nextInt();
     
    //Su dung nextFloat de nhap kieu so thuc
    System.out.println("Nhap chieu cao cua ban: ");
    height = ip.nextFloat();
 
    ip.close();  // Dong doi tuong ip
    }
 
    // Ham in du lieu ra man hinh
    void xuat(){
        System.out.print(" - -- - Thong tin vua nhap: ----");
        System.out.println("\nHo va ten: "+name +"\n Tuoi: "+ age +"\n Chieu cao: "+height);
    } 
    public static void main(String[] args){
    	Exercise1  a= new Exercise1 ();
       a.nhap();
       a.xuat();
 
    }
}
