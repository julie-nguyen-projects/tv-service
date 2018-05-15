package com.epitech.screenfleet.tvservice.Model.Associated;

public class Composition {

    private Long id;
    private AModule module;

    public Composition(){
    }

    public Composition(Long _id, AModule _module){
        id = _id;
        module = _module;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long _id) {
        id = _id;
    }

    public AModule getModule() {
        return module;
    }
    public void setModule(AModule _module) {
        module = _module;
    }
}
