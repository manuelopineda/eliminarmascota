/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Dao.MascotaDao;
import Entidades.Mascota;
import Utilitarios.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author YEFERSON
 */
public class Main04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        List<Mascota> lista = new ArrayList<>();

        MascotaDao mascotadao = new MascotaDao();

        Session sesion = HibernateUtil.getSessionFactory().openSession();

        lista = (ArrayList<Mascota>) mascotadao.ListarRazaMascotas(sesion,"Sandor");

        for (Mascota mascota : lista) {
            System.out.println("Nombre del Perro es: " + mascota.getNombreMascota()+" cuya raza es "+mascota.getRaza());
                  }
    }

}
