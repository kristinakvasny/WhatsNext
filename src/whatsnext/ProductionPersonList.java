/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Philz zee Kill
 */
public class ProductionPersonList implements Serializable {
    
    private ArrayList<ProductionPerson> theProductionPersonList = null;
    
    public ProductionPersonList(){
        this.theProductionPersonList = new ArrayList();
    }

    public void add(ProductionPerson aPerson){
        this.theProductionPersonList.add(aPerson);
    }
    
    public String getByOccupation(String occupation){
        String temp = " ";
        
        for(int i = 0; i < theProductionPersonList.size(); i++){
            
            ProductionPerson person = theProductionPersonList.get(i);
            if(person.getOccupation().equals(occupation)){
                
                if(temp.equals(" ")){
                    temp += person.getName() + " ";
                } else {
                    temp += ", " + person.getName();
                }
            }
        }
   
        return temp;
    }
    /**
     * @return the theProductionPersonList
     */
    public ArrayList<ProductionPerson> getTheProductionPersonList() {
        return theProductionPersonList;
    }

    /**
     * @param theProductionPersonList the theProductionPersonList to set
     */
    public void setTheProductionPersonList(ArrayList<ProductionPerson> theProductionPersonList) {
        this.theProductionPersonList = theProductionPersonList;
    }
    
    
    
}
