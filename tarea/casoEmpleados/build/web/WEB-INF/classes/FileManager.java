
package logicEncryption;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;




public class FileManager {
    
    private String filePath;
    private ArrayList<String> lines;

    public FileManager(String path) {
        this.filePath = path;
        this.lines = new ArrayList();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFileNamPath(String fileName) {
        this.filePath = fileName;
    }

    public ArrayList getLines() {
        return lines;
    }

    public void setLines(ArrayList lines) {
        this.lines = lines;
    }
    
    public void readFile(){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            String currentLine;
            while ((currentLine = br.readLine()) != null){
                lines.add(currentLine);
            }
            
        } catch (IOException e){
            e.printStackTrace();
        } 
        
        finally{
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public String getConcatenatedStrings(){
        String bigString = "";
        for (String currentString : this.lines){
            bigString += currentString;
        }
        return bigString;
    }
    
    public void printLines(){
        for (int i = 0 ; i < lines.size() ; i++){
            System.out.println("Line #" + i + ": " + lines.get(i));
        }
    }
      
    public ArrayList<String[]> getDataMatrix(ArrayList<String> bigString) {
        ArrayList<String[]> dataMatrix = new ArrayList<>();
        for (String currentString : bigString) {
            String[] data = currentString.split(",");
            dataMatrix.add(data);
        }
        return dataMatrix;
    }
}
