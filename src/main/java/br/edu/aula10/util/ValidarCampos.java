/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.aula10.util;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author User
 */
public class ValidarCampos {
    public boolean validaTextField(JTextField campo, 
            String texto){
        if(campo.getText().equals(texto)){   
            campo.setBorder(new LineBorder(Color.RED,2));
            return true;
        }else{
            campo.setBorder(new LineBorder(Color.GRAY,1));
            return false;
        }
    }
    public boolean validarDataNascimento(JFormattedTextField campo){
        if(campo.getText().contains(" ")){   
            campo.setBorder(new LineBorder(Color.RED,2));
            return true;
        }else{
            campo.setBorder(new LineBorder(Color.GRAY,1));
            return false;
        }
    }
    public boolean validarRadioButton(JRadioButton masculino, 
            JRadioButton feminino){
        if(!masculino.isSelected() && !feminino.isSelected()){
            masculino.setBorder(new LineBorder(Color.RED, 2));
            feminino.setBorder(new LineBorder(Color.RED, 2));
            
            masculino.setBorderPainted(true);
            feminino.setBorderPainted(true);
            return true;
        }else{
            masculino.setBorder(new LineBorder(Color.GRAY, 1));
            feminino.setBorder(new LineBorder(Color.GRAY, 1));
            
            masculino.setBorderPainted(false);
            feminino.setBorderPainted(false);
            return false;
        }
    }
    public boolean validaPasswordField(JPasswordField campo, 
            String texto){
        
        String valorCampo = String.valueOf(campo.getPassword());
        
        if(valorCampo.equals(texto)){   
            campo.setBorder(new LineBorder(Color.RED,2));
            return true;
        }else{
            campo.setBorder(new LineBorder(Color.GRAY,1));
            return false;
        }
    }
    public boolean validarComboBox(JComboBox campo){
        if(campo.getSelectedIndex() == 0){
            campo.setBorder(new LineBorder(Color.RED,2));
            return true;
        }else{
            campo.setBorder(new LineBorder(Color.GRAY,1));
            return false;
        }
    }
}
