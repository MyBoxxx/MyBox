package SampleTreeFileView;

import java.util.ArrayList;

import Entity.Abstract_Entity;

public class DirectoryTreeModel extends Abstract_Entity {
	private ArrayList<String> dir;
	

	public DirectoryTreeModel(ArrayList<String> dir) {
		super();
		this.dir = new ArrayList<String>();
	}

	public ArrayList<String> getDir() {
		return dir;
	}

	public void setDir(ArrayList<String> dir) {
		this.dir = dir;
	}
	
}
