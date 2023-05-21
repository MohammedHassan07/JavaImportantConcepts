package Day_02_JavaProject;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        ProductServices services = new ProductServices();
        ProductModel model = new ProductModel();

        // add products
        services.addProducts(new ProductModel("Type C", "Cable", "Black Drawer", 2024));
        services.addProducts(new ProductModel("Mac Studio", "Computer", "White Table", 2025));
        services.addProducts(new ProductModel("Focusrite Mixer", "Audio System", "White Table", 2025));
        services.addProducts(new ProductModel("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        services.addProducts(new ProductModel("Asus Rog", "Laptop", "Black Table", 2021));
        services.addProducts(new ProductModel("Macbook pro", "Laptop", "Brown Drawer", 2022));
        services.addProducts(new ProductModel("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        services.addProducts(new ProductModel("Apple Keyboard", "Keyboard", "White Table", 2022));
        services.addProducts(new ProductModel("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        services.addProducts(new ProductModel("Hdmi cable", "Cable", "Black Drawer", 2024));
        services.addProducts(new ProductModel("Java Black Book", "Cable", "Shelf", 2024));
        services.addProducts(new ProductModel("Logi Mouse", "Mouse", "Black Table", 2022));
        services.addProducts(new ProductModel("Apple Mouse", "Mouse", "White Table", 2022));
        services.addProducts(new ProductModel("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        services.addProducts(new ProductModel("BlackBeast", "Computer", "White Table", 2020));

        List<ProductModel> placeProd = services.getProductByPlace("black drawer");

        for (ProductModel e: placeProd) {
            System.out.println(e);
        }

        List<ProductModel> warnProd = services.getProductsOutOfWarranty();

//        for (ProductModel e: warnProd) {
//            System.out.println(e);
//        }
    }
}
