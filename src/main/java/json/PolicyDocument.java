package json;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PolicyDocument {

    @SerializedName("Version")
    private String version;

    @SerializedName("Statement")
    private List<Statement> statement;

    public List<Statement> getStatement() {
        return statement;
    }
}
