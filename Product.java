import java.util.Objects;

public class Product{

                                                //variables declaration
private int id;
private String name;
private int price;
private int quant;
private static int counter=0;

                                                      //constructor
public Product(String name,int price,int quant){
this.id=String.format("%03d",++counter);
this.name=name;
this.price=price;
this.quant=quant;
}
public Product(String name,int price){
this(name,price,0);
}
public Product(String name){
this(name,0);
}

                                       //set methods
public void setname(String name){
this.name=name;
}
public void setprice(int price){
this.price=price;
}
public void setquant(int quant){
this.quant=quant;
}

                                    //get function
public String getname(){
return name;
}
public int getprice(){
return price;
}
public int getquant(){
return quant;
}
public int getid(){
return id;
}


}