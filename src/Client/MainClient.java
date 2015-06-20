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
        		clien = new myBoxClient("10.0.0.10", 5555);
        		 Splash.main();
        	}catch (Exception ee){
        		System.out.println("ERRRROOOORR");
        	}

        }

}