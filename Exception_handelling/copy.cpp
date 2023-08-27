// 1) example
// #include <iostream>
// using namespace std;

// class pratice
// {
//     private:
    
//            int a,b;
           
//     public:
//     // used of default constructer.
//           pratice()
//           {
//               a=9;
//               b=1;
//           }
//         //  used of parameterized constructer.
        
//         pratice(pratice &p)
//         {
//            a=p.a;
//            b=p.b;
//         }
        
//         void display()
//         {
//             cout<<"a="<<a<<"and"<<"b="<<b;
//         }
        
//         // used of copy constructer
        
//         // void modify(pratice &x)
//         // {
//         //     a=x.a;
//         //     b=x.b;
            
//         // }
// };

// int main()
// {
//     pratice p;
//     pratice p1(p);
//     // p.display();
//     // cout<<"\n";
//     // p1.display();
//     // since the below method is call by value.
//     // p.modify(p1);
//     p1.display();
//     p.display();
    
    
    
    
//     return 0;
// }
// 2)create the copy constructer for calculating the area of circle.

#include<iostream>
using namespace std;

class circle
{
    private:

           float r,a;

    public:

          circle(float x)
          {
            r=x;

          }
          circle(circle &c)
          {
            r=c.r;
          }
          
          

          void compute()
          {
            a=3.142 * r * r;
          }

          void display()
          {
            cout<<"Area is= "<<a;
          }
        
          
          
          

};

int main()
{
    float r;
    cout<<"Enter the radius:";
    cin>>r;
    circle c(r);
    c.compute();
    c.display();

    // creating another object to make used of copy constructer;

    cout<<"\n";

    circle c1(c);
    c1.compute();
    c1.display();
    
    
    
    
    
    
    return 0;
}

