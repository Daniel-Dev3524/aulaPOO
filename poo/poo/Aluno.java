package poo;

public class Aluno extends Usuario {
     private String turma;
     private Integer anoEntrada;

    public Aluno(){}

    public Aluno(String username, String senha, String turma, Integer anoEntrada) {
        super(username, senha);
        this.turma = turma;
        this.anoEntrada = anoEntrada;
    }

    @Override
    public String toString() {
        return "Aluno [turma=" + turma + ", anoEntrada=" + anoEntrada + "]";
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setAnoEntrada(Integer anoEntrada) {
        this.anoEntrada = anoEntrada;
    }

    public Integer getAnoEntrada() {
        return anoEntrada;
    }

    @Override
    public Boolean verificarSenha() {
        // TODO Auto-generated method stub
        return super.verificarSenha();
    }
}
