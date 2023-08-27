#include<iostream>
using namespace std;

class complex
{
    int real,img;
    
    public:
    
    
          void getdata()
          {
              cout<<"Enter the real number:";
              cin>>real;
              cout<<"Enter the img number:";
              cin>>img;
          }
        //   below methode is for call by value
        //   void modify(complex x)
        //   {
        //       x.real=19;
        //       x.img=20;
        //   }
        
        // below methode is for call by reference
        
        // void modify(complex *p)
        // {
        //     p->real=19;
        //     p->img=20;
        // }
        
        // used of copy constructer.
        
        complex(int x,int y)
        {
            real=x;
            img=y;
        }
        
        complex(complex& x)
        {
            real=x.real;
            img=x.img;
        }
          
          void display()
          {
              cout<<real<<"+"<<img<<"i";
          }
};


int main()
{
    
    // static object is created
    
    // complex c;
    // complex c1;
    //   c.getdata();
    // c1.getdata();
    // // c.display();
    // c1.display();
    
    // call by value
    
    // c.modify(c1);
    // c1.display();
    
    // call by reference
    
    // c.modify(&c1);
    // c1.display();
    
    // used of copy constructer in cpp
    
    complex c(0,0);
    c.getdata();
    c.display();
    // when i write the below line compiler will call its copy constructer but as we write our own copy constructer program will not execute.
    // we cannot used call by reference becuase we dont want to change the syntax of constructer.
    // therefore we used the concept called reference variable.
    complex c1(c);
    c1.display();
    return 0;
}