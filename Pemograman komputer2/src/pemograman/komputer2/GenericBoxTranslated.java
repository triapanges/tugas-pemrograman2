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
public class GenericBoxTranslated {
    //private variable;
    private Object content;
    
    //constructor
    public GenericBoxTranslated(Object content){
        this.content = content;
    }
    
    public Object getContent(){
        return content;
    }
    
    public void setContent(Object content){
        this.content = content;
    }
    
    @Override
    public String toString(){
        return content + "("+content.getClass()+")";
    }
    
    
}
}
