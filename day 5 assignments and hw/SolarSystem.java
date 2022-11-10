import java.util.*;
class SolarSystem{
long distance;
long mass;
int rotation;
long size;
String location;
int yearLength;
float dayLength;
int moons;
static double weight=73;
String landscape;

void mercury()
{
	System.out.println("\nGreat!!!! You have chosen Mercury.\n");
	System.out.println("\nHere are some information about Mercury---->\n");
    size=3031;
	location="1st";
	distance=36;
	yearLength=88;
	dayLength=1416;
	moons=0;
	landscape="craters,no atmosphere,daytime temp. of 800°c(426°c)";
}

void venus()
{
	System.out.println("\nGreat!!!! You have chosen venus.\n");
	System.out.println("\nHere are some information about venus---->\n");
    size=7520;
	location="2nd";
	distance=67;
	yearLength=225;
	dayLength=5832;
	moons=0;
	landscape="rocky planet,active volcanoes,thick atmosphere,temperature stays at 900°c";
}

void earth()
{
	System.out.println("\nGreat!!!! You have chosen earth.\n");
	System.out.println("\nHere are some information about earth---->\n");
    size=7926;
	location="3rd";
	distance=93;
	yearLength=365;
	dayLength=24;
	moons=1;
	landscape="75% water cover,active volcanoes,only planet with life";
}

void mars()
{
	System.out.println("\nGreat!!!! You have chosen Mars.\n");
	System.out.println("\nHere are some information about Mars---->\n");
    size=4217;
	location="4th";
	distance=142;
	yearLength=697;
	dayLength=24.37f;
	moons=2;
	landscape="similar to earth,but no bodies of water or life as we know it";
}

void jupiter()
{
	System.out.println("\nGreat!!!! You have chosen jupiter.\n");
	System.out.println("\nHere are some information about jupiter---->\n");
    size=87000;
	location="5th";
	distance=484;
	yearLength=4380;
	dayLength=10;
	moons=16;
	landscape="gas giant,rock core,gaseous outside kept in place by gravity,spot is giant storm";
}

void saturn()
{
	System.out.println("\nGreat!!!! You have chosen saturn.\n");
	System.out.println("\nHere are some information about saturn---->\n");
    size=75000;
	location="6th";
	distance=888;
	yearLength=10585;
	dayLength=11;
	moons=18;
	landscape="gas giant,rock core,gaseous outside kept in place by gravity,rings made of dusty ice chunks";
}

void uranus()
{
	System.out.println("\nGreat!!!! You have chosen uranus.\n");
	System.out.println("\nHere are some information about uranus---->\n");
    size=31500;
	location="7th";
	distance=(long) 1.78;
	yearLength=30660;
	dayLength=17;
	moons=17;
	landscape="gas giant,rock core,gaseous outside kept in place by gravity,blue colour from methane in atmosphere";
}

void neptune()
{
	System.out.println("\nGreat!!!! You have chosen neptune.\n");
	System.out.println("\nHere are some information about neptune---->\n");
    size=31000;
	location="8th";
	distance=(long) 2.8;
	yearLength=59860;
	dayLength=16;
	moons=16;
	landscape="gas giant,windy planet,storms,blue colour from methane in atmosphere";
}

void display()
{
	System.out.println("Its size is : "+size+"(miles wide)");
	System.out.println("It is at "+location+" position in the solar system");
	System.out.println("Its distance from sun is : "+distance+"(in miles)");
	System.out.println("Its length of the year is : "+yearLength+"(earth days)");
	System.out.println("Its length of the day is : "+dayLength+"(earth hours)");
	System.out.println("It has "+moons+" moons");
	System.out.println("Some Landscapes/Descriptions about this planet is given : "+landscape);
}

public static void main(String args[]){
System.out.println(".........................Hi Welcome to The Solar System Wikipedia.............................");
System.out.println("\n\nFollowing is the list of PLANETS have a look !!\n\n");
System.out.println("..............................................................................................");
System.out.println("\n\n1. MERCURY \n2. VENUS \n3. EARTH \n4. MARS \n5. JUPITER \n6. SATURN \n7. URANUS \n8. NEPTUNE\n\n");
System.out.println("..............................................................................................");
System.out.println("\n\nSelect a PLANET you like\n\n");
System.out.println("Press 1 to know about Mercury \nPress 2 to know about venus \nPress 3 to know about earth \nPress 4 to know about mars \nPress 5 to know about jupiter \nPress 6 to know about saturn \nPress 7 to know about uranus \nPress 8 to know about neptune");
System.out.println("..............................................................................................");	
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	
	SolarSystem o1=new SolarSystem();
	
switch(choice){
       case 1:
	           o1.mercury();
               o1.display();
	           break;
	   case 2:
	           o1.venus();
	           o1.display();
	           break;
		case 3:
		       o1.earth();
               o1.display();
	           break;
        case 4:
		       o1.mars();
               o1.display();
	           break;	
        case 5:
		       o1.jupiter();
               o1.display();
	           break;
        case 6:
		       o1.saturn();
               o1.display();
	           break;	
        case 7:
		       o1.uranus();
               o1.display();
	           break;
        case 8:
		       o1.neptune();
               o1.display();
	           break;
        default :
               System.out.println("Invalid input");

			   
}
			   
	System.out.println("\n\nIf you want to know some interesting facts about the planets-----> \t Press 1 Else 2\n\n");
	int no=sc.nextInt();
	
	if(no==1)
	{
		System.out.println("Come On! Let us know your weight in different planets.....");
		System.out.println("\nPress 1 to know about Mercury \nPress 2 to know about venus \nPress 3 to know about earth \nPress 4 to know about mars \nPress 5 to know about jupiter \nPress 6 to know about saturn \nPress 7 to know about uranus \nPress 8 to know about neptune\n");
        		int b=sc.nextInt();
				switch(b){
       case 1:
	           System.out.println("So you are curious to know what your weight will be in Mercury......let us calculate then\n\n");
			   System.out.println("Your weight on mercury will be : "+(0.38*weight)+" pounds");
	           break;
	   case 2:
	           System.out.println("So you are curious to know what your weight will be in Venus......let us calculate then\n\n");
			   System.out.println("Your weight on venus will be : "+(0.91*weight)+" pounds");
	           break;
		case 3:
		       System.out.println("So you are curious to know what your weight will be in earth......let us calculate then\n\n");
			   System.out.println("Your weight on earth will be : "+(1.00*weight)+" pounds");
	           break;
        case 4:
		       System.out.println("So you are curious to know what your weight will be in mars......let us calculate then\n\n");
			   System.out.println("Your weight on mars will be : "+(0.38*weight)+" pounds");
	           break;	
        case 5:
		       System.out.println("So you are curious to know what your weight will be in jupiter......let us calculate then\n\n");
			   System.out.println("Your weight on jupiter will be : "+(2.54*weight)+" pounds");
	           break;
        case 6:
		       System.out.println("So you are curious to know what your weight will be in saturn......let us calculate then\n\n");
			   System.out.println("Your weight on saturn will be : "+(1.08*weight)+" pounds");
	           break;	
        case 7:
		       System.out.println("So you are curious to know what your weight will be in uranus...let us calculate then\n\n");
			   System.out.println("Your weight on uranus will be : "+(0.91*weight)+" pounds");
	           break;
        case 8:
		       System.out.println("So you are curious to know what your weight will be in neptune......let us calculate then\n\n");
			   System.out.println("Your weight on neptune will be : "+(1.19*weight)+" pounds");
	           break;
		default :
               System.out.println("Invalid input");
		
	}
	}
	else
	{
		System.out.println("Thank You for visiting to Solar System Wikipedia");
		System.out.println("\n\nPlease visit again soon....\n\n");
	}
	
}
}