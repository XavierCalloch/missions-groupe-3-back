package dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import dev.domain.Nature;
import dev.domain.NoteDeFrais;

/**Structure modèlisant la ligne des notes de frais
 * @author Salaheddine El Majdoub
 *
 */
public class LigneDeFraisDto {
	
    
    private LocalDate date;
    
	private String type;

	private Integer montant;
	
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "note_de_frais_id")
	private int note_de_frais;

	/**Constructeur
	 * @param date
	 * @param nature
	 * @param montant
	 * @param note_de_frais	 */
	public LigneDeFraisDto(String date, int id, String type, Integer montant, int note_de_frais) {
		super();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		this.date = LocalDate.parse(date,formatter);
		this.type = type;
		this.montant = montant;
		this.note_de_frais = note_de_frais;
		this.id = id;
	}
	public LigneDeFraisDto() {
		super();

	}

	/**Getter
	 * @return datede la ligne de frais
	 */
	public LocalDate getDate() {
		return date;
	}

	/**Setter
	 * @param date de la ligne de frais
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**Getter
	 * @return nature des frais
	 */
	public String getType() {
		return type;
	}
	
	
	/**Getter
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**Setter
	 * @param nature des frais
	 */
	public void setNature(String type) {
		this.type = type;
	}

	/**Getter
	 * @return montant 
	 */
	public Integer getMontant() {
		return montant;
	}

	/**Setter
	 * @param montant
	 */
	public void setMontant(Integer montant) {
		this.montant = montant;
	}

	/**Getter
	 * @return
	 */
	public int getNote_de_frais() {
		return this.note_de_frais;
	}

	/**Setter
	 * @param note_de_frais
	 */
	public void setNote_de_frais(int note_de_frais) {
		this.note_de_frais = note_de_frais;
	}
	
	
	
	

}
