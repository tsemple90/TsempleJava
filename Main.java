class tsempleHw5 {
  public static void main(String[] args) {//main
    Lion lion1 = new Lion("Tyler","Blue");//create lion
    Lion lion2 = new Lion("Bob");//create lion2

    System.out.println("\n");//new lion
    System.out.println(lion1.getname() +" the mountion lion is "+ lion1.getcolor() + ". The mountion lion is "+ lion1.getsize()+" cm big and it is "+ lion1.getheight() + " cm long. His favorite food to eat is "+ lion1.getfood()+".\n");//sentence

    System.out.println(lion2.getname() +" the mountion lion is "+ lion2.getcolor() + ". The mountion lion is "+ lion2.getsize()+" cm big and it is "+ lion2.getheight() + " cm long. His favorite food to eat is "+ lion2.getfood()+".\n");//sentence

    lion1.setcolor("Red");//set color
    lion1.setheight(30);//set height
    lion1.setfood("Beef");//sets food

    System.out.println(lion1.getname() +" the mountion lion is "+ lion1.getcolor() + ". The mountion lion is "+ lion1.getsize()+" cm big and it is "+ lion1.getheight() + " cm long. His favorite food to eat is "+ lion1.getfood()+".\n");//sentence

    lion2.setname("Hanana");//set name
    lion2.setcolor("Pink");//set color
    lion2.setsize(300);//set size
    lion2.setheight(3);//set height
    lion2.setfood("Carrots");//set food

    System.out.println(lion2.getname() +" the mountion lion is "+ lion2.getcolor() + ". The mountion lion is "+ lion2.getsize()+" cm big and it is "+ lion2.getheight() + " cm long. His favorite food to eat is "+ lion2.getfood()+".\n");//sentence
  }
}//tsempleHw5
class Lion{//lion
  private String name;
  private String color;
  private int size;
  private int height;
  private String food;
  
  public Lion (String name, String color){//intial varibles
    this.name=name;
    this.color=color;
    this.size=1;
    this.height=5;
    this.food = "Corn";
  }//first lion
  public Lion(String name){//intial varibles
    this.name=name;
    this.color= "Brown";
    this.size=2;
    this.height=7;
    this.food = "Tacos";
  }
  public String getname() {//get name
    return name;
  }
    public String getcolor() {//get color
    return color;
  }
    public int getsize() {//get size
    return size;
  }
    public int getheight() {//get height
    return height;
  }
    public String getfood() {//get food
    return food;
  }
  public void setname(String name) {//set name
    this.name = name; 
  }
  public void setcolor(String color) {//set color
    this.color = color; 
  }
  public void setsize(int size) {//set size
    this.size = size; 
  }
  public void setheight(int height) {//set height
    this.height = height; 
  }
  public void setfood(String food) {//set food
    this.food = food; 
  }
  
}//lion
