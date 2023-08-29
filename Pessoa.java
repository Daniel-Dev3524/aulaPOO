package aulaPOO;


public class Pessoa {
   public Integer codPessoa;
   public String nome;
   public String endereco;
   public String fone;
   public Double rendimento;
   public String tipo;
   public Character status;

   public Pessoa(){}

    public Pessoa( Integer codPessoa,String nome,String endereco,String fone,Double rendimento, String tipo,Character status ){
        this.codPessoa=codPessoa;
        this.nome = nome;
        this.endereco=endereco;
        this.fone=fone;
        this.rendimento=rendimento;
        this.status=status;
    }  


    public void setCodPessoa(Integer codPessoa) {
        this.codPessoa = codPessoa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getCodPessoa() {
        return codPessoa;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getFone() {
        return fone;
    }

    public Double getRendimento() {
        return rendimento;
    }

    public String getTipo() {
        return tipo;
    }

    public Character getStatus() {
        return status;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setRendimento(Double rendimento) {
        this.rendimento = rendimento;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setStatus(Character status) {
        this.status = status;
    }
}
    

