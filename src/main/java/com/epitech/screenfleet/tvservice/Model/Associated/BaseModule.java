package com.epitech.screenfleet.tvservice.Model.Associated;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


//@Entity
public class BaseModule extends AModule{

    //@ManyToOne
    private Media content;

    public BaseModule(){
    }

    public BaseModule(Long _id, Media _content){
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
