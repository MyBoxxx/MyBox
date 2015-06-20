package Entity;

import java.io.File;
import java.io.Serializable;
import java.sql.Date;

public class MyFile implements Serializable {
	private int id;
	private String FileName;
	private String Path;
	private Date CreatedTime;
	private Date Modified;
	private int premission;
	private int owner;
	private int isDeleted;
	private int isDir;
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFileName() {
		return FileName;
	}



	public void setFileName(String fileName) {
		FileName = fileName;
	}



	public String getPath() {
		return Path;
	}



	public void setPath(String path) {
		Path = path;
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



	public long getFsize() {
		return Fsize;
	}



	public void setFsize(long fsize) {
		Fsize = fsize;
	}

	private String Description=null;
	private long Fsize=0;
	public  byte[] mybytearray;
	 
	public void initArray(int size)
	{
		mybytearray = new byte [size];	
	}
	
	

	public long getFSize() {
		return Fsize;
	}

	public void setFSize(long size) {
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

