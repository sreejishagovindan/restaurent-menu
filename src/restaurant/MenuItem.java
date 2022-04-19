package restaurant;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
    private boolean isNew;
    public MenuItem(String name,String description,double price){
        this.name=name;
        this.description=description;
        this.price=price;
        this.category="not categorizes";
        this.isNew=false;
    }
    public MenuItem(String name,String description,double price, String category,boolean isNew){
        this.name=name;
        this.description=description;
        this.price=price;
        this.category=category;
        this.isNew=isNew;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getCategory(){
        return this.category;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public boolean getIsNew(){
        return this.isNew;
    }
    public void setIsNew(boolean isNew){
        this.isNew=isNew;
    }

}
