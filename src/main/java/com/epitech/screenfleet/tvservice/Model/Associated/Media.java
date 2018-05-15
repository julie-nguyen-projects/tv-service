package com.epitech.screenfleet.tvservice.Model.Associated;

public class Media {

    private Long id;
    private String path;
    private String name;
    private MediaType type;

    public Media(){
    }

    public Media(Long _id, String _path, String _name, MediaType _type){
        id = _id;
        path = _path;
        name = _name;
        type = _type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long _id){
        id = _id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String _path){
        path = _path;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    public MediaType getType() {
        return type;
    }

    public void setType(MediaType _type) {
        type = _type;
    }
}
