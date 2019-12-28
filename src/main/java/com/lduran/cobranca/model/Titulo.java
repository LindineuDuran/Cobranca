package com.lduran.cobranca.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.*;

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

	@NotEmpty(message = "Descrição é obrigatória!")
	@Size(max = 60, message = "A descrição não pode conter mais de 60 caracteres")
	@EqualsAndHashCode.Exclude
	private String descricao;

	@EqualsAndHashCode.Exclude
	@NotNull(message = "Data de Vencimento é obrigatória!")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dataVencimento;

	@NotNull(message = "Valor é obrigatório!")
	@DecimalMin(value = "0.01", message = "Valor não pode ser menor que 0,01")
	@DecimalMax(value = "9999999.99", message = "Valor não pode ser maior que 9.999.999,99")
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
