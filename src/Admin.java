import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Admin extends JFrame implements ActionListener  {

    Container c;
    JButton b1,b2;
    JTextField tf;
    JPasswordField tf2;
    JLabel l,l1;
    JMenuBar mb;
    JMenu Manage_user;
    JMenuItem add,delete;

        Admin()
        {

            super();
            setSize(1000,1000);
            setVisible(true);

            c=getContentPane();
            c.setLayout(null);

            mb=new JMenuBar();
            Manage_user=new JMenu("Manage Users");
            add=new JMenuItem("Add Users");
            delete=new JMenuItem("Delete Users");
            Manage_user.add(add);
            Manage_user.add(delete);
            mb.add(Manage_user);
            setJMenuBar(mb);
            c.add(mb);
            add.addActionListener(this);
            delete.addActionListener(this);

        }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
            if(actionEvent.getSource()==add) {

               Add_user add_user=new Add_user();
               dispose();
            }
            else
            if (actionEvent.getSource()==delete)
            {
                Delete_User delete_user=new Delete_User();
                dispose();
            }


            }
    }


