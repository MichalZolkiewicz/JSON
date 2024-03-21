package json;

public class Logic {

    public boolean checkIfResourceHasOneAsterisk(RolePolicy rolePolicy) {

        String asterisk = rolePolicy.getPolicyDocument().getStatement().get(0).getResource();

        return asterisk.equals("*");
    }
}
