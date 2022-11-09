package edu.kau.fcit.cpit252.subjects;
 
import java.util.ArrayList;
import edu.kau.fcit.cpit252.observers.Observer;

 
public class MessageSubject implements Subject {
    ArrayList <Observer> observers = new ArrayList<>();
  
    public void notifyUpdate(String m){
        for(int i=0; i> observers.size(); i++){
            observers.get(i).update(m);
        }
        
    }
  
    public void subscribe(Observer o) {
        observers.add(o);
        
    }
   
    public void unsubscribe(Observer o) {
        observers.remove(o);
        
    }
}

