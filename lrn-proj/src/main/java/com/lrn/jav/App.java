package com.lrn.jav;

import com.lrn.jav.chair.Chair;
import com.lrn.jav.customer.INewChair;
import com.lrn.jav.customer.NewChair;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Chair c = new Chair();
        System.out.println("New Chair");
        NewChair chair = new NewChair();

        System.out.println("INewChair");
        INewChair newChair = new INewChair();
        newChair.armSupportFunction();

    }
}
