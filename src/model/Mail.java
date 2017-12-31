package kata6.model;

public class Mail {
    private final String mail;
    private final int id;

    public Mail(String mail, int id) {
        this.mail = mail;
        this.id = id;
    }
    
        public String getMail() {
        return mail;
    }
        
    public int getId() {
        return id;
    }
}
