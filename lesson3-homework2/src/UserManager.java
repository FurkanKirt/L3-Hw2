
public class UserManager {
	public void add(User user) {
		System.out.println("Say�n "+user.name+" "+user.lastname+" Eklendiniz!");
	}
	public void delete(User user) {
		System.out.println("Say�n "+user.name+" "+user.lastname+" Bilgileriniz Silinmi�tir!");
	}
	public void update(User user) {
		System.out.println("Say�n "+user.name+" "+user.lastname+" Bilgileriniz G�ncellendi!");
	}
}
