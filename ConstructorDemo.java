public class Customer{
   
           //Default Constructor
 
            public Customer(){
       
                      System.out.println("Default Constructor.......");
  
      
    }
   
 //parameterized Constructor
 
          public Customer(int id,String name,int age){
    
                            System.out.println("Parameterized Constructor called.....");
                                  System.out.println(id+" "+name+" "+age);

    }
   
   public static void main(String[] args)
  
   {
       
              Customer c1=new Customer();
     
              Customer c2=new Customer(101,"neha",22);
 
   }

}










