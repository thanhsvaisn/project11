public class Product {
    final int productID;
    String productName;
    double cost;
    int quantity;
    String unit;

    public Product(int productID,String productName,double cost,int quantyti,String unit){
        this.productID = productID;
        this.productName = productName;
        this.cost = cost;
        this.quantity = quantyti ;
        this.unit = unit ;
    }
    public void addQuantityProduct(int addQuantity){
        this.quantity += addQuantity;
    }
    public void reduceTheNumberOfProduct(int quantityDecreased){
        if(this.quantity >= quantityDecreased){
            quantity -= quantityDecreased;
        }
        else{
            System.out.println("Số lượng cần giảm phải nhỏ hơn số lượng sản phầm ban đầu");
        }
    }
    public void newCost(double newCost){
        this.cost = newCost;
    }
    public void checkProduct(){
        if(this.quantity == 0){
            System.out.println("Đã hết hàng");
        }
        else{
            System.out.println("Số lượng sản phẩm còn" + this.quantity);
        }
    }
    public void printInfoProduct(){
        System.out.println("Mã sản phẩm là : " + productID);
        System.out.println("Tên sản phẩm là : "+ productName);
        System.out.println("Giá tiền :" + cost +  " " + unit);

        System.out.println("số lượng :" + quantity);
        System.out.println("Đơn vị" + unit);
    }
}
