/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacion;

/**
 *
 * @author kduran
 */
public class Request {
    public String message;
    public String key;
    public char[] characters;

    public Request() {
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public char[] getCharacters() {
        return characters;
    }

    public void setCharacters(char[] characters) {
        this.characters = characters;
    }
    
    
}
