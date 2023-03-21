
import java.util.*;
import javax.swing.*;
public class game{
	
	public static void main(String[] args){
		Random rnd = new Random();int round=0;
		Scanner scan = new Scanner(System.in);int members = 1;int count=0;int life = 1; String diff ="(EASY)";int high = 0;
	
		if (round<=5){diff = "(EASY)";} else { if(round<=10){diff = "(MEDIUM)";} else { if(round<=25){ diff="(HARD)";}else {diff="(INSANE)";}}}

String rules =     "Hello, you are responsible for adding and deducting clones from a group of members ."+
		   "Please read the rules carefully :\n"+
		   
		   " -By choosing a specific number you wil be adding it to the total . \n"+
		   " -This total should not exceed 10 and must not be reduced to 0 .\n"+
                   " -Carefully pick the most suitable number .\n" +
		   " -To pick you must input l(L) for the left number and r(L) for the right .\n"+
                   " -If you press another key you'll be deducted 1 round (penalty)!!\n"+
		   " -Be sure you press enter after you input the letter(L or R)\n"+	
		   " -You will have 1 extra attempt use it wisely \n"+
		   " -This game will get progressively harder .\n"+
		   "CAN YOU BE THE ONE TO REACH 30 ROUNDS?? !!!";


JOptionPane.showMessageDialog(null,rules);
while( life >=1){
 	
while(members>=1 && members <=10){
 		String emp = " ";
		String head ="      O" ;
		String body= "    /|\\";
 		String legs="    / \\" ;
if (round<=5){diff = "(EASY)";} else { if(round<=10){diff = "(MEDIUM)";} else {if (round<=25){ diff="(HARD)";}else{diff="INSANE";}}}

System.out.println("\t\tCURRENT MEMBERS :"+members+ " member(s)");
System.out.print(" ROUND : " +round+diff);	
System.out.print("\t\t HIGHSCORE : "+(high));
System.out.println("\t\t EXTRA LIVES :"+life);
System.out.println(head.repeat(members));
System.out.println(body.repeat(members));
System.out.println(legs.repeat(members));
		
int a, b;
if (round == 0){  a =(int)(Math.abs( Math.pow((-1),rnd.nextInt()) *  (rnd.nextInt(10))));
		  b=(int)(Math.abs( Math.pow((-1),rnd.nextInt()) *  (rnd.nextInt(10))));}
			else{
if (round <=5){
   	      	   a = (int)(Math.pow((-1),rnd.nextInt()) * (rnd.nextInt(4)));
		   b=(int)(Math.pow((-1),rnd.nextInt()) * (rnd.nextInt(4)));
} else{ if(round<=10){
                   a = (int)(Math.pow((-1),rnd.nextInt()) * (rnd.nextInt(7)));
                   b = (int)(Math.pow((-1),rnd.nextInt()) * (rnd.nextInt(7)));
} else {if(round<=25){
   		   a = (int)( Math.pow((-1),rnd.nextInt()) *  (rnd.nextInt(10)));
 		   b = (int)( Math.pow((-1),rnd.nextInt()) *  (rnd.nextInt(10)));}
	else { a=(int)( Math.pow((-1),rnd.nextInt()) *  (rnd.nextInt(20)));
		b =(int)( Math.pow((-1),rnd.nextInt()) *  (rnd.nextInt(20)));}
}}}

System.out.println("\tL:   "+a+"\tR:   "+b);

String lr= scan.nextLine();
if(lr.equalsIgnoreCase("L")||lr.equalsIgnoreCase("R"))	{
	
	if(lr.equalsIgnoreCase("L")){members+=a;round++;}
	if(lr.equalsIgnoreCase("R")){members+=b;round++;}
		}	else
				{	round--;
				System.out.println("\nPlease enter a valid value ( One round deduced as penalty) ");}} //end of while loop 
		///you are out of the loop now so you lost how to get back to looP"????
	--life;int round1 = round ;high = round1-1;
	 


JOptionPane.showMessageDialog(null,"YOU lost 1 life ."+"\nSCORE : "+(round -1)+"\nExtra lives remaining : "+life);

			

	////////////////
members = 1 ; round = 0;
while(members>=1 && members <=10){
 		String emp = " ";
		String head ="      O" ;
		String body= "    /|\\";
 		String legs="    / \\" ;

if (round<=5){diff = "(EASY)";} else { if(round<=10){diff = "(MEDIUM)";} else {if (round<=25){ diff="(HARD)";}else{diff="(INSANE)";}}}
System.out.println("\t\tCURRENT MEMBERS :"+members+ " member(s)" );
System.out.print(" ROUND : " +round+diff);	
System.out.print("\t\t HIGHSCORE : "+(high));
System.out.println("\t\tEXTRA LIVES :"+life);
System.out.println(head.repeat(members));
System.out.println(body.repeat(members));
System.out.println(legs.repeat(members));
		
int a, b;
if (round == 0){  a =Math.abs( (int)((Math.pow((-1),rnd.nextInt())))*(int)(rnd.nextInt(10)));
		 b=Math.abs((int)((Math.pow((-1),rnd.nextInt())))*(int)(rnd.nextInt(10)));}else{
if (round <=5){
    a = (int)((Math.pow((-1),rnd.nextInt())))*(int)(rnd.nextInt(4));
   b=(int)((Math.pow((-1),rnd.nextInt())))*(int)(rnd.nextInt(4));
} else if(round<=10){
    a = (int)((Math.pow((-1),rnd.nextInt())))*(int)(rnd.nextInt(7));
    b = (int)((Math.pow((-1),rnd.nextInt())))*(int)(rnd.nextInt(7));
} else {
if(round<=25){
   		   a = (int)( Math.pow((-1),rnd.nextInt()) *  (rnd.nextInt(10)));
 		   b = (int)( Math.pow((-1),rnd.nextInt()) *  (rnd.nextInt(10)));}
	else { a=(int)( Math.pow((-1),rnd.nextInt()) *  (rnd.nextInt(20)));
		b =(int)( Math.pow((-1),rnd.nextInt()) *  (rnd.nextInt(20)));

  }
}}

System.out.println("\tL:   "+a+"\tR:   "+b);

String lr= scan.nextLine();
if(lr.equalsIgnoreCase("L")||lr.equalsIgnoreCase("R"))	{
	
	if(lr.equalsIgnoreCase("L")){members+=a;round++;}
	if(lr.equalsIgnoreCase("R")){members+=b;round++;}
		}	else
				{	round--;
				System.out.println("\nPlease enter a valid value ( One round deduced as penalty) ");}}

		
			int round2=round; if (Math.max(round1,round2)==round2){high=round2-1;}else{high=round1-1;}
			if( life ==0){
	int selectedOption = JOptionPane.showOptionDialog(null, "YOU LOST.\nPLAY AGAIN??", "Option Dialog",
          
  		JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
        	    new Object[] {"YES", "NO"}, JOptionPane.YES_OPTION);
    		
			  if(selectedOption == JOptionPane.YES_OPTION) {
      		 				  life = 2;}
     		
 			





					 if(selectedOption == JOptionPane.NO_OPTION) {
       
					 JOptionPane.showMessageDialog(null,"SCORE : "+(round -1) + " \nHIGHSCORE  : "+high);} 
} //new loop end here 2nd while of life
      }//to do highscore we take the final score of each loop before we die 
	}
}