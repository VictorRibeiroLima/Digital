package br.com.fiap.DAO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bean.Camisa;
import br.com.fiap.facade.FileFacade;


public class CamisaDAO  {
	private FileFacade ff=new FileFacade("C:/BcDeArquivos/LojaCamisas/Camisa.arq");
	private List<Camisa> LISTA=new ArrayList<Camisa>();
	public CamisaDAO() throws ClassNotFoundException, IOException {
		if(ff.devolveObjeto()==null) {
			Camisa c=new Camisa();
			c.setCor("a");
			c.setDescricao("a");
			c.setId(0);
			c.setPreco(1);
			LISTA.add(c);
			ff.preencherArquivo(LISTA);
		}
		else {
			LISTA=(List<Camisa>)ff.devolveObjeto();
		}
		
	}
	@SuppressWarnings("all")
	public void addCamisa(Camisa ca)throws Exception {
		LISTA.add(ca);
		ff.preencherArquivo(LISTA);
	}
	@SuppressWarnings("all")
	public int retornarSize()throws Exception {
		List<Camisa> lista=(List<Camisa>)ff.devolveObjeto();
		return lista.size();
	}
	@SuppressWarnings("all")
	public String corCamisa(int id)throws Exception{
		List<Camisa> lista=(List<Camisa>)ff.devolveObjeto();
		for(Camisa c:lista) {
			if(c.getId()==id)
				return c.getCor();
		}
		return "não encontrado";
	}
	@SuppressWarnings("all")
	public List<Camisa> listaCamisa()throws Exception {
		List<Camisa> lista=(List<Camisa>)ff.devolveObjeto();
		return lista;
	}
}
