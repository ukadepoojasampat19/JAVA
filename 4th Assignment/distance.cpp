#include<iostream>
using namespace std;


class meter_cm;
class feet_inches
{   
    float feet,inches;

    public:

           void getdata();
        //   void display();
           friend feet_inches add(feet_inches x, meter_cm y);
           void display();
           friend meter_cm add(meter_cm x, feet_inches y);

             
};

void feet_inches :: getdata()
{
    cout<<"Enter the value of feet:";
    cin>>feet;
    cout<<"Enter the value of inches:";
    cin>>inches;
}

// void feet_inches :: display()
// {
//     cout<<"feet="<<feet<<"\n";
//     cout<<"inches="<<inches<<"\n";
// }
class meter_cm
{
    float meter,cm;

    public:

           void getdata();
        //   void display();
           friend feet_inches add(feet_inches x, meter_cm y);
           friend meter_cm add(meter_cm x, feet_inches y);
           void display();

            
};

void meter_cm :: getdata()
{
    cout<<"Enter the value of meter:";
    cin>>meter;
    cout<<"Enter the value of cm:";
    cin>>cm;
}

// void meter_cm:: display()
// {
//     cout<<"meter="<<meter<<"\n";
//     cout<<"cm="<<cm<<"\n";
// }

feet_inches add(feet_inches x, meter_cm y)
{
    feet_inches temp;
    float store;
    int due;
    float result_1,result_2;
    result_1=(x.feet)*12 + (y.meter) *39.37;
    result_2=(x.inches) + (y.cm) *0.394;

    // store =(result_1 - result_2);
    cout<<"\n";
    cout<<"Addition of result1= "<<result_1<<"\n";
    cout<<"Addition of result2= "<<result_2<<"\n";
    store =(result_1 - result_2);
    cout<<"\n";
    cout<<"Subtraction of result and result 2 is:"<<store<<"\n";
    due=(int)store;
    cout<<"\n";
    cout<<"Value after converting into integer is:"<<due<<"\n";
    temp.feet=(due)/12;
    temp.inches=(due)%12;
    if(temp.inches<0)
    {
        temp.inches=-(temp.inches);
    }
    

    
    
    // if(temp.inches > 12.00)
    // {
    //     cout<<"the sum of inches is >12 conversion in feet is :"<<"\n"; 
    //     temp.inches=(temp.inches)*3.28;
    // }
      return temp;
}
void feet_inches :: display()
{
    cout<<"the addition of feet is: "<<feet<<"\n";
    cout<<"the addition of inches is:"<<inches<<"\n";
}
meter_cm add(meter_cm x, feet_inches y)
{
    meter_cm temp;
    float result_1,result_2;
    float store;
    int due;
    result_1=(x.meter)/100 +( (y.feet)/30.48);
    result_2=x.cm + (y.inches)/2.54;
    
    cout<<"Addition of result1 is:"<<result_1<<"\n";
    cout<<"Addition of result2 is:"<<result_2<<"\n";
    cout<<"\n";
    
    store=(result_1 - result_2);
    cout<<"Subtraction of result1 and result2 is:"<<store<<"\n";
    cout<<"\n";
    due=(int)store;
    cout<<"Value after convert it into integer is: "<<due<<"\n";
    temp.meter=(due)/100;
    temp.cm=(due)%100;
    if(temp.cm<0)
    {
        temp.cm=-(temp.cm);
    }


    
    // if(temp.cm >100)
    // {
    //     cout<<"the sum of cm is > 100 so conversion in meter is :"<<"\n";
    //     temp.cm =temp.cm/100;
    // }
    return temp;
}

void meter_cm :: display()
{
    cout<<"the addition of meter is: "<<meter<<"\n";
    cout<<"the addition of cm is:"<<meter;
}

int main()
{
    feet_inches f1;

    f1.getdata();
    // f1.display();
    meter_cm m1;

    m1.getdata();
    // m1.display();
    
    feet_inches f2;
    f2= add(f1,m1);
    f2.display();
    cout<<"\n";
    cout<<"Conversion in the form of meter and cm :";
    cout<<"\n";
    
    meter_cm m2;
    m2= add(m1,f1);
    m2.display();
    
    
    
    
    return 0;
}