package br.com.orlandodias.allutils.library;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	private String mailUsername;
	private String mailPassword;

	public SendMail(String mailUsername, String mailPassword) {
		super();
		this.mailUsername = mailUsername;
		this.mailPassword = mailPassword;
	}

	public String getMailUsername() {
		return mailUsername;
	}

	public void setMailUsername(String mailUsername) {
		this.mailUsername = mailUsername;
	}

	public String getMailPassword() {
		return mailPassword;
	}

	public void setMailPassword(String mailPassword) {
		this.mailPassword = mailPassword;
	}

	public void send(String toMail, String subject, String text, String smtp, String from, String port) throws AddressException, MessagingException {
		final String username = mailUsername;
		final String password = mailPassword;

		Properties props = new Properties();

		System.out.println("MyUtils. SendMail. Send: mailUsername: " + mailUsername);
		System.out.println("MyUtils. SendMail. Send: mailPassword: " + mailPassword);
		System.out.println("MyUtils. SendMail. Send: toMail: " + toMail);
		System.out.println("MyUtils. SendMail. Send: subject: " + subject);
		System.out.println("MyUtils. SendMail. Send: smtp: " + smtp);
		System.out.println("MyUtils. SendMail. Send: from: " + from);
		System.out.println("MyUtils. SendMail. Send: port: " + port);

		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		// props.put("mail.smtp.host", "smtp.gmail.com");
		// props.put("mail.smtp.port", "587");
		props.put("mail.smtp.host", smtp);
		props.put("mail.smtp.port", port);

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		Message message = new MimeMessage(session);
		// message.setFrom(new InternetAddress("from-email@gmail.com"));
		message.setFrom(new InternetAddress(from));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toMail));
		message.setSubject(subject);
		message.setText(text);

		Transport.send(message);
	}
}
