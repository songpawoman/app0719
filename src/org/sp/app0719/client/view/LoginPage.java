package org.sp.app0719.client.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class LoginPage extends Page implements ActionListener{
	JTextField t_id;
	JTextField t_pass;
	JButton bt_login; //로그인 버튼
	JButton bt_join; //가입 버튼
	MainFrame mainFrame; //null
	
	public LoginPage(MainFrame mainFrame){
		t_id = new JTextField();
		t_pass = new JTextField();
		bt_login = new JButton("Login");
		bt_join = new JButton("Join");
		this.mainFrame=mainFrame;
		
		Dimension d = new Dimension(280, 40);
		t_id.setPreferredSize(d);
		t_pass.setPreferredSize(d);
		
		setLayout(new FlowLayout());
		
		add(t_id);
		add(t_pass);
		add(bt_login);
		add(bt_join);
		
		setPreferredSize(new Dimension(300, 140));
		setBackground(Color.YELLOW);
		
		bt_login.addActionListener(this);
		bt_join.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
	
		if(obj==bt_login) {
			//로그인 처리~~
		}else if(obj==bt_join) {
			//회원가입폼 보여주기 
			mainFrame.showHide(MainFrame.JOIN);
		}
	}
	
}











