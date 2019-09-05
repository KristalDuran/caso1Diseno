/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso1;

/**
 *
 * @author kduran
 */
public interface IPrototype<T extends Combo> extends Cloneable {
    public T clone();
    public T deepClone();
}
