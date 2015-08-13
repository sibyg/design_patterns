package com.siby.designpatterns.behavioural.visitor;

import com.siby.designpatterns.behavioural.visitor.domain.Body;
import com.siby.designpatterns.behavioural.visitor.domain.Car;
import com.siby.designpatterns.behavioural.visitor.domain.Engine;
import com.siby.designpatterns.behavioural.visitor.domain.Wheel;

class CarElementPrintVisitor implements ICarElementVisitor {
    public void visit(Wheel wheel) {
        System.out.println("Visiting " + wheel.getName() + " wheel");
    }

    public void visit(Engine engine) {
        System.out.println("Visiting engine");
    }

    public void visit(Body body) {
        System.out.println("Visiting body");
    }

    public void visit(Car car) {
        System.out.println("Visiting car");
    }
}