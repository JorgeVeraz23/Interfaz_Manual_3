/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion8;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author USER
 */
public class Datos extends JFrame implements ActionListener {
    
    private JLabel label1, label2;
    private JButton btnaceptar;
    private JTextField campo1, campo2;
    Font fuente;
    public Datos(){
        super("Bienvenido");
        //establecer un tamaño en la ventana
        setSize(500,500);
        //Para que no se desacomoden los botones 
        setLayout(null);
        fuente = new Font("Calibri",3,19);
        label1 = new JLabel("Introduce tu nombre: ");
        label1.setFont(fuente);
        label1.setForeground(Color.black);
        label1.setBounds(120,50,200,40);
        label2 = new JLabel("Introduce tu edad: ");
        label2.setForeground(Color.black);
        label2.setFont(fuente);
        label2.setBounds(120,150,200,40);
        campo1 = new JTextField();
        campo1.setBounds(120,100,180,30);
        campo2 = new JTextField();
        campo2.setBounds(120,200,180,30);
        //creacion del boton
        btnaceptar = new JButton("Aceptar");
        //dimensiones del boton
        btnaceptar.setBounds(250,300,120,40);
        //color de fondo del boton
        btnaceptar.setBackground(Color.red);
       //color del texto en el boton
       btnaceptar.setForeground(Color.white);
       
       add(btnaceptar);
       add(label1);
       add(campo1);
       add(campo2);
       add(label2);
       
       //de esta forma nos suscribimos a una accion tipica
       btnaceptar.addActionListener(this);
       //btnrojo.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        int edad = 0;
        edad = Integer.parseInt(campo2.getText());
        if(e.getSource()==btnaceptar){
            if(edad < 18){
                JOptionPane.showMessageDialog(null,"La edad es incorrecta");
            }
            else{
              Ventana2 v2 = new Ventana2();
              v2.setVisible(true);
              //con dispose cierra la ventana anterior
              dispose();
                
            }
        }
    }
    
}
