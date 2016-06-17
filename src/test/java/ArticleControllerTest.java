/**
 * Created by Irina_Daniel on 6/17/2016.
 */
import com.jayway.restassured.response.Response;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;

public class ArticleControllerTest {

    @Test
    public void testGetArticle(){
      //  Response response = get("/article");
        String json = get("/article").andReturn().toString();
        System.out.println(json);
    }
}
