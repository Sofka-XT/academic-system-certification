package co.com.sofka.models.hu06;

public class HU06CA003Modelo {
    private String idPrograma;
    private String nombrePrograma;
    private String idCurso;
    private String nombreCurso;
    private String idCategoria;
    private int diasCategoria;
    private String nombreCategoria;

    private String fullJson;

    public HU06CA003Modelo setIdPrograma(String idPrograma) {
        this.idPrograma = idPrograma;
        return this;
    }

    public String getIdPrograma() {
        return idPrograma;
    }

    public HU06CA003Modelo setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
        return this;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public HU06CA003Modelo setIdCurso(String idCurso) {
        this.idCurso = idCurso;
        return this;
    }

    public HU06CA003Modelo setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        return this;
    }

    public HU06CA003Modelo setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
        return this;
    }

    public HU06CA003Modelo setDiasCategoria(int diasCategoria) {
        this.diasCategoria = diasCategoria;
        return this;
    }

    public HU06CA003Modelo setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
        return this;
    }

    public String getFullJson() {
        return "{\n" +
                "        \"id\": \""+idPrograma+"\",\n" +
                "        \"name\": \""+nombrePrograma+"\",\n" +
                "        \"courses\": [\n" +
                "            {\n" +
                "                \"courseId\": \""+idCurso+"\",\n" +
                "                \"courseName\": \""+nombreCurso+"\",\n" +
                "                \"categories\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": \""+idCategoria+"\",\n" +
                "                        \"days\": "+diasCategoria+",\n" +
                "                        \"categoryName\": \""+nombreCategoria+"\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        ]\n" +
                "    }";
    }

    public static HU06CA003Modelo modelado(){
        return new HU06CA003Modelo();
    }

}
