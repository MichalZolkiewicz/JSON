package json;

import com.google.gson.annotations.SerializedName;

public class RolePolicy {

    @SerializedName("PolicyName")
    private String policyName;
    @SerializedName("PolicyDocument")
    private PolicyDocument policyDocument;

    public PolicyDocument getPolicyDocument() {
        return policyDocument;
    }
}
