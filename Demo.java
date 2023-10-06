import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.*;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Demo {
          public static int id = 0;
         public static void main(String[] args) {
                    JFrame f = new JFrame();
                    f.setBounds(50,20,800,700);

                    JLabel l = new JLabel("first part");
                    l.setBounds(100,20,100,30);

                    JLabel n = new JLabel("Name :");
                    n.setBounds(50,80,100,30);
                    JTextField jt = new JTextField();
                    jt.setBounds(160,80,100,30);

                    JLabel i = new JLabel("id :");
                    i.setBounds(280,80,50,30);
                    JTextField id1 = new JTextField();
                    id1.setBounds(320,80,150,30);

                    JLabel all = new JLabel();
                    all.setBounds(490,100,400,30);


                    JLabel p = new JLabel("mobile :");
                    p.setBounds(50,120,100,30);
                    JTextField p1 = new JTextField();
                    p1.setBounds(160,120,100,30);

                    JLabel a = new JLabel("Address :");
                    a.setBounds(50,180,100,30);
                    JComboBox c = new JComboBox<>();
                    c.setBounds(120, 180, 100, 30);
                    JTextField su = new JTextField();
                    su.setBounds(230,180,100,30);
                    JTextField co = new JTextField();
                    co.setBounds(350,180,100,30);

                    try {
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection com =  DriverManager.getConnection("jdbc:mysql://Localhost:3306/swing", "root", "Aditi@#123");
                     Statement st = com.createStatement();
                     String qury = "select name from ci";
                     ResultSet r= st.executeQuery(qury);
                     while(r.next()){
                        c.addItem( r.getString("name"));
                        
                     }
                   
                    } catch (Exception z) {
                        System.out.println(z.getMessage());
                    }
                    

                    c.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                    try {
                              Class.forName("com.mysql.cj.jdbc.Driver");
                              Connection com =  DriverManager.getConnection("jdbc:mysql://Localhost:3306/swing", "root", "Aditi@#123");
                              Statement s = com.createStatement();
                              String query="Select name from st1 where sid=(select sid from ci where name='"+c.getSelectedItem()+"')";
                              ResultSet r= s.executeQuery(query);
                              while(r.next()){
                                       su.setText(r.getString("name"));
                                       su.setEditable(false);
                              }
                   
                    } catch (Exception a) {
                    System.out.println(a.getMessage());
                    
                    }
            }
            
            });

                    c.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                      try {
                              Class.forName("com.mysql.cj.jdbc.Driver");
                              Connection com =  DriverManager.getConnection("jdbc:mysql://Localhost:3306/swing", "root", "Aditi@#123");
                              Statement s = com.createStatement();
                              String query="Select name from countery1 where coid=(select coid from ci where name='"+c.getSelectedItem()+"')";
                              ResultSet r= s.executeQuery(query);
                              while(r.next()){
                                        co.setText( r.getString("name"));
                                        co.setEditable(false);
                              }
                   
                     } catch (Exception a) {
                     System.out.println(a.getMessage());
                    
                     }
                    }
            
        });


          c.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection com =  DriverManager.getConnection("jdbc:mysql://Localhost:3306/swing", "root", "Aditi@#123");
                    Statement s = com.createStatement();
                    String query="Select name from st1 where sid=(select sid from ci where name='"+c.getSelectedItem()+"')";
                    ResultSet r= s.executeQuery(query);
                    while(r.next()){
                        su.setText( r.getString("name"));
                        su.setEditable(false);
                    }
                   
                } catch (Exception a) {
                    System.out.println(a.getMessage());
                    
                }
            }
            
        });

                    JLabel db = new JLabel("DOB :");
                    db.setBounds(50,220,100,30);
                    JTextField dob = new JTextField();
                    dob.setBounds(100,220,100,30);

                    JLabel ag = new JLabel("age :");
                    ag.setBounds(220,260,100,30);
                    JTextField age = new JTextField();
                    age.setBounds(270,260,100,30);

                    JLabel dj = new JLabel("DOJ :");
                    dj.setBounds(50,260,100,30);
                    JTextField doj = new JTextField();
                    doj.setBounds(100,260,100,30);

                    doj.addKeyListener(new KeyListener() {

            

                              @Override
                              public void keyTyped(KeyEvent e) {
                                  
                              }
                  
                              @Override
                              public void keyPressed(KeyEvent e) {
                                 
                              }
                  
                              @Override
                              public void keyReleased(KeyEvent e) {
                                  
                                 LocalDate d = LocalDate.parse(dob.getText());
                                         int s= d.getYear();
                                         
                                  LocalDate D = LocalDate.parse(doj.getText());
                                        int S =  D.getYear();
                  
                                  int sum = S-s;
                               String as = Integer.toString(sum);  
                               age.setText(as);
                               age.setEditable(false);
                              }
                              
                          });

                    
                    JLabel cu = new JLabel("Coures Name :");
                    cu.setBounds(50,300,100,30);
                    JLabel ob = new JLabel("Total Marks :");
                    ob.setBounds(170,300,100,30);
                    JLabel ot = new JLabel("Obt :");
                    ot.setBounds(270,300,100,30);
                    JLabel pr = new JLabel("Pracentage :");
                    pr.setBounds(370,300,100,30);

                    JTextField cur = new JTextField();
                    cur.setBounds(40,350,100,30);
                    JTextField obn = new JTextField();
                    obn.setBounds(160,350,100,30);
                    JTextField otn = new JTextField();
                    otn.setBounds(270,350,100,30);
                    JTextField prt = new JTextField();
                    prt.setBounds(380,350,100,30);

                    otn.addKeyListener(new KeyListener() {

                              @Override
                              public void keyTyped(KeyEvent e) {
                                  
                              }
                      
                              @Override
                              public void keyPressed(KeyEvent e) {
                                  
                              }
                      
                              @Override
                              public void keyReleased(KeyEvent e) {
                                   int i = Integer.parseInt(obn.getText());
                                  int j = Integer.parseInt(otn.getText());
                      
                                  int sum = (j*100)/i;
                                  String as = Integer.toString(sum);
                                  prt.setText(as);
                      
                                   prt.setEditable(false);
                              }
                             });

                    JTextField cr = new JTextField();
                    cr.setBounds(40,400,100,30);
                    JTextField on = new JTextField();
                    on.setBounds(160,400,100,30);
                    JTextField tn = new JTextField();
                    tn.setBounds(270,400,100,30);
                    JTextField pt = new JTextField();
                    pt.setBounds(380,400,100,30);

                    tn.addKeyListener(new KeyListener() {

                              @Override
                              public void keyTyped(KeyEvent e) {
                                  
                              }
                      
                              @Override
                              public void keyPressed(KeyEvent e) {
                                  
                              }
                      
                              @Override
                              public void keyReleased(KeyEvent e) {
                                   int i = Integer.parseInt(on.getText());
                                  int j = Integer.parseInt(tn.getText());
                      
                                  int sum = (j*100)/i;
                                  String as = Integer.toString(sum);
                                  pt.setText(as);
                      
                                   pt.setEditable(false);
                              }
                             });

                    JButton sb = new JButton("Submil");
                    sb.setBounds(450,500, 100, 30);

                    try {
                              Class.forName("com.mysql.cj.jdbc.Driver");
                              Connection con= DriverManager.getConnection("jdbc:mysql://Localhost:3306/swing", "root", "Aditi@#123");
                              Statement st=con.createStatement();
                              String query="Select count(id) as id from fr";
                              ResultSet rs= st.executeQuery(query);
                              while(rs.next()){
                              id= rs.getInt("id");

                              }
    
                    } catch (Exception e) {
                              System.out.println(e.getMessage());
                    }
    
//=================================Insert first values============================
                    sb.addActionListener(new ActionListener() {

                     @Override
                     public void actionPerformed(ActionEvent e) {

                              if (p1.getText().equals("")) {
                              JOptionPane.showMessageDialog(null, "Fill your phone Number");
                              } else {
                              if (p1.getText().length()!= 10) {
                        JOptionPane.showMessageDialog(null, "must be 10 digits");
                              } else {
                         if (p1.getText().startsWith("9") || p1.getText().startsWith("6") || p1.getText().startsWith("7")) {
                             
                         }else {
                            JOptionPane.showMessageDialog(null, "must be start 9,6,7 ");
                         }
                              }
                              }
                    try {
                     Class.forName("com.mysql.cj.jdbc.Driver");
                              Connection con = DriverManager.getConnection("jdbc:mysql://Localhost:3306/swing", "root", "Aditi@#123");
                              Statement st = con.createStatement();
                              id++;
                              int i = st.executeUpdate("insert into infor (id, name,mobile,address) values('"+id+"','"+jt.getText()+"','"+p1.getText()+"','"+c.getSelectedItem()+"')");
                              if (i>0) {
                               System.out.println("insert");
                              }
                              else{
                              System.out.println("faild");
                              }

                              int q = st.executeUpdate("insert into cou (id, course,total,obt,parcentage) values('"+id+"','"+cur.getText()+"','"+obn.getText()+"','"+otn.getText()+"','"+prt.getText()+"')");
                              if (q>0) {
                               System.out.println("insert education detailss");
                              }
                              else{
                              System.out.println("faild");
                              }

                              int w = st.executeUpdate("insert into doj (id, dob,doj) values('"+id+"','"+dob.getText()+"','"+doj.getText()+"')");
                              if (w>0) {
                               System.out.println("insert dob and doj");
                              }
                              else{
                              System.out.println("faild");
                              }

                     } catch (Exception a) {
                              System.out.println(a.getMessage());
                     }
                              //JOptionPane.showMessageDialog(null, "sucess");
                    }
            
                    });
          
          
                     JButton fi = new JButton("Find");
                    fi.setBounds(100,500, 100, 30);
                    JButton up = new JButton("Update");
                    up.setBounds(220,500, 100, 30);
                    JButton de = new JButton("Delete");
                    de.setBounds(330,500, 100, 30);

                    //=======================find=========================

                    fi.addActionListener(new ActionListener() {

                              @Override
                              public void actionPerformed(ActionEvent e) {
                                try {
                                  Class.forName("com.mysql.cj.jdbc.Driver");
                                  Connection con = DriverManager.getConnection("jdbc:mysql://Localhost:3306/swing", "root", "Aditi@#123");
                                  Statement s = con.createStatement();
                                  String qury = "SELECT * FROM infor as i LEFT JOIN doj as d ON i.id = d.id where i.id= '"+id1.getText()+"'";
                                  ResultSet r =  s.executeQuery(qury);
                                  while(r.next())
                                  {
                                    jt.setText( r.getString("name"));
                                    p1.setText( r.getString("mobile"));
                                    c.setSelectedItem(r.getString("address"));
                                    doj.setText( r.getString("doj"));
                                    dob.setText( r.getString("dob"));
                                  }
                                                
                                } catch (Exception a) {
                                                  System.out.println(a.getMessage());
                                }
                              }
                              
                            });
                    
                            //-------------delete---------------------
                              
                            
                            de.addActionListener(new ActionListener() {
                    
                              @Override
                              public void actionPerformed(ActionEvent e) {
                                try {
                                  Class.forName("com.mysql.cj.jdbc.Driver");
                                  Connection con = DriverManager.getConnection("jdbc:mysql://Localhost:3306/swing", "root", "Aditi@#123");
                                  Statement s = con.createStatement();
                                  String qury = "Delete from infor where id = '"+id1.getText()+"'";
                                  int r =  s.executeUpdate(qury);
                                  if(r>0){
                                    System.out.println("succesfully delete infor table ");
                                  }
                                  else{
                                    System.out.println("faild");
                                  }

                                  String qury1 = "Delete from doj where id = '"+id1.getText()+"'";
                                  int r1 =  s.executeUpdate(qury1);
                                  if(r1>0){
                                    System.out.println("succesfully delete doj");
                                  }
                                  else{
                                    System.out.println("faild");
                                  }

                                  String qury2 = "Delete from cou where id = '"+id1.getText()+"'";
                                  int r2 =  s.executeUpdate(qury2);
                                  if(r2>0){
                                    System.out.println("succesfully delete cou");
                                  }
                                  else{
                                    System.out.println("faild");
                                  }
                                                
                                } catch (Exception a) {
                                  
                                }
                              }
                              
                            });
                    
                            //-------------------update--------------------
                    
                            up.addActionListener(new ActionListener() {
                    
                              @Override
                              public void actionPerformed(ActionEvent e) {
                                try {
                                  Class.forName("com.mysql.cj.jdbc.Driver");
                                  Connection con = DriverManager.getConnection("jdbc:mysql://Localhost:3306/swing", "root", "Aditi@#123");
                                  Statement s = con.createStatement();
                                  String qury = "update infor set name = '"+jt.getText()+"' where id = '"+n.getText()+"'";
                                  int a =  s.executeUpdate(qury);
                                  if(a>0){
                                    System.out.println("succesfully");
                                  }
                                  else{
                                    System.out.println("faild");
                                  } 
                                } catch (Exception a) {
                                                  
                                }
                              }
                              
                            });
                    
                            

                    
          


                    f.add(l); f.add(n); f.add(jt);  f.add(p);  f.add(c);f.add(all);
                    f.add(p1);  f.add(a); f.add(su); f.add(co);f.add(db); 
                    f.add(dob); f.add(dj); f.add(doj);  f.add(ag);  f.add(age);
                    f.add(cu);  f.add(ob); f.add(ot); f.add(pr); f.add(sb);
                    f.add(cr);  f.add(on); f.add(tn); f.add(pt);f.add(i); f.add(id1);
                    f.add(cur);  f.add(obn); f.add(otn); f.add(prt);
                    f.add(fi);  f.add(up); f.add(de);
                    f.setLayout(null);
                    f.setVisible(true);
                    f.setTitle("Test");
                    f.setResizable(true);

         }
          
}