/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import Editor.Text;
import SaveAs.Context;

/**
 *
 * @author kduran
 */
public class SaveAs implements ICommand{
    
    private Context context;

    private Text text;

    public SaveAs(Context context, Text text) {
        this.context = context;
        this.text = text;
    }
    
    @Override
    public void execute() {
        context.save(text);
    }
}
