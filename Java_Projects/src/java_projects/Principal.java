package java_projects;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
       Vendedor ved1 = new Vendedor();
       double operacao;
       String n = null;
       
       do{
           operacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a opcao desejada: \n 1 - Informar Nome \n 2 - Informar Salario \n 3 - Informar Valor Vendido \n 4 - Calcular Comissao \n 0 - Sair"));
        
       if(operacao == 1){
       ved1.cadastrarNome();
       
       }else if(operacao == 2){
       ved1.cadastrarSalarioBase();
       
       }else if (operacao == 3){
       ved1.cadastrarValorVendido();
       
       }else if (operacao == 4){
       ved1.calculoComissao();
       }
       
       JOptionPane.showMessageDialog(null, "O vendedor " + ved1.getNome() + " teve salario final de " + ved1.getValorVendido());
       
       }while(operacao != 0);
    }
    
}
