package com.lrn.jav.Iface;

public interface IChair {

    public default void seatingFunction() {
        System.out.println("AChair : I can sit");
    }

    public default void armSupportFunction() {
        System.out.println("AChair : I have arm support");
    }

    public default void leanBackSupportFunction() {
        System.out.println("AChair : I can lean back");
    }
}
