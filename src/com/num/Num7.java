package com.num;

public class Num7 {
	
	public void cal(){
		int num0 = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		for (int i = 0; i < 10000; i++) {
			String num = Integer.toString(i);
			int count = 0;
			for (int j = 0; j < num.length(); j++) {
				if (num.charAt(j)=='7') {
					count++;
				}
			}
			switch (count) {
			case 0:
				num0++;
				break;
			case 1:
				num1++;
				break;
			case 2:
				num2++;
				break;
			case 3:
				num3++;
				break;
			case 4:
				num4++;
				break;
			default:
				break;
			}
		}
		System.out.println("num0="+num0);
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		System.out.println("num3="+num3);
		System.out.println("num4="+num4);
	}
	
}
