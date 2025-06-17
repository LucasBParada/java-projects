package java_projects;

import javax.swing.JOptionPane;

public class Calculadora {
    private double n1;
    private double n2;
    private double r;

public Calculadora(){

}

public Calculadora(double n1, double n2, double r){
    this.n1 = n1;
    this.n2 = n2;
    this.r = r;
}

public double getN1() {
    return n1;
}

public void setN1(double n1) {
    this.n1 = n1;
}

public double getN2() {
    return n2;
}

public void setN2(double n2) {
    this.n2 = n2;
}

public double getR() {
    return r;
}

public void setR(double r) {
    this.r = r;
}

public void somar(){
    setR(getN1() + getN2());
}

public void subtrair(){
    r = n1 - n2;
}

public void multiplicar(){
    r = n1 * n2;
}

public void dividir(){
    r = n1 / n2;
 }
}




















    

    























    

   


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

