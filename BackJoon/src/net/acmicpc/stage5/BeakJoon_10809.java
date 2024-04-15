package net.acmicpc.stage5;

import java.util.Scanner;

public class BeakJoon_10809 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		
		s = sc.next();
		
		int[] arr = new int[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if (arr[ch-'a']==-1) {
				arr[ch-'a'] = i;
			}
		}	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
