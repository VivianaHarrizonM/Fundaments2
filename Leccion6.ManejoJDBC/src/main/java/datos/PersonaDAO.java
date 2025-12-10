
package Datos;

import domain.PersonaDTO;
import java.sql.SQLException;
import java.util.*;

public interface PersonaDAO {
    
    public List<PersonaDTO> seleccionar() throws SQLException;
    public int insertar(PersonaDTO persona) throws SQLException;
    public int modificar(PersonaDTO persona)throws SQLException;
    public int eliminar(PersonaDTO persona)throws SQLException;
    
    
}
