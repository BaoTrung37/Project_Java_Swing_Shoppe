package Model;

import exceptions.KhachHangException;
import java.io.Serializable;

public class KhachHang implements Serializable {

    private int maKH;
    private String hoTenKH;
    private String diaChi;
    private String email;
    private String soDienThoai;

    public static int code = 10000000;

    public KhachHang(int maKH, String hoTenKH, String diaChi, String email, String soDienThoai) throws KhachHangException {

        String messTen = checkTen(hoTenKH);
        if (messTen != "") {
            throw new KhachHangException(messTen);
        }

        String messDiachi = checkDiachi(diaChi);
        if (messDiachi != "") {
            throw new KhachHangException(messDiachi);
        }

        String messEmail = checkEmail(email);
        if (messEmail != "") {
            throw new KhachHangException(messEmail);
        }
        String messPhone = checkPhone(soDienThoai);
        if (messPhone != "") {
            throw new KhachHangException(messPhone);
        }
        this.maKH = maKH;
        this.hoTenKH = hoTenKH;
        this.diaChi = diaChi;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    private String checkTen(String name) {
        if (name.isEmpty()) {
            return "Ten khong duoc bo trong";
        }
        return "";
    }

    private String checkDiachi(String diachi) {
        if (diachi.isEmpty()) {
            return "Dia chi khong duoc bo trong";
        }
        return "";
    }

    private String checkEmail(String email) {
        if (email.isEmpty()) {
            return "Email khong duoc bo trong";
        } else if (!email.matches("^(.+)@([^@]+[^.])$")) {
            return "Sai dinh dang email";
        }
        return "";
    }

    private String checkPhone(String phone) {
        if (phone.isEmpty()) {
            return "So dien thoai khong duoc bo trong";
        } 
//else if (!phone.matches(
//                "/^\\+?([0-9]{2})\\)?([0-9]{4})([0-9]{5})$/")) {
//            return "So dien thoai khong hop le";
//        }
//        else if(phone.length() != 9) {
//            return "So dien thoai phai  co 9 chu so";
//        }

        return "";
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getHoTenKH() {
        return hoTenKH;
    }

    public void setHoTenKH(String hoTenKH) {
        this.hoTenKH = hoTenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return maKH + " - " + hoTenKH;
    }

}
