package co.com.sofka.util.hu005;

public enum User {

    COACH("Coach"),
    STUDENT("Estudiante") ;

    private final String value;

    User(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
