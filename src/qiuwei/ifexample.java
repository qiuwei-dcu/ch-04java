package qiuwei;

import java.io.IOException;

public class ifexample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		char i;
		
		i = (char)System.in.read();
		
		
		switch(i) {
		
		case 'G' : case 'g':
			System.out.println("금메달");
			break;
		case 'S' : case 's':
			System.out.println("은메달");
			break;
		case 'B' : case 'b':
			System.out.println("등메달");
			break;
		default:
			System.out.println("노메달");
			break;
			
			
		}
		
		
	}
	
}
//		int age = 10;
//		int charge = 0;
//		int i = 10;
//		
//		if(age < 8){
//			charge = 1000; 
//		}
//		if(age < 14 ){
//			charge = 2000;
//		}
//		if(age < 20 && (i+=2) < 0){
//			charge = 2500;
//		}
//	
//		
//		System.out.println("涝厘丰绰 " + charge + "盔 涝聪促.");
//		System.out.println(i);
//	}
//