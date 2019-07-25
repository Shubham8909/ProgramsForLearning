package com.testing.program;

public class JumpCount {
	
	public static  int jump(int jumpHeight,int slip,int wall,Integer[] heightWalls){
		int jump=0;
		for(int i=0; i<wall; i++){
			int h=heightWalls[i];
			while(h>jumpHeight){
					h=h-jumpHeight;
					h=h+slip;
					jump=jump+1;
			}
			jump= jump+1;
		}
		return jump;
	}
	public static void main(String[] args) {
	int jumpHeight=5;
	int slip=1;
	int wall=2;
	Integer [] heightWalls={9,10};
	System.out.println("Total jump to reach on the top-"+jump(jumpHeight,slip,wall,heightWalls));
	}

}
