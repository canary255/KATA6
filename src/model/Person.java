package kata6.model;

public class Person {
    private int id;
    private String name;
    private Character gender;
    private String birthDate;
    private float weight;
    private String mail;

    public Person(int id, String name, Character gender, String birthDate, float weight, String mail) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.weight = weight;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Character getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public float getWeight() {
        return weight;
    }

    public String getMail() {
        return mail;
    }

    
}