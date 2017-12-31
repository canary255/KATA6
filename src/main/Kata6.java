package kata6.main;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kata6.view.HistogramDisplay;
import kata6.model.Histogram;
import kata6.model.Mail;
import kata6.view.MailHistogramBuilder;
import kata6.view.MailListReader;

public class Kata6 {
    public static void main(String[] args) throws IOException, Exception {
        Kata6 histo = new Kata6();
        histo.execute();
    }
    
    private String filename;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private static HistogramDisplay histoDisplay;
        
    private void execute() throws Exception{
        input();
        process();
        output();
    }
    
    private void input() throws IOException{
        filename = "C:\\Users\\ismael\\Documents\\NetBeansProjects\\KATA6\\emails.txt";
        mailList = MailListReader.read(filename);
    }
    
    private void process() throws Exception{
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    private void output(){
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
 