public class Shape {
     String color;
     boolean filled;
     Shape()
     {
    	 color="green";
    	 filled=true;
     }
     Shape(String c,boolean f)
     {
    	 color=c;
    	 filled=f;
     }
     void Shape(String g,boolean t )
     {
     color=g;
     filled=t;
     }
     String getColor()
     {
    	 return color;
     }
     public void setColor(String c)
  	{	
  		color=c;
  	}

     boolean getxxx()
     {
    	 return filled;
     }
     public void setFilled(boolean f)
  	{	
  		filled=f;
  	}

  // A public method for retrieving the radius
     public boolean isFilled()
     {
         if (filled == true)
         {
             return true;
         }
         else
         {
             return false;
         }
       }
     public String toString()
     {
    	 String IsNot=" ";
    	 if(isFilled() == false)
         {
             IsNot = "not ";
          }
             return "A Shape with color of " + color + " and is " + IsNot + " filled. ";
       }


    	 

}
