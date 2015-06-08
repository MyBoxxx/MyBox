package Entity;

import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class Folder_Entity extends Object_Entity {
		private	int	NumOfObjectIn;
		private ImageIcon image;
		public Folder_Entity(String fileName, String fileType, String modified,
				int permission, String ownerId, String path,
				String description, Boolean isDeleted, float size,
				String createDate, int numOfObjectIn, ImageIcon image) {
			super(fileName, fileType, modified, permission, ownerId, path,
					description, isDeleted, size, createDate);
			NumOfObjectIn = numOfObjectIn;
			this.image = image;
		}
		public int getNumOfObjectIn() {
			return NumOfObjectIn;
		}
		public void setNumOfObjectIn(int numOfObjectIn) {
			NumOfObjectIn = numOfObjectIn;
		}
		public ImageIcon getImage() {
			return image;
		}
		public void setImage(ImageIcon image) {
			this.image = image;
		}

		
		

}
