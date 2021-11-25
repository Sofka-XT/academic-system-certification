package co.com.sofka.util.Hu05;

public enum Actor {
    COACH  ("Coach"),
    STUDENT ("Estudiante") ;

    private final String value;

    Actor(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
