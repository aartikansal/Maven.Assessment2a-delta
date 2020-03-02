package rocks.zipcode.assessment2.generics;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T> implements  Iterable<T>{
    private ArrayList<T> home;
    public Shelter() {
        this .home =new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public Iterator<T> iterator(){
        return home.iterator();
    }
    public int size() {

        return home.size();
    }

    public void add(Object object) {
        home.add((T)object);
    }

    public Boolean contains(Object object) {

        return null;
    }

    public void remove(Object object) {
        this.home.remove((T) object);
    }

    public Object get(Integer index) {

        return null;
    }

    public Integer getIndexOf(Object ageable) {

        Integer index= null;
        for (int i =0; i<size();i++){
            if(this.home.get(i)==(T)ageable){
                index=i;
            }
        }
        return null;
    }
}