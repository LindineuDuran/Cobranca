package com.lduran.cobranca;

import java.util.Locale;
import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication
public class CobrancaApplication
{
	@PostConstruct
	/**
	 * Spring Boot: Time Zone configuration using Hibernate
	 * https://aboullaite.me/spring-boot-time-zone-configuration-using-hibernate/
	 */
	void started()
	{
		TimeZone.setDefault(TimeZone.getTimeZone("TimeZone"));
	}

	public static void main(String[] args)
	{
		SpringApplication.run(CobrancaApplication.class, args);
	}

	public LocaleResolver localeResolver()
	{
		return new FixedLocaleResolver(new Locale("pt", "BR"));
	}
}
