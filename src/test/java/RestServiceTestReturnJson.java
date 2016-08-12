import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.parsing.Parser;
import com.jayway.restassured.path.xml.XmlPath;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Irina_Daniel on 8/4/2016.
 */
public class RestServiceTestReturnJson {

    @Test
    public void testCorrectReturnRestService() {

       String xml = get("http://parabank.parasoft.com/parabank/services/bank/customers/12212/").andReturn().asString();


//        get("/article").then().defaultParser(Parser.JSON).assertThat().body("title",equalTo("Java"));



        //System.out.println(get("/article").andReturn().asString());

    }
}
