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
import javax.swing.table.DefaultTableModel;

public class Principal extends JFrame {
	
 
	
	private static final JMenuBar MenuBar = new JMenuBar();
	private javax.swing.JButton botton;
	private javax.swing.JLabel label;
	private javax.swing.JTextField textfiled;
	private javax.swing.JTable jTableArrecadado;
	
	
	
	
	public void componentes(){
		
		label = new JLabel("Tela de Testes!");
		textfiled = new JTextField();
		botton = new JButton("Salvar");	
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		
		panel.add(label,
				new GridBagConstraints(
				0,
				0,
				1,
				1,
				0.0,
				0.0,
				GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL,
				new Insets(5, 10, 1, 1),
				1,
				1)
				);
		
		panel.add(textfiled,
				new GridBagConstraints(
				0,
				1,
				1,
				1,
				0.0,
				0.0,
				GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL,
				new Insets(5, 10, 1, 1),
				1,
				1)
				);
		
		panel.add(botton,
				new GridBagConstraints(
				0,
				2,
				1,
				1,
				0.0,
				0.0,
				GridBagConstraints.CENTER,
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
		this.setLayout(null);
		this.setBounds(0, 0, 800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			componentes();
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Principal();
	}
}
