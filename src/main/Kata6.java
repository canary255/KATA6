package kata6.main;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kata6.view.HistogramDisplay;
import kata6.model.Histogram;
import kata6.model.Mail;
import kata6.view.MailHistogramBuilder;
import kata6.view.MailListReader;
import java.sql.SQLException;
import kata6.model.Person;
import kata6.view.DataBaseList;

public class Kata6 {
    public static void main(String[] args) throws IOException, Exception {
        Kata6 histo = new Kata6();
        histo.execute();
    }
    
    private String filename;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private static HistogramDisplay histoDisplay;
    private MailHistogramBuilder<Mail> builder;
    private Histogram<String> domains;
    private Histogram<Character> letters;
    private Histogram<Character> gender;
    private  List<Person> people;
        
    private void execute() throws Exception{
        input();
        process();
        output();
    }
    
    private void input() throws IOException{
        filename = "C:\\Users\\ismael\\Documents\\NetBeansProjects\\KATA6\\emails.txt";
        mailList = MailListReader.read(filename);
        builder = new MailHistogramBuilder<Mail>(mailList);
    }
  
    private void process()throws ClassNotFoundException, SQLException{
        domains = builder.build(new Attribute<Mail, String>() {
        @Override
        public String get(Mail item) {
            return item.getMail().split("@")[1];
        }
    });
    people = DataBaseList.read();
    MailHistogramBuilder<Person> builderPerson = new MailHistogramBuilder<>(people);
    gender = builderPerson.build(new Attribute<Person,Character>() {
        @Override
        public Character get(Person item) {
            return item.getGender();
         }
    });
        
    letters = builder.build(new Attribute<Mail, Character>() {
        @Override
        public Character get(Mail item) {
            return item.getMail().charAt(0);
        }
    });
    }
    
    private void output(){
        histoDisplay = new HistogramDisplay(histogram);
        new HistogramDisplay(domains, "Dominios").execute();
        new HistogramDisplay (letters,"Primer Caracter").execute();
        new HistogramDisplay (gender,"Gender").execute();
        histoDisplay.execute();
    }
}
 