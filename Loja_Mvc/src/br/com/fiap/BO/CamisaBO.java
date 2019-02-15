package br.com.fiap.BO;

import java.util.List;

import br.com.fiap.DAO.CamisaDAO;
import br.com.fiap.bean.Camisa;

public class CamisaBO {
	public static void addCamisa(Camisa ca)  throws Exception{
		CamisaDAO caDAO=new CamisaDAO();
		ca.setCor(ca.getCor().toUpperCase());
		ca.setDescricao(ca.getDescricao().toUpperCase());
		caDAO.addCamisa(ca);
	}
	public static List<Camisa> listaCamisa() throws Exception{
		CamisaDAO caDAO=new CamisaDAO();
		return caDAO.listaCamisa();
	}
	public static String corCamisa(int id)throws Exception{
		if(id==0)
			return "não encotrado";
		CamisaDAO caDAO=new CamisaDAO();
		return caDAO.corCamisa(id);
	}
}
