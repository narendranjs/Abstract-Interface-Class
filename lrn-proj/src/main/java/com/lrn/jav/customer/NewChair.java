package com.lrn.jav.customer;

import com.lrn.jav.chair.Chair;

public class NewChair extends Chair {

    public void revolvingSupportFunction() {
        System.out.println("NewChair : Added Revolving support");
    }

    public void softSeatSupportFunction() {
        System.out.println("NewChair : Added Seat cusion");
    }

    public NewChair() {
        this.armSupportFunction();
        this.leanBackSupportFunction();
        this.seatingFunction();
        this.revolvingSupportFunction();
        this.softSeatSupportFunction();
    }
}
