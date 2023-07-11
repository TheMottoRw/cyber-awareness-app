package com.example.learningplatform;

public class ModuleModel {
    private String id;
    private String moduleName;
    private String image;
    private String level;

    public ModuleModel(String id,String level,String moduleName, String image) {
        this.id = id;
        this.level = level;
        this.moduleName = moduleName;
        this.image = image;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
