/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Dao.MascotaDao;
import Utilitarios.HibernateUtil;
import org.hibernate.Session;



/**
 *
 * @author YEFERSON
 */
public class Main06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
         MascotaDao mascotadao = new MascotaDao();

        Session sesion = HibernateUtil.getSessionFactory().openSession();
        int cantidad=mascotadao.contarMascotas(sesion);
        
        System.out.println("Canridad:: "+cantidad);

      

    }

}
