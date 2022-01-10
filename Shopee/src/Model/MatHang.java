package Model;

import exceptions.MatHangException;
import java.io.Serializable;

public class MatHang implements Serializable{
    
    private int maMH;
    private String tenMH;
    private String loaiMH;
    private double giaTien;
    public static int code = 10000000;
    
    public MatHang(int maMH, String tenMH, String loaiMH, double giaTien) throws MatHangException{
        if(checkTen(tenMH)) throw new MatHangException("Ten mat hang khong duoc trong");
        if(checkGiaTien(giaTien)) throw new MatHangException("Gia tien khong duoc be hon 0");
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.loaiMH = loaiMH;
        this.giaTien = giaTien;
    }
    
    private boolean checkTen(String name){
        return name.isEmpty();
    }
    private boolean checkGiaTien(double giatien){
        return giatien <= 0;
    }
    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }
    
    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }
    
    public String getLoaiMH() {
        return loaiMH;
    }

    public void setLoaiMH(String loaiMH) {
        this.loaiMH = loaiMH;
    }
    
    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return maMH + " - " + tenMH;
    }
    
}
