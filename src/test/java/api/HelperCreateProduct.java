package api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

import Model.CreateProductBean;
import Model.ProductBean;
import colesgorup.utils.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HelperCreateProduct {
	public static final String BASE_URL;
	public static final String BASE_URI = createNewproductService.CREATE_PRODUCTS;
	public Response res;

	static {
		try {
			BASE_URL = ConfigReader.getInstance().getString("baseurl");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public HelperCreateProduct() {
		RestAssured.baseURI = BASE_URL;
		RestAssured.useRelaxedHTTPSValidation();

	}

	public Response createResponseNewProduct(CreateProductBean ob) {

		return res = RestAssured.given().body(ob).contentType(ContentType.JSON).post(BASE_URI).andReturn();

	}

}
