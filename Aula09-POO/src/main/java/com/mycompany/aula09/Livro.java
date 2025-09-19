/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula09;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String tit, String autor,
            int totPag, Pessoa let) {
        setTitulo(tit);
        setAutor(autor);
        setTotPaginas(totPag);
        setPagAtual(0);
        setAberto(false);
        setLeitor(let);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    

    
    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ",\n autor=" + autor +
                ",\n totPaginas=" + totPaginas + ",\n pagAtual=" + pagAtual + 
                ",\n aberto=" + aberto + ",\n leitor=" + leitor.getNome() + 
                ",\n Idade=" + leitor.getIdade() +
                ",\n Sexo=" + leitor.getSexo() + '}';
    }
    

    @Override
    public void abrir() {
        setAberto(true); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void fechar() {
        setAberto(false); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void avançarPag() {
        setPagAtual(getPagAtual() + 1); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void voltarPag() {
        setPagAtual(getPagAtual() - 1); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void folhear(int p) {
        if (p > getTotPaginas() || p < 0){
            setPagAtual(0);
        }else{
            setPagAtual(p);
        }
        setPagAtual(p);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
