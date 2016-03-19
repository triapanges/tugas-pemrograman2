/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemograman.komputer2;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class GenericWildcardTest {
     public static void printList(List<Object>lst){
        for(Object o : lst) System.out.println();
    }
    
    public static void main(String[] args){
        List<Object> objLst = new ArrayList<Object>();
        objLst.add(new Integer(55));
        objLst.add(new Integer(551));
        objLst.add(new Integer(552));
        printList(objLst); // matches
        
        List<String> strLst = new ArrayList<String>();
        strLst.add("1");
        strLst.add("2");
        strLst.add("3");
        //printList(strLst); // compilation error
    }
    
}
