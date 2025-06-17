
package java_projects;

import javax.swing.JOptionPane;

public class Vendedor {
    private String nome;
    private double salarioBase;
    private double valorVendido;
    
    
public Vendedor(){

};


public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public double getSalarioBase() {
    return salarioBase;
}

public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

public double getValorVendido() {
    return valorVendido;
}

public void setValorVendido(double valorVendido) {
   this.valorVendido = valorVendido;
}

public void cadastrarSalarioBase(){
    
    setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário")));
}

public void cadastrarNome(){
    
   setNome(JOptionPane.showInputDialog("Digite seu Nome"));
   
}

public void cadastrarValorVendido(){
    double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor vendido"));
}

public double calculoComissao(){
    
    double novoSalario = valorVendido * 10 / 100;
    
    return getValorVendido();
}












    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
