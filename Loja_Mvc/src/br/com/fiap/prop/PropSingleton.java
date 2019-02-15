package br.com.fiap.prop;

import java.io.IOException;
import java.util.Properties;

public class PropSingleton {
	private static Properties p;
	private static final String ARQ="/loja.properties";
	public static Properties pegarInstancia() {
		if(p==null) {
			try {
				p=new Properties();
				p.load(PropSingleton.class.getResourceAsStream(ARQ));
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return p;
	}
}
