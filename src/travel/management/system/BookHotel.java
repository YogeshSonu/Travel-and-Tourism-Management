package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;


public class BookHotel extends JFrame implements ActionListener{
    
    Choice chotel,cac,cfood;
    JLabel labelusername,labelid,labelnumber,labelphone,labeltotal;
    JTextField tfpersons,tfdays;
    String username;
    JButton checkprice,bookpackage,back;
    BookHotel(String username){
        this.username=username;
        setBounds(280,200,1100,600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text=new JLabel("BOOK HOTEL");
        text.setBounds(100, 10, 200, 30);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        add(text);
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblusername.setBounds(40, 70, 100, 20);
        add(lblusername);
        
        labelusername=new JLabel("");
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        labelusername.setBounds(250, 70, 200, 20);
        add(labelusername);
        
        JLabel lblhotel=new JLabel("Select Hotel");
        lblhotel.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblhotel.setBounds(40, 110, 150, 20);
        add(lblhotel);
        
        chotel = new Choice();
        chotel.setBounds(250, 110, 200, 20);
        add(chotel);
        
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("Select * from hotel");
            while(rs.next()){
                chotel.add(rs.getString("Name"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JLabel lblperson=new JLabel("Total Persons");
        lblperson.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblperson.setBounds(40, 150, 150, 25);
        add(lblperson);
        
        tfpersons=new JTextField("1");
        tfpersons.setBounds(250,150,200,25);
        add(tfpersons);
        
        JLabel lbldays=new JLabel("No. of Days");
        lbldays.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbldays.setBounds(40, 190, 150, 25);
        add(lbldays);
        
        tfdays=new JTextField("1");
        tfdays.setBounds(250,190,200,25);
        add(tfdays);
        
        JLabel lblac=new JLabel("AC/Non-AC");
        lblac.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblac.setBounds(40, 230, 150, 25);
        add(lblac);
        
        cac = new Choice();
        cac.add("AC");
        cac.add("Non-AC");
        cac.setBounds(250, 230, 200, 20);
        add(cac);
        
        JLabel lblfood=new JLabel("Food Included");
        lblfood.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblfood.setBounds(40, 270, 150, 25);
        add(lblfood);
        
        cfood = new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250, 270, 200, 20);
        add(cfood);
        
        
        JLabel lblid=new JLabel("Id");
        lblid.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblid.setBounds(40, 310, 150, 20);
        add(lblid);
        
        labelid=new JLabel("");
        labelid.setBounds(250, 310, 200, 25);
        add(labelid);
        
        JLabel lblnumber=new JLabel("Number");
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblnumber.setBounds(40, 350, 150, 25);
        add(lblnumber);
        
        labelnumber=new JLabel("");
        labelnumber.setBounds(250, 350, 150, 25);
        add(labelnumber);
        
        JLabel lblphone=new JLabel("Phone");
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblphone.setBounds(40, 390, 150, 20);
        add(lblphone);
        
        labelphone=new JLabel("");
        labelphone.setBounds(250, 390, 200, 25);
        add(labelphone);
        
        JLabel lbltotal=new JLabel("Total Price");
        lbltotal.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbltotal.setBounds(40, 430, 150, 25);
        add(lbltotal);
        
        labeltotal=new JLabel("");
        labeltotal.setBounds(250, 430, 150, 25);
        add(labeltotal);
        
        try{
            
            Conn c=new Conn();
            String query="select * from customer where Username='"+username+"' ";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                
                labelusername.setText(rs.getString("Username"));
                labelid.setText(rs.getString("Id"));
                labelnumber.setText(rs.getString("Number"));
                labelphone.setText(rs.getString("Phone"));
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        checkprice=new JButton("Check Price");
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
        checkprice.setBounds(60, 490, 120, 25);
        checkprice.addActionListener(this);
        add(checkprice);
        
        bookpackage=new JButton("Book Hotel");
        bookpackage.setBackground(Color.BLACK);
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setBounds(200, 490, 120, 25);
        bookpackage.addActionListener(this);
        add(bookpackage);
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(340, 490, 120, 25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2=i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(500, 50, 600, 300);
        add(image);
        
        
        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==checkprice){
            try{
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery("Select * from hotel where name= '"+chotel.getSelectedItem()+"'");
                while(rs.next()){
                    int cost=Integer.parseInt(rs.getString("CostPerPerson"));
                    int food=Integer.parseInt(rs.getString("Foodincluded"));
                    int ac=Integer.parseInt(rs.getString("Acroom"));
                    
                    int persons=Integer.parseInt(tfpersons.getText());
                    int days=Integer.parseInt(tfdays.getText());
                    
                    
                    String acselected=cac.getSelectedItem();
                    String foodselected=cfood.getSelectedItem();
                    
                    if(persons * days>0){
                        int total=0;
                        total += acselected.equals("AC")?ac:0;
                        total += foodselected.equals("Yes")?food:0;
                        total += cost;
                        total=total*persons*days;
                        labeltotal.setText("Rs "+total);                        
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Please Enter a Valid number");
                    }
                }
             }catch(Exception e){
                e.printStackTrace();
            }
            
            
        }else if(ae.getSource() == bookpackage){
            try{
                Conn c=new Conn();
                c.s.executeUpdate("insert into bookhotel values('"+labelusername.getText()+"', '"+chotel.getSelectedItem()+"', '"+tfpersons.getText()+"', '"+tfdays.getText()+"', '"+cac.getSelectedItem()+"', '"+cfood.getSelectedItem()+"', '"+labelid.getText()+"', '"+labelnumber.getText()+"', '"+labelphone.getText()+"', '"+labeltotal.getText()+"')");
                
                JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
                setVisible(false);
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
        } else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new BookHotel("");
    }
}
