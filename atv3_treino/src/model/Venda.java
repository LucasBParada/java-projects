package model;

import controller.conexao;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


public class Venda {
    private int Codigo;
    private String nomeVendedor;
    private String produtoVendido;

conexao vend = new conexao();
    
public Venda(){
}

public Venda(int Codigo, String nomeVendedor, String produtoVendido){
    this.Codigo = Codigo;
    this.nomeVendedor = nomeVendedor;
    this.produtoVendido = produtoVendido;
}

public int getCodigo() {
    return Codigo;
}

public void setCodigo(int Codigo) {
    this.Codigo = Codigo;
}

public String getNomeVendedor() {
    return nomeVendedor;
}

public void setNomeVendedor(String nomeVendedor) {
    this.nomeVendedor = nomeVendedor;
}

public String getProdutoVendido() {
    return produtoVendido;
}

public void setProdutoVendido(String produtoVendido) {
    this.produtoVendido = produtoVendido;
}

public void cadastrarVenda(){
String sql = "insert into vendas(codigo, nomeVendedor, produtoVendido) values ('" + getCodigo() + "','" + getNomeVendedor() + "','" + getProdutoVendido() + "')";
vend.executeSQL(sql);
JOptionPane.showMessageDialog(null, "Registro cadastrado com sucesso");
}

public void alterarVenda(){
String sql = "update vendas set codigo='"+getCodigo()+"',nomeVendedor='"+getNomeVendedor()+"',produtoVendido='"+getProdutoVendido()+"'where codigo ='"+getCodigo()+"'";
vend.executeSQL(sql);
JOptionPane.showMessageDialog(null, "Registro alterado com sucesso");
}

public void excluirVenda(){
String sql = "delete from vendas where codigo='"+getCodigo()+"'";
vend.executeSQL(sql);
JOptionPane.showMessageDialog(null, "Registro deletado com sucesso");
}

public ResultSet listarVenda(){
ResultSet table = null;
String sql ="select * from vendas";
vend.executeSQL(sql);
table = vend.RetornarResultSet(sql);
return table;
}  

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
