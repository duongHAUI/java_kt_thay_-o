/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author duong
 */
public class QLSV {
    public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int luaChon ;
        
        while (true) {            
            System.out.println("\t\t1.Nhap 1 sv !");
            System.out.println("\t\t2.Hien thi!");
            System.out.println("\t\t3.Hien thi diem >= 5.0!");
            System.out.println("\t\t0.Thoát!");
            System.out.print("\t====>Nhap lua chon : ");
            luaChon = Integer.parseInt(sc.nextLine());
            switch(luaChon){
                case 1 :{
                    SinhVien sv = new SinhVien();
                    sv.nhap();
                    DAOSinhVien.writeObjectFile("Data.dat", sv);
                    break;
                }
                case 2:{
                    System.out.println("===========================================");
                    SinhVien.TieuDe();
                    list = DAOSinhVien.readObjectFile("Data.dat");
                    for (SinhVien sinhVien : list) {
                        sinhVien.Xuat();
                    }
                    break;
                }
                case 3:{
                    System.out.println("===========================================");
                    list = (ArrayList<SinhVien>)DAOSinhVien.readObjectFile("Data.dat");
                    SinhVien.TieuDe();
                    for (SinhVien sinhVien : list) {
                        if(sinhVien.getDiem().getDiemTB() >= 5.0){
                            sinhVien.Xuat();
                        }
                    }
                    break;
                }
                
            }
            if(luaChon == 0){
                break;
                        
            }
        }
    }
}
