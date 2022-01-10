/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author kuted
 */
public class HangMua implements Serializable{
    private int soluong;
    private MatHang matHang;

    public HangMua(int soluong, MatHang matHang) {
        this.soluong = soluong;
        this.matHang = matHang;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public MatHang getMatHang() {
        return matHang;
    }

    public void setMatHang(MatHang matHang) {
        this.matHang = matHang;
    }
    public double getTongtien(){
        return this.matHang.getGiaTien() * this.getSoluong();
    }
}
