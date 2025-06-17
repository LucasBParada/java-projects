
import javax.swing.JOptionPane;

public class Triangulo {
    private double area;
    private double base;
    private double altura;
    
public Triangulo(){

}
    
public Triangulo(double area, double base, double altura){
    this.area = area;
    this.base = base;
    this.altura = altura;
}

public double getArea() {
    return area;
}

public void setArea(double area) {
    this.area = area;
}

public double getBase() {
    return base;
}

public void setBase(double base) {
    this.base = base;
}

public double getAltura() {
    return altura;
}

public void setAltura(double altura) {
    this.altura = altura;
}

public void inseirDadosTriangulo(){
    setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triangulo")));
    setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triangulo")));
}

public void calcularArea(){
    area = (base * altura) / 2;
}

public double mostrarAreaTriangulo(){
JOptionPane.showMessageDialog(null, "Sua area eh:" + area);
return area;
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
