package com;

public class MarksSwitch {

	public static void main(String[] args) {
int mm=1;
int marks=52;
		
		if(marks>60) {
			
			mm=1;
		}
		else {
			if(marks>=45  && marks<60) {
				
				mm=2;
			}
			else {
				if(marks>=33  && marks<45) {
					
					mm=3;
				}
				else {
					
					mm=4;
				}
			}
		}
			
		switch(mm) {
		case 1 : System.out.println("First Division");
		break;
		case 2 : System.out.println("Second Division");
		break;
		case 3 : System.out.println("Third Division");
		break;
		case 4 : System.out.println("Fail");
		break;
		default : System.out.println("invalid choice");
		}

	}


	}

