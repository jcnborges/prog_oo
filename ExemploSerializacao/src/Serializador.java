
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Serializador {
    public void gravar(String caminho, Object objeto) throws FileNotFoundException, IOException {
        FileOutputStream outFile = new FileOutputStream(caminho);
        ObjectOutputStream outObj = new ObjectOutputStream(outFile);
        outObj.writeObject(objeto);
        outObj.close();
    }
    
    public Object ler(String caminho) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream inFile = new FileInputStream(caminho);
        ObjectInputStream inObj = new ObjectInputStream(inFile);
        Object obj = inObj.readObject();
        inObj.close();
        return obj;
    }
}
