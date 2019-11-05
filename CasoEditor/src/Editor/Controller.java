/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor;

import Command.Copy;
import Command.Invoker;
import Command.Paste;
import java.util.ArrayList;

/**
 *
 * @author kduran
 */
public class Controller {
    Invoker invoker;
    Text text;

    public Controller() {
        invoker = new Invoker();
        text = new Text();
    }
    
    public void setCommand(String command, String text) {
        switch(command) {
            case "copy":
                invoker.registerCommand(new Copy());
                invoker.execute();
                break;
            case "paste":
                invoker.registerCommand(new Paste());
                invoker.execute();
                break;
            case "cut":
                invoker.registerCommand(new Copy());
                invoker.execute();
                break;
            case "open":
                invoker.registerCommand(new Copy());
                invoker.execute();
                break;
            case "redo":
                invoker.registerCommand(new Copy());
                invoker.execute();
                break;    
            case "undo":
                invoker.registerCommand(new Copy());
                invoker.execute();
                break;
            case "save":
                invoker.registerCommand(new Copy());
                invoker.execute();
                break;
            case "saveAs":
                invoker.registerCommand(new Copy());
                invoker.execute();
                break;
            case "new":
                invoker.registerCommand(new Copy());
                invoker.execute();
                break;
        }
    }
    
    
}
