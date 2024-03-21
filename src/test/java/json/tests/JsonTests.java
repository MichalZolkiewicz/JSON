package json.tests;

import com.google.gson.Gson;
import json.Logic;
import json.RolePolicy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonTests {

    @Test
    void checkIfTrueWhenAsteriskInResourse() throws FileNotFoundException {
        Gson gson = new Gson();
        String file = ".\\data.json";

        FileReader fileReader = new FileReader(file);

        RolePolicy rolePolicy = gson.fromJson(fileReader, RolePolicy.class);
        Logic logic = new Logic();


        Assertions.assertTrue(logic.checkIfResourceHasOneAsterisk(rolePolicy));
    }

    @Test
    void checkIfFalseWhenSomethingElseInResourse() throws FileNotFoundException {
        Gson gson = new Gson();
        String file = ".\\data2.json";

        FileReader fileReader = new FileReader(file);

        RolePolicy rolePolicy = gson.fromJson(fileReader, RolePolicy.class);
        Logic logic = new Logic();


        Assertions.assertFalse(logic.checkIfResourceHasOneAsterisk(rolePolicy));
    }
}
