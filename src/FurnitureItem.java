public class FurnitureItem
{
    int furnitureCode;String furnitureType;int gradeOfFurniture;String colour;String furnitureUsage;double price;
    FurnitureItem()
    {
        furnitureCode=0;
        furnitureType="";
        gradeOfFurniture=0;
        colour="";
        furnitureUsage="";
        price=0;
    }
    FurnitureItem(String furnitureUsage, double price)
    {
        this.furnitureUsage=furnitureUsage;
        this.price=price;
    }
    double calcDiscount()
    {
        if (this.furnitureUsage.equalsIgnoreCase("Outdoor"))
        {
            System.out.println(" Outdoor furniture item applicable for discount ");
            this.price = this.price*(95.0/100.0);
        }
        else System.out.println(" Indoor furniture item not applicable for discount ");

        return price;
    }
}
