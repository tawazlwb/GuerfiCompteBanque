package com.ingetis.evry.model;

import java.util.List;

public class Compte {
	private int numCompte;
	private float solde;
	//private static int num = 1;
	private Client client;
	private List<Operation> operations;
	
	public Compte() {
		super();
	}
	
	public Compte(int numCompte, float solde) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
	}
	
	public Compte(int numCompte, float solde, Client client, List<Operation> operations) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.client = client;
		this.operations = operations;
	}

	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	/*public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		Compte.num = num;
	}*/

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
}
