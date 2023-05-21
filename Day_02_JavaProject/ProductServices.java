package Day_02_JavaProject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductServices {

    List<ProductModel> list = new ArrayList<>();

    // Method to add products
    public void addProducts(ProductModel model) {
        list.add(model);
    }

    // Method to get Products by place
    public List<ProductModel> getProductByPlace(String place) {

        List<ProductModel> prodList = new ArrayList<>();

        Stream<ProductModel> products = list.stream();

        products.forEach(model -> {

            String temp = model.getProductPlace().toLowerCase();
            if (place.toLowerCase().equals(temp))

                prodList.add(model);

        });
        return prodList;
    }


    // Method to get Products which is out of warranty
    public List<ProductModel> getProductsOutOfWarranty() {

        List<ProductModel> prodList = new ArrayList<>();
        Stream<ProductModel> products = list.stream();

        products.forEach(model-> {

            if (model.getProductWarranty() < LocalDate.now().getYear())
                prodList.add(model);
        });

        return prodList;
    }
}
