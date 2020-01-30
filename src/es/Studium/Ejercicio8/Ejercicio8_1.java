package es.Studium.Ejercicio8;

import java.awt.*;
import java.awt.event.*;

public class Ejercicio8_1 extends WindowAdapter implements ActionListener
{
	Float operador1, operador2, resultado;
	int operacion, operacion2;
	Boolean segundo, fin;
	String operador11, operador22;
	//Creamos la ventana Login
	Frame calculadora =new Frame("Mi Calculadora");
	//Creamos los botones
	Button btn1 = new Button("1");
	Button btn2 = new Button("2");
	Button btn3 = new Button("3");
	Button btn4 = new Button("4");
	Button btn5 = new Button("5");
	Button btn6 = new Button("6");
	Button btn7 = new Button("7");
	Button btn8 = new Button("8");
	Button btn9 = new Button("9");
	Button btn0 = new Button("0");
	Button btnMas = new Button("+");
	Button btnMenos = new Button("-");
	Button btnMult = new Button("*");
	Button btnDiv = new Button("/");
	Button btnComa = new Button(".");
	Button btnIgual = new Button("=");
	//Creamos el campo de texto
	TextField txtResultado = new TextField(200);
	//
	Ejercicio8_1()
	{
		segundo=false;
		operacion2=0;
		calculadora.setLayout (new GridLayout( 5,4 )); //Ponrmod las Filas y las columnas
		calculadora.setTitle ("Mi Calculadora" ); //Pone el titulo a la ventana
		calculadora.setSize(280,200); //Establece el tamaño
		calculadora.setResizable(true); //Evita que se pueda maximizar
		calculadora.setLocationRelativeTo(null); //Establece que la pocicion de la ventana sea en el centro
		//Añadimos las etiquetas y campos de texto y los botonesa la ventana correspondiente
		calculadora.add(btn1);
		calculadora.add(btn2);
		calculadora.add(btn3);
		calculadora.add(btnMas);
		calculadora.add(btn4);
		calculadora.add(btn5);
		calculadora.add(btn6);
		calculadora.add(btnMenos);
		calculadora.add(btn7);
		calculadora.add(btn8);
		calculadora.add(btn9);
		calculadora.add(btnMult);
		calculadora.add(btnComa);
		calculadora.add(btn0);
		calculadora.add(btnIgual);
		calculadora.add(btnDiv);
		calculadora.add(txtResultado);

		calculadora.addWindowListener(this);//Ponemos el cierre de la ventana
		//Ponemos que los botones sean cacturados
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn0.addActionListener(this);
		btnMas.addActionListener(this);
		btnMenos.addActionListener(this);
		btnMult.addActionListener(this);
		btnDiv.addActionListener(this);
		btnComa.addActionListener(this);
		btnIgual.addActionListener(this);

		//Hace visible la ventana
		calculadora.setVisible(true);


	}

	public static void main(String[] args)
	{
		new Ejercicio8_1();
	}
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		Object a; a=ae.getSource();

		while (operacion2<1)
		{
			if(a.equals(btn1)) 
			{
				if(segundo)
				{
					operador22=operador22+ 1+"";
				}
				else
				{
					operador11=operador11+ 1+"";
				}
			}
			if(a.equals(btn2)) 
			{

				if(segundo)
				{
					operador22=operador22+ 2+"";
				}
				else
				{
					operador11=operador11+ 2+"";
				}
			}
			if(a.equals(btn3)) 
			{

				if(segundo)
				{
					operador22=operador22+ 3+"";
				}
				else
				{
					operador11=operador11+ 3+"";
				}
			}
			if(a.equals(btn4)) 
			{
				if(segundo)
				{
					operador22=operador22+ 4+"";
				}
				else
				{
					operador11=operador11+ 4+"";
				}
			}
			if(a.equals(btn5)) 
			{
				if(segundo)
				{
					operador22=operador22+ 5+"";
				}
				else
				{
					operador11=operador11+ 5+"";
				}
			}
			if(a.equals(btn6)) 
			{
				if(segundo)
				{
					operador22=operador22+ 6+"";
				}
				else
				{
					operador11=operador11+ 6+"";
				}
			}
			if(a.equals(btn7)) 
			{
				if(segundo)
				{
					operador22=operador22+ 7+"";
				}
				else
				{
					operador11=operador11+ 7+"";
				}
			}
			if(a.equals(btn8)) 
			{
				if(segundo)
				{
					operador22=operador22+ 8+"";
				}
				else
				{
					operador11=operador11+ 8+"";
				}
			}
			if(a.equals(btn9)) 
			{
				if(segundo)
				{
					operador22=operador22+ 9+"";
				}
				else
				{
					operador11=operador11+ 9+"";
				}
			}
			if(a.equals(btn0)) 
			{
				if(segundo)
				{
					operador22=operador22+ 0+"";
				}
				else
				{
					operador11=operador11+ 0+"";
				}
			}
			if(a.equals(btnComa)) 
			{
				segundo=true;
				operacion=6;
			}

			if(a.equals(btnMas)) 
			{
				segundo=true;
				operacion=1;
			}
			if(a.equals(btnMenos)) 
			{
				segundo=true;
				operacion=2;
			}
			if(a.equals(btnMult)) 
			{
				segundo=true;
				operacion=3;
			}
			if(a.equals(btnDiv)) 
			{
				segundo=true;
				operacion=4;
			}
			if(a.equals(btnIgual)) 
			{
				segundo=true;
				operacion=5;
			}
		}
			switch (operacion) 
			{
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("1");
				break;
			case 3:
				System.out.println("1");
				break;
			case 4:
				System.out.println("1");
				break;
			case 5:
				System.out.println("1");
				break;
			case 6:
				System.out.println("1");
				break;
			}
		
		@Override
		public void windowClosing(WindowEvent we) {
			System.exit(0); 

		}
	}
