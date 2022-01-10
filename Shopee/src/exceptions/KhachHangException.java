/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author kuted
 */
public class KhachHangException extends Exception{
    private String messeger;

    public KhachHangException() {
    }

    public KhachHangException(String messeger) {
        this.messeger = messeger;
    }

    public String getMesseger() {
        return messeger;
    }
    
}
