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
public class Nguoi implements  Serializable{
    private String hoTen;
    private int tuoi;
    private String gioiTinh;

    public Nguoi(String hoTen, int tuoi, String gioiTinh) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten : ");
        hoTen = sc.nextLine();
        System.out.print("Nhap tuoi : ");
        tuoi  = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gioi tinh : ");
        gioiTinh = sc.nextLine();
    }
    public Nguoi() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
}
