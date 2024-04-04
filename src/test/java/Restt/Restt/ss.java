package Restt.Restt;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
 
public class ss {
 
    @Test
    public void Get() { 
        RestAssured.baseURI = "https://gorest.co.in/public/v2/users";
        RequestSpecification httpRequest = RestAssured.given(); 
        Response response = httpRequest.request(Method.GET, "");
        int a = 200 ;
        
        if(a  == 200) {
            System.out.println("Request successful! Status received: " + response.getStatusCode()); 
            System.out.println("Response Body: ");
            System.out.println(response.getBody().asString());
            response.prettyPeek();
        } else {
            System.out.println("Request failed! Status received: " + response.getStatusCode());
        }
    }
    @Test
    public void post() {
        RestAssured.baseURI ="https://reqres.in/api/users"; 
        RequestSpecification request = RestAssured.given(); 
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "morpheus");
        requestParams.put("job", "male"); 
        request.body(requestParams.toJSONString());
        Response response = request.post("/Users"); // Corrected to perform a POST request
        ResponseBody body = response.getBody();
        System.out.println(response.getStatusLine());
        System.out.println(body.asString());
    }
    

    
    @Test
    public void put() {
        RestAssured.baseURI ="https://reqres.in/api/users"; 
        RequestSpecification request = RestAssured.given(); 
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "mor");
        requestParams.put("job", "Vella"); 
        request.body(requestParams.toJSONString());
        Response response = request.post("/Users"); // Corrected to perform a POST request
        ResponseBody body = response.getBody();
        System.out.println(response.getStatusLine());
        System.out.println(body.asString());
    }
    
    
    @Test
    
    public void delete() {
        RestAssured.baseURI = "https://reqres.in/api/users";
        RequestSpecification request = RestAssured.given();
        Response response = request.delete("/2"); // Assuming you want to delete user with ID 2
        int statusCode = response.getStatusCode(); // Get status code
        System.out.println("Response status code: " + statusCode); // Print status code
        System.out.println("Response body: " + response.getBody().asString()); // Print response body
    }
}
    
    

