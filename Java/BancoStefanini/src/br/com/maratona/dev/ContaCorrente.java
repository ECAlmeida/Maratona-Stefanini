package br.com.maratona.dev;
 
//Conta - Pai / ContaCorrente - Filha
public class ContaCorrente extends Conta {
 
    private Float limite;
    
    
    public Float getLimite() {
        return limite;
    }
    public void setLimite(Float limite) {
        this.limite = limite;
    }
    
    
}