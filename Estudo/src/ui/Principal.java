package ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Principal extends JFrame {
	
 

	private static final long serialVersionUID = 1L;
	private static final JMenuBar MenuBar = new JMenuBar();
	 javax.swing.JButton botton;
	 javax.swing.JLabel label;
	 javax.swing.JTextField textfiled;
	 javax.swing.JTable jTableArrecadado;
	 JPanel panel;
	
	
	
	
	public void componentes(){
		
	 panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		
		label = new JLabel("Tela de Testes!");
		
		panel.add(label,
				new GridBagConstraints(
				0,
				0,
				1,
				1,
				0.0,
				0.0,
				GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL,
				new Insets(5, 10, 1, 1),
				1,
				1)
				);
		
		textfiled = new JTextField();
		
		
		panel.add(textfiled,
				new GridBagConstraints(
				0,
				1,
				1,
				1,
				0.0,
				0.0,
				GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL,
				new Insets(5, 10, 1, 1),
				1,
				1)
				);
		
		botton = new JButton("Salvar");		
		panel.add(botton,
				new GridBagConstraints(
				0,
				2,
				1,
				1,
				0.0,
				0.0,
				GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL,
				new Insets(5, 10, 1, 1),
				1,
				1)
				);
		
		this.add(panel);
		
		
	}
	
	
//////////////////////////////////
	private void criaMenu(){
		
		setJMenuBar(MenuBar);
		JMenu menu = new JMenu("Item");
		JMenu intemMenu = new JMenu("Item 1");
		JMenu intemMenu2 = new JMenu("Intem 2");
		
		menu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				label.setText("menu 1!");
				
				
			}
		});
		MenuBar.add(menu);
		MenuBar.add(intemMenu);
		MenuBar.add(intemMenu2);
				
	}
	
	
	//////////////////////////////////////
	private void ativar(){		
		botton.addActionListener(
			
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String texto = textfiled.getText();				
				label.setText(texto);
				
			}
		}		
				
	);
		
		
		
	}
	
	

	
	
	public Principal(){
		
		super("Tela Principal");
		//this.setLayout(null);
		//this.setBounds(0, 0, 800, 600);
		//this.setSize(500, 300);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			componentes();
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Principal();
	}
}
