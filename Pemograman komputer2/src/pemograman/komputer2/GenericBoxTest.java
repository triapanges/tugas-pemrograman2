/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemograman.komputer2;

/**
 *
 * @author HP
 */
public class GenericBoxTest {
     public static void main(String[] args){
        GenericBox<String>box1 = new GenericBox<>("Hello"); //new GenericBox<String>("Hello");
        String str = box1.getContent(); //no explicit downcasting needed
        System.out.println(box1);
        GenericBox<Integer> box2 = new GenericBox<Integer>(123); //autbox int to Integer
        int i = box2.getContent(); //downcasting to integer, auto-unbox to int
        System.out.println(box2);
        GenericBox<Double> box3 = new GenericBox<Double>(55.66); //autobox double to double
        double d = box3.getContent();
        System.out.println(box3);
    }    
}

