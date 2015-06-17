package Client;

import java.net.MalformedURLException;

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
	 
        public static void main(String[] args) 
        {
        	try{
<<<<<<< HEAD
        		clien = new myBoxClient("localhost", 5555);
=======
        		clien = new myBoxClient("192.168.10.101", 5555);
>>>>>>> refs/heads/master
        		 Splash.main();
        	}catch (Exception ee){
        		System.out.println("ERRRROOOORR");
        	}

        }

}
