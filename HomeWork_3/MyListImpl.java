package HomeWork_3;

import HomeWork_1.Person;
import org.omg.CORBA.Object;

import java.util.*;
import java.util.function.Consumer;

/**
 * Created by ANNA on 04.10.2017.
 */
class MyListImpl implements MyList {
    private Person[] arr = new Person[0];
     public void printNames() {
          for(int i =0; i < arr.length; i++) {
              System.out.println(arr[i].name);
          }
    }

    public int size() {
        return arr.length;
    }

    public boolean isEmpty() {
        return arr.length == 0;
    }

    public boolean contains(java.lang.Object o) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    public boolean contains(Object o) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    public Iterator<Person> iterator() {
        return null;
    }

    public Object[] toArray() {
        Object[] result = new Object[arr.length];
        for(int i = 0; i < arr.length; i++){
            result[i] = (Object) arr[i];
        }
        return result;
    }

    public <T> T[] toArray(T[] a) {
        for(int i = 0; i < arr.length; i++){
            a[i] = (T) arr[i];
        }
        return a;
    }

    public boolean add(Person person) {
        //noinspection Since15
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = person;
        return true;
    }

    public boolean remove(java.lang.Object o) {
        MyListImpl newArr = new MyListImpl();
        for(Person item : arr){
            if(!item.equals(o)){
                newArr.add(item);
            }
        }
        arr = new Person[newArr.size()];
        for(int i = 0; i < newArr.size(); i++){
            arr[i] = newArr.get(i);
        }
        return true;
    }

    public boolean remove(Object o) {
        MyListImpl newArr = new MyListImpl();
        for(Person item : arr){
            if(!item.equals(o)){
                newArr.add(item);
            }
        }
        arr = new Person[newArr.size()];
        for(int i = 0; i < newArr.size(); i++){
            arr[i] = newArr.get(i);
        }
        return true;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends Person> c) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends Person> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {

    }

    public Person get(int index) {
        return null;
    }

    public Person set(int index, Person element) {
        return null;
    }

    public void add(int index, Person element) {

    }

    public Person remove(int index) {
        return null;
    }

    public int indexOf(java.lang.Object o) {
        return 0;
    }

    public int lastIndexOf(java.lang.Object o) {
        return 0;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator<Person> listIterator() {
        return null;
    }

    public ListIterator<Person> listIterator(int index) {
        return null;
    }

    public List<Person> subList(int fromIndex, int toIndex) {
        return null;
    }
}
