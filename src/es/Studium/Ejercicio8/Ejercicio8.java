package es.Studium.Ejercicio8;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Ejercicio8 extends Frame implements WindowListener, ActionListener {
	private static final long serialVersionUID = 1L;
	Float operador1, operador2, resultado;
	int operacion;
	Boolean segundo, fin;
	Button boton1 = new Button("1");
	Button boton2 = new Button("2");
	Button boton3 = new Button("3");
	Button boton4 = new Button("+");
	Button boton5 = new Button("4");
	Button boton6 = new Button("5");
	Button boton7 = new Button("6");
	Button boton8 = new Button("-");
	Button boton9 = new Button("7");
	Button boton10 = new Button("8");
	Button boton11 = new Button("9");
	Button boton12 = new Button("*");
	Button boton13 = new Button(".");
	Button boton14 = new Button("0");
	Button boton15 = new Button("=");
	Button boton16 = new Button("/");


	TextField t = new TextField();
public Ejercicio8() {
		setTitle("Mi Calculadora");
		setLayout(new GridLayout(5,3));
		segundo = false;
		fin = false;
		operacion = 0;
		add(boton1);
		boton1.addActionListener(this);
		add(boton2);
		boton2.addActionListener(this);
		add(boton3);
		boton3.addActionListener(this);
		add(boton4);
		boton4.addActionListener(this);
		add(boton5);
		boton5.addActionListener(this);
		add(boton6);
		boton6.addActionListener(this);
		add(boton7);
		boton7.addActionListener(this);
		add(boton8);
		boton8.addActionListener(this);
		add(boton9);
		boton9.addActionListener(this);
		add(boton10);
		boton10.addActionListener(this);
		add(boton11);
		boton11.addActionListener(this);
		add(boton12);
		boton12.addActionListener(this);
		add(boton13);
		boton13.addActionListener(this);
		add(boton14);
		boton14.addActionListener(this);
		add(boton15);
		boton15.addActionListener(this);
		add(boton16);
		boton16.addActionListener(this);

		add(t);

		addWindowListener(this);
		setSize(200, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ejercicio8();
	}
	public void windowActivated(WindowEvent we) {
	}
	public void windowClosed(WindowEvent we) {
	}
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we) {
	}
	public void windowDeiconified(WindowEvent we) {
	}
	public void windowIconified(WindowEvent we) {
	}
	public void windowOpened(WindowEvent we) {
	}
	public void actionPerformed(ActionEvent ae) {
		Object a;
		a = ae.getSource();
		if (a.equals(boton1)) {
			if (segundo) {
				operador2 = (float) 1;
			} else {
				operador1 = (float) 1;
			}
		}
		if (a.equals(boton2)) {
			if (segundo) {
				operador2 = (float) 2;
			} else {
				operador1 = (float) 2;
			}
		}
		if (a.equals(boton3)) {
			if (segundo) {
				operador2 = (float) 3;
			} else {
				operador1 = (float) 3;
			}
		}
		if (a.equals(boton4)) {
			// Suma
			segundo = true;
			operacion = 1;
		}
		if (a.equals(boton5)) {
			if (segundo) {
				operador2 = (float) 4;
			} else {
				operador1 = (float) 4;
			}
		}
		if (a.equals(boton6)) {
			if (segundo) {
				operador2 = (float) 5;
			} else {
				operador1 = (float) 5;
			}
		}
		if (a.equals(boton7)) {
			if (segundo) {
				operador2 = (float) 6;
			} else {
				operador1 = (float) 6;
			}
		}
		if (a.equals(boton8)) {
			//resta
			segundo = true;
			operacion = 2;
		}
		if (a.equals(boton9)) {
			if (segundo) {
				operador2 = (float) 7;
			} else {
				operador1 = (float) 7;
			}
		}
		if (a.equals(boton10)) {
			if (segundo) {
				operador2 = (float) 8;
			} else {
				operador1 = (float) 8;
			}
		}
		if (a.equals(boton11)) {
			if (segundo) {
				operador2 = (float) 9;
			} else {
				operador1 = (float) 9;
			}
		}
		if (a.equals(boton12)) {
			//multiplicación
			segundo = true;
			operacion = 3;
		}
		if (a.equals(boton13)) {

			// El decimal
		}
		if (a.equals(boton14)) {
			if (segundo) {
				operador2 = (float) 0;
			} else {
				operador1 = (float) 0;
			}
		}
		if (a.equals(boton15)) {

			//signo igual
			switch (operacion) {
			case 1:
				//suma
				resultado = operador1 + operador2;
				break;
			case 2:
				//resta
				resultado = operador1 - operador2;
				break;
			case 3:
				//multiplicación
				resultado = operador1 * operador2;
				break;
			case 4:
				//división
				resultado = operador1 / operador2;
				break;
			}
			segundo = false;
			operacion = 0;
			fin = true;
		}
		if (a.equals(boton16)) 
		{
			//división
			segundo = true;
			operacion = 4;
		}
			if (fin) {
				//t.setText(resultado + "");
				t.setText(resultado.toString());
				fin = false;
				operador2 = (float) 0;
			} else {
				if ((segundo) && (operador2 != 0)) {
					t.setText(operador2.toString());
				} else {
					t.setText(operador1 + "");
				}
			}
	}
}
