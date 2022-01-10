package Run;

import Model.KhachHang;
import Model.MatHang;
import View.HomeFrm;
import View.LoginFrm;
import controller.Controller;
import exceptions.KhachHangException;
import exceptions.MatHangException;

public class Run {
    
    public static void main(String[] args) throws MatHangException, KhachHangException {
        LoginFrm frm =new LoginFrm();
        frm.setVisible(true);
//        HomeFrm frm = new HomeFrm();
//        frm.setVisible(true);
//        Controller.goods.add(new MatHang(1000000, "dsa", "asddsa", 11));
//        Controller.goods.add(new MatHang(1000001, "aasd", "323", 223));
//        Controller.customers.add(new KhachHang(1000000, "ASdasd", "Asd", "Asd", "02323"));
//        Controller.customers.add(new KhachHang(1000001, "casc", "d2e", "acx", "132323"));
        
    }
}
