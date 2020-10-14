package br.com.maratona.dev;
 
public class Conta {
    
    private Integer conta;
    private Integer agencia;
    private Double saldo;
    private Boolean status;
    private Long codigoPix;
    
    public Integer getConta() {
        return conta;
    }
    public void setConta(Integer conta) {
        this.conta = conta;
    }
    
    public Integer getAgencia() {
        return agencia;
    }
    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }
    
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    
    public Long getCodigoPix() {
        return codigoPix;
    }
    public void setCodigoPix(Long codigoPix) {
        this.codigoPix = codigoPix;
    }
    
    
    
    //Métodos
    public void sacar(Double valorSaque) {
        this.saldo = this.saldo - valorSaque;
    }
    
    public void depositar(Double valorDeposito) {
        this.saldo = this.saldo + valorDeposito;
    }
}