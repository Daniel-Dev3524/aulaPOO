package aulaPOO;
public class PessoaFisica extends Pessoa {
    private String cpf;
    private String rg;

    
    public PessoaFisica(){}
    
    public PessoaFisica(Integer codPessoa, String nome, String endereco, String fone, Double rendimento, String tipo,
            Character status, String cpf, String rg) {
        super(codPessoa, nome, endereco, fone, rendimento, tipo, status);
        this.cpf = cpf;
        this.rg = rg;
    }



    public PessoaFisica(String cpf,String rg){
        this.cpf=cpf;
        this.rg=rg;
    }



    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
  
    
    }
 

