package com.epitech.screenfleet.tvservice.Model.Associated;

public class BasicModule extends AModule{

    private Media content;

    public BasicModule(){
    }

    public BasicModule(Long _id, Media _content){
        id = _id;
        content = _content;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long _id) {
        id = _id;
    }

    public Media getContent() {
        return content;
    }
    public void setContent(Media _content) {
        content = _content;
    }
}
