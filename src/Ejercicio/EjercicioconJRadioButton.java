package Ejercicio;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class EjercicioconJRadioButton extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjercicioconJRadioButton frame = new EjercicioconJRadioButton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	static int[] p = {0,0,0,0,0};
	static int IndicadorPregunta = 0;
	static int m = 0;
	static int Buenas = 0;
	static int a = 0;
	static int Malas = 0;
	static int [] hola = {0,0,0,0,0};
	static String[] Preguntas = { "Esta libreria no es parte de java, pero tambien es usada para desarrollar interfaces de usuario: ","¿Quien creo el lenguaje de java?",
			" ¿Cuales son los tipos de variables en java?", "¿Que es un package en java?","Todos son ciclos parte de java excepto 1 ¿Cual es?"};
	
	static String[] Respuestas = {"AWT","SWT","Swing","JavaFx","Oracle","Sun","Apache","Eclipe Foundation","Global/Local/Estatica","Instancia/Estatica/Local","Static/Final/Abstract","Public/Static/Global",
			"Un espacio de trabajo","Grupo de clase relacionadas","Interfaz visual","Directorio online","for","foreach","do while","while",};
	private final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * Create the frame.
	 */
	public EjercicioconJRadioButton() {
		setTitle("Quiz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblPregunta = new JLabel("Ojo");
		
		JRadioButton rad1 = new JRadioButton("");
		buttonGroup.add(rad1);
		
		JRadioButton rad2 = new JRadioButton("");
		buttonGroup.add(rad2);
		
		JRadioButton rad3 = new JRadioButton("");
		buttonGroup.add(rad3);
		
		JRadioButton rad4 = new JRadioButton("");
		buttonGroup.add(rad4);
		
		JButton radSiguiente = new JButton("Siguiente");
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				 
				radSiguiente.setVisible(true);
				IndicadorPregunta = IndicadorPregunta - 1;
				lblPregunta.setText((IndicadorPregunta+1)+". "+Preguntas[IndicadorPregunta]);
				if(p[IndicadorPregunta] == 1)
				{					
					rad1.setSelected(true);					
				}
				else if(p[IndicadorPregunta] == 2)
				{
					rad2.setSelected(true);	
				}
				else if(p[IndicadorPregunta] == 3)
				{
					rad3.setSelected(true);	
				}
				else if(p[IndicadorPregunta] == 4)
				{
					rad4.setSelected(true);	;
				}	
				
				   switch(IndicadorPregunta)
					{
					 case 0:
						 rad1.setText(Respuestas[0]);
						rad2.setText(Respuestas[1]);
						rad3.setText(Respuestas[2]);
						rad4.setText(Respuestas[3]);						
						break;
					 case 1:
						 rad1.setText(Respuestas[4]);
							rad2.setText(Respuestas[5]);
							rad3.setText(Respuestas[6]);
							rad4.setText(Respuestas[7]);							
							break;
					 case 2:
						 rad1.setText(Respuestas[8]);
							rad2.setText(Respuestas[9]);
							rad3.setText(Respuestas[10]);
							rad4.setText(Respuestas[11]);
							break;
					 case 3:
						 rad1.setText(Respuestas[12]);
							rad2.setText(Respuestas[13]);
							rad3.setText(Respuestas[14]);
							rad4.setText(Respuestas[15]);
					        break;
					 case 4:
						    rad1.setText(Respuestas[16]);
						   	rad2.setText(Respuestas[17]);
							rad3.setText(Respuestas[18]);
							rad4.setText(Respuestas[19]);							
					}
			}
		});
		
	
		radSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if(p[IndicadorPregunta] == 1)
				{					
					rad1.setSelected(true);					
				}
				else if(p[IndicadorPregunta] == 2)
				{
					rad2.setSelected(true);	
				}
				else if(p[IndicadorPregunta] == 3)
				{
					rad3.setSelected(true);	
				}
				else if(p[IndicadorPregunta] == 4)
				{
					rad4.setSelected(true);	;
				}	
				else
				{
					if(rad2.isSelected() == true)
					{
						Buenas = Buenas +1;
						p[IndicadorPregunta]=2;
					}
					else if(rad3.isSelected() == true)
					{
						Malas = Malas + 1;
						p[IndicadorPregunta]=3;
					}
					else if(rad4.isSelected() == true)
					{
						Malas = Malas + 1;
						p[IndicadorPregunta]=4;
					}
					else if(rad1.isSelected() == true)
					{
						Malas = Malas + 1;
						p[IndicadorPregunta]=1;
					}
					else if(buttonGroup.isSelected(null))
					{				
						hola[a] = IndicadorPregunta+1;
						a++;   
					}
				}			
					IndicadorPregunta = IndicadorPregunta +1;
					if((Buenas+Malas) == 5)
					{
				     
				      if (m == 0)
				      {
				    	  radSiguiente.setVisible(false);
							JOptionPane.showMessageDialog(null, "Ya termino de contestar las preguntas, de clic en evaluar para checar su calificacion","Atencion", 1);
							m = (int) 1;
							return;
				      }
				      else
				      {
				    	  lblPregunta.setText((IndicadorPregunta+1)+". "+Preguntas[IndicadorPregunta]);
						   switch(IndicadorPregunta)
							{
							 case 0:
								 int o = 0;
								 rad1.setText(Respuestas[0]);
								rad2.setText(Respuestas[1]);
								rad3.setText(Respuestas[2]);
								rad4.setText(Respuestas[3]);	
								buttonGroup.clearSelection();
								if(p[IndicadorPregunta] == 1)
								{					
									rad1.setSelected(true);					
								}
								else if(p[IndicadorPregunta] == 2)
								{
									rad2.setSelected(true);	
								}
								else if(p[IndicadorPregunta] == 3)
								{
									rad3.setSelected(true);	
								}
								else if(p[IndicadorPregunta] == 4)
								{
									rad4.setSelected(true);	;
								}	
								break;
							 case 1:
								 rad1.setText(Respuestas[4]);
									rad2.setText(Respuestas[5]);
									rad3.setText(Respuestas[6]);
									rad4.setText(Respuestas[7]);
									buttonGroup.clearSelection();
									if(p[IndicadorPregunta] == 1)
									{					
										rad1.setSelected(true);					
									}
									else if(p[IndicadorPregunta] == 2)
									{
										rad2.setSelected(true);	
									}
									else if(p[IndicadorPregunta] == 3)
									{
										rad3.setSelected(true);	
									}
									else if(p[IndicadorPregunta] == 4)
									{
										rad4.setSelected(true);	;
									}	
									break;
							 case 2:
								 rad1.setText(Respuestas[8]);
									rad2.setText(Respuestas[9]);
									rad3.setText(Respuestas[10]);
									rad4.setText(Respuestas[11]);	
									buttonGroup.clearSelection();
									if(p[IndicadorPregunta] == 1)
									{					
										rad1.setSelected(true);					
									}
									else if(p[IndicadorPregunta] == 2)
									{
										rad2.setSelected(true);	
									}
									else if(p[IndicadorPregunta] == 3)
									{
										rad3.setSelected(true);	
									}
									else if(p[IndicadorPregunta] == 4)
									{
										rad4.setSelected(true);	;
									}	
									break;
							 case 3:
								 rad1.setText(Respuestas[12]);
									rad2.setText(Respuestas[13]);
									rad3.setText(Respuestas[14]);
									rad4.setText(Respuestas[15]);
									buttonGroup.clearSelection();
									if(p[IndicadorPregunta] == 1)
									{					
										rad1.setSelected(true);					
									}
									else if(p[IndicadorPregunta] == 2)
									{
										rad2.setSelected(true);	
									}
									else if(p[IndicadorPregunta] == 3)
									{
										rad3.setSelected(true);	
									}
									else if(p[IndicadorPregunta] == 4)
									{
										rad4.setSelected(true);	;
									}	
							        break;
							 case 4:
								    rad1.setText(Respuestas[16]);
								   	rad2.setText(Respuestas[17]);
									rad3.setText(Respuestas[18]);
									rad4.setText(Respuestas[19]);							
									IndicadorPregunta = (int)4;
									buttonGroup.clearSelection();
									if(p[IndicadorPregunta] == 1)
									{					
										rad1.setSelected(true);					
									}
									else if(p[IndicadorPregunta] == 2)
									{
										rad2.setSelected(true);	
									}
									else if(p[IndicadorPregunta] == 3)
									{
										rad3.setSelected(true);	
									}
									else if(p[IndicadorPregunta] == 4)
									{
										rad4.setSelected(true);	;
									}	
							        break;	 
			          }
						
				   }
			     }
					else
					{
						lblPregunta.setText((IndicadorPregunta+1)+". "+Preguntas[IndicadorPregunta]);
						   switch(IndicadorPregunta)
							{
							 case 0:
								 int o = 0;
								 rad1.setText(Respuestas[0]);
								rad2.setText(Respuestas[1]);
								rad3.setText(Respuestas[2]);
								rad4.setText(Respuestas[3]);	
								buttonGroup.clearSelection();
								if(p[IndicadorPregunta] == 1)
								{					
									rad1.setSelected(true);					
								}
								else if(p[IndicadorPregunta] == 2)
								{
									rad2.setSelected(true);	
								}
								else if(p[IndicadorPregunta] == 3)
								{
									rad3.setSelected(true);	
								}
								else if(p[IndicadorPregunta] == 4)
								{
									rad4.setSelected(true);	;
								}	
								break;
							 case 1:
								 rad1.setText(Respuestas[4]);
									rad2.setText(Respuestas[5]);
									rad3.setText(Respuestas[6]);
									rad4.setText(Respuestas[7]);
									buttonGroup.clearSelection();
									if(p[IndicadorPregunta] == 1)
									{					
										rad1.setSelected(true);					
									}
									else if(p[IndicadorPregunta] == 2)
									{
										rad2.setSelected(true);	
									}
									else if(p[IndicadorPregunta] == 3)
									{
										rad3.setSelected(true);	
									}
									else if(p[IndicadorPregunta] == 4)
									{
										rad4.setSelected(true);	;
									}	
									break;
							 case 2:
								 rad1.setText(Respuestas[8]);
									rad2.setText(Respuestas[9]);
									rad3.setText(Respuestas[10]);
									rad4.setText(Respuestas[11]);	
									buttonGroup.clearSelection();
									if(p[IndicadorPregunta] == 1)
									{					
										rad1.setSelected(true);					
									}
									else if(p[IndicadorPregunta] == 2)
									{
										rad2.setSelected(true);	
									}
									else if(p[IndicadorPregunta] == 3)
									{
										rad3.setSelected(true);	
									}
									else if(p[IndicadorPregunta] == 4)
									{
										rad4.setSelected(true);	;
									}	
									break;
							 case 3:
								 rad1.setText(Respuestas[12]);
									rad2.setText(Respuestas[13]);
									rad3.setText(Respuestas[14]);
									rad4.setText(Respuestas[15]);
									buttonGroup.clearSelection();
									if(p[IndicadorPregunta] == 1)
									{					
										rad1.setSelected(true);					
									}
									else if(p[IndicadorPregunta] == 2)
									{
										rad2.setSelected(true);	
									}
									else if(p[IndicadorPregunta] == 3)
									{
										rad3.setSelected(true);	
									}
									else if(p[IndicadorPregunta] == 4)
									{
										rad4.setSelected(true);	;
									}	
							        break;
							 case 4:
								    rad1.setText(Respuestas[16]);
								   	rad2.setText(Respuestas[17]);
									rad3.setText(Respuestas[18]);
									rad4.setText(Respuestas[19]);							
									IndicadorPregunta = (int)4;
									buttonGroup.clearSelection();
									if(p[IndicadorPregunta] == 1)
									{					
										rad1.setSelected(true);					
									}
									else if(p[IndicadorPregunta] == 2)
									{
										rad2.setSelected(true);	
									}
									else if(p[IndicadorPregunta] == 3)
									{
										rad3.setSelected(true);	
									}
									else if(p[IndicadorPregunta] == 4)
									{
										rad4.setSelected(true);	;
									}	
							        break;	 
			         }		   
					}
				
					
				
				
			}
		});
		radSiguiente.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				
					
					
						
					   
				
				
				   
				
				
				
			}
		});
		
		JButton btnEvaluar = new JButton("Evaluar");
		btnEvaluar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				int R = 0;
				R = Buenas + Malas;
				String Faltan = " ";
				if (R == 5)
				{
					JOptionPane.showMessageDialog(null,"Respondio bien: "+Buenas+"Preguntas"+"\n\n Respuestas incorrectas: "+Malas);

				}
				else
				{
				
					if (IndicadorPregunta < 5)
					{
						JOptionPane.showMessageDialog(null,"No a terminado todas las preguntas");

					}
					else
					{
                    	for (int i = 0; i<5 ; i++)
                    	{
                    		if (hola[i]>=1)
                    		{
                    			Faltan = Faltan +" "+ hola[i];
                    		} 
                    	}
                    	JOptionPane.showMessageDialog(null,"Le falto contestar estas preguntas: " + Faltan);
                    	for (int i = 0; i<5 ; i++)
                    	{
                    		if (hola[i]>=1)
                    		{
                    			lblPregunta.setText((hola[i]+1)+". "+Preguntas[hola[i]]);
                    			switch(hola[i])
                    			{
                    			 case 0:
                    				 rad1.setText(Respuestas[0]);
                    				rad2.setText(Respuestas[1]);
                    				rad3.setText(Respuestas[2]);
                    				rad4.setText(Respuestas[3]);
                    			
                    				break;
                    			 case 1:
                    				 rad1.setText(Respuestas[4]);
                    					rad2.setText(Respuestas[5]);
                    					rad3.setText(Respuestas[6]);
                    					rad4.setText(Respuestas[7]);
                    					break;
                    			 case 2:
                    				 rad1.setText(Respuestas[8]);
                    					rad2.setText(Respuestas[9]);
                    					rad3.setText(Respuestas[10]);
                    					rad4.setText(Respuestas[11]);
                    					break;
                    			 case 3:
                    				 rad1.setText(Respuestas[12]);
                    					rad2.setText(Respuestas[13]);
                    					rad3.setText(Respuestas[14]);
                    					rad4.setText(Respuestas[15]);
                    					break;
                    			 case 4:
                    				 rad1.setText(Respuestas[16]);
                    					rad2.setText(Respuestas[17]);
                    					rad3.setText(Respuestas[18]);
                    					rad4.setText(Respuestas[19]);
                    			break;
                    			}
                    		} 
                    	}
                    	radSiguiente.setVisible(true);
					}
				}
				
			}

			private String ConvertToString(int i) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnRegresar)
							.addGap(83)
							.addComponent(btnEvaluar)
							.addGap(56)
							.addComponent(radSiguiente))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(25)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rad4)
								.addComponent(rad3)
								.addComponent(rad2)
								.addComponent(rad1)
								.addComponent(lblPregunta))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblPregunta)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rad1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rad2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rad3)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rad4)
					.addPreferredGap(ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnRegresar)
						.addComponent(btnEvaluar)
						.addComponent(radSiguiente))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		
		lblPregunta.setText((IndicadorPregunta+1)+". "+Preguntas[IndicadorPregunta]);
		switch(IndicadorPregunta)
		{
		 case 0:
			 rad1.setText(Respuestas[0]);
			rad2.setText(Respuestas[1]);
			rad3.setText(Respuestas[2]);
			rad4.setText(Respuestas[3]);
			
			break;
		 case 1:
			 rad1.setText(Respuestas[4]);
				rad2.setText(Respuestas[5]);
				rad3.setText(Respuestas[6]);
				rad4.setText(Respuestas[7]);
				break;
		 case 2:
			 rad1.setText(Respuestas[8]);
				rad2.setText(Respuestas[9]);
				rad3.setText(Respuestas[10]);
				rad4.setText(Respuestas[11]);
				break;
		 case 3:
			 rad1.setText(Respuestas[12]);
				rad2.setText(Respuestas[13]);
				rad3.setText(Respuestas[14]);
				rad4.setText(Respuestas[15]);
				break;
		 case 4:
			 rad1.setText(Respuestas[16]);
				rad2.setText(Respuestas[17]);
				rad3.setText(Respuestas[18]);
				rad4.setText(Respuestas[19]);
		break;
		}
		
		
	}

}
