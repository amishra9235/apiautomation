package api;

import Model.ProductBean;
import colesgorup.utils.ConfigReader;
import com.fasterxml.jackson.core.type.TypeReference;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class Helper {

    /*
    We read config values
    rest assured url

     */

    public static final String BASE_URL;
    public static final String BASE_URI = getProductService.GET_ALL_PRODUCTS;
    public Response res;

    static {
        try {
            BASE_URL = ConfigReader.getInstance().getString("baseurl");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public Helper() {
        RestAssured.baseURI = BASE_URL;
        RestAssured.useRelaxedHTTPSValidation();

    }

    public Response getResponseAllProduct() {
        return res = RestAssured.given().contentType(ContentType.JSON).get(BASE_URI).andReturn();

    }

    public Response getResponseSingleProduct(String id) {
        return res = RestAssured.given().contentType(ContentType.JSON).get(BASE_URI + "/" + id).andReturn();

    }

    public List<ProductBean> getAllProducts(Response res) {
        Type type = new TypeReference<List<ProductBean>>() {
        }.getType();

        return res.as(type);
    }


    public ProductBean getProductDetail(Response res) {
        Type type = new TypeReference<ProductBean>() {
        }.getType();
        return res.as(type);
    }

}
