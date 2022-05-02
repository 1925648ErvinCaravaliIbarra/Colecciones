/*
 * 
 * 
 */
package colecciones;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import  operaciones.Operaciones;
/*
 *
 * 
 */
public class Colecciones_GUI extends JFrame {
private JPanel pdatos, pbotones,pnorte;
private JLabel valor1,resultados;
private JTextField tfvalor;
private JComboBox <String>combo1;
private JButton mostrarvalor,ingresarvalor;
private JTextArea area;
private JScrollPane barras;

  
    /*
     *
     * 
    */
    private void initGUI() {
    valor1= new JLabel("Ingrese un valor :");
    tfvalor= new JTextField(20);
    pdatos = new JPanel();
    pdatos.add(valor1);
    pdatos.add(tfvalor);
    add(pdatos);
    
    String[] C= {"Seleccione una opcion","ArrayList","Set","Arreglo"};
    combo1= new JComboBox<>(C);
    ingresarvalor= new JButton("Ingresar valor");
    mostrarvalor= new JButton("Mostrar valor");
    pbotones= new JPanel(new GridLayout(1,2,2,2));
    pbotones.add(combo1);
    pbotones.add(ingresarvalor);
    pbotones.add(mostrarvalor);
    add(pbotones);
    
    pnorte= new JPanel(new GridLayout(2,1));
    pnorte.add(pdatos);
    pnorte.add(pbotones);
    add(pnorte);
    
    area= new JTextArea(15,30);
    barras= new  JScrollPane(area);
    resultados = new JLabel("Resultados :");
    
    
    add(pnorte,BorderLayout.NORTH);
    add(barras,BorderLayout.CENTER);
    add(resultados,BorderLayout.SOUTH);
    
    ManejadoraDeventos evento= new ManejadoraDeventos();
    ingresarvalor.addActionListener(evento);
    mostrarvalor.addActionListener(evento);
    
    
    }
    
    
 
    /*
     *
     * 
    */
    public  Colecciones_GUI(){
    initGUI();
    this.setTitle("Coleeciones");//titulo de la ventana.
    this.setSize(450,400);// tamaño de la ventana ancho y alto respectivamente. 
    this.setLocationRelativeTo(null);//sin modificar en que zona de la pantalla quiero la presentacion.
    this.setVisible(true);// con esto hago visible la ventana.
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// se cierra/abre la ventana. 
    }
    
   
    /*
     *
     * 
    */
    
    class ManejadoraDeventos implements ActionListener  {
        Operaciones op;
        public ManejadoraDeventos(){
         op = new Operaciones();
        }
          String  v1, v2;
        @Override
        public void actionPerformed(ActionEvent e) {
            
            v1 =  tfvalor.getText();
            v2 =  combo1.getSelectedItem().toString();
            if(e.getSource()==ingresarvalor){
            
             String   m =op.IngresarDato(v1,v2);
                resultados.setText(m);
             
            }  else if(e.getSource()==mostrarvalor){
            
              String  t =(op.MostrarDato(combo1.getSelectedItem().toString()));
              area.setText(t);
            }
        }
        
         
    }
    
    public static void main(String[] args) {
      
    Colecciones_GUI E = new Colecciones_GUI();
    }
    
}
