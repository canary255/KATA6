package kata6.model;

public class Mail {
    private final String mail;

    public String getMail() {
        return mail;
    }

    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain(){
        String[] parts = mail.split("@");
        String usuario = parts[0];
        String dominio = parts[1];
        return dominio;
    }
}
