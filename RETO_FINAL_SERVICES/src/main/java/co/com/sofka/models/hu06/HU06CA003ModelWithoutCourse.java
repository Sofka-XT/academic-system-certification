package co.com.sofka.models.hu06;

public class HU06CA003ModelWithoutCourse {
    private String idPrograma;
    private String nombrePrograma;

    private String fullJson;

    public HU06CA003ModelWithoutCourse setIdPrograma(String idPrograma) {
        this.idPrograma = idPrograma;
        return this;
    }

    public String getIdPrograma() {
        return idPrograma;
    }

    public HU06CA003ModelWithoutCourse setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
        return this;
    }

    public String getFullJson() {
        return "{\n" +
                "        \"id\": \""+idPrograma+"\",\n" +
                "        \"name\": \""+nombrePrograma+"\",\n" +
                "        \"courses\": []" +
                "}";
    }

    public static HU06CA003ModelWithoutCourse modelado(){
        return new HU06CA003ModelWithoutCourse();
    }

}
