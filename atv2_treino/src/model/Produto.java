package model;

import Controller.conexao;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class Produto {
    private int codigo;
    private String nomeProduto;
    private String descricao;
   
    conexao prod = new conexao();

public Produto(){
}

public Produto(int codigo, String nomeProduto, String descricao){
    this.codigo = codigo;
    this.nomeProduto = nomeProduto;
    this.descricao = descricao;
}    

public int getCodigo() {
    return codigo;
}

public void setCodigo(int codigo) {
    this.codigo = codigo;
}

public String getNomeProduto() {
    return nomeProduto;
}

public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}

public void cadastrarProduto(){
String sql = "insert into produto(codigo, nomeProduto, descricao) values('"+getCodigo()+"','"+getNomeProduto()+"','"+getDescricao()+"')";
prod.executeSQL(sql);
JOptionPane.showMessageDialog(null, "Registro criado com sucesso");
}

public ResultSet consultarProduto(){
ResultSet tabela = null;
String sql ="select * from produto";
prod.executeSQL(sql);
tabela = prod.RetornarResultSet(sql);
return tabela;
}

public void alterarProduto(){
String sql ="update produto set codigo='"+getCodigo()+"',nomeProduto='"+getNomeProduto()+"',descricao='"+getDescricao()+"'";
prod.executeSQL(sql);
JOptionPane.showMessageDialog(null, "Registro alterado com sucesso");
}

public void excluirProduto(){
String sql = "delete from produto where codigo='"+getCodigo()+"'";
prod.executeSQL(sql);
JOptionPane.showMessageDialog(null, "Registro excluido com sucesso");
}




    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}