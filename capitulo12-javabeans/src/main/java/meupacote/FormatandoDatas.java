package meupacote;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatandoDatas {
	
	private String dataFormatada;
	private LocalDate data;

	
	public String getDataFormatada() {		
		return DateTimeFormatter
		.ofPattern(dataFormatada)
		.withZone(ZoneId.systemDefault())
		.format(
			this.data
		);
	}
	public void setDataFormatada(String dataFormatada) {
		this.dataFormatada = dataFormatada;
	}
	public LocalDate getData() {
		return this.data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}

	
	

}
