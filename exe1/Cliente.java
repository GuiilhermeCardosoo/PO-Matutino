/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.exe1;

/**
 *
 * @author 1090482121028
 */
public class Cliente {
    // Variaveis da classe
    private String nroConta, nroAgencia, nome;
    private float saldo;
    // contrutores
    public Cliente(){
        
    }
    public Cliente(String nroConta, String nroAgencia, String nome, float saldo){
        this.setNroConta(nroConta);
        this.setNroAgencia(nroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    public final void setNroConta(String nroConta) {
        if((nroConta.length() == 8) && (nroConta.charAt(6)=='-')){
        this.nroConta = nroConta;
    }
        else{
                this.nroConta = "";
                System.out.println("Número da conta inválido");
        }
    }

    public final void setNroAgencia(String nroAgencia) {
        if((nroAgencia.length() == 6) && (nroAgencia.charAt(4)=='-')){
            this.nroAgencia = nroAgencia;
        }
        else{
            this.nroAgencia = "";
            System.out.println("Número da Agência inválida");
        }
        
    }

    public final void setNome(String nome) {
        if (nome.length() <=30){
        this.nome = nome;
    }
        else{
            this.nome="";
            System.out.println("Nome Inválido");
        }
    }

    public final void setSaldo(float saldo) {
        if (saldo >= 0 ){
        this.saldo = saldo;
    }
        else{ 
            System.out.println("Saldo não pode ficar negativo");
        }
    }

    public String getNroConta() {
        return nroConta;
    }

    public String getNroAgencia() {
        return nroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }
    public void depositar(float x){
        this.setSaldo(this.saldo + x);
    }
    public void sacar(float x){
        this.setSaldo(this.saldo - x);
        
    }

    @Override // Informa que o método toString() é anulado da class pai
    public String toString() {
        return "Cliente{" + "nroConta=" + nroConta + ", nroAgencia=" + nroAgencia + ", nome=" + nome + ", saldo=" + saldo + '}';
    }
    
    
}
