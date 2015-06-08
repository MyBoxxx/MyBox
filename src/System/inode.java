package System;

import java.nio.file.Files;
import java.sql.Date;

public class inode {
private String name;
private String type;
private String modified;
private int permission;
private int ownerId;
private String path;
private String description;
private Boolean isDeleted;
private Long size;
private Date CreateDate;
public inode(String name, String type, String modified, int permission,
		int ownerId, String path, Long size) {
	super();
	this.name = name;
	this.type = type;
	this.modified = modified;
	this.permission = permission;
	this.ownerId = ownerId;
	this.path = path;
	this.size = size;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getModified() {
	return modified;
}
public void setModified(String modified) {
	this.modified = modified;
}
public int getPermission() {
	return permission;
}
public void setPermission(int permission) {
	this.permission = permission;
}
public int getOwnerId() {
	return ownerId;
}
public void setOwnerId(int ownerId) {
	this.ownerId = ownerId;
}
public String getPath() {
	return path;
}
public void setPath(String path) {
	this.path = path;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Boolean getIsDeleted() {
	return isDeleted;
}
public void setIsDeleted(Boolean isDeleted) {
	this.isDeleted = isDeleted;
}
public Long getSize() {
	return size;
}
public void setSize(Long size) {
	this.size = size;
}
public Date getCreateDate() {
	return CreateDate;
}
public void setCreateDate(Date createDate) {
	CreateDate = createDate;
}


}
