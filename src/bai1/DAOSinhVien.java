/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author duong
 */
public class DAOSinhVien {
    public static void writeObjectFile(String filename , SinhVien sv){
        FileOutputStream  fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(filename,true);        
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(sv);
            
            oos.close();
            fos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAOSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DAOSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                oos.close();
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(DAOSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void writeAllObjectFile(String filename , ArrayList<SinhVien> li){
        FileOutputStream  fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(filename);        
            oos = new ObjectOutputStream(fos);
            
            for (SinhVien sinhVien : li) {
                oos.writeObject(sinhVien);
            }
            
            oos.close();
            fos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAOSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DAOSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                oos.close();
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(DAOSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static ArrayList<SinhVien>  readObjectFile(String filename){
        ArrayList<SinhVien> list = new ArrayList<>();
        FileInputStream  fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(filename);        
            
            
            while (fis.available() > 0) {                
                ois = new ObjectInputStream(fis);
                SinhVien sv = (SinhVien) ois.readObject();
                list.add(sv);
            }
            ois.close();
            fis.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAOSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DAOSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                ois.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(DAOSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
}
