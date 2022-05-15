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
public class Diem implements  Serializable{
    private float diemMon1;
    private float diemMon2;
    private float diemMon3;
    private float diemTB;

    public Diem(float diemMon1, float diemMon2, float diemMon3) {
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
        this.diemTB = (diemMon1+diemMon2+diemMon3) /3 ;
    }

    public Diem() {
    }

    public float getDiemMon1() {
        return diemMon1;
    }

    public void setDiemMon1(float diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public float getDiemMon2() {
        return diemMon2;
    }

    public void setDiemMon2(float diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public float getDiemMon3() {
        return diemMon3;
    }

    public void setDiemMon3(float diemMon3) {
        this.diemMon3 = diemMon3;
    }

    public float getDiemTB() {
        return diemTB;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem mon 1 : ");
        diemMon1 = sc.nextFloat();
        System.out.print("Nhap diem mon 2 : ");
        diemMon2 = sc.nextFloat();
        System.out.print("Nhap diem mon 3 : ");
        diemMon3 = sc.nextFloat();
        diemTB = (diemMon1+diemMon2+diemMon3) /3 ;
    }
    
}
