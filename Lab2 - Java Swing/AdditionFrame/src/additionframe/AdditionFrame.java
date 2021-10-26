package additionframe;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Nasif
 */
public class AdditionFrame implements ActionListener {
    
    JFrame frame;
    JTextField textfield1, textfield2, textfield3;
    JLabel label1, label2, label3;
    JButton button;
    
    AdditionFrame()
    {
        frame = new JFrame("Calculator");
        frame.setSize(450,450);
        frame.setLayout(null);
        
        label1=new JLabel("First Input: ");  
        label1.setBounds(125,99,100,30); 
        
        label2=new JLabel("Second Input: ");
        label2.setBounds(125,139,100,30);
        
        
        textfield1=new JTextField();  
        textfield1.setBounds(220,100,70,30);
        
        textfield2=new JTextField();
        textfield2.setBounds(220,140,70,30);
        
        label3=new JLabel("Answer: ");
        label3.setBounds(125,179,100,30);
        
        textfield3=new JTextField();
        textfield3.setBounds(220,180,70,30);
        
        button=new JButton("+");  
        button.setBounds(160,220,95,30);  
        
        button.addActionListener(this); 
        
        frame.add(label1);
        frame.add(textfield1);
        frame.add(label2);
        frame.add(textfield2);
        frame.add(label3);
        frame.add(textfield3);
        frame.add(button);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        String text1=textfield1.getText();
        int text11 = Integer.parseInt(text1);
        String text2=textfield2.getText();
        int text22 = Integer.parseInt(text2);
        int text3=text11+text22; 
        String text33=Integer.toString(text3);
        textfield3.setText(text33);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        
        new AdditionFrame();
    }
    
}
