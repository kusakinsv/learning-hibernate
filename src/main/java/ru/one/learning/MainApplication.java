package ru.one.learning;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import ru.one.learning.helloworld.entity.Message;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.sql.DataSource;

public class MainApplication {
	public static void main(String[] args) {
		Message msg = new Message();
		msg.setText("Hello World");
		System.out.println(msg);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HelloWorld");
	}
}
