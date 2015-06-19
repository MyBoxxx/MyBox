package Entity;

public class File_Entity extends Object_Entity {
	
		private	String	FileType;

		public String getFileType() {
			return FileType;
		}

		public void setFileType(String fileType) {
			FileType = fileType;
		}

		public File_Entity(String fileName, String fileType, String modified,
				int permission, String ownerId, String path,
				String description, Boolean isDeleted, float size,
				String createDate, String fileType2) {
			super(fileName, fileType, modified, permission, ownerId, path,
					description, isDeleted, size, createDate);
			FileType = fileType2;
		}

}
