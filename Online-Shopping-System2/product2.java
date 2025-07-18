import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

abstract class product2 {

    private String name;
    private Double price;
    private int productId;
    protected String category;
    // Menambahkan atribut createdAt 
    protected LocalDateTime createdAt; 
    

    // Getter - mengambil/mengembalikan nilai
    public String getName() {
        
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public String getDateTime() {
        this.createdAt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return createdAt.format(formatter);
    }

    public abstract String getCategory();

    // Setter - memberikan nilai
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    public String getFormattedDate() {
        this.createdAt = LocalDateTime.now();
    
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return createdAt.format(formatter);
    }

    public void getInfo() {
        System.out.println(getName() + "-" + getPrice());
    }
    
}
