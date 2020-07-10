package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test(){
        String[]names={"Peter","John","Tony","Praise","Priest"};
        System.out.println("Second to the last is: "+names[3]);

        for(int i = 0; i<=names.length;i++){
            System.out.println(names[i]);
        }
    }

    @Test
    void enhanceForLoop(){
        String[]names={"Peter","John","Tony","Praise","Priest"};
        for(String name: names){
            System.out.println(name);
        }

        System.out.println();
        printArrayElements(names);
    }
    void printArrayElements(String[] theArray){
        for(String element: theArray){
            System.out.println(element);
        }
    }
}