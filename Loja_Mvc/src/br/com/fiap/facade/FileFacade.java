package br.com.fiap.facade;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileFacade {
	private FileOutputStream arquivoO=null;
	private ObjectOutputStream dadosO=null;
	private FileInputStream arquivoI=null;
	private ObjectInputStream dadosI=null;
	private File f=null;
	public FileFacade(String diretorio){
		f=new File(diretorio);
	}
	public void criarArquivo() throws FileNotFoundException {
			arquivoO=new FileOutputStream(f);
	}
	public FileInputStream devolveArquivo() throws FileNotFoundException {
		if(!f.exists()) {
			criarArquivo();
		}
		arquivoI=new FileInputStream(f);
		return arquivoI;
	}
	public Object devolveObjeto() throws IOException, ClassNotFoundException {
		if(devolveArquivo().read()==-1) {
			return null;
		}
		dadosI=new ObjectInputStream(devolveArquivo());
		return dadosI.readObject();
	}
	public void preencherArquivo(Object o) throws IOException {
		criarArquivo();
		dadosO=new ObjectOutputStream(arquivoO);
		dadosO.writeObject(o);
		dadosO.flush();
	}
}
