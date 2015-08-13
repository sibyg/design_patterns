package com.siby.designpatterns.behavioural.visitor;

import com.siby.designpatterns.behavioural.visitor.domain.Body;
import com.siby.designpatterns.behavioural.visitor.domain.Car;
import com.siby.designpatterns.behavioural.visitor.domain.Engine;
import com.siby.designpatterns.behavioural.visitor.domain.Wheel;

class CarElementDoVisitor implements ICarElementVisitor {
    public void visit(Wheel wheel) {
        System.out.println("Kicking my " + wheel.getName() + " wheel");
    }

    public void visit(Engine engine) {
        System.out.println("Starting my engine");
    }

    public void visit(Body body) {
        System.out.println("Moving my body");
    }

    public void visit(Car car) {
        System.out.println("Starting my car");
    }
}