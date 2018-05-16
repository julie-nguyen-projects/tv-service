package com.epitech.screenfleet.tvservice.Model;

import com.epitech.screenfleet.tvservice.Model.Associated.Composition;

import javax.persistence.*;

@Entity
public class Tv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String ipAdress;


    private String name;

    private Long compositionId;

    public Tv(){
    }

    public Tv(String _ip, String _name, Long _compo){
        ipAdress = _ip;
        name = _name;
        compositionId  = _compo;
    }

    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String _ipAdress) {
        ipAdress = _ipAdress;
    }

    public Long getCompositionId() {
        return compositionId;
    }

    public void setCompositionId(Long composition) {
        this.compositionId = composition;
    }
}
