package com.delibanhmi.verification;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.delibanhmi.model.User;

public class InscriptionVerification {
	private String champName="name";
	private String champAddress="address";
	private String champEmail="email";
	private String champPassword="password";
	private String champTelephone="telephone";
	public final String champConfirmation="confirmation";
	private String resultat="resultat";
	private Map<String, String> erreurs;
	public String getResultat() {
		return resultat;
	}
	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	public void setErreurs(String champs, String message) {
		erreurs.put(champs, message);
	}
	public Map<String, String> getErreurs() {
		return erreurs;

	}

	public User verifierUser(HttpServletRequest request) {
		//instancier un utilisateur
		erreurs=  new HashMap<String, String>();
		User user=new User();
		
		// creer un map erreurs pour contenir les messages erreurs qui va afficher quand l'utilisateur ne rentre pas ses informations correctement
		
		// recuperer les champs rentr�es par l'utilisateurs par methode getParameter du request HTTPServlet
		String name=request.getParameter(champName);
		try {
			verifierNom(name);
		} catch (Exception e){
		setErreurs(champName,e.getMessage());
		}
		
		String email=request.getParameter(champEmail);
		try {
			verifierEmail(email);
		} catch(Exception e) {
		setErreurs(champEmail, e.getMessage());
		}
		
		String password=request.getParameter(champPassword);
		String confirmation=request.getParameter(champConfirmation);
		try {
			verifierPassword(password, confirmation);
		} catch (Exception e) {
			setErreurs(champPassword, e.getMessage() );
		}
		
		String telephone=request.getParameter(champTelephone);
		
		String address=request.getParameter(champAddress);
		
		if(erreurs.isEmpty()) {
			
			user.setName(name);
			user.setPassword(password);
			user.setTelephone(telephone);
			user.setAddress(address);
			user.setEmail(email);
			resultat="reussi";
			return user;}
			else {
			resultat="pas reussi";
			return user;
			}
	
	
	
	
}
		public void verifierPassword(String password, String confirmation) throws Exception {

			if (password != null && password.length() >= 3 && confirmation != null && confirmation.length() >= 3) {
				if (!password.equals(confirmation)) {
					throw new Exception("votre confirmation doit �tre identique avec le password");
				}
			} else {
				throw new Exception("votre password doit contenir au moins 3 charact�res");
			}
		}


//verifier si le nom est rentr� correctement
public void verifierNom(String nom) throws Exception {
	if(nom.length()<2) {
		throw new Exception("Votre nom doit contenir au moins 2 charact�re");
	}
}
//verifier si l'email est rentr� correctement
public void verifierEmail(String email) throws Exception{
	if (email != null && email.trim().length() != 0) {
		if (!email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
			throw new Exception("votre mail n'est pas correct");
		}

	} else {
		throw new Exception("rentrez votre mail svp");
	}
}

}
