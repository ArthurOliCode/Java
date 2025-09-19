/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula014;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Video implements AcoesVideo{
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    //Construtor
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    
    
    
    
    //Implementação dos metódos abstratos.
    @Override
    public void play(){
        if(!isReproduzindo()){
            vPlay();
            setReproduzindo(true); 
        }else{
            System.out.println("Não foi possível reproduzir vídeo!");
        }
    }
    
    @Override
    public void pause(){
        if(isReproduzindo()){
            vPause();
        }else{
            System.out.println("Não foi possível pausar vídeo!");
        }
    }
    
    @Override
    public void like(){
        setCurtidas(getCurtidas() + 1);
        System.out.println("Curtiu '" + getTitulo() + "'!");
    }

    
    //Metódos Getter e Setter de cada atributo.
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        float media;
        media = (this.avaliacao + avaliacao)/this.views;
        this.avaliacao = media;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    public void vPause(){
        System.out.println("||");
        System.out.println("Video pausado!");
    }
    
    public void vPlay(){
        System.out.println("|>");
        System.out.println("Reproduzindo '" + getTitulo() + "'!");
    }

    //Metódo toString() para demonstrar dados visualmente.
    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + 
                ", avaliacao=" + avaliacao + 
                ", views=" + views + 
                ", curtidas=" + curtidas + 
                ", reproduzindo=" + reproduzindo + '}';
    }
    
    
}
