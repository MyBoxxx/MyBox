package Entity;

import java.io.File;
import java.io.Serializable;

public class MyFile implements Serializable {
	
	private String Description=null;
	private int Fsize=0;
	public  byte[] mybytearray;
	public File theFile = new File("");
	
<<<<<<< HEAD
=======
	public File getTheFile() {
		return theFile;
	}

	public void setTheFile(File theFile) {
		this.theFile = theFile;
	}

>>>>>>> refs/heads/master
	public void initArray(int size)
	{
		mybytearray = new byte [size];	
	}
	
	public MyFile(File file) {
		theFile = file;
	}

	public int getFSize() {
		return Fsize;
	}

	public void setFSize(int size) {
		this.Fsize = size;
	}

	public byte[] getMybytearray() {
		return mybytearray;
	}
	
	public byte getMybytearray(int i) {
		return mybytearray[i];
	}

	public void setMybytearray(byte[] mybytearray) {
		
		for(int i=0;i<mybytearray.length;i++)
		this.mybytearray[i] = mybytearray[i];
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}	
}

