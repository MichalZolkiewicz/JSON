package json;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Statement {

    @SerializedName("Sid")
    private String sid;
    @SerializedName("Effect")
    private String effect;
    @SerializedName("Action")
    private List<String> action;
    @SerializedName("Resource")
    private String resource;

    public String getResource() {
        return resource;
    }
}
