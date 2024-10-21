package modelo;

/**
 *
 * @author zakaria Abouhammadi
 */

public final class modelo {
    
    /*
    * Nombre del Usuario.
    */
    private String nombreUsuario;
    
    /*
    * Contrasña del Usuario.
    */
    private String passwordUsuario;
    
    /**
    * Obtiene el nombre del usuario.
    * @return  Nombre Del usuario.
    */
    public String getnombreUsuario() {
        return nombreUsuario;
    }
    
    /**
    * Obtiene la contraseña del usuario.
    * @return  Contraseña del usuario.
    */
    public String getpasswordUsuario() {
        return passwordUsuario;
    }
    
    /**
    * Determina el tipo de usuario basado en el nombre de usuario y la contraseña proporcionados.
    *
    * @param nombreUsuario el nombre de usuario proporcionado
    * @param passwordUsuario la contraseña proporcionada
    * @return el tipo de usuario correspondiente ("medico", "enfermera","desconocido")
    */
    public String tipoDeUsuario(String nombreUsuario, String passwordUsuario) {     
        if (nombreUsuario.equals("medico") && passwordUsuario.equals("medico")) {
            return "medico";
        } else if (nombreUsuario.equals("enfermera") && passwordUsuario.equals("enfermera")) {
            return "cliente";
        } else {
            return "desconocido";
        }
    }
}