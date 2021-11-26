package co.com.sofka.util.hu05;

public enum Resources {

    RESOURCE_CREATE("/course/create"),
    RESOURCE_DELETE( "course/delete/{id}"),
    RESOURCE_GETALL("/course/getAll"),
    RESOURCE_UPDATE( "/course/update");

    private final String value;

    public String getValue() {
        return value;
    }

    Resources(String value) {
        this.value = value;
    }

}
