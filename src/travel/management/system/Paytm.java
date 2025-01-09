package travel.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Paytm extends JFrame implements ActionListener{
    
    JButton back;
    
    Paytm(){
        
        setBounds(500,200,800,600);
        
        JEditorPane pane=new JEditorPane();
        pane.setEditable(false);
        
        try{
            
            pane.setPage("https://phonepe.com");
            
        }catch(Exception e){
            pane.setContentType("text/html");
            pane.setText("<html>Could not load,Error 404</html>");
        }
        
        JScrollPane sp=new JScrollPane(pane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(sp);
        setPreferredSize(new Dimension(800,600));
        
        
        back=new JButton("Back");
        back.setBounds(610, 20, 80, 40);
        back.addActionListener(this);
        pane.add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Payments();
    }
    
    public static void main(String[] args){
        new Paytm();
    }
}
