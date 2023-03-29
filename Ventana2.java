
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion8;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class Ventana2 extends JFrame {
    public Ventana2(){
        setBounds(0,0,400,400);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        Datos dato = new Datos();
        dato.setVisible(true);
    }
}
