
public class UserManager {
	public void add(User user) {
		System.out.println("Sayýn "+user.name+" "+user.lastname+" Eklendiniz!");
	}
	public void delete(User user) {
		System.out.println("Sayýn "+user.name+" "+user.lastname+" Bilgileriniz Silinmiþtir!");
	}
	public void update(User user) {
		System.out.println("Sayýn "+user.name+" "+user.lastname+" Bilgileriniz Güncellendi!");
	}
}
