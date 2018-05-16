package com.epitech.screenfleet.tvservice.Model.Associated;

import javax.persistence.*;

//@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AModule {

    //@Id
    protected Long id;

    //@OneToOne
    //@JoinColumn(name = "composition_id")
    protected Composition composition;

    public Long getId() {
        return id;
    }
    public void setId(Long _id){
        id = _id;
    }

    public Composition getComposition(){
        return composition;
    }

    public void setComposition(Composition _composition) {
        composition = _composition;
    }
}
