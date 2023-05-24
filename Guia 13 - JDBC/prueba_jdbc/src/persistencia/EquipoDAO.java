
package persistencia;

import dominio.equipo.Equipo;

public final class EquipoDAO extends DAO{
    
    public void guardarEquipo(Equipo equipo) throws Exception{
    
        try {
            if (equipo == null) {
                throw new Exception("Debe indicar un equipo");
            }
            
            String sql = "INSERT INTO equipo (nombre, conferencia)"
                    + "VALUES ( '" + equipo.getNombre() + "' , '" + equipo.getConferencia() + "' );'";
            
            insertModDel(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void modificarEquipo(Equipo equipo) throws Exception{
    
        try {
            if (equipo == null) {
                throw new Exception("Debe indicar un equipo");
            }
            
            String sql = "UPDATE equipo SET"
                    + "nombre = '" + equipo.getNombre() + "' WHERE conferencia = '" + equipo.getConferencia() + "' );'";
            
            insertModDel(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void eliminarEquipo(String nombre) throws Exception{
    
        try {
            
            String sql = "DELETE FROM equipo WHERE nombre = '" + nombre + "'";
            
            insertModDel(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public Equipo buscarEquipoXnombre(String nombre) throws Exception{
    
        try {
            
            String sql = "SELECT * FROM equipo "
                    + "WHERE nombre = '" + nombre + "'";
            
            consultarBase(sql);
            
            Equipo equipo = null;
            
            while (resultado.next()) {
                equipo = new Equipo();
                equipo.setNombre(resultado.getString(1));
                equipo.setConferencia(resultado.getNString(3));
            }
            desconectarBase();
            return equipo;
            
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
}
