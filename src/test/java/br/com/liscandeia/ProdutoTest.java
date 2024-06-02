package test.java.br.com.liscandeia;

import main.java.br.com.liscandeia.Produto;
import main.java.br.com.liscandeia.dao.ProdutoDAO;
import main.java.br.com.liscandeia.dao.IProdutoDAO;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {
    private IProdutoDAO produtoDAO;

    public ProdutoTest(){
        produtoDAO = new ProdutoDAO();
    }
    @Test
    public void cadastroCurso(){
        Produto produto = new Produto();
        produto.setValor(2000.99);
        produto.setNome("TV");
        produto.setDescricao("Testando cadastro!");
        produtoDAO.cadastro(produto);
        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}
