package com.day3assignment;

public class VowelAndConsonent {
	
    void checkCharacter(char ans) {
    	if(ans == 'a' | ans=='A' | ans=='e' | ans=='E' | ans == 'i' | ans=='I' | ans=='o' | ans=='O' | ans=='u' | ans=='U') {
    		System.out.println("Character is vowel");
    	}
    	else if(ans == 'b' | ans=='B' | ans=='c' | ans=='C' | ans == 'd' | ans=='D' | ans=='f' | ans=='F' | ans=='g' | ans=='G'| 
    			ans == 'h' | ans=='H' | ans=='j' | ans=='J' | ans == 'k' | ans=='K' | ans=='l' | ans=='L' | ans=='m' | ans=='M'|
    			ans == 'n' | ans=='N' | ans=='p' | ans=='P' | ans == 'q' | ans=='Q' | ans=='r' | ans=='R' | ans=='s' | ans=='S'|
    			ans == 't' | ans=='T' | ans=='v' | ans=='V' | ans == 'w' | ans=='W' | ans=='x' | ans=='X' | ans=='y' | ans=='Y'| ans=='z' | ans=='Z'){
    		System.out.println("Character is consonant");
    	}
    	else {
    		System.out.println("invalid character");
    	}
    }
   
    
   
   
	public static void main(String[] argu) {
		char ans1 = 'a';
		char ans2='z';
		char ans3='@';
		
		VowelAndConsonent d1 = new VowelAndConsonent();
		d1.checkCharacter(ans1);
		d1.checkCharacter(ans2);
		d1.checkCharacter(ans3);
	}
}
