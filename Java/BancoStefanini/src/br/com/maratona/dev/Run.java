package br.com.maratona.dev;
 
public class Run {
    
    public static void main(String[] args) {
        //New - Criação de um objeto
        //Construtor tem que ter o mesmo nome da Classe
        //Pessoa pessoa = new Pessoa(); //Instanciando Objeto pessoa
        
        //pessoa.nome = "Eder"; //String utiliza aspas duplas
        //pessoa.sexo = 'M'; //Caracter utiliza aspas simples
        
        //System.out.println("Hello World Java");
        //System.out.println(pessoa.nome);
        
        //Variável local
        //String nome = "Eder";
        
        //Setando valor da idade
        //pessoa.setIdade(31);
        //System.out.println(pessoa.getIdade());
        //pessoa.setNome(nome);
        //System.out.println(pessoa.getNome());
        
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.getLimite();
        contaCorrente.getCodigoPix();
        
        
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.getAgencia();
        
    }
}
 