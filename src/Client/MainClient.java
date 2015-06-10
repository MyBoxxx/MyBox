package Client;

import GUI_final.*;
import Controlers.*;
import Entity.*;
/**
 * the main class that start mybox application
 * @author Niv
 *
 */
public class MainClient {

	 public static myBoxClient clien;
	 
        public static void main(String[] args) {

               ClientGui cg = new ClientGui();
               ClientEntity ce= new ClientEntity();
               ClientController cc = new ClientController(cg,ce);

        }

}