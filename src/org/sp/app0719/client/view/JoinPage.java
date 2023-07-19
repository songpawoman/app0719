package org.sp.app0719.client.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JoinPage extends Page implements ActionListener{
	JTextField t_id;
	JPasswordField t_pass;
	JTextField t_name;
	JTextField t_email;
	JButton bt_join;
	JButton bt_login;
	MainFrame mainFrame;
	
	public JoinPage(MainFrame mainFrame) {
		t_id = new JTextField();
		t_pass = new JPasswordField();
		t_name = new JTextField();
		t_email = new JTextField();
		bt_join = new JButton("Join");
		bt_login = new JButton("Login");
		this.mainFrame=mainFrame;
		
		Dimension d= new Dimension(480,40);
		
		t_id.setPreferredSize(d);
		t_pass.setPreferredSize(d);
		t_name.setPreferredSize(d);
		t_email.setPreferredSize(d);
		
		add(t_id);
		add(t_pass);
		add(t_name);
		add(t_email);
		
		add(bt_join);
		add(bt_login);
		
		setPreferredSize(new Dimension(500,300));
		
		bt_join.addActionListener(this);
		bt_login.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj==bt_join) {
			//회원가입 처리
			
		}else if(obj==bt_login){
			//로그인 페이지 보여주기
			mainFrame.showHide(MainFrame.LOGIN);
		}
	}
}





















