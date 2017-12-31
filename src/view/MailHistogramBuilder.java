
package kata6.view;

import java.util.ArrayList;
import java.util.List;
import kata6.model.Histogram;
import kata6.model.Mail;
import kata6.Attribute;

public class MailHistogramBuilder <T> {

    public MailHistogramBuilder(List<T> items) {
        this.items = items;
    }
    
    private final List <T> items;
    
    public <A>Histogram<A> build (Attribute <T,A> attribute){
           Histogram<A> histo = new Histogram<>();
           for (T item : items) {
               A value = attribute.get(item);
               histo.increment(value);}
        return histo;
    }
}
