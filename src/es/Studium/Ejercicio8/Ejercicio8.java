package es.Studium.Ejercicio8;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio8 extends WindowAdapter implements ActionListener
{
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
	Button btnComa = new Button(",");
	Button btnIgual = new Button("=");
	TextField txtResultado = new TextField(20);
	Ejercicio8()
	{

		calculadora.setLayout (new GridLayout( 5,4 ));
		calculadora.setTitle ("Mi Calculadora" ); //Pone el titulo a la ventana
		calculadora.setSize(280,200); //Establece el tamaño
		calculadora.setResizable(false); //Evita que se pueda maximizar
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

		calculadora.addWindowListener(this);
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
		new Ejercicio8();
	}
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub

		Object a; a=ae.getSource();
		while(a != btnIgual)
		{
			if(a.equals(btn1)) 
			{
	
			}
			if(a.equals(btn2)) 
			{
	
			}
			if(a.equals(btn3)) 
			{
	
			}
			if(a.equals(btn4)) 
			{
	
			}
			if(a.equals(btn5)) 
			{
	
			}
			if(a.equals(btn6)) 
			{
	
			}
			if(a.equals(btn7)) 
			{
	
			}
			if(a.equals(btn8)) 
			{
	
			}
			if(a.equals(btn9)) 
			{
	
			}
			if(a.equals(btn0)) 
			{
	
			}
			if(a.equals(btnMas)) 
			{
	
			}
			if(a.equals(btnMenos)) 
			{
	
			}
			if(a.equals(btnMult)) 
			{
	
			}
			if(a.equals(btnDiv)) 
			{
	
			}
			if(a.equals(btnComa)) 
			{
	
			}
		}
			if(a.equals(btnIgual)) 
			{
	
			}
	}
	@Override
	public void windowClosing(WindowEvent we) {
		System.exit(0); 

	}
}
