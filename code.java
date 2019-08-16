import java.util.Scanner;
class A
{
/*declaration of variables is done her*/
int ch,c,vage,sage;
String vname,vadd,vgen,vcase,vpho;
String sname,sadd,sgen,spho;

void method1()
{
/*----------------------------------------------------------------MODULE1--------------------------------
-------------------------*/
/*This module helps the taken in case and select either civil/criminalcase */
System.out.println("\t\t\twelcome to police complaint system");
System.out.println("\t\t\t\t FIR FILING ");
System.out.println("select type of case");
System.out.println(" \tpress 1 for criminal case");
System.out.println("\tpress 2 for civilcase");
Scanner ob=new Scanner(System.in);
ch = ob.nextInt();
if((ch ==1) || (ch ==2))
{
if (ch==1)
System.out.println("it is criminal case");
else
System.out.println("it is civil case");
}
System.out.println("enter the case in to FIR");
vcase = ob.next()+ob.nextLine();
/*--------------------------------------------MODULE2----------------------------------------------------
-----------------------*/
/*This module deals with storing details of victim like name,age, gender,address and phone
no*/
System.out.println("\t\t\t\t\t\t ENTER VICTIMS DETAILS");
System.out.println("enter victim NAME");
vname =ob.next()+ob.nextLine();
System.out.println("enter AGE ");
vage = ob.nextInt();
System.out.println("enter GENDER");
vgen =ob.next();
System.out.println("enter ADDRESS");
vadd =ob.next()+ob.nextLine();
System.out.println("enter phone number");
vpho =ob.next()+ob.nextLine();

/*-------------------------------------------------MODULE3-----------------------------------------------
--------------------*/
/*This module wholly deals with storing suspect details as given by the victim /complainer*/
System.out.println("\t\t\t\t\t\t ENTER SUSPECT DETAILS");
System.out.println("enter suspect NAME");
sname =ob.next()+ob.nextLine();
System.out.println("enter AGE ");
sage =ob.nextInt();
System.out.println("enter GENDER");
sgen =ob.next();
System.out.println("enter ADDRESS");
sadd =ob.next();
System.out.println("enter phone number");
spho =ob.next()+ob.nextLine();

/*----------------------------------------------MODULE4--------------------------------------------------
----------------------*/
/*This module wholly details with investigation which will be commenced by police and
final conclusion will be drawn by them about case and it is made into a report*/
System.out.println("INVESTIGATION IS DONE BY POLICE");
System.out.println("\t\t\t\t\t\t INVESTIGATION FINAL REPORT ");
System.out.println(" Has the suspect commited the crime?");
System.out.println("press 1 for yes");
System.out.println("press 2 for no");
c =ob.nextInt();
if (c == 1)
{
System.out.println("suspect has comitted the crime");
}
else
{
if (c==2)
{
System.out.println("suspected has not committed the crime");
}
else
{
System.out.println("invalid selection");
}
}
}
/*---------------------------------------------------MODULE5---------------------------------------------
---------------------*/

/*This method2 deals with displaying report and submiting report to court using.report
consist of type of case either criminal/civil. shows case details which include victim details
and suspect details*/

void method2()
{
System.out.println("\n\nForwarding report to court");
System.out.println("\n\n\n\n---------------------------------------------------------------CASE DETAILS-------------------------------------------------------");
System.out.println("CASE:"+vcase);
if((ch ==1) || (ch ==2))
{
if (ch==1)
System.out.println("It is criminal case");
else
System.out.println("it is civil case");
}
System.out.println("\n\n\n\n\n\n\n-------------------------------------------------------------- VICTIM DETAILS-------------------------------------------------------");
System.out.println("NAME:"+vname);
System.out.println("AGE:"+vage);
System.out.println("GENDER:"+vgen);
System.out.println("ADDRESS:"+vadd);
System.out.println("PHONENO:"+vpho);
System.out.println("\n\n-------------------------------------------------------------SUSPECT DETAILS---------------------------------------------------");
System.out.println("NAME:"+sname);
System.out.println("AGE:"+sage);
System.out.println("GENDER:"+sgen);
System.out.println("ADDRESS:"+sadd);
System.out.println("PHONENO:"+spho);
System.out.println("\n-----------------------------------------------------------INTERROGATION REPORT-------------------------------------------");
if((c==1)||(c==2))
{
if(c==1)
{
System.out.println("\t\tsuspect has committed the crime");
System.out.println("\t\tThank you\n\t\t\tyour report has been submited");
}
else
{
System.out.println("\t\tsuspected has not committed the crime");
System.out.println("\t\tThank you\n\t\t\tyour report has been submited");
}
}
else
{
System.out.println("invalid selection");
}
}
}

/*This is the main method in there are two methods,method 1 consist of 4 modules that is
from 1 to 4 and 5th module in built in method2*/
public class Police
{
public static void main(String args[ ])
{
A a=new A();
a.method1();
a.method2();
}
}
