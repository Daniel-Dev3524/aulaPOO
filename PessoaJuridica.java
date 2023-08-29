package aulaPOO;
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String nomeFantasia;


    public PessoaJuridica(){}


    public PessoaJuridica(String cnpj, String nomeFantasia) {
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }


    


    public PessoaJuridica(Integer codPessoa, String nome, String endereco, String fone, Double rendimento, String tipo,
            Character status, String cnpj, String nomeFantasia) {
        super(codPessoa, nome, endereco, fone, rendimento, tipo, status);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }


    public String getCnpj() {
        return cnpj;
    }


    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }


    public String getNomeFantasia() {
        return nomeFantasia;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
        result = prime * result + ((nomeFantasia == null) ? 0 : nomeFantasia.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PessoaJuridica other = (PessoaJuridica) obj;
        if (cnpj == null) {
            if (other.cnpj != null)
                return false;
        } else if (!cnpj.equals(other.cnpj))
            return false;
        if (nomeFantasia == null) {
            if (other.nomeFantasia != null)
                return false;
        } else if (!nomeFantasia.equals(other.nomeFantasia))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "PessoaJuridica [cnpj=" + cnpj + ", nomeFantasia=" + nomeFantasia + "]";
    };

    

   
}
