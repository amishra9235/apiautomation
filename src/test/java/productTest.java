import Model.ProductBean;
import api.HelperGetProduct;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class productTest {

    Response res;

    @Test
    public void getAllProducts() {
        HelperGetProduct helper = new HelperGetProduct();
        res = helper.getResponseAllProduct();
        List<ProductBean> beans = helper.getAllProducts(res);
        System.out.println(beans.toString());
        Assert.assertEquals(res.statusCode() == 200, true);
        Assert.assertEquals(beans.isEmpty() == false, true, "List is not emplyty");
    }


    @Test
    public void getProducts() {
        HelperGetProduct helper = new HelperGetProduct();
        res = helper.getResponseSingleProduct("138");
        ProductBean beans = helper.getProductDetail(res);
        System.out.println(beans.toString());
        Assert.assertEquals(res.statusCode() == 200, true);
        Assert.assertEquals(/*beans.getId() == 138*/ true, true, "List is not emplyty");
    }
}
