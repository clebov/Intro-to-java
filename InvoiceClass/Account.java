/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounttest;

/**
 *
 * @author clebo
 */
public class Account {
    // instance variable
    private String name;
    private String yearOfStudy;
    
    //public method setName
    public void setName(String name)
    {
        this.name = name;
        
    }
    
    //public method setYear
    public void setYear(String yearOfStudy)
    {
        this.yearOfStudy = yearOfStudy;
    }
    
    //public method getYear
    public String getYear()
    {
        return this.yearOfStudy;
    }
    
    
    //public method getName
    public String getName()
    {
        return this.name;
    }
}
