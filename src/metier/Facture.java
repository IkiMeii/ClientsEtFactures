package metier;

import java.time.LocalDate;


public class Facture
{
	private Client client;
	private int montant;
	private LocalDate date;
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	Facture(Client client, int montant)
	{
		this.client = client;
		this.montant = montant;
		this.date = LocalDate.now();
	}

	public Client getClient()
	{
		return client;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return montant;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		return false;
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return date;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
		client.delete();
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		return null;
	}
}