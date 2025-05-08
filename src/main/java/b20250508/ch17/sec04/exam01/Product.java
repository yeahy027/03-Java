package b20250508.ch17.sec04.exam01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
public class Product {
    private int pno;
    private String name;
    private String company;
    private int price;

    @Override
    public String toString() {
        return new StringBuilder()
                .append("{")
                .append("pno: " + pno + ", ")
                .append("name: " + name + ", ")
                .append("company: " + company + ", ")
                .append("price: " + price)
                .append("}")
                .toString();
    }
}
