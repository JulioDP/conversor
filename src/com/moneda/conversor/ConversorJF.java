package com.moneda.conversor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class ConversorJF extends JFrame {

	private JPanel contentPane;
	private JTextField total;
	private JTextField valor;
	String moneda = "Monedas";
	String temperatura = "Temperatura";
	Unidad ins = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorJF frame = new ConversorJF();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConversorJF() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel conversor = new JLabel("Conversor");
		conversor.setFont(new Font("Tw Cen MT", Font.BOLD, 43));
		conversor.setBounds(411, 21, 182, 96);
		contentPane.add(conversor);
		
		JComboBox listaConversion = new JComboBox();
		listaConversion.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JComboBox listaopcion = new JComboBox();
		listaopcion.setFont(new Font("Tahoma", Font.BOLD, 14));
		listaopcion.setModel(new DefaultComboBoxModel(new String[] {"Monedas", "Temperatura"}));
		listaopcion.setBounds(378, 134, 201, 43);
		contentPane.add(listaopcion);
		
		
		
		
		listaopcion.addItemListener(new ItemListener() {
			String objeto[];
			DefaultComboBoxModel mo = null;
			  public void itemStateChanged(ItemEvent itemEvent) {
				  if (moneda.equals(listaopcion.getSelectedItem().toString())) {
					  	ins = new Moneda();
						objeto = new String[]
								{"De Peso MXN a Dolar", "De Peso MXN a Euro", "De Peso MXN a Libras Esterlinas", "Peso MXN a Yen", "Peso MXN a Won"};
						mo = new DefaultComboBoxModel(objeto);
					}else {
						ins = new Temperatura();
						objeto = new String[]
								{"De Celsius a Kelvin", "De Kelvin a Celsius", "De Celsius a Fahrenheit", "De Fahrenheit a Celsius", "De Kelvin a Fahrenheit","De Fahrenheit a Kelvin"};
						mo = new DefaultComboBoxModel(objeto);
					}
				  listaConversion.setModel(mo);
			  }
			});
		
		
	
		
		
		
		
		listaConversion.setBounds(493, 221, 201, 43);
		contentPane.add(listaConversion);
		
		total = new JTextField();
		total.setFont(new Font("Tahoma", Font.PLAIN, 17));
		total.setBounds(493, 287, 206, 43);
		contentPane.add(total);
		total.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Valor");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(258, 229, 64, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Total");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(435, 309, 59, 21);
		contentPane.add(lblNewLabel_1);
		
		valor = new JTextField();
		valor.setFont(new Font("Tahoma", Font.PLAIN, 17));
		valor.setColumns(10);
		valor.setBounds(337, 220, 116, 44);
		contentPane.add(valor);
		
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Convertible con = ins;
				ins.setValor(Double.parseDouble(valor.getText()));
				con.convertir(ins, listaConversion.getSelectedItem().toString());
				total.setText(ins.getCantidad()+"");
				
				
				
			}
		});
		btnNewButton.setBounds(250, 299, 122, 31);
		contentPane.add(btnNewButton);
		
	}
}
