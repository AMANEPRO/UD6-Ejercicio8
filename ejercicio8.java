package ejercicios;

import javax.swing.JOptionPane;

public class ejercicio8 {

	public static void main(String[] args) {
		
		String num1beta=JOptionPane.showInputDialog("Introduce el primer numero");
		
		String num2beta=JOptionPane.showInputDialog("Introduce el segundo numero");
		
		String num3beta=JOptionPane.showInputDialog("Introduce el tercer numero");
		
		String num4beta=JOptionPane.showInputDialog("Introduce el cuarto numero");
		
		String num5beta=JOptionPane.showInputDialog("Introduce el quinto numero");
		
		String num6beta=JOptionPane.showInputDialog("Introduce el sexto numero");
		
		String num7beta=JOptionPane.showInputDialog("Introduce el septimo numero");
		
		String num8beta=JOptionPane.showInputDialog("Introduce el octavo numero");
		
		String num9beta=JOptionPane.showInputDialog("Introduce el noveno numero");
		
		String num10beta=JOptionPane.showInputDialog("Introduce el decimo numero");
		
		int num1=Integer.parseInt(num1beta);
		
		int num2=Integer.parseInt(num2beta);
		
		int num3=Integer.parseInt(num3beta);
		
		int num4=Integer.parseInt(num4beta);
		
		int num5=Integer.parseInt(num5beta);
		
		int num6=Integer.parseInt(num6beta);
		
		int num7=Integer.parseInt(num7beta);
		
		int num8=Integer.parseInt(num8beta);
		
		int num9=Integer.parseInt(num9beta);
		
		int num10=Integer.parseInt(num10beta);
		
		
		int num[] = new int [10];
		
		num[0]=num1;
		num[1]=num2;
		num[2]=num3;
		num[3]=num4;
		num[4]=num5;
		num[5]=num6;
		num[6]=num7;
		num[7]=num8;
		num[8]=num9;
		num[9]=num10;
		
		System.out.println(num[0]);
		
		System.out.println(num[1]);
		
		System.out.println(num[2]);
		
		System.out.println(num[3]);
		
		System.out.println(num[4]);
		
		System.out.println(num[5]);
		
		System.out.println(num[6]);
		
		System.out.println(num[7]);
		
		System.out.println(num[8]);
		
		System.out.println(num[9]);
		
		
		
	}

}
