/**
 * Created by Irina_Daniel on 6/17/2016.
 */
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONObject;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.*;


public class ArticleControllerTest {

    @Test
    public void testGetArticle(){
      //  Response response = get("/article");
        String json = get("/article").andReturn().toString();

        System.out.println(json);
    }
}
