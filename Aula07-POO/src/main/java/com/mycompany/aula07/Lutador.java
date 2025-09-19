/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07;

/**
 *
 * @author arthu_uhkw4r8
 */
public final class Lutador implements LutaUEM{
    private String n;
    private String nacio;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String nac, int id, double alt,
            double p, int v, int d, int em) {
        setN(no);
        setNacio(nac);
        setIdade(id);
        setAltura(alt);
        setPeso(p);
        setVitorias(v);
        setDerrotas(d);
        setEmpates(em);
    }

    
    
    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    
    public String getNacio() {
        return nacio;
    }

    public void setNacio(String nacio) {
        this.nacio = nacio;
    }

    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    
    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(getPeso() < 52.2){
            this.categoria = "inválido";
        }else if(getPeso() <= 70.3){
            this.categoria = "leve";
        }else if(getPeso() <= 83.9){
            this.categoria = "médio";
        }else if(getPeso() <= 120.2){
            this.categoria = "pesado"; 
        }else{
            this.categoria = "inválido";
        }
    }

    
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int v) {
        this.vitorias += getVitorias() + v;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int d) {
        this.derrotas += getDerrotas() + d;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int e) {
        this.empates += getEmpates() + e;
    }

    
    
    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empateLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    @Override
    public void apresentar() {
        System.out.println("------------------------------------------");
        System.out.println("Apresentaresmos agora a vocês, ele!!");
        System.out.println(this.getN() + "!!");
        System.out.println("Sendo da(o) " + this.getNacio());
        System.out.println("Com " + this.getAltura() + "m de altura!");
        System.out.println(this.getIdade() + " anos");
        System.out.println("pesando " + this.getPeso() + " kilos!");
        System.out.println("Vindo da categoria " + this.getCategoria() + "!!");
        if(this.getVitorias() > 1){
            System.out.println("Com " + this.getVitorias() + " vitórias!");
        }else{
            System.out.println("Com " + this.getVitorias() + " vitória!");
        }
        if(this.getDerrotas() > 1 || this.getDerrotas() == 0){
            System.out.println(this.getDerrotas() + " derrotas!");
        }else{
            System.out.println(this.getDerrotas() + " derrota!");
        }
        if(this.getEmpates() > 1 || this.getEmpates() == 0){
            System.out.println("E " + this.getEmpates() + " empates!!");
        }else{
            System.out.println("E " + this.getEmpates() + " empate!!");
        }
    }

    @Override
    public void status() {
        System.out.println("Nome: " + this.getN());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
    }
    
}
