/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.HoaDon;
import Model.KhachHang;
import Model.MatHang;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author kuted
 */
public class Controller {

    public static Controller con;
    public static List<KhachHang> customers = new ArrayList<>();
    public static List<MatHang> goods = new ArrayList<>();
    public static List<HoaDon> bills = new ArrayList<>();

    public Controller() {
//        con = new Controller();
    }

    public static void setCodestaticKhachHang(int code) {
        KhachHang.code = code;
    }

    public static void setCodestaticMatHang(int code) {
        MatHang.code = code;
    }

    public static void setCodestaticHoaDon(int code) {
        HoaDon.code = code;
    }

    public static int getIdLastInListMatHang(List<MatHang> list) {
        return !list.isEmpty() ? list.get(list.size() - 1).getMaMH() + 1 : 10000000;
    }

    public static int getIdLastInListKhachHang(List<KhachHang> list) {
        return !list.isEmpty() ? list.get(list.size() - 1).getMaKH() + 1 : 10000000;
    }

    public static int getIdLastInListHoaDon(List<HoaDon> list) {
        return !list.isEmpty() ? list.get(list.size() - 1).getMaDh() + 1 : 1000000;
    }
    public static List<HoaDon> getHoaDonTheoTenKhachHang(String ten){
        List<HoaDon> list = new ArrayList<>();
        for(HoaDon hd : bills){
            if(hd.getKhachHang().getHoTenKH().contains(ten)){
                list.add(hd);
            }
        }
        return list;
    }
    public static void sapXepTheoTenKhachHangTrongHoaDon(List<HoaDon> list){
        Collections.sort(list, new Comparator<HoaDon> () {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                String fullname1 = o1.getKhachHang().getHoTenKH();
                String fullname2 = o2.getKhachHang().getHoTenKH();
                String ten1 = fullname1.substring(fullname1.lastIndexOf(" ") + 1);
                String ten2 = fullname2.substring(fullname2.lastIndexOf(" ") + 1);
                int com = Collator.getInstance(new Locale("vi")).compare(ten1, ten2);
                if(com == 0){
                    String ho1 = fullname1.substring(0,fullname1.lastIndexOf(" "));
                    String ho2 = fullname1.substring(0,fullname1.lastIndexOf(" "));
                    return Collator.getInstance(new Locale("vi")).compare(ho1, ho2);
                }
                else return com;
            }
        });
    }
    public static void sapXepSoluongmua(List<HoaDon> list){
        Collections.sort(list, new Comparator<HoaDon> () {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                int sl1 = o1.getSoluong();
                int sl2 = o2.getSoluong();
                return sl2 - sl1;
            }
        });
    }
    public static void sapXepTongTien(List<HoaDon> list){
        Collections.sort(list, new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                double tong1 = o1.getTongtien();
                double tong2 = o2.getTongtien();
                return (int)(tong2 - tong1);
            }
        });
    }
    public static void sapXepTheoma(List<HoaDon> list){
        Collections.sort(list, new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                int ma1 = o1.getMaDh();
                int ma2 = o2.getMaDh();
                return ma2 - ma1;
            }
        });
    }
//    public static void sapXepTheoTenKhachHang(List<KhachHang> list){
//        Collections.sort(list, new Comparator<KhachHang> () {
//            @Override
//            public int compare(KhachHang o1, KhachHang o2) {
//                String fullname1 = o1.getHoTenKH();
//                String fullname2 = o2.getHoTenKH();
//                String ten1 = fullname1.substring(fullname1.lastIndexOf(" ") + 1);
//                String ten2 = fullname2.substring(fullname2.lastIndexOf(" ") + 1);
//                int com = Collator.getInstance(new Locale("vi")).compare(ten1, ten2);
//                if(com == 0){
//                    String ho1 = fullname1.substring(0,fullname1.lastIndexOf(" "));
//                    String ho2 = fullname1.substring(0,fullname1.lastIndexOf(" "));
//                    return Collator.getInstance(new Locale("vi")).compare(ho1, ho2);
//                }
//                else return com;
//            }
//        });
//    }
//    public static List<HoaDon> getHoaDonTheoTenMatHang(String ten){
//        List<HoaDon> list = new ArrayList<>();
//        for(HoaDon hd : bills){
//            if(hd.get)){
//                list.add(hd);
//            }
//        }
//        return list;
//    }
}
