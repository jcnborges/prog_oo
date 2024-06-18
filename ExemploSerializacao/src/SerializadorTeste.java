
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class SerializadorTeste {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Motocicleta moto = new Motocicleta("Honda", "Titan", 20);
            Serializador serializador = new Serializador();
            serializador.gravar("moto.dat", moto);
            
            Motocicleta motoLida = (Motocicleta) serializador.ler("moto.dat");
            System.out.println("fim");
            
        } catch (IOException ex) {
            Logger.getLogger(SerializadorTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
