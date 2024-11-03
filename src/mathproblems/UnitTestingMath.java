package mathproblems;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnitTestingMath {
    /*public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

    }*/
    @BeforeClass
    public static void beforeTest(){
        System.out.println("Unit testing for mathproblems begin");
    }

    // list out all the assertion for all of the math problem classes
    @Test

    @AfterClass
    public static void afterTest(){
        System.out.println("Unit testing done!!");
    }


}
