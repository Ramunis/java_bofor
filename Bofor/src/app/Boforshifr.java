package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;

public class Boforshifr extends JFrame {
	
	private JPanel contentPane;
	private JTextField keyfield;
	private JTextField mesfield;
	private JTextField outfield;
	private JTextField keyfield1;
	private JTextField keyfield2;
	private JTextField filefield;
	private JTextField keyfield3;
	private JTextField filefield1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Boforshifr frame = new Boforshifr();
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
	public Boforshifr() {
		setTitle("Lab 1 \u0428\u0438\u0444\u0440 \u0411\u043E\u0444\u043E\u0440\u0430 \u0420\u0430\u043C\u0443\u043D\u0438\u0441 214.41");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 728, 504);
		contentPane.add(tabbedPane);
		
		JPanel mesfie = new JPanel();
		tabbedPane.addTab("\u0428\u0438\u0444\u0440\u043E\u0432\u0430\u0442\u044C \u0422\u0435\u043A\u0441\u0442", null, mesfie, null);
		mesfie.setLayout(null);
		
		keyfield = new JTextField();
		keyfield.setBounds(10, 28, 243, 20);
		mesfie.add(keyfield);
		keyfield.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u041A\u043B\u044E\u0447:");
		lblNewLabel.setBounds(10, 11, 137, 14);
		mesfie.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0421\u043E\u043E\u0431\u0449\u0435\u043D\u0438\u0435:");
		lblNewLabel_1.setBounds(10, 59, 147, 14);
		mesfie.add(lblNewLabel_1);
	
		JTextPane mesfeld = new JTextPane();
		mesfeld.setBounds(10, 84, 243, 96);
		mesfie.add(mesfeld);
		
		JTextPane outfie = new JTextPane();
		outfie.setBounds(10, 225, 243, 156);
		mesfie.add(outfie);
		outfie.setVisible(false);
		
		
		JButton btnNewButton = new JButton("\u0417\u0430\u0448\u0438\u0444\u0440\u043E\u0432\u0430\u0442\u044C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
               String k,m,o;
				
				k = keyfield.getText();
				m = mesfeld.getText();
				
				app.Bofordll Bof = new Bofordll(k,m);
				o = Bof.Encrypt(m, Bof.tokey(k));
				
				outfie.setVisible(true);
				outfie.setText(o);
				
			}
		});
		btnNewButton.setBounds(10, 191, 243, 23);
		mesfie.add(btnNewButton);
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("\u0420\u0430\u0441\u0448\u0438\u0444\u0440\u043E\u0432\u0430\u0442\u044C \u0422\u0435\u043A\u0441\u0442", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\u041A\u043B\u044E\u0447:");
		lblNewLabel_2.setBounds(10, 11, 171, 14);
		panel_1.add(lblNewLabel_2);
		
		keyfield1 = new JTextField();
		keyfield1.setBounds(10, 31, 227, 20);
		panel_1.add(keyfield1);
		keyfield1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u0417\u0430\u0448\u0438\u0444\u0440\u043E\u0432\u0430\u043D\u043D\u043E\u0435 \u0441\u043E\u043E\u0431\u0449\u0435\u043D\u0438\u0435:");
		lblNewLabel_3.setBounds(10, 62, 201, 14);
		panel_1.add(lblNewLabel_3);
		
		JTextPane mesfield1 = new JTextPane();
		mesfield1.setBounds(10, 87, 227, 123);
		panel_1.add(mesfield1);
		
		JTextPane outfield1 = new JTextPane();
		outfield1.setBounds(10, 255, 227, 126);
		panel_1.add(outfield1);
		outfield1.setVisible(false);
		
		JButton btnNewButton_1 = new JButton("\u0420\u0430\u0441\u0448\u0438\u0444\u0440\u043E\u0432\u0430\u0442\u044C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String k1,m1,o1;
					
					k1 = keyfield1.getText();
					m1 = mesfield1.getText();
					
					app.Bofordll Bof1 = new Bofordll(k1,m1);
					o1 = Bof1.Decrypt(m1, Bof1.tokey(k1));
					
					outfield1.setVisible(true);
					outfield1.setText(o1);
				
				
			}
		});
		btnNewButton_1.setBounds(10, 221, 227, 23);
		panel_1.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("\u0428\u0438\u0444\u0440\u043E\u0432\u0430\u0442\u044C TXT \u0444\u0430\u0439\u043B", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("\u041A\u043B\u044E\u0447:");
		lblNewLabel_4.setBounds(10, 11, 152, 14);
		panel.add(lblNewLabel_4);
		
		keyfield2 = new JTextField();
		keyfield2.setBounds(10, 33, 334, 20);
		panel.add(keyfield2);
		keyfield2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\u0422\u0435\u043A\u0441\u0442\u043E\u0432\u043E\u0439 \u0444\u0430\u0439\u043B:");
		lblNewLabel_5.setBounds(10, 105, 205, 14);
		panel.add(lblNewLabel_5);
		
		filefield = new JTextField();
		filefield.setBounds(10, 130, 334, 20);
		panel.add(filefield);
		filefield.setColumns(10);
		
		JLabel statusinfo = new JLabel("");
		statusinfo.setFont(new Font("Tahoma", Font.PLAIN, 50));
		statusinfo.setBounds(169, 238, 46, 14);
		panel.add(statusinfo);
		
		JButton btnNewButton_2 = new JButton("\u041E\u0442\u043A\u0440\u044B\u0442\u044C \u0438 \u0428\u0438\u0444\u0440\u043E\u0432\u0430\u0442\u044C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fileopen = new JFileChooser();
				int ret = fileopen.showDialog(null, "Открыть файл");                
				if (ret == JFileChooser.APPROVE_OPTION) {
				    File file = fileopen.getSelectedFile();
				    
				    filefield.setText(file.getPath());
				    
				    try (BufferedReader reader = new BufferedReader(
				    	       new InputStreamReader(
				    	         new FileInputStream(file), "UTF8"))) {
				    	
				    	char[] buffer = new char[990000000];
				    	int n;
				    	StringBuilder sb = new StringBuilder();
				    	while ((n = reader.read(buffer)) != -1)
				    	{
				    		sb.append(buffer,0,n);
				    	}
				    	
				        //
				        String k2,m2,o2;				      
				        k2 = keyfield2.getText();
						m2 = sb.toString();
						
						app.Bofordll Bof1 = new Bofordll(k2,m2);
						o2 = Bof1.Encrypt(m2, Bof1.tokey(k2));
						
						try(FileWriter writer = new FileWriter(file.getPath(), false))
				        {
				           // запись всей строки	         
				            writer.write(o2);
				         
				            writer.flush();
				            
				            statusinfo.setText("Зашифровано");
				            JOptionPane.showMessageDialog(contentPane, "Зашифровано");
				        }
				        catch(IOException ex){
				             
				            System.out.println(ex.getMessage());
				        } 
						//
				        
				    } catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton_2.setBounds(10, 71, 334, 23);
		panel.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("\u0420\u0430\u0441\u0448\u0438\u0444\u0440\u043E\u0432\u0430\u0442\u044C TXT \u0444\u0430\u0439\u043B", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("\u041A\u043B\u044E\u0447:");
		lblNewLabel_6.setBounds(21, 21, 322, 14);
		panel_2.add(lblNewLabel_6);
		
		keyfield3 = new JTextField();
		keyfield3.setBounds(20, 46, 323, 20);
		panel_2.add(keyfield3);
		keyfield3.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("\u0422\u0435\u043A\u0441\u0442\u043E\u0432\u043E\u0439 \u0444\u0430\u0439\u043B:");
		lblNewLabel_7.setBounds(21, 117, 322, 14);
		panel_2.add(lblNewLabel_7);
		
		filefield1 = new JTextField();
		filefield1.setBounds(21, 142, 322, 20);
		panel_2.add(filefield1);
		filefield1.setColumns(10);
		
		JLabel statusinfo1 = new JLabel("");
		statusinfo1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		statusinfo1.setBounds(156, 240, 46, 14);
		panel_2.add(statusinfo1);
		
		JButton btnNewButton_3 = new JButton("\u041E\u0442\u043A\u0440\u044B\u0442\u044C \u0438 \u0420\u0430\u0441\u0448\u0438\u0444\u0440\u043E\u0432\u0430\u0442\u044C");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fileopen1 = new JFileChooser();
				int ret1 = fileopen1.showDialog(null, "Открыть файл");                
				if (ret1 == JFileChooser.APPROVE_OPTION) {
				    File file1 = fileopen1.getSelectedFile();
				    
				    filefield1.setText(file1.getPath());
				    
				    try (BufferedReader reader1 = new BufferedReader(
				    	       new InputStreamReader(
				    	         new FileInputStream(file1), "UTF8"))) {
				    	
				    	char[] buffer = new char[990000000];
				    	int n;
				    	StringBuilder sb1 = new StringBuilder();
				    	while ((n = reader1.read(buffer)) != -1)
				    	{
				    		sb1.append(buffer,0,n);
				    	}
				        //
				        String k3,m3,o3;				      
				        k3 = keyfield3.getText();
						m3 = sb1.toString();
						
						app.Bofordll Bof3 = new Bofordll(k3,m3);
						o3 = Bof3.Decrypt(m3, Bof3.tokey(k3));
						
					    //
						try(FileWriter writer1 = new FileWriter(file1.getPath(), false))
				        {
				           // запись всей строки	         
				            writer1.write(o3);
				         
				            writer1.flush();
				            
				            statusinfo1.setText("Расшифровано");			         
				            JOptionPane.showMessageDialog(contentPane, "Расшифровано");
				        }
				        catch(IOException ex){
				             
				            System.out.println(ex.getMessage());
				        } 
						//
				        
				    } catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
			}
		});
		btnNewButton_3.setBounds(21, 83, 322, 23);
		panel_2.add(btnNewButton_3);
		
		
		
	
		
		
		
	}
}



