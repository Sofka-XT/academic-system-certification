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

    public String getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(String idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getDiasCategoria() {
        return diasCategoria;
    }

    public void setDiasCategoria(int diasCategoria) {
        this.diasCategoria = diasCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public void setFullJson(String fullJson) {
        this.fullJson = fullJson;
    }

    public String getFullJson() {
        fullJson="{\n" +
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
        return fullJson;
    }

    public String getFullJson2Program(){
        fullJson ="{\n" +
                "        \"id\": \""+idPrograma+"\",\n" +
                "        \"name\": \""+nombrePrograma+"\",\n" +
                "        \"courses\": [\n" +
                "            {\n" +
                "                \"courseId\": \""+idCurso+"\",\n" +
                "                \"courseName\": \""+nombreCurso+"\",\n" +
                "                \"categories\": [\n" +
                "                    {\n" +
                "                       \"categoryId\": \""+idCategoria+"\",\n" +
                "                        \"days\": "+diasCategoria+",\n" +
                "                        \"categoryName\": \""+nombreCategoria+"\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"categoryId\": \"44445555\",\n" +
                "                        \"days\": 5,\n" +
                "                        \"categoryName\": \"programación funcional 4\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"courseId\": \"3333344444\",\n" +
                "                \"courseName\": \"testeo funcional\",\n" +
                "                \"categories\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": \"222\",\n" +
                "                        \"days\": 3,\n" +
                "                        \"categoryName\": \"programación funciona 2\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"categoryId\": \"44455\",\n" +
                "                        \"days\": 5,\n" +
                "                        \"categoryName\": \"programación funcion1\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        ]\n" +
                "    }";
        return fullJson;
    }


}
