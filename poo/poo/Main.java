package poo;

public class Main {


        public static void main(String[] args){


        Professor professor = new Professor("reneilson.senai", "admin", "Desenvolvimento de Sistemas");
        Aluno aluno = new Aluno("felipe.januario", "aluno", "2021/2", 2021);


        System.out.println(professor.isAdmin());
        System.out.println(aluno.isAdmin());

        
        // Polimorfismo
        // Fazer sobrecarga do toString de Professor e Aluno
        // Criar construtor vazio e construtor completo nas classes

        // Encapsulamento
        // Alterar atributos para ocultar suas informações fora da classe
        // Ajustar atributos na classe pai para que sejam protected

        // Herança 
        // Chamar o método isAdmin() para verificar se o professor e aluno são administrador

        // Abstração
        // Adicionar um novo método na interface user para verificação de senha
    }

    


    @Override
    public String toString() {
        return "Main []";
    }

    public Main() {
    }
    
}
