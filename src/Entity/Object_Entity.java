package Entity;

@SuppressWarnings("serial")
public class Object_Entity extends AbstractEntity_Entity {
	
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	public String getFileType() {
		return FileType;
	}
	public void setFileType(String fileType) {
		FileType = fileType;
	}
	public String getModified() {
		return Modified;
	}
	public void setModified(String modified) {
		Modified = modified;
	}
	public int getPermission() {
		return Permission;
	}
	public void setPermission(int permission) {
		Permission = permission;
	}
	public String getOwnerId() {
		return OwnerId;
	}
	public void setOwnerId(String ownerId) {
		OwnerId = ownerId;
	}
	public String getPath() {
		return Path;
	}
	public void setPath(String path) {
		Path = path;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Boolean getIsDeleted() {
		return IsDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		IsDeleted = isDeleted;
	}
	public float getSize() {
		return Size;
	}
	public void setSize(float size) {
		Size = size;
	}
	public String getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(String createDate) {
		CreateDate = createDate;
	}
	private	String	FileName;
    private	String	FileType;
	private	String	 Modified;
	private	int	 Permission;
	private	String	OwnerId;
	private	String	Path;
	private	String	Description;
	private	Boolean	IsDeleted;
	private	float	Size;
    protected	String	CreateDate;
	public Object_Entity(String fileName, String fileType, String modified,
			int permission, String ownerId, String path, String description,
			Boolean isDeleted, float size, String createDate) {
		super();
		FileName = fileName;
		FileType = fileType;
		Modified = modified;
		Permission = permission;
		OwnerId = ownerId;
		Path = path;
		Description = description;
		IsDeleted = isDeleted;
		Size = size;
		CreateDate = createDate;
	}
}
