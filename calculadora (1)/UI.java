package main;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;

import cliente.CustomFont;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class UI extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblTextSalida;
	private JButton btnC;
	private JButton btnCE;
	private JButton btnRaiz;
	private JButton btnDivision;
	private JButton btnN7;
	private JButton btnN8;
	private JButton btnN9;
	private JButton btnMultiplicar;
	private JButton btnN4;
	private JButton btnN5;
	private JButton btnN6;
	private JButton btnResta;
	private JButton btnN3;
	private JButton btnN2;
	private JButton btnN1;
	private JButton btnSuma;
	private JButton btnN00;
	private JButton btnN0;
	private JButton btnPorcentaje;
	private JButton btnIgual;
	private long V1;
	private long V2;
	private String valor1;
	private String valor2;
	private String operacion;
	

	public UI() {
		setTitle("Calculadora");
		setSize(374,479);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		CustomFont fuente = new CustomFont();
		Font roboto = fuente.setMyFont(1, 16);
		
		lblTextSalida = new JLabel("0");
		lblTextSalida.setFont(fuente.setMyFont(1, 30));
		getContentPane().add(lblTextSalida, BorderLayout.NORTH);
		
		JPanel panelMando = new JPanel();
		getContentPane().add(panelMando, BorderLayout.CENTER);
		panelMando.setLayout(new GridLayout(5, 4, 3, 3));
		
		btnC = new JButton("C");
		btnC.setBackground(new Color(255, 204, 51));
		btnC.setForeground(new Color(0, 0, 0));
		btnC.setFont(roboto);
		btnC.addActionListener(this);
		panelMando.add(btnC);
		
		btnCE = new JButton("CE");
		btnCE.setBackground(new Color(255, 204, 51));
		btnCE.setForeground(new Color(0, 0, 0));
		btnCE.setFont(roboto);
		btnCE.addActionListener(this);
		panelMando.add(btnCE);
		
		btnRaiz = new JButton("Raiz");
		btnRaiz.setBackground(new Color(255, 204, 51));
		btnRaiz.setForeground(new Color(0, 0, 0));
		btnRaiz.setFont(roboto);
		btnRaiz.addActionListener(this);
		panelMando.add(btnRaiz);
		
		btnDivision = new JButton("/");
		btnDivision.setBackground(new Color(255, 204, 51));
		btnDivision.setForeground(new Color(0, 0, 0));
		btnDivision.setFont(roboto);
		btnDivision.addActionListener(this);
		panelMando.add(btnDivision);
		
		btnN7 = new JButton("7");
		btnN7.setForeground(Color.WHITE);
		btnN7.setFont(roboto);
		btnN7.addActionListener(this);
		panelMando.add(btnN7);
		
		btnN8 = new JButton("8");
		btnN8.setForeground(Color.WHITE);
		btnN8.setFont(roboto);
		btnN8.addActionListener(this);
		panelMando.add(btnN8);
		
		btnN3 = new JButton("3");
		btnN3.setForeground(Color.WHITE);
		btnN3.setFont(roboto);
		btnN3.addActionListener(this);
		
		btnResta = new JButton("-");
		btnResta.setBackground(new Color(255, 204, 51));
		btnResta.setForeground(new Color(0, 0, 0));
		btnResta.setFont(roboto);
		btnResta.addActionListener(this);
		
		btnN4 = new JButton("4");
		btnN4.setForeground(Color.WHITE);
		btnN4.setFont(roboto);
		btnN4.addActionListener(this);
		
		btnMultiplicar = new JButton("X");
		btnMultiplicar.setBackground(new Color(255, 204, 51));
		btnMultiplicar.setForeground(new Color(0, 0, 0));
		btnMultiplicar.setFont(roboto);
		btnMultiplicar.addActionListener(this);
		
		btnN9 = new JButton("9");
		btnN9.setForeground(Color.WHITE);
		btnN9.setFont(roboto);
		btnN9.addActionListener(this);
		panelMando.add(btnN9);
		panelMando.add(btnMultiplicar);
		panelMando.add(btnN4);
		
		btnN5 = new JButton("5");
		btnN5.setForeground(Color.WHITE);
		btnN5.setFont(roboto);
		btnN5.addActionListener(this);
		panelMando.add(btnN5);
		
		btnN6 = new JButton("6");
		btnN6.setForeground(Color.WHITE);
		btnN6.setFont(roboto);
		btnN6.addActionListener(this);
		panelMando.add(btnN6);
		panelMando.add(btnResta);
		
		btnN2 = new JButton("2");
		btnN2.setForeground(Color.WHITE);
		btnN2.setFont(roboto);
		btnN2.addActionListener(this);
		
		btnN1 = new JButton("1");
		btnN1.setForeground(Color.WHITE);
		btnN1.setFont(roboto);
		btnN1.addActionListener(this);
		panelMando.add(btnN1);
		panelMando.add(btnN2);
		panelMando.add(btnN3);
		
		btnIgual = new JButton("=");
		btnIgual.setBackground(new Color(255, 204, 51));
		btnIgual.setForeground(new Color(0, 0, 0));
		btnIgual.setFont(roboto);
		btnIgual.addActionListener(this);
		
		btnN00 = new JButton("00");
		btnN00.setForeground(Color.WHITE);
		btnN00.setFont(roboto);
		btnN00.addActionListener(this);
		
		btnN0 = new JButton("0");
		btnN0.setForeground(Color.WHITE);
		btnN0.setFont(roboto);
		btnN0.addActionListener(this);
		
		btnSuma = new JButton("+");
		btnSuma.setBackground(new Color(255, 204, 51));
		btnSuma.setForeground(new Color(0, 0, 0));
		btnSuma.setFont(roboto);
		btnSuma.addActionListener(this);
		panelMando.add(btnSuma);
		panelMando.add(btnN0);
		panelMando.add(btnN00);
		
		btnPorcentaje = new JButton("%");
		btnPorcentaje.setForeground(Color.WHITE);
		btnPorcentaje.setFont(roboto);
		btnPorcentaje.addActionListener(this);
		panelMando.add(btnPorcentaje);
		panelMando.add(btnIgual);
		
		operacion = "";
		valor1 = "";
		valor2 = "";
		
		
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object d = e.getSource();
		
		if(d.equals(btnN00)) {
			
			if(!lblTextSalida.getText().equals("0")) {
				
				if(operacion.equals("") || operacion == null) {
					V1*=100;
					valor1 = Long.toString(V1);
					lblTextSalida.setText(valor1);
				}else {
					V2*=100;
					valor2 = Long.toString(V2);
					lblTextSalida.setText(valor1 + " " + operacion + " " + valor2);
				}
			}
		}

		else if(d.equals(btnN0)) {
			if(!lblTextSalida.getText().equals("0"))
				comprobacion(0);
		}
		
		else if(d.equals(btnN1)) {
			comprobacion(1);
		}
		
		else if(d.equals(btnN2)) {
			comprobacion(2);
		}
		
		else if(d.equals(btnN3)) {
			comprobacion(3);
		}
		
		else if(d.equals(btnN4)) {
			comprobacion(4);
		}
		
		else if(d.equals(btnN5)) {
			comprobacion(5);
		}
		
		else if(d.equals(btnN6)) {
			comprobacion(6);
		}
		
		else if(d.equals(btnN7)) {
			comprobacion(7);
		}
		
		else if(d.equals(btnN8)) {
			comprobacion(8);
		}
		
		else if(d.equals(btnN9)) {
			comprobacion(9);
		}
		
		else if(d.equals(btnSuma)) {
			comprobarOper("+");
		}
		
		else if(d.equals(btnResta)) {
			comprobarOper("-");
		}
		
		else if(d.equals(btnMultiplicar)) {
			comprobarOper("*");
		}

		else if(d.equals(btnDivision)) {
			comprobarOper("/");
		}
		else if(d.equals(btnPorcentaje)) {
			comprobarOper("%");
		}
		else if(d.equals(btnRaiz)) {
			valor1="";
			operacion = "Raiz";
			lblTextSalida.setText(operacion);
		}
		else if(d.equals(btnIgual)) {

			if(!( V1 == 0 && V2 == 0 && (operacion.equals("") || operacion == null) )) {

				String res = "";

				if(operacion.equals("+")) {
					res = Long.toString(suma(V1, V2));
					lblTextSalida.setText(res);
				}
				else if(operacion.equals("-")) {
					res = Long.toString(resta(V1, V2));
					lblTextSalida.setText(res);
				}
				else if(operacion.equals("*")) {
					res = Long.toString(multiplicacion(V1, V2));
					lblTextSalida.setText(res);
				}
				else if(operacion.equals("/")) {
					res = Double.toString(division(V1, V2));
					lblTextSalida.setText(res);
				}
				else if(operacion.equals("%")) {
					res =Double.toString(porcentaje(V1, V2));
					lblTextSalida.setText(res);
				}
				else if(operacion.equals("Raiz")) {
					res = Double.toString(raiz(V1));
					lblTextSalida.setText(res);
				}
				
				valor1 = res;
				valor2 = "";
				operacion = "";
				V1 = (int) Double.parseDouble(res);
				V2 = 0;
			}

		}

		else if(d.equals(btnC)) {
			V1 = 0;
			V2 = 0;
			valor1 = "";
			valor2  = "";
			operacion = "";
			lblTextSalida.setText("0");
		}

		else if(d.equals(btnCE)) {
			
			boolean llave = false;
			 
			//si valor1 tiene valores y no hay operacion ni valor2
			if((V1 != 0) && operacion.equals("") && V2 == 0) { 

				//casteo a String
				String r = Long.toString(V1);
				//Lo tranformo en Array
				char[] n = r.toCharArray();
				r="";
				
				for(int i=0; i<n.length-1;i++) {
					/*Un bucle que no llega a la ultima 
					*posision logrando eliminar el ultimo digito
					*/
					r += n[i];
				}
				//almaceno el nuevo valor para ser mostrado
				valor1 = r;
				
				//si ese valor quedo vacio
				if(r.equals("")) {
					V1 = 0;
					valor1 = "";
					llave = true;//indicamos que esta vacio
				}else {
					V1  = Integer.parseInt(r); //si no esta vacio lo casteo a int
				}
				
				if(llave) {
					/*
					 * evaluo si esto o no vacio asi al momento de mostrar
					 * en pantalla el JLabel no salga vacio o desaparezca
					 * es por esto que asigno un 0
					 */
					lblTextSalida.setText("0");
				}else {
					lblTextSalida.setText(valor1);
				}
			}
			else if((V1 != 0) && !operacion.equals("") && V2 != 0) {

				String r = Long.toString(V2);
				char[] n = r.toCharArray();
				r = "";
				
				for(int i=0; i<n.length-1;i++) {
					r += n[i];
				}
				
				valor2 = r;
				if(r.equals("")) {
					V2 = 0;
					valor2 = "";
					lblTextSalida.setText(valor1 + " " + operacion);
				}else {
					V2  = Integer.parseInt(r);
					lblTextSalida.setText(valor1 + " " + operacion + " " + valor2);
				}
				
			}
			else if((V1 != 0) && !operacion.equals("") && V2 == 0) {
				System.out.println("tercera condicion");
				operacion = "";
				lblTextSalida.setText(valor1);
			}
		}
	} 

	public void comprobarOper(String op) {
		if(!(V1 == 0)) {
			operacion = op;
			lblTextSalida.setText(V1 + " " + operacion );
		}
	}
	public void comprobacion(int v) {

		if(operacion.equals("") || operacion == null) {
			valor1 += v;
			lblTextSalida.setText(valor1);
			V1 = Long.parseLong(valor1);
		}else if (operacion.equals("Raiz")){
			
			valor1 += v;
			lblTextSalida.setText(operacion + " " + valor1); 
			V1 = Long.parseLong(valor1);
		} else {
			valor2 += v;
			lblTextSalida.setText(valor1
					+ " " + operacion + " " + valor2);
			V2 = Integer.parseInt(valor2);
		}

	}
	
	public long suma(long v12 , long v22) {
		long sum = v12 + v22;
		return sum;
	}
	
	public long resta(long v12 , long v22) {
		long rest = v12 - v22;
		return rest;
	}
	
	public long multiplicacion(long v12, long v22) {
		long multip = v12 * v22;
		return multip;
	}
	
	public double division(long v12 , long v22) {
		double divi =(double) v12 / v22;
		return divi;
	}
	
	public double raiz(double v) {
		return Math.sqrt(v);
	}
	
	public double porcentaje(long v12 , double v2) {
		return v12 * (v2/100);
		
	}
	
	
}
