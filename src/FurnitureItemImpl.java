public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem obj = new FurnitureItem();
      //   When no values are provided for the object's attributes by the user and thus default values are being taken
        System.out.println(" Price After discount is : ₹ " + obj.calcDiscount());
        FurnitureItem obj1 = new FurnitureItem("Outdoor",1200);
        System.out.println(" Price after discount is : ₹ " + obj1.calcDiscount());
        FurnitureItem obj2 = new FurnitureItem("Indoor",1500);
        System.out.println(" Price After discount is : ₹ " + obj2.calcDiscount());
    }
}
//testing commit