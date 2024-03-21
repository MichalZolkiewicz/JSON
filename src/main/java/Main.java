import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import json.Logic;
import json.RolePolicy;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Gson gsonFile = new Gson();
        Logic logic = new Logic();
        String fileName = ".\\data.json";

        try(FileReader fileReader = new FileReader(fileName)) {

            RolePolicy rolePolicy = gsonFile.fromJson(fileReader, RolePolicy.class);
            boolean x = logic.checkIfResourceHasOneAsterisk(rolePolicy);

        } catch (JsonSyntaxException | JsonIOException | IOException e) {
            e.printStackTrace();
        }
    }
}
