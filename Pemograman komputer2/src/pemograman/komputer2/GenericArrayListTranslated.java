/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemograman.komputer2;
import java.util.Arrays;
/**
 *
 * @author HP
 */
public class GenericArrayListTranslated {
    private int size;
    private Object[]elements;
    
    public GenericArrayListTranslated(){
        elements = new Object[3];
        size = 0;
}
     public void add(Object element){
        if(size<elements.length){
            elements[size] = element;
        }else{
            
            System.out.println("Alocating new size of Array");
            Object[]temp = Arrays.copyOf(elements,elements.length + 3);
            elements = temp;
            elements[size] = element;
            System.out.println("Size:"+elements.length);
        }
        ++size;
    }
    
    public Object get(int index){
        if(index>=size)
            throw new IndexOutOfBoundsException("Index:"+index+".size:"+size);
        return(Object)elements[index];
    }
    
    public int size(){
        return size;
    }
}
