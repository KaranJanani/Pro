import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    Container c;
    JButton b;
    JTextField tf;
    JPasswordField tf2;
    JLabel l,l1;
    Login() {
        super();
        setSize(1000, 1000);
        setVisible(true);
        c=getContentPane();
        c.setLayout(null);
        l=new JLabel("USERNAME");
        l.setBounds(100,100,100,20);
        l1=new JLabel("PASSWORD");
        l1.setBounds(100,150,100,20);
        b=new JButton("LOGIN");
        tf=new JTextField();
        tf.setBounds(200,100,100,20);
        tf2=new JPasswordField();
        tf2.setBounds(200,150,100,20);
        b=new JButton("LOGIN");
        b.setBounds(150,200,100,20);

        c.add(l);
        c.add(l1);
        c.add(tf);
        c.add(tf2);
        c.add(b);
        b.addActionListener(this);

    }


    public static void main(String[] args) {
        Login login =new Login();
    }
    String usr="karan";
    String pass="k123";

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if(tf.getText().trim().length()==0)
        {
            JOptionPane.showMessageDialog(null,"ENTER USER NAME");
        }
        else
            if(tf2.getText().trim().length()==0)
            {
                JOptionPane.showMessageDialog(null,"ENTER PASSWORD");
            }

        else
        if(tf.getText().equals(usr)&&tf2.getText().equals(pass))
        {
            Admin second=new Admin();
            dispose();

        }
        else
        {
            c.setBackground(Color.RED);
        }


    }
}

