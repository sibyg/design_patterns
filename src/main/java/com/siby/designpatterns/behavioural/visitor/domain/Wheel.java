package com.siby.designpatterns.behavioural.visitor.domain;

import com.siby.designpatterns.behavioural.visitor.ICarElement;
import com.siby.designpatterns.behavioural.visitor.ICarElementVisitor;

public class Wheel implements ICarElement {
    public Wheel(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void accept(ICarElementVisitor visitor) {
        visitor.visit(this);
    }
}
