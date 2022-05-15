/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author duong
 */
public class SinhVien extends Nguoi implements  Serializable{
    private String maSV;
    private Diem diem = new Diem();
    
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien : ");
        maSV =  sc.nextLine();
        super.nhap();
        diem.Nhap();
    }
    
    public String getMaSV() {
        return maSV;
    }
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public Diem getDiem() {
        return diem;
    }

    public void setDiem(Diem diem) {
        this.diem = diem;
    }

    
    public void Xuat(){
        
        System.out.printf("%-20s%-20s%-20d%-15s%15s%15s%15s%15s",maSV,getHoTen(),getTuoi(),getGioiTinh(),String.format("%.1f",diem.getDiemMon1()),String.format("%.1f",diem.getDiemMon2()),String.format("%.1f",diem.getDiemMon3()),String.format("%.1f",diem.getDiemTB()));
        System.out.println("");
    }
    public static void TieuDe(){
        
        System.out.printf("%-20s%-20s%-20s%-15s%15s%15s%15s%15s","Masv","HoTen","tuoi","GT","Diem1","Diem2","Diem3","DiemTB");
        System.out.println("");
    }
}
