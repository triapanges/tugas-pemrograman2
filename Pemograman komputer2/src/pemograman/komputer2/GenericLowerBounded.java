/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemograman.komputer2;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.shape.Circle;

/**
 *
 * @author HP
 */
public class GenericLowerBounded {
    public static void main(String[] argv){
        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle(10,20));
        list1.add(new Rectangle(3,20));
        calcualateArea(list1);
        
        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle(10));
        list2.add(new Circle(3));
        GenericLowerBounded.<Circle>calcualateArea(list2); //another way to write
    }
    
    public static<T> void calcualateArea(List <? super T>list)
    {
        for(int i = 0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
    
}

