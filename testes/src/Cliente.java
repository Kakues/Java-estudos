public class Cliente {
        
    String nome;
    int idade;
    String cpf;

    public Cliente(String nome, int idade, String cpf){
        this.nome = nome; 
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getInfo(){
        return "Nome: " + nome + ", Idade: " + idade + ", CPF: " + cpf;
    }

}
