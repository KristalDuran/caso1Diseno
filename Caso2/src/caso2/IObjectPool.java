/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;


public interface IObjectPool<Bola> {
    
 
    public Bola getObject();
    public void releaceObject(Bola bola); 
}
