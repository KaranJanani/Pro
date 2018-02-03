import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add_user extends JFrame implements ActionListener{
    JButton add_user,close;
    JTextField uname,user_type,user_id;
    JPasswordField pass;
    JLabel usr,pa,u_type,u_id;
    Container c;
    public Add_user() {
        super();
        setSize(750,750);
        setVisible(true);
        setLayout(null);
        c=getContentPane();
        add_user=new JButton("ADD USER");
        add_user.setBounds(70,330,125,20);
        uname=new JTextField();
        uname.setBounds(200,100,100,20);
        pass =new JPasswordField();
        pass.setBounds(200,150,100,20);
        usr=new JLabel("USERSNAME");
        usr.setBounds(100,100,100,20);
        pa=new JLabel("PASSWORD");
        pa.setBounds(100,150,100,20);
        u_type=new JLabel("USER TYPE");
        u_type.setBounds(100,200,100,20);
        u_id=new JLabel("USER ID");
        u_id.setBounds(100,250,100,20);
        user_type=new JTextField();
        user_type.setBounds(200,200,100,20);
        user_id=new JTextField();
        user_id.setBounds(200,250,100,20);
        close=new JButton("CLOSE");
        close.setBounds(210,330,80,20);

        c.add(add_user);
        c.add(uname);
        c.add(pass);
        c.add(usr);
        c.add(pa);
        c.add(u_id);
        c.add(u_type);
        c.add(user_type);
        c.add(user_id);
        c.add(close);
        add_user.addActionListener(this);
        close.addActionListener(this);



    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()==close)
        {
            dispose();
        }
        else
        if(uname.getText().trim().length()==0)
        {
            JOptionPane.showMessageDialog(null,"ENTER USERNAME");
        }
        else
            if(pass.getText().trim().length()==0)
            {
                JOptionPane.showMessageDialog(null,"ENTER PASSWORD");
            }
            else if (user_type.getText().trim().length()==0)
            {
                JOptionPane.showMessageDialog(null,"ENTER USER TYPE");
            }
            else if(user_id.getText().trim().length()==0)
            {
                JOptionPane.showMessageDialog(null,"ENTER USER ID");
            }
            else {


                Mysql mysql = new Mysql();
                mysql.adduser(user_id.getText(), user_type.getText(), uname.getText(), pass.getText());

                JOptionPane.showMessageDialog(null, "USER ADDED SUCESSFULLY");
            }

    }



}
