/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor;

import Command.Copy;
import Command.Create;
import Command.Cut;
import Command.Invoker;
import Command.Open;
import Command.Paste;
import Command.Redo;
import Command.Save;
import Command.SaveAs;
import Command.Undo;
import SaveAs.*;

/**
 *
 * @author kduran
 */
public class Controller {
    Invoker invoker;
    Text text;
    ISaveAS saveAs;
    Context context;
    
    public Controller() {
        invoker = new Invoker();
        text = new Text();
        context = new Context();
    }

    public Text getText() {
        return text;
    }

    public void setSaveAs(String type){
        switch(type) {
            case "csv":
                saveAs = new CSV();
                break;
            case "json":
                saveAs = new JSON();
                break;
            case "txt":
                saveAs = new TXT();
                break;
            case "xml":
                saveAs = new XML();
                break;
        }
        context.setSaveAs(saveAs);
    }
    
    public void execute(String command) {
        switch(command) {
            case "copy":
                invoker.registerCommand(new Copy());
                break;
            case "paste":
                invoker.registerCommand(new Paste());
                break;
            case "cut":
                invoker.registerCommand(new Cut());
                break;
            case "open":
                invoker.registerCommand(new Open());
                break;
            case "redo":
                invoker.registerCommand(new Redo());
                break;    
            case "undo":
                invoker.registerCommand(new Undo());
                break;
            case "save":
                invoker.registerCommand(new Save(text));
                break;
            case "saveAs":
                invoker.registerCommand(new SaveAs(context, text));
                break;
            case "new":
                invoker.registerCommand(new Create());
                break;
        }
        invoker.execute();
    }
    
    
}
