import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Model.CreateProductBean;
import Model.ProductBean;
import api.HelperCreateProduct;
import api.HelperGetProduct;
import io.restassured.response.Response;

public class CreateTest {
	Response res;

	@Test
	public void createNewProducts() throws JsonProcessingException {
		HelperCreateProduct helper = new HelperCreateProduct();
		List<String> images = new ArrayList<String>();
		images.add("https://i.imgur.com/1twoa1Dy.jpeg");
		images.add("https://i.imgur.com/1twoa1Dy.jpeg");
		CreateProductBean bean = new CreateProductBean("test1", 33, "Test Description", images, 5);
		System.out.println(bean);
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(bean);
		res = helper.createResponseNewProduct(bean);
		System.out.println(res.asString());
		Assert.assertEquals(res.statusCode() == 200, true);
	}

}
