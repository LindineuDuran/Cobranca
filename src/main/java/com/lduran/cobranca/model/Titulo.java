package com.lduran.cobranca.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

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
	@Temporal(TemporalType.DATE)
	private Date dataVEncimento;

	@EqualsAndHashCode.Exclude
	private BigDecimal valor;

	@EqualsAndHashCode.Exclude
	@Enumerated(EnumType.STRING)
	private StatusTitulo status;
}
