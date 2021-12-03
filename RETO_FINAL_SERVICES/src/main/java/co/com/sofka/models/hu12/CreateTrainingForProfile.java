package co.com.sofka.models.hu12;

public class CreateTrainingForProfile {
    private String fullJson;
    private String idProfile;
    private String nameProfile;
    private String numberProfile;
    private String emailProfile;

    public String getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(String idProfile) {
        this.idProfile = idProfile;
    }

    public String getNameProfile() {
        return nameProfile;
    }

    public void setNameProfile(String nameProfile) {
        this.nameProfile = nameProfile;
    }

    public String getNumberProfile() {
        return numberProfile;
    }

    public void setNumberProfile(String numberProfile) {
        this.numberProfile = numberProfile;
    }

    public String getEmailProfile() {
        return emailProfile;
    }

    public void setEmailProfile(String emailProfile) {
        this.emailProfile = emailProfile;
    }

    public String getFullJson() {
        return "{\n" +
                "    \"trainingId\": \"Testprueba\",\n" +
                "    \"name\": \"Testprueba\",\n" +
                "    \"startingDate\": \"2022-01-21\",\n" +
                "    \"apprentices\": [\n" +
                "    {\n" +
                "        \"id\": \""+idProfile+"\",\n" +
                "        \"name\": \""+nameProfile+"\",\n" +
                "        \"phoneNumber\": \""+nameProfile+"\",\n" +
                "        \"emailAddress\": \""+emailProfile+"\"\n" +
                "    }\n" +
                "    ],\n" +
                "    \"coaches\": [{\n" +
                "        \"id\": \"wagary55\",\n" +
                "        \"name\": \"Manuel Salas\",\n" +
                "        \"phoneNumber\": \"12355656\",\n" +
                "        \"emailAddress\": \"Manuel@gmail.com\"\n" +
                "    }],\n" +
                "    \"program\": \"yyyy\"\n" +
                "}";
    }
}
