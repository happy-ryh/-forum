package edu.swjtuhc.demo.service;

import edu.swjtuhc.demo.model.admin;

public interface AdminService {
	public admin panduandenji(String adminAccount);
	public int getChaRuadmin(admin admin);
	public admin getadminlogin(String adminAccount);
	public int scadmin(String adminAccount);
}
