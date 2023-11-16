// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.



public class Main {
    public static void main(String[] args) {
    Product produtc1 = new Product(1,"BMW",10000,9,"$");
    Product product2 = new Product(2,"VolVo",13000,3,"$");
    Product product3 = new Product(3,"HSSS",10000,9,"$");
    produtc1.reduceTheNumberOfProduct(5);
    product2.addQuantityProduct(7);
    product3.addQuantityProduct(9);

    produtc1.printInfoProduct();
    product3.printInfoProduct();
    product2.printInfoProduct();

    produtc1.checkProduct();
    product3.checkProduct();
    product2.checkProduct();
    }

}