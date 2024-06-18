
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
public class TesteSerializadorLista {
    public static void main(String[] args) {
        try {
            Motocicleta moto1 = new Motocicleta("Honda", "Titan", 20);
            Motocicleta moto2 = new Motocicleta("Yamaha", "YBR", 30);
            Motocicleta moto3 = new Motocicleta("Kawazaki", "Ninja", 10);
            List<Motocicleta> lista = new ArrayList<Motocicleta>();
            lista.add(moto1);
            lista.add(moto2);
            lista.add(moto3);
            Serializador serializador = new Serializador();
            serializador.gravar("lista.dat", lista);    
            List<Motocicleta> listaGravada = (ArrayList<Motocicleta>) serializador.ler("lista.dat");
            System.out.println("fim");
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(TesteSerializadorLista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
