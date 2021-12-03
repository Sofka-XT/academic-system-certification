package co.com.sofka.util.hu05;

public enum Resources {

    DELETE_COURSE("course/delete/"),
    CREATE_COURSE("course/create"),
    GET_ALL_COURSE("course/getAll"),
    UPDATE_COURSE("course/update"),
    GET_BY_ID("course/getById/");

    private final String value;

    public String getValue() {
        return value;
    }

    Resources(String value) {
        this.value = value;
    }

}
