
import javax.swing.JOptionPane;

public class Principal {

    Triangulo tri = new Triangulo();
    
    public static void main(String[] args) {
        Triangulo tri = new Triangulo();
    int op;
        
    do{
    String menu = "1 - Inserir dados do triângulo\n" + "2 - Calcular área do triângulo\n" + "3 - Mostrar área do triângulo\n" + "0 - Sair";
    op = Integer.parseInt(JOptionPane.showInputDialog(menu));
    
    switch(op){
        case 1:
            tri.inseirDadosTriangulo();
        break;
        
        case 2:
            tri.calcularArea();
        break;
        
        case 3:
            tri.mostrarAreaTriangulo();
        break;
        
        case 0:
            JOptionPane.showMessageDialog(null, "Saindo");
        }
    
    }while(op != 0);
          
    }
    
}
