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
public class GenericArrayListTest {
    public static void main(String[] args){
        //type safe to hold a list of strings
        GenericArrayList<String>strLst = new GenericArrayList<String>();
        
        strLst.add("redhat"); //compiler checks if arguments is of type String
        strLst.add("Ubuntu");
        strLst.add("zorin");
        strLst.add("noveINT");
        strLst.add("DOS");
        strLst.add("arissan");
        strLst.add("machintosh");
}
    for(int i = 0; i< strLst.size();++i){
            String str = strLst.get(i); //compiler insert the downcasting operator(String)
            System.out.println(str);
        }
        
        //strLst.add(new Integer(2016); // compiler detected arguments is NOT String, issues compilation error
        
        GenericArrayList<Integer>intLst = new GenericArrayList<Integer>();
        
        //strLst.add("redhat"); //compiler checks if arguments s of type string;
        intLst.add(new Integer(2016)); //compiler detected argument is NOT String, issues compilation NOT error
        intLst.add(new Integer(2016)); //compiler detected argument is NOT String, issues compilation NOT error
        for(int i = 0; i<intLst.size(); ++i){
            Integer elem = intLst.get(i); //compilation insert the downcasting operator(String)
            System.out.println(elem);
        }
    }
    
}