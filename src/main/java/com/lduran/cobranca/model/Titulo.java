package com.lduran.cobranca.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import lombok.*;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Titulo
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@EqualsAndHashCode.Exclude
	private String descricao;

	@EqualsAndHashCode.Exclude
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dataVencimento;

	@EqualsAndHashCode.Exclude
	@NumberFormat(pattern = "#,##0.00")
	private BigDecimal valor;

	@EqualsAndHashCode.Exclude
	@Enumerated(EnumType.STRING)
	private StatusTitulo status;

	public boolean isPendente()
	{
		return StatusTitulo.PENDENTE.equals(this.status);
	}
}
