package com.epitech.screenfleet.tvservice.Model.Associated;

import java.util.ArrayList;

public class SlideView extends AModule{

    private int nbSlide;
    private ArrayList slides;

    public SlideView(){
        nbSlide = 0;
        slides = new ArrayList();
    }

    public SlideView(Long _id, int _nbSlide, ArrayList _slides){
        id = _id;
        nbSlide = _nbSlide;
        slides = _slides;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long _id) {
        id = _id;
    }

    public int getNbSlide() {
        return nbSlide;
    }
    public void setNbSlide(int _nbSlide) {
        nbSlide = _nbSlide;
    }

    public ArrayList getSlides() {
        return slides;
    }
    public void setSlides(ArrayList slides) {
        this.slides = slides;
    }

    public void addSlide(AModule _module){
        slides.add(_module);
    }

    public boolean removeSlide(int _nbSlide){
        if (nbSlide < _nbSlide){
            return false;
        }else{
            slides.remove(_nbSlide);
            return true;
        }
    }
}
