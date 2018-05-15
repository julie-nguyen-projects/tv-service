package com.epitech.screenfleet.tvservice.Model.Associated;

public class SplitView extends AModule{

    private AModule split1;
    private AModule split2;
    private TypeSplit type;

    public SplitView(){
    }

    public SplitView(Long _id, AModule _split1, AModule _split2, TypeSplit _type){
        id = _id;
        split1 = _split1;
        split2 = _split2;
        type = _type;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long _id){
        id = _id;
    }

    public AModule getSplit1() {
        return split1;
    }
    public void setSplit1(AModule _split1) {
        split1 = _split1;
    }

    public AModule getSplit2() {
        return split2;
    }
    public void setSplit2(AModule _split2) {
        split2 = _split2;
    }

    public TypeSplit getType() {
        return type;
    }
    public void setType(TypeSplit _type){
        type = _type;
    }
}
