/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05;

/**
 *
 * @author arthu_uhkw4r8
 */
public class ContaBanco {
        private float saldo;
        public int numConta;
        protected String tipo;
        private String dono;
        public boolean status;
        
        public ContaBanco(){
            this.saldo = 0;
            this.status = false;
        }
        
        
        public void setDono(String n){
            if(this.getStatus() == true){
                this.dono = n;
            }else{
                System.out.println("Para realizar esta ação, abra uma conta!");
            }
        }
        public String getDono(){
            return this.dono;
        }
        

        public void setStatus(boolean t){
            this.status = t;
        }
        public boolean getStatus(){
            return this.status;
        }
        
        
        public void setNumConta(int n){
            this.numConta = n;
        }
        public int getNumConta(){
            return this.numConta;
        }
        
        
        public void setTipo(String t){
            if(this.getStatus() == true){
                this.tipo = t;
            }else{
                System.out.println("Erro! Para especificar o tipo da conta, primeiramente deve-se abrir uma!");
            }
        }
        public String getTipo(){
            return this.tipo;
        }
        
        
        
        public void abrirConta(String t){
            this.setStatus(true);
            this.setTipo(t);
            float v;
            if(t.equals("cc")){
                v = 50f;
                setSaldo(getSaldo() + v);
            }else if(this.getTipo().equals("cp")){
                v = 150f;
                setSaldo(getSaldo() + v);
            }
        }
        public void fecharConta(){
            if(this.getStatus() && this.getSaldo() == 0){
                this.setStatus(false);
                this.setDono("N/A");
                this.setTipo("N/A");
            }else if(this.getStatus() == false){
                System.out.println("Abra uma conta primeiro para realizar esta ação!");
            }else if(this.getSaldo() > 0){
                System.out.println("Não é possível fechar a conta, pois ela possui saldo em conta!\n");
            }else if(this.getSaldo() < 0){
                System.out.println("Não é possível fechar a conta, pois a conta possui divída!");
            }
        }
        
        
        public void setSaldo(float s){
            if(this.getStatus() == true){
                this.saldo = s;
            }else{
                System.out.println("Erro! Abra primeiramente uma conta, para possiblitar o depósito!\n");
            }
        }
        public float getSaldo(){
            return this.saldo;
        }
        
        
        public void setSacar(float sq){
            if (this.getSaldo() >= sq && this.getStatus() == true){
                this.setSaldo(getSaldo() - sq);
            }else{
                System.out.println("Erro!! Não foi possível efetuar o saque. A quantia em conta, não cobre o saque!\n");
            }
        }
        
        
        public void setDepositar(float is){
            if(this.getStatus()){
                setSaldo(getSaldo() + is);
            }else{
                System.out.println("Erro! Primeiro inicie uma conta.\n");
            }
        }
        

        public void pagarMensalidade(){
            float v;
            if(this.getStatus() && this.getTipo().equals("cc")){
                v = 12;
                setSaldo(getSaldo() - v);
            }else if(this.getStatus() && this.getTipo().equals("cp")){
                v = 20f;
                setSaldo(getSaldo() - v);
            }
        }
        
        
        public void status(){
            System.out.println("Número da conta: " + this.getNumConta());
            System.out.println("Dono da conta: " + this.getDono());
            System.out.println("Tipo da conta: " + this.getTipo());
            System.out.println("Saldo presente: " + this.getSaldo());
            System.out.println("Status da conta: " + this.getStatus());
        }
}
