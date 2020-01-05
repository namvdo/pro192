
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  
 * @author macbook
 */
public class MyBycle implements IBook{
    public void f1(List<Book> a){
        Collections.sort(a);
        a.remove(0);
    }
    @Override
    public void f2(List<Book> a){
        Collections.sort(a, new Comparator<Book>() {
            public int compare(Book x, Book y){
                return x.getName().compareTo(y.getName());
            }
        });
    }
}
