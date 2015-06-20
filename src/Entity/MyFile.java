package Entity;

import java.io.File;
import java.io.Serializable;
import java.sql.Date;

public class MyFile implements Serializable {
	private int FileID;
	private Date CreatedTime;
	private Date Modified;
	private int premission;
	private int owner;
	private int isDeleted;
	private int isDir;
	private String Path;
	private String Description=null;
	private int Fsize=0;
	private  byte[] mybytearray;
	private File theFile = new File("");
	
	public File getTheFile() {
		return theFile;
	}

	public void setTheFile(File theFile) {
		this.theFile = theFile;
	}

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
	public int getFileID() {
		return FileID;
	}

	public void setFileID(int fileID) {
		FileID = fileID;
	}

	public Date getCreatedTime() {
		return CreatedTime;
	}

	public void setCreatedTime(Date createdTime) {
		CreatedTime = createdTime;
	}

	public Date getModified() {
		return Modified;
	}

	public void setModified(Date modified) {
		Modified = modified;
	}

	public int getPremission() {
		return premission;
	}

	public void setPremission(int premission) {
		this.premission = premission;
	}

	public int getOwner() {
		return owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public int getIsDir() {
		return isDir;
	}

	public void setIsDir(int isDir) {
		this.isDir = isDir;
	}

	public String getPath() {
		return Path;
	}

	public void setPath(String path) {
		Path = path;
	}

	public int getFsize() {
		return Fsize;
	}

	public void setFsize(int fsize) {
		Fsize = fsize;
	}

}

