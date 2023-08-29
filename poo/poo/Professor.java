package poo;

public class Professor extends Usuario {
     private String disciplina;

    public Professor(){}

    public Professor(String username, String senha, String disciplina) {
        super(username, senha);
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor [disciplina=" + disciplina + "]";
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
