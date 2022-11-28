import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Layout implements ActionListener{
    private final ClassTable mtm;
    private final StudentTable st;
    private final JTable jtbl, jtblS;
    private final JTextField groupName, groupMax, sName, sSurname, sPoints, sBirthday, sNationality;
    public Layout(){
        JFrame jfrm = new JFrame("Dziennik");
        jfrm.setPreferredSize(new Dimension(620,600));
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new FlowLayout());

        mtm=new ClassTable();
        st=new StudentTable(mtm.cc.groups.get(0));

        jtbl = new JTable(mtm);
        jtbl.setPreferredScrollableViewportSize(new Dimension(500,150));
        jtblS = new JTable(st);
        jtblS.setPreferredScrollableViewportSize(new Dimension(500,150));

        JScrollPane jscrlp = new JScrollPane(jtbl);
        JScrollPane jscrlpS = new JScrollPane(jtblS);

        groupName = new JTextField();
        groupName.setPreferredSize(new Dimension(250,30));
        groupMax = new JTextField();
        groupMax.setPreferredSize(new Dimension(250,30));
        sName = new JTextField();
        sName.setPreferredSize(new Dimension(95,30));
        sSurname = new JTextField();
        sSurname.setPreferredSize(new Dimension(95,30));
        sPoints = new JTextField();
        sPoints.setPreferredSize(new Dimension(95,30));
        sBirthday = new JTextField();
        sBirthday.setPreferredSize(new Dimension(95,30));
        sNationality = new JTextField();
        sNationality.setPreferredSize(new Dimension(95,30));


        JButton jbtnNew = new JButton("Dodaj Grupę");
        jbtnNew.addActionListener(this);
        JButton jbtnDelete = new JButton("Usuń Grupę");
        jbtnDelete.addActionListener(this);
        JButton jbtnNewS = new JButton("Dodaj Studenta");
        jbtnNewS.addActionListener(this);
        JButton jbtnDeleteS = new JButton("Usuń Studenta");
        jbtnDeleteS.addActionListener(this);
        JButton jbtnSort = new JButton("Sortowanie");
        jbtnSort.addActionListener(this);


        jtbl.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = jtbl.getSelectedRow();
                st.changeModel(mtm.cc.groups.get(row));
                jtblS.setModel(st);
            }
        });


        jfrm.getContentPane().add(jscrlp);
        jfrm.getContentPane().add(groupName);
        jfrm.getContentPane().add(groupMax);
        jfrm.getContentPane().add(jbtnNew);
        jfrm.getContentPane().add(jbtnDelete);
        jfrm.getContentPane().add(jscrlpS);
        jfrm.getContentPane().add(sName);
        jfrm.getContentPane().add(sSurname);
        jfrm.getContentPane().add(sBirthday);
        jfrm.getContentPane().add(sPoints);
        jfrm.getContentPane().add(sNationality);
        jfrm.getContentPane().add(jbtnNewS);
        jfrm.getContentPane().add(jbtnDeleteS);
        jfrm.getContentPane().add(jbtnSort);
        jfrm.pack();
        jfrm.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Dodaj Grupę")){
            mtm.newClass(groupName.getText(), Integer.parseInt(groupMax.getText()));
        }
        else if(ae.getActionCommand().equals("Usuń Grupę")){
            mtm.deleteClass(jtbl.getSelectedRow());
        }
        else if(ae.getActionCommand().equals("Dodaj Studenta")){
            st.newStudent(sName.getText(), sSurname.getText(), Integer.parseInt(sBirthday.getText()),Double.parseDouble(sPoints.getText()), sNationality.getText());
        }
        else if(ae.getActionCommand().equals("Usuń Studenta")){
            st.deleteStudent(jtblS.getSelectedRow());
        }
        else if(ae.getActionCommand().equals("Sortowanie")) {
            st.sort();
        }
    }
}