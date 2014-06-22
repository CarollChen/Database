package assignment2;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.sql.*;
import java.text.SimpleDateFormat;


class LoginPanel extends JPanel{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JTextField username;
	JPasswordField password;
	JButton login;
	JButton signup;
	private String UserName;
	private String Password;

	
	public void disablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
				comps[i].disable();
		}
	}

	public void enablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
				comps[i].enable();
		}
	}

	LoginPanel(){
		this.setBounds(810, 30, 250, 100);
		this.setLayout(new GridLayout(3,2));
		this.add(new Label("UserName: "));
		username = new JTextField();
        this.add(username);
		this.add(new Label("Password: "));
		password = new JPasswordField();
        this.add(password);
        login = new JButton("Login");
        signup = new JButton("Signup");
        this.add(login);
        this.add(signup);
        
      
	}
	public String getUserName(){
		
		  UserName = username.getText();
		
		return UserName;
	}
	
	public String getPassword(){
		
		Password = password.getText();
		
		return Password;
	}
	
	public void setUserName(String user){
		UserName=user;
	}
	
	public void Clearpassword(){
		
		password.setText(null);
		
	}
}

class SignupPanel extends JPanel{
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JButton login;
	JButton signup;
	JPasswordField password;
	JPasswordField password2;

	JTextField country;
	JTextField state;
	JTextField city;
	JTextField email;
	JTextField birthday;
	JTextField fname;
	JTextField lname;
	JTextField str_no;
	JTextField str_address;
	JTextField zip;

	public void disablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
				comps[i].disable();
		}
		disableButton();
	}

	public void enablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
				comps[i].enable();
		}
		enableButton();
	}

	SignupPanel(){
		this.setBounds(810, 150, 250, 350);
		this.setLayout(new GridLayout(13,2));
		this.add(new Label("Email: "));
		email = new JTextField();
        this.add(email);
		this.add(new Label("Password: "));
		password = new JPasswordField();
        this.add(password);
		this.add(new Label("ReEnter Password: "));
		password2 = new JPasswordField();
        this.add(password2);
		this.add(new Label("First Name: "));
		fname = new JTextField();
        this.add(fname);
		this.add(new Label("Last Name: "));
		lname = new JTextField();
        this.add(lname);
        
        
        this.add(new Label("Country: "));
		country = new JTextField();
        this.add(country);
        
        
        this.add(new Label("State: "));
		state = new JTextField();
        this.add(state);
        
		this.add(new Label("City: "));
		city = new JTextField();
        this.add(city);
		this.add(new Label("Birthday : "));
		birthday = new JTextField();
        this.add(birthday);
		this.add(new Label("strNo : "));
		str_no = new JTextField();
        this.add(str_no);
		this.add(new Label("strAdress : "));
		str_address = new JTextField();
        this.add(str_address);
        
        
        
        this.add(new Label("Zip : "));
		zip = new JTextField();
        this.add(zip);
        this.add(new Label(""));
        signup = new JButton("signup");
        this.add(signup);
       
        disablePanel();
        
	}

	public void disableButton(){
		signup.setEnabled(false);
	}
	public void enableButton(){
		signup.setEnabled(true);
	}
	
	public String getEmail()
	{
		String Email = email.getText();
		
		return Email;
	}
	public String getpswd1()
	{
		String Email = password.getText();
		
		return Email;
	}
	public String getfname()
	{
		String Email = fname.getText();
		
		return Email;
	}
	public String getlname()
	{
		String Email = lname.getText();
		
		return Email;
	}
	public String getpswd2()
	{
		String Email = password2.getText();
		
		return Email;
	}
	
	public String getcountry()
	{
		String Email = country.getText();
		
		return Email;
	}
	
	public String getstate()
	{
		String Email = state.getText();
		
		return Email;
	}
	
	public String getcity()
	{
		String Email = city.getText();
		
		return Email;
	}
	
	public String getbirthday()
	{
		String Email = birthday.getText();
		
		return Email;
	}
	
	public String getstr_no()
	{
		String Email = str_no.getText();
		
		return Email;
	}
	
	public String getstr_address()
	{
		String Email = str_address.getText();
		
		return Email;
	}
	
	public String getzip()
	{
		String Email = zip.getText();
		
		return Email;
	}
	
	//------------------------------------------------------------------clear-----------------------------------------------------------------------//
	
	public void clearsignup()
	{
		email.setText(null);
		fname.setText(null);
		lname.setText(null);
		password.setText(null);
		password2.setText(null);
		country.setText(null);
		state.setText(null);
		city.setText(null);
		birthday.setText(null);
		str_no.setText(null);
		str_address.setText(null);
		zip.setText(null);
		
	}
	
}

class SqlPanel extends JPanel{
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	static JTextArea SQLArea = null;
	JScrollPane scrollPane = null;
	JLabel showLabel;
	SqlPanel(){
		setInputArea();
	}

	public void disablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
				comps[i].disable();
		}
	}

	public void enablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
				comps[i].enable();
		}
	}

	private void setInputArea(){
		setBounds(0, 495,810, 150);
		SQLArea = new JTextArea(6,68);
		SQLArea.setLineWrap(true);
		scrollPane = new JScrollPane(SQLArea);
		this.add(scrollPane);
	}
	
	public static void showsql(String a)
	{
		SQLArea.append(a + "\n");
	}
}

class Frame0 extends JFrame{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public JTextField txtfield;
	public JButton btn1;
	public String lbltext;
	public JLabel label;
	public String FriendType[] = { "Normal Friend", "Close Friend", "Family" };
	public JComboBox combo;

	Frame0(String text,int mode){
		this.lbltext = text;
		 this.setSize(300, 120);
		 this.setResizable(false);
		setLayout(new FlowLayout());
		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
		setLocation((width-this.getWidth())/2,(height-this.getHeight())/2);
		label = new JLabel(text);
		add(label);
		txtfield = new JTextField(10);
        add(txtfield);
        combo= new JComboBox(FriendType);
        if(mode==1)
        	add(combo);
        btn1 = new JButton("OK");
        add(btn1);

	}
}

class Frame10 extends JFrame{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public JTextField txtfield;
	public JButton btn1;
	public String lbltext;
	public JLabel label;
	public String FriendType[] = { "Only Me", "Only Friend", "EveryOne" };
	public JComboBox combo;

	Frame10(String text,int mode){
		this.lbltext = text;
		 this.setSize(300, 120);
		 this.setResizable(false);
		setLayout(new FlowLayout());
		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
		setLocation((width-this.getWidth())/2,(height-this.getHeight())/2);
		label = new JLabel(text);
		add(label);
		txtfield = new JTextField(10);
        add(txtfield);
        combo= new JComboBox(FriendType);
        if(mode==1)
        	add(combo);
        btn1 = new JButton("OK");
        add(btn1);

	}
}

class Frame1 extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public JTextField txtfield;
	JButton btn1;
	JButton btn2;
	String lbltext0;
	String lbltext1;
	JLabel lbl0;
	JLabel lbl1;
	public JTextArea textArea = null;

	Frame1(String text0, String text1) {
		this.lbltext0 = text0;
		this.lbltext1 = text1;
		this.setResizable(false);
		setLayout(null);
		 this.setSize(300, 256);
		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
		setLocation((width-this.getWidth())/2,(height-this.getHeight())/2);
		lbl0 = new JLabel(text0);
		add(lbl0);
		lbl0.setBounds(10, 10, 70, 30);

		txtfield = new JTextField(10);
		add(txtfield);
		txtfield.setBounds(85, 10, 150, 30);

		lbl1 = new JLabel(text1);
		add(lbl1);
		lbl1.setBounds(10, 45, 70, 30);

		textArea = new JTextArea(8, 10);
		textArea.setLineWrap(true);
		JScrollPane scrollPane = new JScrollPane(textArea);
		this.add(scrollPane);
		scrollPane.setBounds(85,55,180,90);

		btn1 = new JButton("OK");
		btn1.setBounds(90,165,90, 30);
		add(btn1);

	}
}


class Frame2 extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public JTextField txtfield;
	JButton btn1;
	JButton btn2;
	String lbltext0;
	JLabel lbl0;

	Frame2(String text0) {
		this.setResizable(false);
		this.lbltext0 = text0;
        this.setSize(300, 150);
        this.setResizable(false);
		setLayout(null);

		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
		setLocation((width-this.getWidth())/2,(height-this.getHeight())/2);
		lbl0 = new JLabel(text0);
		add(lbl0);
		lbl0.setBounds(10, 10, 70, 30);

		txtfield = new JTextField(10);
		add(txtfield);
		txtfield.setBounds(85, 10, 100, 30);

		btn1 = new JButton("Decline");
		btn2 = new JButton("Accept ALL");

		btn1.setBounds(190,10,90, 30);
		btn2.setBounds(70,60,150, 30);
		add(btn1);
		add(btn2);

	}
}


class Frame3 extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JTextField []txtfield;
	JButton btn1;
	JLabel []lbl;
	Frame3(String text0) {
		this.setResizable(false);
		this.setTitle(text0);
        this.setSize(1000, 70);
        this.setResizable(false);
		setLayout(new GridLayout(1,9));

		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
		setLocation((width-this.getWidth())/2,(height-this.getHeight())/2);
		lbl = new JLabel[4];
		for(int i=0;i<4;i++)
			lbl[i] = new JLabel();
		lbl[0].setText("topleft x:");
		lbl[1].setText("topleft y:");
		lbl[2].setText("bottomright x:");
		lbl[3].setText("bottomright y:");

		txtfield = new JTextField[4];
		for(int i=0;i<4;i++)
			txtfield[i] = new JTextField();

		btn1 = new JButton("search");
		for(int i=0;i<4;i++)
		{
			add(lbl[i]);
			add(txtfield[i]);
		}
		add(btn1);
	}
}


class PostandSearchPanel extends JPanel{
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JTextArea textArea = null;
	JScrollPane scrollPane = null;

	JTextField text;
	JLabel showLabel;
	JButton []buttons;

	public void disableButton(){
		for(int i=0;i<buttons.length;i++)
			buttons[i].setEnabled(false);
	}

	public void enableButton(){
		for(int i=0;i<buttons.length;i++)
			buttons[i].setEnabled(true);
	}

	PostandSearchPanel(){
		
		setLayout(null);
		this.setBounds(0, 10,780, 120);
        setInputArea();

		buttons = new JButton[2];
		buttons[0]= new JButton("Post");
		buttons[1]= new JButton("Search For Friend");

		text  = new JTextField(15);
		text.setLocation(10,3);
		text.setText("");
		text.setBounds(460, 40, 150, 25);
		buttons[0].setBounds(380,40,60,25);
		buttons[1].setBounds(620,40,130,25);

		
		this.add(buttons[0]);
		this.add(text);
		this.add(buttons[1]);

	}
	
	public String getinfo()
	{
		String info = text.getText();
		
		return info;
	}
	
	public void disablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
				comps[i].disable();
		}
		disableButton();
	}

	public void clearPanel(){
		text.setText("");
	    textArea.setText("");
	}

	public  void enablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
				comps[i].enable();
		}
		enableButton();
	}

	public void setInputArea(){
		textArea = new JTextArea(4,30);
		textArea.setLineWrap(true);
		textArea.setBounds(10, 10, 360, 90);
		this.add(textArea);
	}
 }

class ResultPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextArea resultArea = null;
	JScrollPane scrollPane = null;
	ResultPanel(){
		setResultArea();
	}

	public void setResultArea(){
		resultArea = new JTextArea(10,30);
		resultArea.setLineWrap(true);
		resultArea.setBounds(10, 140,750, 250);

		scrollPane = new JScrollPane(resultArea);
		add(scrollPane);

	}
	
//	public void setResult(String a)
//	{
//		resultArea.setText(a);
//	}
}

class ButtonPanel extends JPanel{
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JTextArea textArea = null;
	JScrollPane scrollPane = null;
	JLabel showLabel;
	JButton []buttons;

	ButtonPanel(){
	  this.setBounds(10, 415, 770, 40);
	 	buttons = new JButton[8];
		this.setLayout(new GridLayout(2,4));
        for(int i=0;i<8;i++){
        	buttons[i]= new JButton();
        	this.add(buttons[i]);
        }
        buttons[0].setText("Add Friend");
        buttons[1].setText("List all posts");
        buttons[2].setText("List all comments on a post");
        buttons[3].setText("Comment on A post");
        buttons[4].setText("List all events");
        buttons[5].setText("Friend request");   
        buttons[6].setText("Find nearest friend");
        buttons[7].setText("Range query");

	}

	public void disableButton(){
		for(int i=0;i<buttons.length;i++)
			buttons[i].setEnabled(false);
	}

	public void enableButton(){
		for(int i=0;i<buttons.length;i++)
			buttons[i].setEnabled(true);
	}

	public void disablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
				comps[i].disable();
		}
		disableButton();
	}

	public void enablePanel(){
		if(this.getComponentCount()==0)
			return ;
		Component[] comps= new Component[this.getComponentCount()];
		comps = this.getComponents();
		for(int i=0;i<comps.length;i++){
			comps[i].enable();
		}
		enableButton();
	}
}


class MainFrame extends JFrame{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private boolean  logged = false;
	JLabel LogoLabel;
	JButton notifyButton;
	LoginPanel loginPanel;
	SignupPanel signUpPanel;
	SqlPanel sqlPanel;
	ButtonPanel buttonPanel;
	PostandSearchPanel postandsearch;
	ResultPanel resultPanel;
	Connection conn=null;
	ArrayList<String> requester = new ArrayList<String>();
	ArrayList<String> Relation= new ArrayList<String>();
	int countrequest=0;
	JTextArea resultArea = null;
	JScrollPane scrollPane = null;
	int trigger = 0;
	JLabel showLabel;
	int hasRequest = 0;
	StringBuffer SQLOut = new StringBuffer ();
	
	
	MainFrame(){
		setResizable(false);
		setLayout(null);
		setSize(1100, 700);
		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
		setLocation((width-1100)/2,(height-700)/2);
		setTitle("This is GUI for database homework");
		setNotifyLabel();
		SetLogo();
		setLoginPanel();
		setSignupPanel();
		setSqlPanel();
		setButtonPanel();
		setPostandSearchPanel();
		setResultPanel();
		postandsearch.disablePanel();
		buttonPanel.disablePanel();
	}

	public void disableResult(){
    	resultArea.setText("");
    	resultArea.setEditable(false);
    	resultArea.setEnabled(false);
    	scrollPane.setEnabled(false);
	}

	public void setResultPanel(){
		resultArea = new JTextArea(10,30);
		resultArea.setLineWrap(true);
		scrollPane = new JScrollPane(resultArea);
		add(scrollPane);
		scrollPane.setBounds(10, 140,770, 250);
	}

	public void SetLogo(){
	Image image;
	try {
		image = ImageIO.read(new File("usc_viterbi_logo.jpg"));
		ImageIcon icon = new ImageIcon(image);
		LogoLabel = new JLabel();
		LogoLabel.setIcon(icon);
		LogoLabel.setBounds(830,480,300,150);

		add(LogoLabel);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  //this generates an image file

	}

	public void setNotifyLabel(){
		Image image;
		try {
			image = ImageIO.read(new File("notify.png"));
			ImageIcon icon = new ImageIcon(image);
			notifyButton = new JButton();
			notifyButton.setIcon(icon);
			notifyButton.setBounds(750,3,30,30);

			notifyButton.addActionListener(new ActionListener() {
	           
	            public void actionPerformed(ActionEvent e) {
	            	/*Fill this function*/
	            	/*Press this notification button, you should list all the friend request on the ResultPanel*/
	            	/*the output format is like "... wants to add you as 'friend type'." */
	            	String name = loginPanel.getUserName();
	            	
	            	String sql4 = "with t1 as(select USERS,plevel from request where userr = '"+name+"')select t1.users,plevel,fname,lname from t1,users where t1.USERS = users.email";
	            	
	            	try{
            			ConnectDB cdb = new ConnectDB();
                		
                		Connection conn = cdb.openConnection();
                		
                		Statement stm = null;
    		
                		stm = conn.createStatement();
                		
                		ResultSet result = stm.executeQuery(sql4);
            			
            			ResultSetMetaData mtdata = result.getMetaData();
            			
            			int ncol = mtdata.getColumnCount();
            			
            			String Lname = "";
            			String Fname = "";
            			String Plevel = "";
            			String total = "";
            			String account = "";
            			System.out.println("ncol" + ncol);
            			
            			int index = 0;
            			
            			System.out.println("row:        "+result.getRow());
            			
            			System.out.println(sql4);
            			
            			while(result.next())
            				{
            				
            				index++;
            				account = result.getString(1)+" ";
            				Plevel = result.getString(2)+" ";
            				Fname = result.getString(3)+" ";
            				Lname = result.getString(4)+" ";
            				
            				total +=account + Fname+Lname+"want to add you as :" + Plevel +"\n";
            				
            				for(int i=1;i<=ncol;i++)
            					{
            					
            					System.out.print(mtdata.getColumnLabel(i)+":    ");
            					
            					System.out.print(result.getString(mtdata.getColumnLabel(i))+"    ");
            					
            					}
            				
            					System.out.println();
            				}
            			
            			
            			SqlPanel.showsql(sql4);
            			
            			
            			resultArea.setText(total);
            			

	            	}
	            	catch(Exception ex1)
	            	{
	            		ex1.getStackTrace();
	            	}
	            	
	            	
	            }
	        });

			add(notifyButton);
			notifyButton.setVisible(false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //this generates an image file

			
	}

	public void setButtonPanel(){
		buttonPanel = new ButtonPanel();
		this.add(buttonPanel);

		buttonPanel.buttons[0].addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
            	final Frame0 frame=new Frame0("User Email",1);
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setVisible(true);

                frame.btn1.addActionListener(new ActionListener() {
                    
                    public void actionPerformed(ActionEvent e) {
                    	/*Fill this function*/
    	            	/*Press this add friend button, input user Email information, press OK, you should be able to send friend request*/
    	            	/*After press ok, you should also pop up a standard dialog box to show the request send status <succeed or failed>*/
                    	
                    	
                    	
                    	String names = loginPanel.getUserName();
                    	
                    	int seq = frame.combo.getSelectedIndex();
                    	
                    	String plevel = "";
                    	
                    	if(seq==0)
                    	{
                    		 plevel = "Normal Friend";
                    	}
                    	else if(seq==1)
                    	{
                    		 plevel = "Close Friend";
                    	}
                    	else if(seq==2)
                    	{
                    		 plevel = "Family";
                    	}
                    	
                    	
                    	
                    	String namer = frame.txtfield.getText();
                    	
    	            	String sql4 = "INSERT INTO request (users, userr,plevel) VALUES ('"+names+"', '"+namer+ "', '"+ plevel +"')";
    	            	
    	            	System.out.println(sql4);
    	            	
    	            	String sql1 = "select * from friend where (user1 = '"+names+"' and user2 = '"+namer+"')or(user1 = '"+namer+"' and user2 ='"+names+"')";
    	            	
    	            	System.out.println(sql1);
    	            	
    	            	String sql2 = "select * from users where email = '"+ namer +"'";
    	            	
    	            	System.out.println(sql2);
    	            	
    	            	try{
                			ConnectDB cdb = new ConnectDB();
                    		
                    		Connection conn = cdb.openConnection();
                    		
                    		Statement stm = null;
                    		
                    		Statement stm2 = null;
                    		
                    		Statement stm3 = null;
        		
                    		stm = conn.createStatement();
                    		
                    		stm2 = conn.createStatement();
                    		
                    		stm3 = conn.createStatement();
                    		
                    		ResultSet result3 = stm3.executeQuery(sql2);
                    		
                    		if(!result3.next())
                    		{
                    			JOptionPane.showMessageDialog(null, "The friend you want to add not exists");
                    		}
                    		else
                    		{
                    			ResultSet result2 = stm2.executeQuery(sql1);
                    			
                    			if(result2.next())
                    			{
                    				JOptionPane.showMessageDialog(null, "You two already friends");
                    			}
                    			else
                    			{
                    				ResultSet result = stm.executeQuery(sql4);
                    				
                    				JOptionPane.showMessageDialog(null, "request sending successed");
                    				
                    				System.out.println("request sending successed");
                    			}
                    		}
                    		
                    		
                			//JOptionPane.showMessageDialog(null, "request sending successed");
                			
                			
                			SqlPanel.showsql(sql4);
    	            	}
    	            	catch(SQLException ex1)
    	            	{
    	            		
    	            		//ex1.printStackTrace();
    	            		
    	            		System.out.println(	ex1.getLocalizedMessage());
    	            		
    	            		JOptionPane.showMessageDialog(null, "request sending failed");
    	            	}
                    	
                    
                    }
                });

            }
        });
		buttonPanel.buttons[1].addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e) {
            	/*Fill this function*/
            	/*Press this list all post button, you should be able to list all the post which are visible to you*/
            	/*You can define the output format*/
            	String names = loginPanel.getUserName();
            	
            	String sql4 = "select * from POST"
            			+ " where plevel = 2"
            			+ " union"
            			+ " select * from POST"
            			+ " where email = '"+names+"'"
            			+" union"
            			+"  select * from Post where post.email in(SELECT F.USER1 AS EMAIL FROM FRIEND F WHERE F.USER2 = '"+names+"'" 
            			+"  UNION SELECT F.USER2 AS EMIAL FROM FRIEND F  WHERE F.USER1 = '"+names+"') and post.plevel = 1";
;
            	
            	System.out.println(sql4);
            	
            	
            	try{
        			ConnectDB cdb = new ConnectDB();
            		
            		Connection conn = cdb.openConnection();
            		
            		Statement stm = null;
		
            		stm = conn.createStatement();
            		
            		ResultSet result = stm.executeQuery(sql4);
            		
        			ResultSetMetaData mtdata = result.getMetaData();
        			
        			int ncol = mtdata.getColumnCount();
        			
        			//System.out.println("hasnext:    " +result.next());
        			//int index = 1;
        			
        			String total = "";
        			
        			while(result.next())
        				{
        			
        				for(int i=1;i<=ncol;i++)
        				{
        			System.out.print(mtdata.getColumnLabel(i)+"\n");
        			
        			total += mtdata.getColumnLabel(i)+":\n";
        			
        			System.out.print(result.getString(mtdata.getColumnLabel(i))+"\n");
        			
        			total += result.getString(mtdata.getColumnLabel(i))+"\n";
        				}
        			System.out.println("---------------------------------------------------------------------------");
        			total+= "---------------------------------------------------------------------------"+"\n";
        				}
        			
        			resultArea.setText(total);
        			
        			SqlPanel.showsql(sql4);
 		
            	}
            	catch(SQLException ex1)
            	{
            		
            		//ex1.printStackTrace();
            		
            		System.out.println(	ex1.getLocalizedMessage());
            		
            		
            	}
            	
            	
            }
        });

		buttonPanel.buttons[2].addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e) {
            	final Frame0 frame=new Frame0("Post ID: ",2);
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setVisible(true);
                frame.btn1.addActionListener(new ActionListener() {
                 
                    public void actionPerformed(ActionEvent e) {
                    	/*Fill this function*/
    	            	/*Press this List Comments Button, input Post ID, press OK, you should be able to list all the comment about this post*/
                    String PID = frame.txtfield.getText();
                    
                    String names = loginPanel.getUserName();
                    
                    System.out.println(PID);
                    
                   
                   String sql_sub =  "select POST.PID from POST"
        			+ " where plevel = 2 and PID = '"+PID+"'"
        			+ " union"
        			+ " select POST.PID from POST"
        			+ " where email = '"+names+"'"+"and PID = '"+PID+"'"
        			+" union"
        			+"  select POST.PID from Post where post.email in(SELECT F.USER1 AS EMAIL FROM FRIEND F WHERE F.USER2 = '"+names+"'" 
        			+"  UNION SELECT F.USER2 AS EMIAL FROM FRIEND F  WHERE F.USER1 = '"+names+"') and post.plevel = 1"+"and PID = '"+PID+"'";
                    
                   
                   String sql1 = "select * from postc where PID = '" + PID +"'";
                   
                   String sql2 = sql_sub;
                   
                   System.out.println(sql1+"   "+sql_sub);
                	
                	
                    try{
            			ConnectDB cdb = new ConnectDB();
                		
                		Connection conn = cdb.openConnection();
                		
                		Statement stm1 = null;
                		
                		Statement stm2 = null;
    		
                		stm1 = conn.createStatement();
                		
                		stm2 = conn.createStatement();
                		
                		ResultSet result1 = stm1.executeQuery(sql_sub);
                		
                		if(result1.next())
                		{
                			
                			ResultSet result2 = stm1.executeQuery(sql1);
                			
            			ResultSetMetaData mtdata = result2.getMetaData();
            			
            			int ncol = mtdata.getColumnCount();
            			
            			//System.out.println("hasnext:    " +result.next());
            			//int index = 1;
            			
            			String total = "";
            			
            			while(result2.next())
            				{
            			
            				for(int i=1;i<=ncol;i++)
            				{
            			System.out.print(mtdata.getColumnLabel(i)+"\n");
            			
            			total += mtdata.getColumnLabel(i)+":\n";
            			
            			System.out.print(result2.getString(mtdata.getColumnLabel(i))+"\n");
            			
            			total += result2.getString(mtdata.getColumnLabel(i))+"\n";
            				}
            			System.out.println("---------------------------------------------------------------------------");
            			total+= "---------------------------------------------------------------------------"+"\n";
            				}
            			
            			resultArea.setText(total);
            			
            			SqlPanel.showsql(sql1);
                		}
                		else
                		{
                			resultArea.setText("You are not allowed to see this post");	
                			
                			System.out.println("You are not allowed to see this post");
                		}
                	}
                	catch(SQLException ex1)
                	{
                		
                		//ex1.printStackTrace();
                		
                		System.out.println(	ex1.getLocalizedMessage());
                		
                		JOptionPane.showMessageDialog(null, "cannot make a comment to this post");
                	}
                	
                    
                    }
                });
            }
        });
		
		buttonPanel.buttons[3].addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
            	final Frame1 frame=new Frame1("Post ID: ","Content: ");
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setVisible(true);
                frame.btn1.addActionListener(new ActionListener() {
                    
                    public void actionPerformed(ActionEvent e) {
                    	/*Fill this function*/
    	            	/*Press this Comment Button, input Post ID, and comment, press OK, you should be able to comment on this post*/
                    	/*After press ok, you should also pop up a standard dialog box to show the comment's status <succeed or failed>*/	
                    	
                    	String PID = frame.txtfield.getText();
                    	
                    	String NOTE = frame.textArea.getText();
                    	
                    	java.util.Date dt = new java.util.Date();
                    	
                    	SimpleDateFormat tempDate = new SimpleDateFormat("dd/MM/yyyy"); 
                    	
                    	String datetime = tempDate.format(dt); 
                    	
                    	//System.out.println(PID+"     "+ NOTE +"     "+datetime);
                    	
                    	String email = loginPanel.getUserName();
                    	
                    	
                    	String sql_sub =  "select POST.PID from POST"
                    			+ " where plevel = 2 and PID = '"+PID+"'"
                    			+ " union"
                    			+ " select POST.PID from POST"
                    			+ " where email = '"+email+"'"+"and PID = '"+PID+"'"
                    			+" union"
                    			+"  select POST.PID from Post where post.email in(SELECT F.USER1 AS EMAIL FROM FRIEND F WHERE F.USER2 = '"+email+"'" 
                    			+"  UNION SELECT F.USER2 AS EMIAL FROM FRIEND F  WHERE F.USER1 = '"+email+"') and post.plevel = 1"+"and PID = '"+PID+"'";
                    	
                    	String sql = "INSERT INTO POSTC (PID, TEXT, EMAIL, CDATE) VALUES ('"+PID+"', '"+NOTE+"', '"+email+"', to_date('"+datetime+"', 'mm/dd/yyyy'))";
                    	
                    	System.out.println(sql);
                    	
                    	try{
                			ConnectDB cdb = new ConnectDB();
                    		
                    		Connection conn = cdb.openConnection();
                    		
                    		Statement stm = null;
                    		
                    		Statement stm0 = null;
        		
                    		stm = conn.createStatement();
                    		
                    		stm0 = conn.createStatement();
                    		
                    		ResultSet result0 = stm.executeQuery(sql_sub);
                    		if(result0.next())
                    		{
                    		ResultSet result = stm.executeQuery(sql);
                			
                			JOptionPane.showMessageDialog(null, "request sending successed");
                			System.out.println("comment sending successed");
                			
                			SqlPanel.showsql(sql);
                    		}
                    		else
                    		{
                    			JOptionPane.showMessageDialog(null, "You cannot access to this post");	
                    		}
    	            	}
    	            	catch(SQLException ex1)
    	            	{
    	            		
    	            		//ex1.printStackTrace();
    	            		
    	            		System.out.println(	ex1.getLocalizedMessage());
    	            		
    	            		JOptionPane.showMessageDialog(null, "comment sending failed");
    	            	}
                    	
                    }
                });
            }
        });
		
		buttonPanel.buttons[4].addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
            	/*Fill this function*/
            	/*Press this List all event Button, you should be able to list all available event*/
            	String sql = "select * from event";
            	
            	try{
        			ConnectDB cdb = new ConnectDB();
            		
            		Connection conn = cdb.openConnection();
            		
            		Statement stm = null;
		
            		stm = conn.createStatement();
            		
            		ResultSet result = stm.executeQuery(sql);
            		
        			ResultSetMetaData mtdata = result.getMetaData();
        			
        			int ncol = mtdata.getColumnCount();
        			
        			//System.out.println("hasnext:    " +result.next());
        			//int index = 1;
        			
        			String total = "";
        			
        			while(result.next())
        				{
        			
        				for(int i=1;i<=ncol;i++)
        				{
        			System.out.print(mtdata.getColumnLabel(i)+"\n");
        			
        			total += mtdata.getColumnLabel(i)+":\n";
        			
        			System.out.print(result.getString(mtdata.getColumnLabel(i))+"\n");
        			
        			total += result.getString(mtdata.getColumnLabel(i))+"\n";
        				}
        			System.out.println("---------------------------------------------------------------------------");
        			total+= "---------------------------------------------------------------------------"+"\n";
        				}
        			
        			resultArea.setText(total);
        			
        			SqlPanel.showsql(sql);
 		
            	}
            	catch(SQLException ex1)
            	{
            		
            		//ex1.printStackTrace();
            		
            		System.out.println(	ex1.getLocalizedMessage());
            		
            		
            	}
            }
        });


		buttonPanel.buttons[5].addActionListener(new ActionListener() {
           
        public void actionPerformed(ActionEvent e) {
        	final Frame2 frame=new Frame2("Decline: ");
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.setVisible(true);

            frame.btn1.addActionListener(new ActionListener() {
               
                public void actionPerformed(ActionEvent e) {
                	/*Fill this function*/
                	/*Press this decline Button, you should be able to decline friend request*/
                	/*You could decline one at a time, or decline many at a time. e.g. using comma to separate each request*/
                	/*pop up a standard dialog box to show <succeed or failed>*/
                	
                	String todecline = frame.txtfield.getText();
                	
                	String[] dec = todecline.split(",");
                	
                	String receiver = loginPanel.getUserName();
                	
                	String name = loginPanel.getUserName();
        	
                try{
            			ConnectDB cdb = new ConnectDB();
                		
                		Connection conn = cdb.openConnection();
                		
                		Statement stm = null;
    		
                		stm = conn.createStatement();
                		
                			for(int i=0;i<dec.length;i++)
                				{
                					System.out.println(dec[i]);
                					
                					String sql0 = "with t1 as(select USERS,plevel from request where userr = '"+name+"')select t1.users,plevel,fname,lname from t1,users where t1.USERS = users.email";
                	            	
                					ResultSet result0 = stm.executeQuery(sql0);
                		
                				if(result0.next())
                				{
                					String sql = "delete from request where userr = '"+receiver+"' and users = '"+dec[i]+"'" ;
                				
                					System.out.println(sql);
                		
                					ResultSet result = stm.executeQuery(sql);
                		
                					SqlPanel.showsql(sql);
                					
                					JOptionPane.showMessageDialog(null, "declined successfully");
                				}
                				else
                				{
                					JOptionPane.showMessageDialog(null, "No Requset,No decline");
                					
                					notifyButton.setVisible(false);
         
                					resultArea.setText("");
                				}
                				}
                		
                	
                	}
                catch(SQLException e1)
                	{
                		JOptionPane.showMessageDialog(null, "The request cannot be declined");
                	}
                	
                	
                }
            });


            frame.btn2.addActionListener(new ActionListener() {
           
                public void actionPerformed(ActionEvent e) {
                	/*Fill this function*/
                	/*Press this accept all Button, you should be able to accept all friend request and add this information into friend relationship table*/
                	/*pop up a standard dialog box to show <succeed or failed>*/
                	
                	String receiver = loginPanel.getUserName();
                	
                	String sql1 = "insert into friend (select * from request where userr = '"+receiver+"')";
                					
                	String sql2 = "delete from request where userr = '"+receiver+"'";
                	
                	String sql0 = "with t1 as(select USERS,plevel from request where userr = '"+receiver+"')select t1.users,plevel,fname,lname from t1,users where t1.USERS = users.email";
                	
                	try
                	{
                		ConnectDB cdb = new ConnectDB();
                		
                		Connection conn = cdb.openConnection();
                		
                		Statement stm = null;
    		
                		stm = conn.createStatement();
                		
                		Statement stm0 = null;
                		
                		stm0 = conn.createStatement();
                		
                		ResultSet result0 = stm0.executeQuery(sql0);
                		
                		if(result0.next())
                		{
                		ResultSet result1 = stm.executeQuery(sql1);
                		
                		ResultSet result2 = stm.executeQuery(sql2);
                		
                		JOptionPane.showMessageDialog(null, "accept successfully");
                		}
                		else
                		{
                			JOptionPane.showMessageDialog(null, "you have no friend request");	
                		}
                		//notifyButton.setVisible(false);
                		
                		//resultPanel.resultArea.setText("");
                		
                		SqlPanel.showsql(sql1);
                		
                		SqlPanel.showsql(sql2);
                	}
                	catch(SQLException e1)
                	{
                		
                		e1.printStackTrace();
                		
                		JOptionPane.showMessageDialog(null, "accept failed");
                	}
                }
            });

        }
		});

		buttonPanel.buttons[6].addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
            	/*Fill this function*/
            	/*Press this Button, you should be able list the information(including address information) about your friend who live nearest to you*/
            	/*This is a spatial query*/
            	
            	String users = loginPanel.getUserName().trim();
            				
            	String sql1 = "select l.email,b.aid, b.coord.SDO_POINT.x langtitude, b.coord.SDO_POINT.y latitude"
            			+ " from Address b , live l"
            			+ " where b.aid = l.aid and l.email = '"+users+"'";
            	
            	System.out.println(sql1);
            	
            	
            	
            	
            	try
            	{
            		ConnectDB cdb = new ConnectDB();
            		
            		Connection conn = cdb.openConnection();
            		
            		Statement stm1 = null;
            		Statement stm2 = null;
            		
            		stm1 = conn.createStatement();
            		stm2 = conn.createStatement();
            		
            		ResultSet result1 = stm1.executeQuery(sql1);
            		
            		
      		
            		String EMAIL1 = "";
            		String AID1 ="";
            		String LANGTITUDE1 ="";
            		String LATITUDE1="";
            		
            		String EMAIL2 = "";
            		String AID2 ="";
            		String LANGTITUDE2 ="";
            		String LATITUDE2="";
            		//String distance="";
            		
            		while(result1.next())
            		{
            			 EMAIL1 = result1.getString(1);
                		 AID1 =result1.getString(2);
                		 LANGTITUDE1 =result1.getString(3);
                		 LATITUDE1=result1.getString(4);   			
            		}
            		
            		
            		
            		String sql2 = "SELECT distinct"
                			+" A.aid id,A.coord.SDO_POINT.x langtitude, A.coord.SDO_POINT.y latitude, MDSYS.SDO_NN_DISTANCE(1) distance, l.email"
                			+" FROM"
                			+" Address A ,live l"
                			+" WHERE"
                			+" SDO_NN(A.coord,MDSYS.SDO_GEOMETRY(2001,null,MDSYS.SDO_POINT_TYPE("+LANGTITUDE1+","+LATITUDE1+",0),null,null),'SDO_NUM_RES=1',1) = 'TRUE' and l.aid = A.aid and l.email<>'"+users+"'";
       		
            		ResultSet result2 = stm2.executeQuery(sql2);
            		System.out.println(sql2);
            		while(result2.next())
            		{
            			 EMAIL2 = result2.getString(5);
                		 AID2 =result2.getString(1);
                		 LANGTITUDE2 =result2.getString(2);
                		 LATITUDE2=result2.getString(3);   			
            		}
            		
            		System.out.println("You are: "+EMAIL1 + " @   " +  LANGTITUDE1  + "     " + LATITUDE1 +"     "+AID1);
            		System.out.println("Nearest Friend: "+EMAIL2 + " @   " +  LANGTITUDE2  + "     " + LATITUDE2 +"     "+AID2);
            		
            		String r1 ="";
            		
            		r1 = "You are: "+EMAIL1 + " @   " +  LANGTITUDE1  + "     " + LATITUDE1 +"     "+AID1;
            		
            		String r2 ="";
            		
            		r2 = "Nearest Friend: "+EMAIL2 + " @   " +  LANGTITUDE2  + "     " + LATITUDE2 +"     "+AID2;
            		
            		System.out.println(r1+"\n"+r2);
            		
            		resultArea.setText(r1+"\n"+r2);
            		
            		
            		//JOptionPane.showMessageDialog(null, "accept successfully");
            		
            		//notifyButton.setVisible(false);
            		
            		//resultPanel.resultArea.setText("");
            		
            		SqlPanel.showsql(sql1);
            		
            		SqlPanel.showsql(sql2);
            	}
            	catch(SQLException e1)
            	{
            		
            		e1.printStackTrace();
            		
            		JOptionPane.showMessageDialog(null, "we cannot get your position");
            	}
            	
            	
            	
            }
        });
		buttonPanel.buttons[7].addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
            	final Frame3 frame=new Frame3("Please input coordinate: ");
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setVisible(true);

                frame.btn1.addActionListener(new ActionListener() {
                  
                    public void actionPerformed(ActionEvent e) {
                    	/*Fill this function*/
                    	/*Press this Button, input left top corner coordinate and right down corner coordinate*/
                    	/*press ok, you should be able list the information(including address information) about your friend who lives in this area. Close query window*/
                    	/*This is a spatial query*/ 	
                    	//String p1 = frame.;
                    	
                    	String a = frame.txtfield[0].getText();
                    	
                    	String b = frame.txtfield[1].getText();
                    	
                    	String c = frame.txtfield[2].getText();
                    	
                    	String d = frame.txtfield[3].getText();
                    	
                    	String sql1 = "SELECT A.aid id,A.coord.SDO_POINT.x langtitude, A.coord.SDO_POINT.y latitude,live.email"
                    	+" FROM Address A , live"
                    	+" WHERE "
                    	+" SDO_RELATE("         	 
                    	+" A.coord,"
                    	+" mdsys.sdo_geometry(2003,null,NULL,"
                    	+"    mdsys.sdo_elem_info_array(1,2003,3),"
                    	+"   mdsys.sdo_ordinate_array("+a+","+b+","+c+","+d+")),"

                    	+" 'mask=Inside querytype=WINDOW') = 'TRUE' and A.aid = live.aid";
                    	
                    	System.out.println(sql1);
                    	
                    	try
                    	{
                    		ConnectDB cdb = new ConnectDB();
                    		
                    		Connection conn = cdb.openConnection();
                    		
                    		Statement stm1 = null;
                    		Statement stm2 = null;
                    		
                    		stm1 = conn.createStatement();
                    		
                    		ResultSet result = stm1.executeQuery(sql1);
                    		
                    		String total = "";
                			
                    		ResultSetMetaData mtdata = result.getMetaData();
                			
                			int ncol = mtdata.getColumnCount();
                    		
                			while(result.next())
                				{
                			
                				for(int i=1;i<=ncol;i++)
                				{
                			System.out.print(mtdata.getColumnLabel(i)+"\n");
                			
                			total += mtdata.getColumnLabel(i)+":\n";
                			
                			System.out.print(result.getString(mtdata.getColumnLabel(i))+"\n");
                			
                			total += result.getString(mtdata.getColumnLabel(i))+"\n";
                				}
                			System.out.println("---------------------------------------------------------------------------");
                			total+= "---------------------------------------------------------------------------"+"\n";
                				}
                			
                			resultArea.setText(total);
                    		
                    		sqlPanel.showsql(sql1);
                    	}
                    	catch(SQLException e1)
                    	{
                    		JOptionPane.showMessageDialog(null, "Something wrong");
                    	}
                    	
                    }
                });
            }
        });
		
	}

	public void setPostandSearchPanel(){
		postandsearch = new PostandSearchPanel();
		this.add(postandsearch);
		StringBuffer result= new StringBuffer();
		
		postandsearch.buttons[0].addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) { 
            	/*Fill this function*/
            	/*Press this Button, you should be able post the information written in the textArea*/
            	/*pop up a standard dialog box to show <succeed or failed>*/
            	 
                 	final Frame10 frame=new Frame10("Choose Privacy Level Please",1);
                     frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                     frame.setVisible(true);
                     
                     frame.txtfield.setVisible(false);
                     
                frame.btn1.addActionListener(new ActionListener() {
                	
                	public void actionPerformed(ActionEvent e) {
                		
                		
                		String email = loginPanel.getUserName();
                		
                		int Plevel = frame.combo.getSelectedIndex();
  		
                		String note = postandsearch.textArea.getText();
                		
                		java.util.Date dt = new java.util.Date();
                    	
                    	SimpleDateFormat tempDate = new SimpleDateFormat("dd/MM/yyyy"); 
                    	
                    	String datetime = tempDate.format(dt); 
                		
                    	String PID;
                    	
                    	System.out.println(" email "+email+"  level "+Plevel+" note " + note + "date  " + datetime);
                    	
                    	try{
                    	ConnectDB cdb = new ConnectDB();
                		
                		Connection conn = cdb.openConnection();
                		
                		Statement stm = null;
    		
                		stm = conn.createStatement();
                		
                		String sql = "select PID from post";
                		
                		int index = 1;
                		
                		ResultSet result = stm.executeQuery(sql);
            			
            			ResultSetMetaData mtdata = result.getMetaData();
            			
            			while(result.next())
            			{
            				index++;
            			}
            			
            			System.out.println("index:    "+index);
            			
            			sql = "INSERT INTO POST (PID, NOTE, EMAIL, PLEVEL, PDATE) values('" + index +"','"+note+"','"+email+"',"+Plevel+","+"to_date('"+datetime+"', 'mm/dd/yyyy'))";
            			
            			stm.executeQuery(sql);
            			
            			sqlPanel.showsql(sql);
            			
            			JOptionPane.showMessageDialog(null, "posting succssed");
                    	}
                    	catch(SQLException e1)
                    	{
                    		JOptionPane.showMessageDialog(null, "posting failed");
                    	}
                    	
                		
                	}
                	
                });
            	
            	
            }
        });


		postandsearch.buttons[1].addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {  
            	/*Fill this function*/
            	/*Press this Button, you should be able search user information, list the information on the result panel*/
            	/*The search should based on email, first name or last name*/
            	String info = postandsearch.getinfo();
            	
            	if(info.equals(""))
            	{
            		JOptionPane.showMessageDialog(null, "the input should not be empty");
            	}
            	else
            	{
            		String sql3 = "select u.email,u.fname,u.lname,u.birthdate,aa.street_no,aa.street_add,a.city,a.state,aa.zip,a.country from users u,address aa,live l,zipinfo a where l.aid = aa.aid and u.email = l.email and a.zip = aa.zip and( u.email = '"+info+"' or u.fname = '"+info+"' or u.lname = '"+info+"')";
            		
            		SqlPanel.showsql(sql3+"\n");
            		
            		
            		try{
            			ConnectDB cdb = new ConnectDB();
                		
                		Connection conn = cdb.openConnection();
                		
                		Statement stm = null;
    		
                		stm = conn.createStatement();
                		
                		ResultSet result = stm.executeQuery(sql3);
            			
            			ResultSetMetaData mtdata = result.getMetaData();
            			
            			int ncol = mtdata.getColumnCount();
            			
            			String total = "";
            			
            			while(result.next())
            				{
            			
            				for(int i=1;i<=ncol;i++)
            				{
            			System.out.print(mtdata.getColumnLabel(i)+":    ");
            			total += mtdata.getColumnLabel(i)+":    ";
            			System.out.print(result.getString(mtdata.getColumnLabel(i))+"    ");
            			total += result.getString(mtdata.getColumnLabel(i))+"    ";
            				}
            			total += "\n";
            			System.out.println();
            				}
            			
            			System.out.println(total);
            			
            			
            			resultArea.setText(total);
            			
            			
            			if(result.next())
            				{
            				notifyButton.setVisible(true);
            				}
            			
            			
                		}
                		catch(SQLException ex1)
                		{
                			System.out.println("alla");
                		}

            		
            	}

            }
        });
	}
	public void setSQLOutput(StringBuffer sb)
	{
		sqlPanel.SQLArea.setText(sb.toString());
		sqlPanel.SQLArea.setEnabled(true);
	}
	public void setSqlPanel(){
		sqlPanel = new SqlPanel();
		this.add(sqlPanel);
		showLabel = new JLabel("The corresponding SQL :");
		showLabel.setBounds(20, 470, 200, 20);
		this.add(showLabel);
	}

	public void setLoginPanel(){
		loginPanel = new LoginPanel();
		this.add(loginPanel);

		loginPanel.signup.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		        signUpPanel.enablePanel();
			}
        });
        loginPanel.login.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {  
            	/*Fill this function*/
            	/*Press this Button, you should be able match the user information. If valid, keep the user email information(but can't modified) and clear the password*/
            	/*at the same time, you should scan the friend request table, to determine whether current logged in user has friend request, if has, set notification icon*/
            	/*If invalid, you should pop up a dialog box to notify user, then enable signup panel for user to register*/
            	/*After logged in, you should change this button's function as logout which means disable all the panel, return to the original state*/
            	
            	notifyButton.setVisible(false);
            	
            	boolean flag = false;
            	
            	signUpPanel.clearsignup();
            	// false means that have not logged in
            	
            		String Email = loginPanel.getUserName();
            		
            		System.out.println(Email);
            		
            		String Password = loginPanel.getPassword();
            		
            		System.out.println(Password);
            		
            		loginPanel.Clearpassword();
            		
            		String rightpswd = null;
            		
            		ConnectDB cdb = new ConnectDB();
            		
            		Connection conn = cdb.openConnection();
            		
            		Statement stm = null;
            		
            		
            		try {
            			stm = conn.createStatement();
            		} catch (SQLException exe) {
            			// TODO Auto-generated catch block
            			exe.printStackTrace();
            		}
            		
            		String sql="select PASSWD FROM users WHERE email = "+"'"+Email+"'";
            		
            		SqlPanel.showsql(sql);
            		
            		try {
            			//stm.execute(sql);
            			
            			ResultSet result = stm.executeQuery(sql+"                                                                ");
            			
            			ResultSetMetaData mtdata = result.getMetaData();
            			
            			int ncol = mtdata.getColumnCount();
          
            			int index = 1;
            			
            			while(result.next())
            				{
            			
            				for(int i=1;i<=ncol;i++)
            				{
            					System.out.print(mtdata.getColumnLabel(i)+":    ");
            			
            					System.out.print(result.getString(mtdata.getColumnLabel(i))+"    ");
            			
            			rightpswd = result.getString(1);
            				}
            					System.out.println();
            				}
            			
            		} catch (SQLException exe) {
            			// TODO Auto-generated catch block
            				System.out.println("false");
            				exe.printStackTrace();
            		}
            //	
            	
            		 if(rightpswd!=null){
                     	
                 		System.out.println("r: "+rightpswd +"   " + "in: " +Password);
                 		
                 		
                 		rightpswd = rightpswd.trim();
                 		
                 		Password = Password.trim();
                 		
                 		System.out.println(Password.length() + "    " + rightpswd.length());
            		 /** if successfully logged in
            		 */
                 		System.out.println(Password.equals(rightpswd));
            		if(Password.equals(rightpswd))
            				{
            					System.out.println("successful");
            					
            					flag = true;
            				}
            		}
            		 
            		 
        //-------------------------------------------------operation------------------------------------------------------------------------------------//
        //-------------------------------------------------operation------------------------------------------------------------------------------------//
            	
            		 
            		 
            	if(flag)
            	{
            		
            		logged = true;
            		
            		System.out.println("flag == true");
            		
            		buttonPanel.enablePanel();
            		
            		sqlPanel.enablePanel();
            		
            		postandsearch.enablePanel();
            		
            		signUpPanel.disable();
            		
            		resultArea.setText(null);
            		
            		String sql2 ="select * FROM request WHERE userr= '"+Email+"'";
            		
            		SqlPanel.showsql(sql2+"                                                                ");
            		
            		try{
            		ResultSet result = stm.executeQuery(sql2);
        			
        			ResultSetMetaData mtdata = result.getMetaData();
        			
        			int ncol = mtdata.getColumnCount();
            		
        			//System.out.println(result.next());
        			
 //       			String in = null;
        			
//        			while(result.next())
//        			{
//        				in = result.getString(1);
//        			}
//        			
//        		
//        			
//        			System.out.println("input   +      " + in);
//        			
        			//System.out.println("reult has has"+result.next());
        			
        			if(result.next())
        				{
        				
        				System.out.println("input   +     asrdgheath " );
        				notifyButton.setVisible(true);
        				}
        			
        			
            		}
            		catch(SQLException ex1)
            		{
            			ex1.getStackTrace();
            		}
            	}
            	else
            	{
            		System.out.println("false");
            		
            		if(!logged)
            		{
            		System.out.println("flag == false");
            		
            		resultArea.setText("");
            		
            		sqlPanel.SQLArea.setText("");
            		
            		postandsearch.text.setText("");
            		
            		postandsearch.textArea.setText("");
            		
            		signUpPanel.enablePanel();
            		
            		buttonPanel.disablePanel();
            		
            		sqlPanel.disablePanel();
            		
            		postandsearch.disablePanel();
            		
            		JOptionPane.showMessageDialog(null, "invalid Username or Password");
            		
            		notifyButton.setVisible(false);
            		logged = false;
            		}
            		else
            		{
            			resultArea.setText("");
                		
                		sqlPanel.SQLArea.setText("");
                		
                		postandsearch.text.setText("");
                		
                		postandsearch.textArea.setText("");
            			
            			signUpPanel.disablePanel();
                		
                		buttonPanel.disablePanel();
                		
                		sqlPanel.disablePanel();
                		
                		postandsearch.disablePanel();
                		
                		notifyButton.setVisible(false);
                		
                		System.out.print("sdkljflksdhb");
                		
                		logged = false;
            		}
	
            	}
            		 
       		 
            	}

           });
   

	}

	public void setSignupPanel(){

		signUpPanel = new SignupPanel();
		this.add(signUpPanel);
		signUpPanel.signup.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)  {  
            	/*Fill this function*/
            	/*Press this signup button, you should be able check whether current account is existed. If existed, pop up an error, if not check input validation(You can design this part according to your database table's restriction) create the new account information*/
            	/*pop up a standard dialog box to show <succeed or failed>*/
            	
            	String password = signUpPanel.getpswd1();
            	String password2 = signUpPanel.getpswd2();
            	String country = signUpPanel.getcountry();
            	String state = signUpPanel.getstate();
            	String city = signUpPanel.getcity();
            	String email = signUpPanel.getEmail();
            	String birthday = signUpPanel.getbirthday();
            	String fname = signUpPanel.getfname();
            	String lname = signUpPanel.getlname();
            	String str_no = signUpPanel.getstr_no();
            	String str_address = signUpPanel.getstr_address();
            	String zip = signUpPanel.getzip();
            	
            	if(!password.equals(password2))
            	{
            		JOptionPane.showMessageDialog(null, "two passwords are not the same please try again");
            		
            		signUpPanel.password.setText("");
					
					signUpPanel.password2.setText("");
            	}
            	else
            	{
            		try
            		{
            			
            			ConnectDB cdb = new ConnectDB();
            			
            			Connection conn = cdb.openConnection();
            			
            			Statement stm = null;
            			
            			Statement stm0 = null;
            			
            			stm = conn.createStatement();
            			
            			stm0 = conn.createStatement();
            			
            			
            			
            			String sql = "";
            			
            			sql="INSERT INTO USERS (EMAIL, PASSWD, FNAME, LNAME, BIRTHDATE) VALUES ('"+email+"', '"+password+"', '"+fname+"', '"+lname+"', to_date('"+birthday+"', 'mm/dd/yyyy'))";
            			
            			ResultSet result0 = stm0.executeQuery(sql);
            			
            			result0 = stm0.executeQuery("select * from users where email ='"+email+"'");
            			
            			//debug
            			{
            				while(result0.next())
            				{
            					System.out.println("*****************************   "+result0.getString(1));
            				}
            			}
            			
            			sqlPanel.showsql(sql);
            			
            			//Get AID
            			
            			String sqla = "select a.AID,a.STREET_NO,a.STREET_ADD,z.CITY,z.STATE ,z.COUNTRY ,z.ZIP from address a ,zipinfo z where z.zip = a.zip order by AID";
            			
            			ResultSet result = stm.executeQuery(sqla);
            			
            			ArrayList<Integer> AID= new ArrayList();
            			
            			ArrayList<String> ADD= new ArrayList();
            			
            			String Address = "";
            			
            			ResultSetMetaData mtdata = result.getMetaData();
            			
            			int ncol = mtdata.getColumnCount();
            			
            			int index = 0;
            			
            			while(result.next())
            			{
            				for(int i=2;i<=ncol;i++)
            				{
            				
            					String tmp = result.getString(i).trim();
            					
            					Address += tmp;
            				}
            				
            				Address = Address.trim();
            				
            				ADD.add(Address);
            				
            				Address = new String("");
            				
            			}
            			
            			for(int i=0;i<ADD.size();i++)
            			{
            				System.out.print(ADD.get(i)+"   " +ADD.get(i).length());
            				
            				System.out.println();
            			}
            			
            			String input = str_no+str_address+city+state+country+zip;
            			
            			System.out.println("input:   " + input + input.length());
            			
            			System.out.println(input.equals(ADD.get(0)));
            			
            			int AIDR = 0;
            			
            			for(int i=0;i<ADD.size();i++)
            			{
            				if(input.equals(ADD.get(i)))
            				{
            					AIDR = i+1;
            					
            					break;
            				}
            			}
            			
            			System.out.println(AIDR);
            			
            			
            			if(AIDR!=0)
            			{
            				
            				String sql3 = "INSERT INTO LIVE (AID, EMAIL) VALUES ('"+AIDR+"', '"+email+"')";
            				
            				System.out.println(sql3);
            				
            				stm.executeQuery(sql3);
            				
            				sqlPanel.showsql(sql3);
            			}
            			else
            			{
            				AIDR = ADD.size()+2;
            				
            				String sql1 =   "INSERT INTO zipinfo (CITY, STATE, COUNTRY, ZIP) VALUES ('"+city+"', '"+state+"', '"+country+"',"+ zip+")" ;
            				
            				String sql3 = "select * from zipinfo where zip ="+zip;
            				
            				String sql2 = "INSERT INTO ADDRESS (AID, STREET_NO, STREET_ADD, ZIP) VALUES ('" + AIDR+"',"+str_no+", '"+str_address+"', "+zip+")";
            				
            				System.out.println(sql1);
            				System.out.println(sql2);
            				System.out.println(sql3);
            				
            				sql = "INSERT INTO LIVE (AID, EMAIL) VALUES ('"+AIDR +"', '"+email+"')";
            				
            				System.out.println(sql);
            				
            				ResultSet result1 = stm.executeQuery(sql3);
            				
            				
            				if(result1.next())
            				{
            					stm.executeQuery(sql2);
            					sqlPanel.showsql(sql1+"\n");
                				
            				}
            				else
            				{
            					stm.executeQuery(sql1);
                				stm.executeQuery(sql2);
                				sqlPanel.showsql(sql1+"\n"+sql2);
                				
            				}
            				
            				stm.executeQuery(sql);
            					
            				sqlPanel.showsql(sql);
  
            				
            			}
            			
            			
            			
            			JOptionPane.showMessageDialog(null, "successfully signed up");
            			signUpPanel.clearsignup();
            		}
            		catch(SQLException ex)
            		{
            			JOptionPane.showMessageDialog(null, "wrong format information or your email has already been signed");
            			
            			ex.printStackTrace();
            			
            			ConnectDB cdb = new ConnectDB();
            			
            			Connection conn = cdb.openConnection();
            			
            			Statement stm = null;
            			
            			try {
							stm = conn.createStatement();
						
            			
							String sql="delete from users where email = '"+email+"'";
            			
							stm.executeQuery(sql);
            			
							signUpPanel.password.setText("");
							
							signUpPanel.password2.setText("");
            			} 
            			catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
            		}
            	}
            	
            }
        });

		signUpPanel.disablePanel();

	}


}


class ConnectDB{

	
	static Connection ct;
	static CallableStatement cs;
	
	public void ConnectDB()
	{
		Connection ct = null;
		CallableStatement cs = null;
	}
	
	
	public Connection openConnection(){
       
		Connection ct = null;
		CallableStatement cs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			ct = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:Homework", "scott", "wenjiaxie");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		return ct;
	}
	public void closeConnection(Connection conn)
	{
		/*Fill this function*/
    	/*implement close connection */
		
		
			try {
				cs.close();
				ct.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

public class Assignment2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		ConnectDB cdb = new ConnectDB();
//		
//		Connection conn = cdb.openConnection();
//		
//		Statement stm = null;
//		
//		
//		try {
//			stm = conn.createStatement();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		String sql="select * from address";
//		
//		try {
//			//stm.execute(sql);
//			
//			ResultSet result = stm.executeQuery(sql);
//			
//			ResultSetMetaData mtdata = result.getMetaData();
//			
//			int ncol = mtdata.getColumnCount();
//			
//			//System.out.println("hasnext:    " +result.next());
//			int index = 1;
//			
//			while(result.next())
//				{
//			
//				for(int i=1;i<=ncol;i++)
//				{
//			System.out.print(mtdata.getColumnLabel(i)+":    ");
//			
//			System.out.print(result.getString(mtdata.getColumnLabel(i))+"    ");
//				}
//			System.out.println();
//				}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			System.out.println("false");
//			e.printStackTrace();
//		}
		
		
		// TODO Auto-generated method stub
    	MainFrame frame = new MainFrame();
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

