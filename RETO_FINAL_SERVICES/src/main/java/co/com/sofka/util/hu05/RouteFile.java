package co.com.sofka.util.hu05;

public enum RouteFile {

    DATA_VALID("src/test/resources/File/dateCreateNewCourse.Json"),
    DATA_NOT_VALID("src/test/resources/File/dataNotValidCrateCourse.Json"),
    DATA_EMPTY("src/test/resources/File/dataEmpty.Json"),
    DATA_NOT_VALID2("src/test/resources/File/dataNotValidFieldsObligatory.Json"),
    TYPE_INVALD("src/test/resources/File/typeInvalid.Json"),
    AVERAGE_INVALD("src/test/resources/File/averageInvalid.Json"),
    CONDITION_INVALD("src/test/resources/File/conditionInvalid.Json"),
    SOME_EMPTY_FIELDS("src/test/resources/File/someEmptyFields.Json"),
    EDIT_DATA("src/test/resources/File/editCourse.Json");

    private final String value;

    public String getValue() {
        return value;
    }

    RouteFile(String value) {
        this.value = value;
    }
}
