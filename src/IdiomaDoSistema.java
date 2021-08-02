import java.util.Locale;

public class IdiomaDoSistema {

	public static void main(String[] args) {
		//System.getProperty("user.language");
		System.out.println("O idioma do seu sistema é "+Locale.getDefault().getDisplayLanguage());
		
	}

}
