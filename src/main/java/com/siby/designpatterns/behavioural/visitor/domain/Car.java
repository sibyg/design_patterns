package com.siby.designpatterns.behavioural.visitor.domain;

import com.siby.designpatterns.behavioural.visitor.ICarElement;
import com.siby.designpatterns.behavioural.visitor.ICarElementVisitor;

public class Car implements ICarElement {
    ICarElement[] elements;

    public Car() {
        elements = new ICarElement[]{new Wheel("front left"), new Wheel("front right"), new Wheel("back left"), new Wheel("back right"), new Body(), new Engine()};
    }

    public void accept(ICarElementVisitor visitor) {
        for (ICarElement element : elements) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}
