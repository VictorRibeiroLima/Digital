package br.com.fiap.testes;

import java.util.Properties;

import br.com.fiap.BO.CamisaBO;
import br.com.fiap.bean.Camisa;
import br.com.fiap.prop.PropSingleton;
public class TesteDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Properties p=PropSingleton.pegarInstancia();
			System.out.println(p.getProperty("nome"));
			System.out.println(CamisaBO.corCamisa(401));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
	