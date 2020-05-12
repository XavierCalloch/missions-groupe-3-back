package dev.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Prime {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private LocalDate date;

	private Integer montant;

	@ManyToOne
	@JoinColumn(name = "collegue_id")
	private Collegue collegue;

	@ManyToOne
	@JoinColumn(name = "mission_id")
	private Mission mission;

	private Integer deduction;

	/**
	 * Constructor
	 * 
	 */
	public Prime() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param date
	 * @param montant
	 */
	public Prime(LocalDate date, Integer montant) {
		super();
		this.date = date;
		this.montant = montant;
	}

	/**
	 * Constructor
	 * 
	 * @param date
	 * @param montant
	 * @param deduction
	 */
	public Prime(LocalDate date, Integer montant, Integer deduction) {
		super();
		this.date = date;
		this.montant = montant;
		this.deduction = deduction;
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Getter
	 * 
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * Setter
	 * 
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * Getter
	 * 
	 * @return the montant
	 */
	public Integer getMontant() {
		return montant;
	}

	/**
	 * Setter
	 * 
	 * @param montant the montant to set
	 */
	public void setMontant(Integer montant) {
		this.montant = montant;
	}

	/**
	 * Getter
	 * 
	 * @return the collegue
	 */
	public Collegue getCollegue() {
		return collegue;
	}

	/**
	 * Setter
	 * 
	 * @param collegue the collegue to set
	 */
	public void setCollegue(Collegue collegue) {
		this.collegue = collegue;
	}

	/**
	 * Getter
	 * 
	 * @return the mission
	 */
	public Mission getMission() {
		return mission;
	}

	/**
	 * Setter
	 * 
	 * @param mission the mission to set
	 */
	public void setMission(Mission mission) {
		this.mission = mission;
	}

	/**
	 * Getter
	 * 
	 * @return the deduction
	 */
	public Integer getDeduction() {
		return deduction;
	}

	/**
	 * Setter
	 * 
	 * @param deduction the deduction to set
	 */
	public void setDeduction(Integer deduction) {
		this.deduction = deduction;
	}

}
