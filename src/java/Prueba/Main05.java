/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Dao.MascotaDao;
import Entidades.Mascota;
import Utilitarios.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author YEFERSON
 */
public class Main05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //lista por id
        /*
        MascotaDao mascotadao = new MascotaDao();
        Mascota buscar = new Mascota();
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        buscar = mascotadao.getMascota(sesion, 1);
        
        System.out.println("busca:: "+buscar.getNombreCliente()+"++"+
                buscar.getNombreMascota());
         */
        //LISTAR POR NOMBRE DE MASCOTA
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        MascotaDao mascotadao = new MascotaDao();
        List<Mascota> lista = mascotadao.listarxNombreMascota(sesion, "Sandor");
        for (Mascota mascota : lista) {
            System.out.println(mascota.getIdMascota()+"\t \t"+"Nombre Mascota: "+mascota.getNombreCliente()+"\t \t"+ "Nombre Mascota: "+
                    mascota.getNombreMascota()+"\t \t"+mascota.getRaza());
        }
        

    }

}
