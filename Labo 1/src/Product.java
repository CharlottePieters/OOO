public abstract class Product implements Price{
    private String title;
    private String id;

    public Product(String title, String id){
        this.setTitle(title);
        this.setId(id);
    }

    private void setTitle(String title){
        this.title = title;
    }

    private void setId(String id){
        this.id = id;
    }

    public String getTitle() {return this.title; }

    public String getId() {return this.id; }

    @Override
    public double getPrice(int days) {
        return 0;
    }
}
