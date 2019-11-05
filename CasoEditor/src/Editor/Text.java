/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor;

import java.util.ArrayList;

/**
 *
 * @author kduran
 */
public class Text {
    private ArrayList<String> words;
    private boolean black;
    private String color;

    public Text() {
        words = new ArrayList<>();
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public void addWord(String word) {
        this.words.add(word);
    }

    public boolean isBlack() {
        return black;
    }

    public void setBlack(boolean black) {
        this.black = black;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
