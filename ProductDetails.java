import java.util.*;
class Product
{
 String pcode,pname;
 double price;
 void details()
 {
  System.out.println("PRODUCT DETAILS");
  System.out.println("Pcode:" +pcode);
  System.out.println("Pname:" +pname);
  System.out.println("Price:" +price);
  
 }
}
public class ProductDetails
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  Product p1=new Product();
  System.out.println("\nEnter Product code: ");
  p1.pcode=sc.next();
  System.out.println("Enter Product name: ");
  p1.pname=sc.next();
  System.out.println("Enter Product price: ");
  p1.price=sc.nextInt();
  System.out.println("\nProduct1:");
  p1.details();
  
  Product p2=new Product();
  System.out.println("\nEnter Product code: ");
  p2.pcode=sc.next();
  System.out.println("Enter Product name: ");
  p2.pname=sc.next();
  System.out.println("Enter Product price: ");
  p2.price=sc.nextInt();
  System.out.println("\nProduct2:");
  p2.details();
  
  Product p3=new Product();
  System.out.println("\nEnter Product code: ");
  p3.pcode=sc.next();
  System.out.println("Enter Product name: ");
  p3.pname=sc.next();
  System.out.println("Enter Product price: ");
  p3.price=sc.nextInt();
  System.out.println("\nProduct3:");
  p3.details();
  
  if(p1.price<p2.price && p1.price<p3.price)
  {
   System.out.println("\nProduct1 has the lowest price.");
   p1.details();
  }
  else if(p2.price<p3.price)
        {
            System.out.println("\nProduct2 has the lowest price.");
   p2.details();
        }
        else
  {
         System.out.println("\nProduct3 has the lowest price.");
   p3.details();
  }
 }
}
