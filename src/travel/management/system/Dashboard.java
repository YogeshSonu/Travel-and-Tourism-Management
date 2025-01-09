package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    String username;
    JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkPackages,bookPackages,viewPackages;
    JButton viewhotels,destination,bookhotels,viewbookedhotels,payments,Calculators,about,notepad,deletePersonalDetails,icon1,heading1;
    Dashboard(String username){
        
        this.username=username;
//        setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        
        JLabel heading=new JLabel("DashBoard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/logout.png"));
        Image i5=i4.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        icon1=new JButton(i6);
        icon1.setBounds(1175, 10, 40, 40);
        icon1.setBorder(BorderFactory.createEmptyBorder());
        icon1.setBackground(null);
        icon1.addActionListener(this);
        p1.add(icon1);
        
        heading1=new JButton("Logout");
        heading1.setBounds(1220, 10, 120, 40);
        heading1.setForeground(Color.WHITE);
        heading1.setFont(new Font("Tahoma",Font.BOLD,30));
        heading1.setBackground(null);
        heading1.setBorder(BorderFactory.createEmptyBorder());
        heading1.addActionListener(this);
        p1.add(heading1);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);
        
        addPersonalDetails=new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 45);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        
        updatePersonalDetails=new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 45, 300, 45);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        
        viewPersonalDetails=new JButton("View Details");
        viewPersonalDetails.setBounds(0,90, 300, 45);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        
        deletePersonalDetails=new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 135, 300, 45);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        
        checkPackages=new JButton("Check Packages");
        checkPackages.setBounds(0, 180, 300, 45);
        checkPackages.setBackground(new Color(0,0,102));
        checkPackages.setForeground(Color.WHITE);
        checkPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkPackages.setMargin(new Insets(0,0,0,110));
        checkPackages.addActionListener(this);
        p2.add(checkPackages);
        
        bookPackages=new JButton("Book Packages");
        bookPackages.setBounds(0, 225, 300, 45);
        bookPackages.setBackground(new Color(0,0,102));
        bookPackages.setForeground(Color.WHITE);
        bookPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookPackages.setMargin(new Insets(0,0,0,120));
        bookPackages.addActionListener(this);
        p2.add(bookPackages);
        
        viewPackages=new JButton("View Packages");
        viewPackages.setBounds(0, 270, 300, 45);
        viewPackages.setBackground(new Color(0,0,102));
        viewPackages.setForeground(Color.WHITE);
        viewPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPackages.setMargin(new Insets(0,0,0,120));
        viewPackages.addActionListener(this);
        p2.add(viewPackages);
        
        
        viewhotels=new JButton("View Hotels");
        viewhotels.setBounds(0, 315, 300, 45);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setMargin(new Insets(0,0,0,140));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotels=new JButton("Book Hotel");
        bookhotels.setBounds(0, 360, 300, 45);
        bookhotels.setBackground(new Color(0,0,102));
        bookhotels.setForeground(Color.WHITE);
        bookhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotels.setMargin(new Insets(0,0,0,140));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);
        
        viewbookedhotels=new JButton("View Booked Hotel");
        viewbookedhotels.setBounds(0, 405, 300, 45);
        viewbookedhotels.setBackground(new Color(0,0,102));
        viewbookedhotels.setForeground(Color.WHITE);
        viewbookedhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewbookedhotels.setMargin(new Insets(0,0,0,70));
        viewbookedhotels.addActionListener(this);
        p2.add(viewbookedhotels);
        
        destination=new JButton("Destinations");
        destination.setBounds(0, 450, 300, 45);
        destination.setBackground(new Color(0,0,102));
        destination.setForeground(Color.WHITE);
        destination.setFont(new Font("Tahoma",Font.PLAIN,20));
        destination.setMargin(new Insets(0,0,0,125));
        destination.addActionListener(this);
        p2.add(destination);
        
        payments=new JButton("Payments");
        payments.setBounds(0, 495, 300, 45);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        payments.setMargin(new Insets(0,0,0,155));
        payments.addActionListener(this);
        p2.add(payments);
        
        Calculators=new JButton("Calculator");
        Calculators.setBounds(0, 540, 300, 45);
        Calculators.setBackground(new Color(0,0,102));
        Calculators.setForeground(Color.WHITE);
        Calculators.setFont(new Font("Tahoma",Font.PLAIN,20));
        Calculators.setMargin(new Insets(0,0,0,145));
        Calculators.addActionListener(this);
        p2.add(Calculators);
        
        notepad=new JButton("Notepad");
        notepad.setBounds(0, 585, 300, 45);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,155));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about=new JButton("About");
        about.setBounds(0, 630, 300, 45);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,175));
        about.addActionListener(this);
        p2.add(about);
        
        
        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i8=i7.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel image=new JLabel(i9);
        image.setBounds(0, 0, 1650, 1000);
        add(image);
        
        JLabel text=new JLabel("Travel and Tourism Management System");
        text.setBounds(350,70,1250,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.PLAIN,55));
        image.add(text);
        
        setVisible(true);
    }
        
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addPersonalDetails){
            new AddCustomer(username);
        }
        if(ae.getSource()==viewPersonalDetails){
            new ViewCustomer(username);
        }
        if(ae.getSource()==updatePersonalDetails){
            new UpdateCustomer(username);
        }
        if(ae.getSource()==checkPackages){
            new CheckPackages();
        }
        if(ae.getSource()==bookPackages){
            new BookPackage(username);
        }
        if(ae.getSource()==viewPackages){
            new ViewPackage(username);
        }
        if(ae.getSource()==viewhotels){
            new CheckHotels();
        }
        if(ae.getSource()==destination){
            new Destinations();
        }
        if(ae.getSource()==bookhotels){
            new BookHotel(username);
        }
        if(ae.getSource()==viewbookedhotels){
            new ViewBookedHotel(username);
        }
        if(ae.getSource()==payments){
            new Payments();
        }
        if(ae.getSource()==Calculators){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
          }
        }
        if(ae.getSource()==notepad){
                try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
           }
        }
        if(ae.getSource()==about){
            new About();
        }
        if(ae.getSource()==deletePersonalDetails){
            new DeleteDetails(username);
        }
        if(ae.getSource()==icon1 || ae.getSource()==heading1){
            JOptionPane.showMessageDialog(null, "Logout Successfully");
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args){
        new Dashboard("");
    }
}
