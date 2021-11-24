package co.com.sofka.util.hu07;

public enum Dictionary {
    CREATE_TRAINING("/CreateTraining"),
    DELETE("delete/"),
    GET_ALL_TRAININGS("/Trainings"),
    GET_ONE_TRAINING("/Training"),
    UPDATE_TRAINING("/updateTraining"),
    THE_RESPONSE_CODE("El código de respuesta HTTP/HTTPS debe ser: ");


    private final String value;

    public String getValue() {
        return value;
    }

    Dictionary(String value) {
        this.value = value;
    }

}
