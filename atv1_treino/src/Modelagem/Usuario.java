package Modelagem;

import Controle.Conexao;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class Usuario {
    private String nome;
    private String email;
    private String login;
    private String senha;
    
    Conexao conUsuario = new Conexao();
    
public Usuario(){
}

public Usuario(String nome, String email, String login, String senha){
    this.nome = nome;
    this.email = email;
    this.login = login;
    this.senha = senha;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getLogin() {
    return login;
}

public void setLogin(String login) {
    this.login = login;
}

public String getSenha() {
    return senha;
}

public void setSenha(String senha) {
    this.senha = senha;
}

public void cadastrarUsuario(){
    String sql = "Insert into Usuario(nome, email, login, senha) values ('"+this.getNome() + "', '"+ this.getEmail() + "','"+ this.getLogin() + "','" + this.getSenha() +"')";
    conUsuario.executeSQL(sql);
    JOptionPane.showMessageDialog(null, "Registro criado com sucesso");
}

public void excluir(){
String sql;
sql = "DELETE FROM usuario WHERE nome = '" + getNome() + "'";
conUsuario.executeSQL(sql);
JOptionPane.showMessageDialog(null, "Registro deletado com sucesso");
}

public void alterar(){
String sql;
sql = "UPDATE Usuario SET nome='" + this.getNome() + "', email='" + this.getEmail() + "', login='" + this.getLogin() + "', senha='" + this.getSenha() + "' WHERE nome='" + this.getNome() + "'";
conUsuario.executeSQL(sql);
JOptionPane.showMessageDialog(null, "Registro alterado com sucesso");
}

public ResultSet consultar(){
   ResultSet tabela = null;
    
   String sql = "Select * from Usuario";
   tabela = conUsuario.RetornarResultSet(sql);
   return tabela;
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
