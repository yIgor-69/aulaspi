package ifrn.pi.eventos.models;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome não deve estar em branco!")
	private String nome;
	@NotBlank(message = "O local não deve estar em branco!")
	private String local;
	@NotNull(message = "A data não deve estar em branco!")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate data;
	@NotNull(message = "O horário não deve estar em branco!")
	private LocalTime horario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", nome=" + nome + ", local=" + local + ", data=" + data + ", horario=" + horario
				+ "]";
	}
	
	

}
