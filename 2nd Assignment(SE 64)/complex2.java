public class complex2
{ 
   private int real ,img,re;

   public complex2(int x,int y)
   {
      real=x;
      img=y;
   }
   
   public void add(complex2 x,complex2 y)
   {
      real=x.real + y.real;
      img=x.img + y.img;

   }

   public void sub(complex2 x,complex2 y)
   {
      real=x.real - y.real;
      img=x.img - y.img;
   }

   public void mul(complex2 x , complex2 y)
   {
      real=((x.real*y.real) + (x.img * y.img)*(-1));
      img=(x.real * y.img) + (x.img * y.real);
   }
   
   public void div(complex2 x,complex2 y)
   {
      re=((y.real)*(y.real)) + ((y.img)*(y.img)) ;     
      real=((x.real*y.real) + (x.img * y.img))/re;
      img=((x.img*y.real)- (x.real *y.img))/re;
   
   }
   
   
   public void display()
   {
      System.out.println("The  Real And Imginary Part is :");
      System.out.println(real+"+"+img+"i");
   }
}
