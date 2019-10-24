/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteredsocial;

import api.AbstractObservable;
import api.IObservable;
import api.IObserver;
import java.util.ArrayList;

/**
 *
 * @author kduran
 */
public class Celebridad extends AbstractObservable{
    
    private int id;
    private String nombre;
    private ArrayList<String> mensajes;
    private ArrayList<Mensaje> posts;
    private ArrayList<Seguidor> fans;
    private boolean state = true;
    
    public Celebridad(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.mensajes = new ArrayList<>();
        this.posts = new ArrayList<>();
        this.fans = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getMensajes() {
        return mensajes;
    }

    public ArrayList<Mensaje> getPosts() {
        return posts;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    public Mensaje getPostId(int id) {
        for (Mensaje post : posts) {
            if(post.getId() == id)
                return post;
        }
        return null;
    }

    public void addPost(String texto){
        Mensaje post = new Mensaje(texto, id);
        posts.add(post);
    }
    
    public void addFan(Seguidor fan){
        fans.add(fan);
    }
    
    public ArrayList<Seguidor> getFans() {
        return fans;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
