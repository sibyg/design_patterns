package com.siby.designpatterns.behavioural.visitor;

import com.siby.designpatterns.behavioural.visitor.domain.Body;
import com.siby.designpatterns.behavioural.visitor.domain.Car;
import com.siby.designpatterns.behavioural.visitor.domain.Engine;
import com.siby.designpatterns.behavioural.visitor.domain.Wheel;


public interface ICarElementVisitor {
    void visit(Wheel wheel);

    void visit(Engine engine);

    void visit(Body body);

    void visit(Car car);
}
