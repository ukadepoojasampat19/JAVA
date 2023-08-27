#include<iostream>
using namespace std;

public class complex
{
    private:
            int real,img;

    public:
    
           complex()
           {
               real=10;
               img=23;
           }

           complex(int real,int img)
           {
            this.real=real;
            this.img=img;
           }

           void modify(complex obj){
            obj.real=10;
            obj.img=20;

           }

           public void display()
           {
               cout<<real <<"+"<<img<<"i";
           }
}

int main()
{
    complex c1(1,2);
    complex c2(3,4);
    c1.display();
   
}

        
        
           


          

    
    
    
    
    
    