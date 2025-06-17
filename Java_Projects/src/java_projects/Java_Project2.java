package java_projects;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Java_Project2 {

    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        int operacoes, n1, n2;
        
        do{
        operacoes = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Somar" + "\n2 - Subtrair \n3 - Multiplicar \n4 - Dividir" + "\n0 - Sair"));
        
        switch(operacoes){
            case 1:
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
                cal.setN1(n1);  
                
                cal.setN2(Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero")));
                
                cal.somar();
                
                JOptionPane.showMessageDialog(null, cal.getR());
                break;
            
            case 2:
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
                cal.setN1(n1);  
                
                cal.setN2(Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero")));
               
                cal.subtrair();
                
                JOptionPane.showMessageDialog(null, cal.getR());
                break;
            
            case 3:
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
                cal.setN1(n1);  
                
                cal.setN2(Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero")));
                
                cal.multiplicar();
              
                JOptionPane.showMessageDialog(null, cal.getR());
                break;
            
            case 4:
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
                cal.setN1(n1);  
                
                cal.setN2(Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero")));
                
                cal.dividir();
              
                JOptionPane.showMessageDialog(null, cal.getR());
                break;
                
            case 0:
                JOptionPane.showMessageDialog(null, "Saindo Calculadora");
                break;
        }
      }while(operacoes != 0);
    }
  }
