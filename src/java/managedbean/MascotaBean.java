/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import Dao.MascotaDao;
import Entidades.Mascota;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author YEFERSON
 */
@ManagedBean
@ViewScoped
public class MascotaBean {
    private Mascota mascota;

    public MascotaBean() {
        mascota = new Mascota();
    }

    
    
    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    public String guardar(){
        MascotaDao dao = new MascotaDao();
        dao.guardarMascota(mascota);
        
        return "/RegistroMascota";
    }
    public ArrayList<Mascota> listar(){
        ArrayList<Mascota> milista = new ArrayList<>();
        MascotaDao dao = new MascotaDao();
        milista = dao.listarMascotas();
        return milista;
    }
    
    public String actualizarMascota(){
        MascotaDao dao = new MascotaDao();
        dao.actualizarMascota(mascota);
        limpiar();
        return "/RegistroMascota";
    }
    

  public String Eliminar(Mascota mascota){
      MascotaDao dao = new MascotaDao();
      boolean resp = dao.eliminarMascota(mascota);
      if(resp){
          FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registro Eliminado EXITOSAMENTE"));
      }else{
          FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("No se Elimino el Registro !!"));
      }
     
      return "/RegistroMascota";
  }
  
      public String limpiar(){
        mascota = new Mascota();
        return "/RegistroMascota";
    }
}
