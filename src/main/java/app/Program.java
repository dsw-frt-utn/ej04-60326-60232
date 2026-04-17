package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.MenuPrincipalView;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        //reemplazamos por la vista del menu, para que el programa arranque ahi
        MenuPrincipalView menu = new MenuPrincipalView();
        menu.setVisible(true);
    }
}
