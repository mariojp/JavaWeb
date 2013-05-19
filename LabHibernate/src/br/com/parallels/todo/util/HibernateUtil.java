package br.com.parallels.todo.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder();
		serviceRegistryBuilder.applySettings(configuration.getProperties());
		SessionFactory factory = configuration
				.buildSessionFactory(serviceRegistryBuilder
						.buildServiceRegistry());
		return factory;
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
}
