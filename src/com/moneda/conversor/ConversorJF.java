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
import java.awt.event.ActionEvent;

public class ConversorJF extends JFrame {

	private JPanel contentPane;
	private JTextField total;
	private JTextField valor;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel conversor = new JLabel("Conversor");
		conversor.setFont(new Font("Tw Cen MT", Font.BOLD, 43));
		conversor.setBounds(410, 93, 182, 96);
		contentPane.add(conversor);
		
		JComboBox listaConversion = new JComboBox();
		listaConversion.setFont(new Font("Tahoma", Font.BOLD, 14));
		listaConversion.setModel(new DefaultComboBoxModel(new String[] {"De Peso MXN a Dolar", "De Peso MXN a Euro", "De Peso MXN a Libras Esterlinas", "Peso MXN a Yen", "Peso MXN a Won"}));
		listaConversion.setBounds(493, 221, 201, 43);
		contentPane.add(listaConversion);
		
		total = new JTextField();
		total.setFont(new Font("Tahoma", Font.PLAIN, 17));
		total.setBounds(493, 287, 116, 43);
		contentPane.add(total);
		total.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Valor");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(187, 237, 64, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Total");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(435, 309, 59, 21);
		contentPane.add(lblNewLabel_1);
		
		valor = new JTextField();
		valor.setFont(new Font("Tahoma", Font.PLAIN, 17));
		valor.setColumns(10);
		valor.setBounds(250, 220, 116, 44);
		contentPane.add(valor);
		
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Moneda moneda = new Moneda();
				moneda.setValor(Double.parseDouble(valor.getText()));
				moneda.convertir(moneda, listaConversion.getSelectedItem().toString());
				total.setText(moneda.getCantidad()+"");
				
				
				
			}
		});
		btnNewButton.setBounds(250, 307, 116, 23);
		contentPane.add(btnNewButton);
		
	}
}
