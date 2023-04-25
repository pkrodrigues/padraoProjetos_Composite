package designpattern.structural;

import java.util.ArrayList;
import java.util.List;

public class ProductPackage extends Content{
   private List<Content> products;

   public ProductPackage(String description){
       super(description);
       this.products = new ArrayList<Content>();
   }

   public void addProduct(Content contenct){
       this.products.add(contenct);
   }

   public String getContent(){
       String exitf = "";
       exitf = "Pacote de produtos: "+ this.getContent() + "\n";
       for(Content content : products){
           exitf += content.getContent();
       }
       return exitf;
   }


}
