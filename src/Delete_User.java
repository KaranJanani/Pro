import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Delete_User extends JFrame implements ActionListener {
    Container c;
    JButton del,close;
    JLabel usr, msg;
    JTextField uname;

    Delete_User() {
        super();
        setSize(750, 750);
        setVisible(true);
        setLayout(null);
        c = getContentPane();
        usr = new JLabel("USERNAME");
        usr.setBounds(100, 100, 100, 20);
        uname = new JTextField();
        uname.setBounds(200, 100, 100, 20);
        del = new JButton("DELETE USER");
        del.setBounds(80, 150, 100, 20);
        msg = new JLabel("ENTER THE USER NAME");
        msg.setBounds(100, 200, 200, 20);
        close=new JButton("CLOSE");
        close.setBounds(200,150,100,20);
        c.add(close);
        c.add(usr);
        c.add(uname);
        c.add(del);
        del.addActionListener(this);
        close.addActionListener(this);
    }



        @Override
        public void actionPerformed (ActionEvent actionEvent){
        if(actionEvent.getSource()==close)
        {
            dispose();
        }

        else
        if(uname.getText().trim().length()==0)

        {
                JOptionPane.showMessageDialog(null,"Enter USERNAME");

        }


            else
                if(actionEvent.getSource()==del)
            {
                Mysql mysql = new Mysql();

                mysql.deleteuser(uname.getText());
                JOptionPane.showMessageDialog(null, "USER DELETED SUCESSFULLY");
                uname.setText(null);
            }


    }



    }
