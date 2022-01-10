package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class HoaDon implements Serializable{
    
    private int maDh ;
    private KhachHang khachHang;
    private Date ngayTao;
    private List<HangMua> orderGoods;
    private int soluong;
    private int tongtien;
    
    public static int code = 1000000;

    public HoaDon(int maDh, KhachHang khachHang, Date ngayTao, List<HangMua> orderGoods, int soluong, int tongtien) {
        this.maDh = maDh;
        this.khachHang = khachHang;
        this.ngayTao = ngayTao;
        this.orderGoods = orderGoods;
        this.soluong = soluong;
        this.tongtien = tongtien;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    
    public int getMaDh() {
        return maDh;
    }

    public void setMaDh(int maDh) {
        this.maDh = maDh;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public List<HangMua> getOrderGoods() {
        return orderGoods;
    }

    public void setOrderGoods(List<HangMua> orderGoods) {
        this.orderGoods = orderGoods;
    }

    public static int getCode() {
        return code;
    }

    public static void setCode(int code) {
        HoaDon.code = code;
    }
    
    
    
}
