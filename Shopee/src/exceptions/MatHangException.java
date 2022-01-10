/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author kuted
 */
public class MatHangException extends Exception{
    private String mess;
    
    public MatHangException() {
    }

    public MatHangException(String message) {
        this.mess = message;
    }

    public String getMess() {
        return mess;
    }
    
    
    
}
