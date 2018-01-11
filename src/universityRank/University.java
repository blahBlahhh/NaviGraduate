package universityRank;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class University
{
	private StringProperty rank;
	private StringProperty name;  
    private StringProperty sat;  
    private StringProperty rate;  
    
    public University(StringUniversity University)
    {  
    	this.rank = new SimpleStringProperty(University.getRank());
        this.name = new SimpleStringProperty(University.getName());  
        this.sat = new SimpleStringProperty(University.getSAT());
        this.rate = new SimpleStringProperty(University.getRate());
    }  
    
    public String getRank()
    {
    	return rank.get();
    }
    public String getName() 
    {  
        return name.get();  
    }  
    public String getSAT() 
    {  
        return sat.get();  
    }  
    public String getRate()
    {  
        return rate.get();  
    }  
    
    public void setRank(String rank)
    {
    	this.rank.set(rank);
    }
    public StringProperty rankProperty()
    {
    	return rank;
    }
  
    public void setName(String name) {  
        this.name.set(name);  
    }  
    public StringProperty nameProperty() {  
        return name;  
    }  
  
    public void setSAT(String sat) {  
        this.sat.set(sat);  
    }
    public StringProperty SATProperty() {  
        return sat;  
    }  
  
    public void setRate(String rate) {  
        this.rate.set(rate);  
    } 
    public StringProperty rateProperty() {  
        return rate;  
    }  
}
