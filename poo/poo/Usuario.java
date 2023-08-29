package poo;
import java.security.MessageDigest;



public class Usuario implements User {
    protected String username;
    protected String senha;

    public Usuario(){}

    public Usuario(String username, String senha) {
        this.username = username;
        this.senha = senha;
    }

    @Override
    public String criptografarSenha() {
        MessageDigest algorithm;
        try {
            algorithm = MessageDigest.getInstance("MD5");
            byte messageDigest[] = algorithm.digest(this.senha.getBytes("UTF-8"));
            return new String(messageDigest);
        } catch (Exception e) {
            e.printStackTrace();
            return this.senha;
        }        
    }

    @Override
    public Boolean isAdmin() {
        return this.username.contains("senai");
    }

    @Override
    public String toString() {
        return "Usuario [username=" + username + ", senha=" + senha + "]";
    }

    @Override
    public Boolean verificarSenha() {
        // TODO Auto-generated method stub
        
        return this.senha.length() >=6;
    }

    
}
