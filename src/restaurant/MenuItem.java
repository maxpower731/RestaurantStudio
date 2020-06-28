package restaurant;

import java.util.Arrays;
import java.util.Date;

public class MenuItem {

    private Double price;
    private String name;
    private String description;
    private String category;
    private Boolean isNew;
    private Date dateCreated = new Date();

    public MenuItem(String name, Double price, String description, String category, Boolean isNew) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        String[] allowedCategories = {"appetizer", "main course", "dessert"};
        if (Arrays.stream(allowedCategories).anyMatch(category::equals)) {
            this.category = category;
        } else {
            System.out.println("Invalid category entered. Please submit a valid category.");
        }

    }

    public String getCategory() {
        return category;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = new Date();
    }
}
