import designpattern.structural.Product;
import designpattern.structural.ProductPackage;
import designpattern.structural.ShoppingBag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingBagTest {
    @Test
    public void deveRetornarConteudoDaSacola(){
        ProductPackage productPackageOne = new ProductPackage("Fardo de água");
        ProductPackage productPackageTwo = new ProductPackage("Fardo de coca-cola");

        Product productOne = new Product("Água c/Gás", 1.09);
        productPackageOne.addProduct(productOne);

        ProductPackage productPackageThree = new ProductPackage("Combo limpeza");
        Product detergente = new Product("Dertergente liquido", 2.59);
        Product esponja = new Product("Esponja multiuso", 0.89);

        ProductPackage cestaBasica = new ProductPackage("Cesta de Produtos");

        cestaBasica.addProduct(productPackageOne);
        cestaBasica.addProduct(productPackageTwo);
        cestaBasica.addProduct(productPackageThree);

        ShoppingBag sacola = new ShoppingBag();
        sacola.setContent(cestaBasica);

        assertEquals("Pacote de produtos: Fardo de água\n"+
                "Pacote de produtos: Fardo de coca-cola\n"+
                "Pacote de produtos: Combo limpeza\n"+
                "Descrição produto: Água c/Gás valor: R$ 1.09\n"+
                        "Pacote de produtos: Cesta de Produtos\n"+
                "Descrição produto: Dertergente liquido valor: R$ 2.59\n"+
                "Descrição produto: Esponja multiuso: R$ 0.89\n"
                , sacola.getContent());




    }
}
