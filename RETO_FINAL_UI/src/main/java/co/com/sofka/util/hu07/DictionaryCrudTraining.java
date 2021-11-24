package co.com.sofka.util.hu07;

public enum DictionaryCrudTraining {
    ACTOR_NAME("Titanes"),
    USER ("Admin"),
    PASSWORD("admin123"),
    FALLO("Inicio de sesion fallido."),
    PIM_ASSERTION("PIM");



    String value;

    public String getValue() {
        return value;
    }

    private DictionaryCrudTraining(String value)
    {
        this.value=value;
    }
}
