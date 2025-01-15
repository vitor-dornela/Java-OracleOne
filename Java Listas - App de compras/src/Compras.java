import java.util.ArrayList;
import java.util.List;

public class Compras {

    private String item;
    private double price;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




    public String showPurchases() {
        return """
                **************************
                COMPRAS REALIZADAS:
                
                Item    -   Valor
                %s      -   R$ %.2f
               
                **************************
                """.formatted();
    }
}
