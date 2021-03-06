package org.ku8eye.domain;

import java.util.Date;

public class DockerImage {
	/**
	 * 内部使用，非数据库字段
	 */
	private Integer internalSeq;
	
	/**
	 * 处理进度，非数据库字段
	 */
	private Integer progress;
	/**
	 * 处理过程中的错误问题（如果有），非数据库字段
	 */
	private String processHint;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column docker_image.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column docker_image.TITLE
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column docker_image.IMAGE_NAME
     *
     * @mbggenerated
     */
    private String imageName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column docker_image.VERSION
     *
     * @mbggenerated
     */
    private String version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column docker_image.VERSION_TYPE
     *
     * @mbggenerated
     */
    private Byte versionType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column docker_image.PUBLIC_IMAGE
     *
     * @mbggenerated
     */
    private Byte publicImage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column docker_image.SIZE
     *
     * @mbggenerated
     */
    private Integer size;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column docker_image.category
     *
     * @mbggenerated
     */
    private String category;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column docker_image.CLUSTER_ID
     *
     * @mbggenerated
     */
    private Integer clusterId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column docker_image.REGISTRY_ID
     *
     * @mbggenerated
     */
    private Integer registryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column docker_image.IMAGE_ICON_URL
     *
     * @mbggenerated
     */
    private String imageIconUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column docker_image.STATUS
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column docker_image.AUTO_BUILD_COMMAND
     *
     * @mbggenerated
     */
    private String autoBuildCommand;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column docker_image.AUTO_BUILD
     *
     * @mbggenerated
     */
    private Byte autoBuild;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column docker_image.NOTE
     *
     * @mbggenerated
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column docker_image.LAST_UPDATED
     *
     * @mbggenerated
     */
    private Date lastUpdated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column docker_image.BUILD_FILE
     *
     * @mbggenerated
     */
    private String buildFile;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column docker_image.ID
     *
     * @return the value of docker_image.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column docker_image.ID
     *
     * @param id the value for docker_image.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column docker_image.TITLE
     *
     * @return the value of docker_image.TITLE
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column docker_image.TITLE
     *
     * @param title the value for docker_image.TITLE
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column docker_image.IMAGE_NAME
     *
     * @return the value of docker_image.IMAGE_NAME
     *
     * @mbggenerated
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column docker_image.IMAGE_NAME
     *
     * @param imageName the value for docker_image.IMAGE_NAME
     *
     * @mbggenerated
     */
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column docker_image.VERSION
     *
     * @return the value of docker_image.VERSION
     *
     * @mbggenerated
     */
    public String getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column docker_image.VERSION
     *
     * @param version the value for docker_image.VERSION
     *
     * @mbggenerated
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column docker_image.VERSION_TYPE
     *
     * @return the value of docker_image.VERSION_TYPE
     *
     * @mbggenerated
     */
    public Byte getVersionType() {
        return versionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column docker_image.VERSION_TYPE
     *
     * @param versionType the value for docker_image.VERSION_TYPE
     *
     * @mbggenerated
     */
    public void setVersionType(Byte versionType) {
        this.versionType = versionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column docker_image.PUBLIC_IMAGE
     *
     * @return the value of docker_image.PUBLIC_IMAGE
     *
     * @mbggenerated
     */
    public Byte getPublicImage() {
        return publicImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column docker_image.PUBLIC_IMAGE
     *
     * @param publicImage the value for docker_image.PUBLIC_IMAGE
     *
     * @mbggenerated
     */
    public void setPublicImage(Byte publicImage) {
        this.publicImage = publicImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column docker_image.SIZE
     *
     * @return the value of docker_image.SIZE
     *
     * @mbggenerated
     */
    public Integer getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column docker_image.SIZE
     *
     * @param size the value for docker_image.SIZE
     *
     * @mbggenerated
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column docker_image.category
     *
     * @return the value of docker_image.category
     *
     * @mbggenerated
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column docker_image.category
     *
     * @param category the value for docker_image.category
     *
     * @mbggenerated
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column docker_image.CLUSTER_ID
     *
     * @return the value of docker_image.CLUSTER_ID
     *
     * @mbggenerated
     */
    public Integer getClusterId() {
        return clusterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column docker_image.CLUSTER_ID
     *
     * @param clusterId the value for docker_image.CLUSTER_ID
     *
     * @mbggenerated
     */
    public void setClusterId(Integer clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column docker_image.REGISTRY_ID
     *
     * @return the value of docker_image.REGISTRY_ID
     *
     * @mbggenerated
     */
    public Integer getRegistryId() {
        return registryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column docker_image.REGISTRY_ID
     *
     * @param registryId the value for docker_image.REGISTRY_ID
     *
     * @mbggenerated
     */
    public void setRegistryId(Integer registryId) {
        this.registryId = registryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column docker_image.IMAGE_ICON_URL
     *
     * @return the value of docker_image.IMAGE_ICON_URL
     *
     * @mbggenerated
     */
    public String getImageIconUrl() {
        return imageIconUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column docker_image.IMAGE_ICON_URL
     *
     * @param imageIconUrl the value for docker_image.IMAGE_ICON_URL
     *
     * @mbggenerated
     */
    public void setImageIconUrl(String imageIconUrl) {
        this.imageIconUrl = imageIconUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column docker_image.STATUS
     *
     * @return the value of docker_image.STATUS
     *
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column docker_image.STATUS
     *
     * @param status the value for docker_image.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column docker_image.AUTO_BUILD_COMMAND
     *
     * @return the value of docker_image.AUTO_BUILD_COMMAND
     *
     * @mbggenerated
     */
    public String getAutoBuildCommand() {
        return autoBuildCommand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column docker_image.AUTO_BUILD_COMMAND
     *
     * @param autoBuildCommand the value for docker_image.AUTO_BUILD_COMMAND
     *
     * @mbggenerated
     */
    public void setAutoBuildCommand(String autoBuildCommand) {
        this.autoBuildCommand = autoBuildCommand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column docker_image.AUTO_BUILD
     *
     * @return the value of docker_image.AUTO_BUILD
     *
     * @mbggenerated
     */
    public Byte getAutoBuild() {
        return autoBuild;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column docker_image.AUTO_BUILD
     *
     * @param autoBuild the value for docker_image.AUTO_BUILD
     *
     * @mbggenerated
     */
    public void setAutoBuild(Byte autoBuild) {
        this.autoBuild = autoBuild;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column docker_image.NOTE
     *
     * @return the value of docker_image.NOTE
     *
     * @mbggenerated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column docker_image.NOTE
     *
     * @param note the value for docker_image.NOTE
     *
     * @mbggenerated
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column docker_image.LAST_UPDATED
     *
     * @return the value of docker_image.LAST_UPDATED
     *
     * @mbggenerated
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column docker_image.LAST_UPDATED
     *
     * @param lastUpdated the value for docker_image.LAST_UPDATED
     *
     * @mbggenerated
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column docker_image.BUILD_FILE
     *
     * @return the value of docker_image.BUILD_FILE
     *
     * @mbggenerated
     */
    public String getBuildFile() {
        return buildFile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column docker_image.BUILD_FILE
     *
     * @param buildFile the value for docker_image.BUILD_FILE
     *
     * @mbggenerated
     */
    public void setBuildFile(String buildFile) {
        this.buildFile = buildFile;
    }

	public Integer getInternalSeq() {
		return internalSeq;
	}

	public void setInternalSeq(Integer internalSeq) {
		this.internalSeq = internalSeq;
	}

	public Integer getProgress() {
		return progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public String getProcessHint() {
		return processHint;
	}

	public void setProcessHint(String processHint) {
		this.processHint = processHint;
	}
    
    
}