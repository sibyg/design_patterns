package com.siby.designpatterns.behavioural.visitor.domain;

import com.siby.designpatterns.behavioural.visitor.ICarElement;
import com.siby.designpatterns.behavioural.visitor.ICarElementVisitor;

public class Engine implements ICarElement {
    public void accept(ICarElementVisitor visitor) {
        visitor.visit(this);
    }
}
